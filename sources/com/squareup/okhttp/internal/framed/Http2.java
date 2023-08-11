package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.FrameReader;
import com.squareup.okhttp.internal.framed.Hpack;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13133f;
import okio.C13179y0;
import okio.C13181z0;

public final class Http2 implements Variant {
    /* access modifiers changed from: private */
    public static final C13133f CONNECTION_PREFACE = C13133f.m29652e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(FrameLogger.class.getName());

    static final class FrameLogger {
        private static final String[] BINARY = new String[256];
        private static final String[] FLAGS = new String[64];
        private static final String[] TYPES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = BINARY;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = FLAGS;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            strArr2[1 | 8] = strArr2[1] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr2[i3];
                int i5 = iArr[0];
                String[] strArr3 = FLAGS;
                int i6 = i5 | i4;
                strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
                strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = FLAGS;
                if (i < strArr4.length) {
                    if (strArr4[i] == null) {
                        strArr4[i] = BINARY[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        FrameLogger() {
        }

        static String formatFlags(byte b, byte b2) {
            String str;
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        return "ACK";
                    }
                    return BINARY[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr = FLAGS;
                    if (b2 < strArr.length) {
                        str = strArr[b2];
                    } else {
                        str = BINARY[b2];
                    }
                    if (b == 5 && (b2 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b != 0 || (b2 & 32) == 0) {
                        return str;
                    }
                    return str.replace("PRIORITY", "COMPRESSED");
                }
            }
            return BINARY[b2];
        }

        static String formatHeader(boolean z, int i, int i2, byte b, byte b2) {
            String str;
            String str2;
            String[] strArr = TYPES;
            if (b < strArr.length) {
                str = strArr[b];
            } else {
                str = String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            }
            String formatFlags = formatFlags(b, b2);
            Object[] objArr = new Object[5];
            if (z) {
                str2 = "<<";
            } else {
                str2 = ">>";
            }
            objArr[0] = str2;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = str;
            objArr[4] = formatFlags;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* access modifiers changed from: private */
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    public static IOException ioException(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    public static int lengthWithoutPadding(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static int readMedium(C13130e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    public static void writeMedium(C13127d dVar, int i) {
        dVar.writeByte((i >>> 16) & 255);
        dVar.writeByte((i >>> 8) & 255);
        dVar.writeByte(i & 255);
    }

    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public FrameReader newReader(C13130e eVar, boolean z) {
        return new Reader(eVar, 4096, z);
    }

    public FrameWriter newWriter(C13127d dVar, boolean z) {
        return new Writer(dVar, z);
    }

    static final class Reader implements FrameReader {
        private final boolean client;
        private final ContinuationSource continuation;
        final Hpack.Reader hpackReader;
        private final C13130e source;

        Reader(C13130e eVar, int i, boolean z) {
            this.source = eVar;
            this.client = z;
            ContinuationSource continuationSource = new ContinuationSource(eVar);
            this.continuation = continuationSource;
            this.hpackReader = new Hpack.Reader(i, continuationSource);
        }

        private void readData(FrameReader.Handler handler, int i, byte b, int i2) {
            boolean z;
            short s = 0;
            boolean z2 = true;
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 32) == 0) {
                z2 = false;
            }
            if (!z2) {
                if ((b & 8) != 0) {
                    s = (short) (this.source.readByte() & 255);
                }
                handler.data(z, i2, this.source, Http2.lengthWithoutPadding(i, b, s));
                this.source.skip((long) s);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        private void readGoAway(FrameReader.Handler handler, int i, byte b, int i2) {
            if (i < 8) {
                throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i3 = i - 8;
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    C13133f fVar = C13133f.f20904f;
                    if (i3 > 0) {
                        fVar = this.source.mo52534o((long) i3);
                    }
                    handler.goAway(readInt, fromHttp2, fVar);
                    return;
                }
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            } else {
                throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        private List<Header> readHeaderBlock(int i, short s, byte b, int i2) {
            ContinuationSource continuationSource = this.continuation;
            continuationSource.left = i;
            continuationSource.length = i;
            continuationSource.padding = s;
            continuationSource.flags = b;
            continuationSource.streamId = i2;
            this.hpackReader.readHeaders();
            return this.hpackReader.getAndResetHeaderList();
        }

        private void readHeaders(FrameReader.Handler handler, int i, byte b, int i2) {
            boolean z;
            short s = 0;
            if (i2 != 0) {
                if ((b & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((b & 8) != 0) {
                    s = (short) (this.source.readByte() & 255);
                }
                if ((b & 32) != 0) {
                    readPriority(handler, i2);
                    i -= 5;
                }
                handler.headers(false, z, i2, -1, readHeaderBlock(Http2.lengthWithoutPadding(i, b, s), s, b, i2), HeadersMode.HTTP_20_HEADERS);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        private void readPing(FrameReader.Handler handler, int i, byte b, int i2) {
            boolean z = false;
            if (i != 8) {
                throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                handler.ping(z, readInt, readInt2);
            } else {
                throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        private void readPriority(FrameReader.Handler handler, int i, byte b, int i2) {
            if (i != 5) {
                throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            } else if (i2 != 0) {
                readPriority(handler, i2);
            } else {
                throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        private void readPushPromise(FrameReader.Handler handler, int i, byte b, int i2) {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.source.readByte() & 255);
                }
                handler.pushPromise(i2, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Http2.lengthWithoutPadding(i - 4, b, s), s, b, i2));
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        private void readRstStream(FrameReader.Handler handler, int i, byte b, int i2) {
            if (i != 4) {
                throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            } else if (i2 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i2, fromHttp2);
                } else {
                    throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
            } else {
                throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        private void readSettings(FrameReader.Handler handler, int i, byte b, int i2) {
            if (i2 != 0) {
                throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    handler.ackSettings();
                    return;
                }
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i % 6 == 0) {
                Settings settings = new Settings();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.source.readShort();
                    int readInt = this.source.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            if (readInt >= 0) {
                                readShort = 7;
                                break;
                            } else {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        case 5:
                            if (readInt >= 16384 && readInt <= 16777215) {
                                break;
                            } else {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                            break;
                        default:
                            throw Http2.ioException("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(readShort));
                    }
                    settings.set(readShort, 0, readInt);
                }
                handler.settings(false, settings);
                if (settings.getHeaderTableSize() >= 0) {
                    this.hpackReader.headerTableSizeSetting(settings.getHeaderTableSize());
                }
            } else {
                throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, byte b, int i2) {
            if (i == 4) {
                long readInt = ((long) this.source.readInt()) & 2147483647L;
                if (readInt != 0) {
                    handler.windowUpdate(i2, readInt);
                } else {
                    throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(readInt));
                }
            } else {
                throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
        }

        public void close() {
            this.source.close();
        }

        public boolean nextFrame(FrameReader.Handler handler) {
            try {
                this.source.mo52533m0(9);
                int access$300 = Http2.readMedium(this.source);
                if (access$300 < 0 || access$300 > 16384) {
                    throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(access$300));
                }
                byte readByte = (byte) (this.source.readByte() & 255);
                byte readByte2 = (byte) (this.source.readByte() & 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(FrameLogger.formatHeader(true, readInt, access$300, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        readData(handler, access$300, readByte2, readInt);
                        break;
                    case 1:
                        readHeaders(handler, access$300, readByte2, readInt);
                        break;
                    case 2:
                        readPriority(handler, access$300, readByte2, readInt);
                        break;
                    case 3:
                        readRstStream(handler, access$300, readByte2, readInt);
                        break;
                    case 4:
                        readSettings(handler, access$300, readByte2, readInt);
                        break;
                    case 5:
                        readPushPromise(handler, access$300, readByte2, readInt);
                        break;
                    case 6:
                        readPing(handler, access$300, readByte2, readInt);
                        break;
                    case 7:
                        readGoAway(handler, access$300, readByte2, readInt);
                        break;
                    case 8:
                        readWindowUpdate(handler, access$300, readByte2, readInt);
                        break;
                    default:
                        this.source.skip((long) access$300);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public void readConnectionPreface() {
            if (!this.client) {
                C13133f o = this.source.mo52534o((long) Http2.CONNECTION_PREFACE.mo52590H());
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(String.format("<< CONNECTION %s", new Object[]{o.mo52609l()}));
                }
                if (!Http2.CONNECTION_PREFACE.equals(o)) {
                    throw Http2.ioException("Expected a connection header but was %s", o.mo52595N());
                }
            }
        }

        private void readPriority(FrameReader.Handler handler, int i) {
            int readInt = this.source.readInt();
            handler.priority(i, readInt & Integer.MAX_VALUE, (this.source.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }
    }

    static final class Writer implements FrameWriter {
        private final boolean client;
        private boolean closed;
        private final C13121c hpackBuffer;
        private final Hpack.Writer hpackWriter;
        private int maxFrameSize = 16384;
        private final C13127d sink;

        Writer(C13127d dVar, boolean z) {
            this.sink = dVar;
            this.client = z;
            C13121c cVar = new C13121c();
            this.hpackBuffer = cVar;
            this.hpackWriter = new Hpack.Writer(cVar);
        }

        private void writeContinuationFrames(int i, long j) {
            byte b;
            while (j > 0) {
                int min = (int) Math.min((long) this.maxFrameSize, j);
                long j2 = (long) min;
                j -= j2;
                if (j == 0) {
                    b = 4;
                } else {
                    b = 0;
                }
                frameHeader(i, min, Http2.TYPE_CONTINUATION, b);
                this.sink.write(this.hpackBuffer, j2);
            }
        }

        public synchronized void ackSettings(Settings settings) {
            if (!this.closed) {
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                frameHeader(0, 0, (byte) 4, (byte) 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void close() {
            this.closed = true;
            this.sink.close();
        }

        public synchronized void connectionPreface() {
            if (this.closed) {
                throw new IOException("closed");
            } else if (this.client) {
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(String.format(">> CONNECTION %s", new Object[]{Http2.CONNECTION_PREFACE.mo52609l()}));
                }
                this.sink.write(Http2.CONNECTION_PREFACE.mo52594M());
                this.sink.flush();
            }
        }

        public synchronized void data(boolean z, int i, C13121c cVar, int i2) {
            byte b;
            if (!this.closed) {
                if (z) {
                    b = (byte) 1;
                } else {
                    b = 0;
                }
                dataFrame(i, b, cVar, i2);
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        public void dataFrame(int i, byte b, C13121c cVar, int i2) {
            frameHeader(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.sink.write(cVar, (long) i2);
            }
        }

        public synchronized void flush() {
            if (!this.closed) {
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        public void frameHeader(int i, int i2, byte b, byte b2) {
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(false, i, i2, b, b2));
            }
            int i3 = this.maxFrameSize;
            if (i2 > i3) {
                throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) == 0) {
                Http2.writeMedium(this.sink, i2);
                this.sink.writeByte(b & 255);
                this.sink.writeByte(b2 & 255);
                this.sink.writeInt(i & Integer.MAX_VALUE);
            } else {
                throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
            }
        }

        public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (errorCode.httpCode != -1) {
                frameHeader(0, bArr.length + 8, Http2.TYPE_GOAWAY, (byte) 0);
                this.sink.writeInt(i);
                this.sink.writeInt(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.sink.write(bArr);
                }
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            }
        }

        public synchronized void headers(int i, List<Header> list) {
            if (!this.closed) {
                headers(false, i, list);
            } else {
                throw new IOException("closed");
            }
        }

        public int maxDataLength() {
            return this.maxFrameSize;
        }

        public synchronized void ping(boolean z, int i, int i2) {
            byte b;
            if (!this.closed) {
                if (z) {
                    b = 1;
                } else {
                    b = 0;
                }
                frameHeader(0, 8, Http2.TYPE_PING, b);
                this.sink.writeInt(i);
                this.sink.writeInt(i2);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void pushPromise(int i, int i2, List<Header> list) {
            byte b;
            if (!this.closed) {
                this.hpackWriter.writeHeaders(list);
                long size = this.hpackBuffer.size();
                int min = (int) Math.min((long) (this.maxFrameSize - 4), size);
                long j = (long) min;
                int i3 = (size > j ? 1 : (size == j ? 0 : -1));
                if (i3 == 0) {
                    b = 4;
                } else {
                    b = 0;
                }
                frameHeader(i, min + 4, Http2.TYPE_PUSH_PROMISE, b);
                this.sink.writeInt(i2 & Integer.MAX_VALUE);
                this.sink.write(this.hpackBuffer, j);
                if (i3 > 0) {
                    writeContinuationFrames(i, size - j);
                }
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void rstStream(int i, ErrorCode errorCode) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (errorCode.httpCode != -1) {
                frameHeader(i, 4, Http2.TYPE_RST_STREAM, (byte) 0);
                this.sink.writeInt(errorCode.httpCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public synchronized void settings(Settings settings) {
            int i;
            if (!this.closed) {
                frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
                for (int i2 = 0; i2 < 10; i2++) {
                    if (settings.isSet(i2)) {
                        if (i2 == 4) {
                            i = 3;
                        } else if (i2 == 7) {
                            i = 4;
                        } else {
                            i = i2;
                        }
                        this.sink.writeShort(i);
                        this.sink.writeInt(settings.get(i2));
                    }
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void synReply(boolean z, int i, List<Header> list) {
            if (!this.closed) {
                headers(z, i, list);
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void synStream(boolean z, boolean z2, int i, int i2, List<Header> list) {
            if (!z2) {
                try {
                    if (!this.closed) {
                        headers(z, i, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public synchronized void windowUpdate(int i, long j) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            } else {
                frameHeader(i, 4, (byte) 8, (byte) 0);
                this.sink.writeInt((int) j);
                this.sink.flush();
            }
        }

        /* access modifiers changed from: package-private */
        public void headers(boolean z, int i, List<Header> list) {
            if (!this.closed) {
                this.hpackWriter.writeHeaders(list);
                long size = this.hpackBuffer.size();
                int min = (int) Math.min((long) this.maxFrameSize, size);
                long j = (long) min;
                int i2 = (size > j ? 1 : (size == j ? 0 : -1));
                byte b = i2 == 0 ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                frameHeader(i, min, (byte) 1, b);
                this.sink.write(this.hpackBuffer, j);
                if (i2 > 0) {
                    writeContinuationFrames(i, size - j);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    static final class ContinuationSource implements C13179y0 {
        byte flags;
        int left;
        int length;
        short padding;
        private final C13130e source;
        int streamId;

        public ContinuationSource(C13130e eVar) {
            this.source = eVar;
        }

        private void readContinuationHeader() {
            int i = this.streamId;
            int access$300 = Http2.readMedium(this.source);
            this.left = access$300;
            this.length = access$300;
            byte readByte = (byte) (this.source.readByte() & 255);
            this.flags = (byte) (this.source.readByte() & 255);
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (readByte != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public long read(C13121c cVar, long j) {
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
                    this.left = (int) (((long) this.left) - read);
                    return read;
                }
            }
        }

        public C13181z0 timeout() {
            return this.source.timeout();
        }

        public void close() {
        }
    }
}
