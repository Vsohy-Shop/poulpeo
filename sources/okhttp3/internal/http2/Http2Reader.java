package okhttp3.internal.http2;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.C13121c;
import okio.C13130e;
import okio.C13133f;
import okio.C13179y0;
import okio.C13181z0;
import p436tf.C13525d;

/* compiled from: Http2Reader.kt */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final C13130e source;

    /* compiled from: Http2Reader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    /* compiled from: Http2Reader.kt */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, C13133f fVar, String str2, int i2, long j);

        void data(boolean z, int i, C13130e eVar, int i2);

        void goAway(int i, ErrorCode errorCode, C13133f fVar);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list);

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        C12775o.m28638h(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(C13130e eVar, boolean z) {
        C12775o.m28639i(eVar, APIParams.SOURCE);
        this.source = eVar;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(eVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, (DefaultConstructorMarker) null);
    }

    private final void readData(Handler handler, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            boolean z2 = true;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 32) == 0) {
                z2 = false;
            }
            if (!z2) {
                if ((i2 & 8) != 0) {
                    i4 = Util.and(this.source.readByte(), 255);
                }
                handler.data(z, i3, this.source, Companion.lengthWithoutPadding(i, i2, i4));
                this.source.skip((long) i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) {
        if (i < 8) {
            throw new IOException(C12775o.m28647q("TYPE_GOAWAY length < 8: ", Integer.valueOf(i)));
        } else if (i3 == 0) {
            int readInt = this.source.readInt();
            int readInt2 = this.source.readInt();
            int i4 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
            if (fromHttp2 != null) {
                C13133f fVar = C13133f.f20904f;
                if (i4 > 0) {
                    fVar = this.source.mo52534o((long) i4);
                }
                handler.goAway(readInt, fromHttp2, fVar);
                return;
            }
            throw new IOException(C12775o.m28647q("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i2);
        this.continuation.setFlags(i3);
        this.continuation.setStreamId(i4);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i4 = Util.and(this.source.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                readPriority(handler, i3);
                i -= 5;
            }
            handler.headers(z, i3, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler handler, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException(C12775o.m28647q("TYPE_PING length != 8: ", Integer.valueOf(i)));
        } else if (i3 == 0) {
            int readInt = this.source.readInt();
            int readInt2 = this.source.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            handler.ping(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) {
        if (i != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        } else if (i3 != 0) {
            readPriority(handler, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                i4 = Util.and(this.source.readByte(), 255);
            } else {
                i4 = 0;
            }
            handler.pushPromise(i3, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.source.readInt();
            ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
            if (fromHttp2 != null) {
                handler.rstStream(i3, fromHttp2);
                return;
            }
            throw new IOException(C12775o.m28647q("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    private final void readSettings(Handler handler, int i, int i2, int i3) {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                handler.ackSettings();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            Settings settings = new Settings();
            C13525d s = C13537l.m30892s(C13537l.m30893t(0, i), 6);
            int j = s.mo53147j();
            int k = s.mo53148k();
            int q = s.mo53149q();
            if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
                while (true) {
                    int i4 = j + q;
                    int and = Util.and(this.source.readShort(), 65535);
                    readInt = this.source.readInt();
                    if (and != 2) {
                        if (and == 3) {
                            and = 4;
                        } else if (and != 4) {
                            if (and == 5 && (readInt < 16384 || readInt > 16777215)) {
                            }
                        } else if (readInt >= 0) {
                            and = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    settings.set(and, readInt);
                    if (j == k) {
                        break;
                    }
                    j = i4;
                }
                throw new IOException(C12775o.m28647q("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
            }
            handler.settings(false, settings);
        } else {
            throw new IOException(C12775o.m28647q("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i)));
        }
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) {
        if (i == 4) {
            long and = Util.and(this.source.readInt(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(i3, and);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(C12775o.m28647q("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i)));
    }

    public void close() {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, Handler handler) {
        C12775o.m28639i(handler, "handler");
        try {
            this.source.mo52533m0(9);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.readByte(), 255);
                int and2 = Util.and(this.source.readByte(), 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
                if (!z || and == 4) {
                    switch (and) {
                        case 0:
                            readData(handler, readMedium, and2, readInt);
                            return true;
                        case 1:
                            readHeaders(handler, readMedium, and2, readInt);
                            return true;
                        case 2:
                            readPriority(handler, readMedium, and2, readInt);
                            return true;
                        case 3:
                            readRstStream(handler, readMedium, and2, readInt);
                            return true;
                        case 4:
                            readSettings(handler, readMedium, and2, readInt);
                            return true;
                        case 5:
                            readPushPromise(handler, readMedium, and2, readInt);
                            return true;
                        case 6:
                            readPing(handler, readMedium, and2, readInt);
                            return true;
                        case 7:
                            readGoAway(handler, readMedium, and2, readInt);
                            return true;
                        case 8:
                            readWindowUpdate(handler, readMedium, and2, readInt);
                            return true;
                        default:
                            this.source.skip((long) readMedium);
                            return true;
                    }
                } else {
                    throw new IOException(C12775o.m28647q("Expected a SETTINGS frame but was ", Http2.INSTANCE.formattedType$okhttp(and)));
                }
            } else {
                throw new IOException(C12775o.m28647q("FRAME_SIZE_ERROR: ", Integer.valueOf(readMedium)));
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) {
        C12775o.m28639i(handler, "handler");
        if (!this.client) {
            C13130e eVar = this.source;
            C13133f fVar = Http2.CONNECTION_PREFACE;
            C13133f o = eVar.mo52534o((long) fVar.mo52590H());
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(C12775o.m28647q("<< CONNECTION ", o.mo52609l()), new Object[0]));
            }
            if (!C12775o.m28634d(fVar, o)) {
                throw new IOException(C12775o.m28647q("Expected a connection header but was ", o.mo52595N()));
            }
        } else if (!nextFrame(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    private final void readPriority(Handler handler, int i) {
        int readInt = this.source.readInt();
        handler.priority(i, readInt & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* compiled from: Http2Reader.kt */
    public static final class ContinuationSource implements C13179y0 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final C13130e source;
        private int streamId;

        public ContinuationSource(C13130e eVar) {
            C12775o.m28639i(eVar, APIParams.SOURCE);
            this.source = eVar;
        }

        private final void readContinuationHeader() {
            int i = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and != 9) {
                throw new IOException(and + " != TYPE_CONTINUATION");
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        public long read(C13121c cVar, long j) {
            C12775o.m28639i(cVar, "sink");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.skip((long) this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(cVar, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        public C13181z0 timeout() {
            return this.source.timeout();
        }

        public void close() {
        }
    }
}
