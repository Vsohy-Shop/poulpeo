package okhttp3.internal.p406ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.C12775o;
import okio.C13121c;
import okio.C13127d;
import okio.C13133f;

/* renamed from: okhttp3.internal.ws.WebSocketWriter */
/* compiled from: WebSocketWriter.kt */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C13121c.C13122a maskCursor;
    private final byte[] maskKey;
    private final C13121c messageBuffer = new C13121c();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final C13127d sink;
    private final C13121c sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, C13127d dVar, Random random2, boolean z2, boolean z3, long j) {
        byte[] bArr;
        C12775o.m28639i(dVar, "sink");
        C12775o.m28639i(random2, "random");
        this.isClient = z;
        this.sink = dVar;
        this.random = random2;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = dVar.mo52524f();
        C13121c.C13122a aVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new C13121c.C13122a() : aVar;
    }

    private final void writeControlFrame(int i, C13133f fVar) {
        boolean z;
        if (!this.writerClosed) {
            int H = fVar.mo52590H();
            if (((long) H) <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.sinkBuffer.writeByte(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(H | 128);
                    Random random2 = this.random;
                    byte[] bArr = this.maskKey;
                    C12775o.m28636f(bArr);
                    random2.nextBytes(bArr);
                    this.sinkBuffer.write(this.maskKey);
                    if (H > 0) {
                        long size = this.sinkBuffer.size();
                        this.sinkBuffer.mo52517b0(fVar);
                        C13121c cVar = this.sinkBuffer;
                        C13121c.C13122a aVar = this.maskCursor;
                        C12775o.m28636f(aVar);
                        cVar.mo52567y0(aVar);
                        this.maskCursor.mo52574k(size);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(H);
                    this.sinkBuffer.mo52517b0(fVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public void close() {
        MessageDeflater messageDeflater2 = this.messageDeflater;
        if (messageDeflater2 != null) {
            messageDeflater2.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final C13127d getSink() {
        return this.sink;
    }

    public final void writeClose(int i, C13133f fVar) {
        C13133f fVar2 = C13133f.f20904f;
        if (!(i == 0 && fVar == null)) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C13121c cVar = new C13121c();
            cVar.writeShort(i);
            if (fVar != null) {
                cVar.mo52517b0(fVar);
            }
            fVar2 = cVar.mo52498M();
        }
        try {
            writeControlFrame(8, fVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, C13133f fVar) {
        C12775o.m28639i(fVar, "data");
        if (!this.writerClosed) {
            this.messageBuffer.mo52517b0(fVar);
            int i2 = 128;
            int i3 = i | 128;
            if (this.perMessageDeflate && ((long) fVar.mo52590H()) >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater2 = this.messageDeflater;
                if (messageDeflater2 == null) {
                    messageDeflater2 = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater2;
                }
                messageDeflater2.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long size = this.messageBuffer.size();
            this.sinkBuffer.writeByte(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (size <= 125) {
                this.sinkBuffer.writeByte(((int) size) | i2);
            } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.writeByte(i2 | 126);
                this.sinkBuffer.writeShort((int) size);
            } else {
                this.sinkBuffer.writeByte(i2 | 127);
                this.sinkBuffer.mo52501O0(size);
            }
            if (this.isClient) {
                Random random2 = this.random;
                byte[] bArr = this.maskKey;
                C12775o.m28636f(bArr);
                random2.nextBytes(bArr);
                this.sinkBuffer.write(this.maskKey);
                if (size > 0) {
                    C13121c cVar = this.messageBuffer;
                    C13121c.C13122a aVar = this.maskCursor;
                    C12775o.m28636f(aVar);
                    cVar.mo52567y0(aVar);
                    this.maskCursor.mo52574k(0);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, size);
            this.sink.mo52536p();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(C13133f fVar) {
        C12775o.m28639i(fVar, "payload");
        writeControlFrame(9, fVar);
    }

    public final void writePong(C13133f fVar) {
        C12775o.m28639i(fVar, "payload");
        writeControlFrame(10, fVar);
    }
}
