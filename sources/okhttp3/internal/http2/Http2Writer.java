package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.C13121c;
import okio.C13127d;

/* compiled from: Http2Writer.kt */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C13121c hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize = 16384;
    private final C13127d sink;

    /* compiled from: Http2Writer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Http2Writer(C13127d dVar, boolean z) {
        C12775o.m28639i(dVar, "sink");
        this.sink = dVar;
        this.client = z;
        C13121c cVar = new C13121c();
        this.hpackBuffer = cVar;
        this.hpackWriter = new Hpack.Writer(0, false, cVar, 3, (DefaultConstructorMarker) null);
    }

    private final void writeContinuationFrames(int i, long j) {
        int i2;
        while (j > 0) {
            long min = Math.min((long) this.maxFrameSize, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            frameHeader(i, i3, 9, i2);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) {
        C12775o.m28639i(settings, "peerSettings");
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(C12775o.m28647q(">> CONNECTION ", Http2.CONNECTION_PREFACE.mo52609l()), new Object[0]));
            }
            this.sink.mo52517b0(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean z, int i, C13121c cVar, int i2) {
        if (!this.closed) {
            dataFrame(i, z ? 1 : 0, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i, int i2, C13121c cVar, int i3) {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            C13127d dVar = this.sink;
            C12775o.m28636f(cVar);
            dVar.write(cVar, (long) i3);
        }
    }

    public final synchronized void flush() {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) {
        boolean z;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
        }
        boolean z2 = true;
        if (i2 <= this.maxFrameSize) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((Integer.MIN_VALUE & i) != 0) {
                z2 = false;
            }
            if (z2) {
                Util.writeMedium(this.sink, i2);
                this.sink.writeByte(i3 & 255);
                this.sink.writeByte(i4 & 255);
                this.sink.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(C12775o.m28647q("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i2).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        boolean z;
        C12775o.m28639i(errorCode, "errorCode");
        C12775o.m28639i(bArr, "debugData");
        if (!this.closed) {
            boolean z2 = false;
            if (errorCode.getHttpCode() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                frameHeader(0, bArr.length + 8, 7, 0);
                this.sink.writeInt(i);
                this.sink.writeInt(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.sink.write(bArr);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z, int i, List<Header> list) {
        int i2;
        C12775o.m28639i(list, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            long min = Math.min((long) this.maxFrameSize, size);
            int i3 = (size > min ? 1 : (size == min ? 0 : -1));
            if (i3 == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            frameHeader(i, (int) min, 1, i2);
            this.sink.write(this.hpackBuffer, min);
            if (i3 > 0) {
                writeContinuationFrames(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i, int i2) {
        int i3;
        if (!this.closed) {
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            frameHeader(0, 8, 6, i3);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) {
        int i3;
        C12775o.m28639i(list, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(((long) this.maxFrameSize) - 4, size);
            int i4 = min + 4;
            long j = (long) min;
            int i5 = (size > j ? 1 : (size == j ? 0 : -1));
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            frameHeader(i, i4, 5, i3);
            this.sink.writeInt(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (i5 > 0) {
                writeContinuationFrames(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) {
        boolean z;
        C12775o.m28639i(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                frameHeader(i, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) {
        int i;
        C12775o.m28639i(settings, "settings");
        if (!this.closed) {
            int i2 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i2 < 10) {
                int i3 = i2 + 1;
                if (settings.isSet(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 != 7) {
                        i = i2;
                    } else {
                        i = 4;
                    }
                    this.sink.writeShort(i);
                    this.sink.writeInt(settings.get(i2));
                }
                i2 = i3;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void windowUpdate(int i, long j) {
        boolean z;
        if (!this.closed) {
            if (j == 0 || j > 2147483647L) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                frameHeader(i, 4, 8, 0);
                this.sink.writeInt((int) j);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(C12775o.m28647q("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
