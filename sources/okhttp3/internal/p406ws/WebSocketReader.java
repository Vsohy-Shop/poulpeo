package okhttp3.internal.p406ws;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.Util;
import okio.C13121c;
import okio.C13130e;
import okio.C13133f;

/* renamed from: okhttp3.internal.ws.WebSocketReader */
/* compiled from: WebSocketReader.kt */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final C13121c controlFrameBuffer = new C13121c();
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final C13121c.C13122a maskCursor;
    private final byte[] maskKey;
    private final C13121c messageFrameBuffer = new C13121c();
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final C13130e source;

    /* renamed from: okhttp3.internal.ws.WebSocketReader$FrameCallback */
    /* compiled from: WebSocketReader.kt */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str);

        void onReadMessage(C13133f fVar);

        void onReadPing(C13133f fVar);

        void onReadPong(C13133f fVar);
    }

    public WebSocketReader(boolean z, C13130e eVar, FrameCallback frameCallback2, boolean z2, boolean z3) {
        byte[] bArr;
        C12775o.m28639i(eVar, APIParams.SOURCE);
        C12775o.m28639i(frameCallback2, "frameCallback");
        this.isClient = z;
        this.source = eVar;
        this.frameCallback = frameCallback2;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        C13121c.C13122a aVar = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = !z ? new C13121c.C13122a() : aVar;
    }

    private final void readControlFrame() {
        String str;
        short s;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo52564x(this.controlFrameBuffer, j);
            if (!this.isClient) {
                C13121c cVar = this.controlFrameBuffer;
                C13121c.C13122a aVar = this.maskCursor;
                C12775o.m28636f(aVar);
                cVar.mo52567y0(aVar);
                this.maskCursor.mo52574k(0);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                C13121c.C13122a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                C12775o.m28636f(bArr);
                webSocketProtocol.toggleMask(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.mo52482B0();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.mo52498M());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.mo52498M());
                return;
            default:
                throw new ProtocolException(C12775o.m28647q("Unknown control opcode: ", Util.toHexString(this.opcode)));
        }
    }

    /* JADX INFO: finally extract failed */
    private final void readHeader() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i = and & 15;
                this.opcode = i;
                boolean z7 = false;
                if ((and & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.isFinalFrame = z;
                if ((and & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.isControlFrame = z2;
                if (!z2 || z) {
                    if ((and & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i == 1 || i == 2) {
                        if (!z3) {
                            z6 = false;
                        } else if (this.perMessageDeflate) {
                            z6 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.readingCompressedMessage = z6;
                    } else if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((and & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if ((and & 16) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            int and2 = Util.and(this.source.readByte(), 255);
                            if ((and2 & 128) != 0) {
                                z7 = true;
                            }
                            if (z7 == this.isClient) {
                                if (this.isClient) {
                                    str = "Server-sent frames must not be masked.";
                                } else {
                                    str = "Client-sent frames must be masked.";
                                }
                                throw new ProtocolException(str);
                            }
                            long j = (long) (and2 & 127);
                            this.frameLength = j;
                            if (j == 126) {
                                this.frameLength = (long) Util.and(this.source.readShort(), 65535);
                            } else if (j == 127) {
                                long readLong = this.source.readLong();
                                this.frameLength = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.isControlFrame && this.frameLength > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z7) {
                                C13130e eVar = this.source;
                                byte[] bArr = this.maskKey;
                                C12775o.m28636f(bArr);
                                eVar.readFully(bArr);
                            }
                        } else {
                            throw new ProtocolException("Unexpected rsv3 flag");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private final void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo52564x(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    C13121c cVar = this.messageFrameBuffer;
                    C13121c.C13122a aVar = this.maskCursor;
                    C12775o.m28636f(aVar);
                    cVar.mo52567y0(aVar);
                    this.maskCursor.mo52574k(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    C13121c.C13122a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    C12775o.m28636f(bArr);
                    webSocketProtocol.toggleMask(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException(C12775o.m28647q("Expected continuation opcode. Got: ", Util.toHexString(this.opcode)));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (this.readingCompressedMessage) {
                MessageInflater messageInflater2 = this.messageInflater;
                if (messageInflater2 == null) {
                    messageInflater2 = new MessageInflater(this.noContextTakeover);
                    this.messageInflater = messageInflater2;
                }
                messageInflater2.inflate(this.messageFrameBuffer);
            }
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo52482B0());
            } else {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo52498M());
            }
        } else {
            throw new ProtocolException(C12775o.m28647q("Unknown opcode: ", Util.toHexString(i)));
        }
    }

    private final void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    public void close() {
        MessageInflater messageInflater2 = this.messageInflater;
        if (messageInflater2 != null) {
            messageInflater2.close();
        }
    }

    public final C13130e getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
