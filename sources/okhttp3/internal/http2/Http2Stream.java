package okhttp3.internal.http2;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.C13110a;
import okio.C13121c;
import okio.C13130e;
import okio.C13175w0;
import okio.C13179y0;
import okio.C13181z0;
import p336ef.C11921v;

/* compiled from: Http2Stream.kt */
public final class Http2Stream {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;

    /* renamed from: id */
    private final int f20877id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout = new StreamTimeout(this);
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout = new StreamTimeout(this);

    /* compiled from: Http2Stream.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class FramingSource implements C13179y0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final C13121c readBuffer = new C13121c();
        private final C13121c receiveBuffer = new C13121c();
        final /* synthetic */ Http2Stream this$0;
        private Headers trailers;

        public FramingSource(Http2Stream http2Stream, long j, boolean z) {
            C12775o.m28639i(http2Stream, "this$0");
            this.this$0 = http2Stream;
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = this.this$0;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.this$0.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public void close() {
            long size;
            Http2Stream http2Stream = this.this$0;
            synchronized (http2Stream) {
                setClosed$okhttp(true);
                size = getReadBuffer().size();
                getReadBuffer().mo52514a();
                http2Stream.notifyAll();
                C11921v vVar = C11921v.f18618a;
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            this.this$0.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final C13121c getReadBuffer() {
            return this.readBuffer;
        }

        public final C13121c getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX INFO: finally extract failed */
        public long read(C13121c cVar, long j) {
            boolean z;
            Throwable th;
            long j2;
            boolean z2;
            C13121c cVar2 = cVar;
            long j3 = j;
            C12775o.m28639i(cVar2, "sink");
            long j4 = 0;
            if (j3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (true) {
                    Http2Stream http2Stream = this.this$0;
                    synchronized (http2Stream) {
                        http2Stream.getReadTimeout$okhttp().enter();
                        try {
                            if (http2Stream.getErrorCode$okhttp() == null || getFinished$okhttp()) {
                                th = null;
                            } else {
                                th = http2Stream.getErrorException$okhttp();
                                if (th == null) {
                                    ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                    C12775o.m28636f(errorCode$okhttp);
                                    th = new StreamResetException(errorCode$okhttp);
                                }
                            }
                            if (!getClosed$okhttp()) {
                                if (getReadBuffer().size() > j4) {
                                    j2 = getReadBuffer().read(cVar2, Math.min(j3, getReadBuffer().size()));
                                    http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
                                    long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                                    if (th == null && readBytesTotal >= ((long) (http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2))) {
                                        http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                        http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                                    }
                                } else if (getFinished$okhttp() || th != null) {
                                    j2 = -1;
                                } else {
                                    http2Stream.waitForIo$okhttp();
                                    j2 = -1;
                                    z2 = true;
                                    http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                    C11921v vVar = C11921v.f18618a;
                                }
                                z2 = false;
                                http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                C11921v vVar2 = C11921v.f18618a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                            throw th2;
                        }
                    }
                    if (z2) {
                        j4 = 0;
                    } else if (j2 != -1) {
                        updateConnectionFlowControl(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(C12775o.m28647q("byteCount < 0: ", Long.valueOf(j)).toString());
            }
        }

        public final void receive$okhttp(C13130e eVar, long j) {
            boolean finished$okhttp;
            boolean z;
            boolean z2;
            long j2;
            C12775o.m28639i(eVar, APIParams.SOURCE);
            Http2Stream http2Stream = this.this$0;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                while (j > 0) {
                    synchronized (this.this$0) {
                        finished$okhttp = getFinished$okhttp();
                        z = true;
                        if (getReadBuffer().size() + j > this.maxByteCount) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C11921v vVar = C11921v.f18618a;
                    }
                    if (z2) {
                        eVar.skip(j);
                        this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (finished$okhttp) {
                        eVar.skip(j);
                        return;
                    } else {
                        long read = eVar.read(this.receiveBuffer, j);
                        if (read != -1) {
                            j -= read;
                            Http2Stream http2Stream2 = this.this$0;
                            synchronized (http2Stream2) {
                                if (getClosed$okhttp()) {
                                    j2 = getReceiveBuffer().size();
                                    getReceiveBuffer().mo52514a();
                                } else {
                                    if (getReadBuffer().size() != 0) {
                                        z = false;
                                    }
                                    getReadBuffer().mo52494K(getReceiveBuffer());
                                    if (z) {
                                        http2Stream2.notifyAll();
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                updateConnectionFlowControl(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public C13181z0 timeout() {
            return this.this$0.getReadTimeout$okhttp();
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class StreamTimeout extends C13110a {
        final /* synthetic */ Http2Stream this$0;

        public StreamTimeout(Http2Stream http2Stream) {
            C12775o.m28639i(http2Stream, "this$0");
            this.this$0 = http2Stream;
        }

        public final void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            this.this$0.closeLater(ErrorCode.CANCEL);
            this.this$0.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        C12775o.m28639i(http2Connection, "connection");
        this.f20877id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = (long) http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(this, (long) http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(this, z);
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode2, IOException iOException) {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (getErrorCode$okhttp() != null) {
                    return false;
                }
                if (getSource$okhttp().getFinished$okhttp() && getSink$okhttp().getFinished()) {
                    return false;
                }
                setErrorCode$okhttp(errorCode2);
                setErrorException$okhttp(iOException);
                notifyAll();
                C11921v vVar = C11921v.f18618a;
                this.connection.removeStream$okhttp(this.f20877id);
                return true;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z;
        boolean isOpen;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (getSource$okhttp().getFinished$okhttp() || !getSource$okhttp().getClosed$okhttp() || (!getSink$okhttp().getFinished() && !getSink$okhttp().getClosed())) {
                    z = false;
                } else {
                    z = true;
                }
                isOpen = isOpen();
                C11921v vVar = C11921v.f18618a;
            }
            if (z) {
                close(ErrorCode.CANCEL, (IOException) null);
            } else if (!isOpen) {
                this.connection.removeStream$okhttp(this.f20877id);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    public final void checkOutNotClosed$okhttp() {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        } else if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                C12775o.m28636f(errorCode2);
                th = new StreamResetException(errorCode2);
            }
            throw th;
        }
    }

    public final void close(ErrorCode errorCode2, IOException iOException) {
        C12775o.m28639i(errorCode2, "rstStatusCode");
        if (closeInternal(errorCode2, iOException)) {
            this.connection.writeSynReset$okhttp(this.f20877id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        C12775o.m28639i(errorCode2, "errorCode");
        if (closeInternal(errorCode2, (IOException) null)) {
            this.connection.writeSynResetLater$okhttp(this.f20877id, errorCode2);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        C12775o.m28639i(headers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!getSink$okhttp().getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    getSink$okhttp().setTrailers(headers);
                    C11921v vVar = C11921v.f18618a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f20877id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okio.C13175w0 getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.isLocallyInitiated()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():okio.w0");
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final C13179y0 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.f20877id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.getClient$okhttp() == z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean isOpen() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getFinished$okhttp()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0018
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getClosed$okhttp()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0018:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getFinished()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0028
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getClosed()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0028:
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.isOpen():boolean");
    }

    public final C13181z0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(C13130e eVar, int i) {
        C12775o.m28639i(eVar, APIParams.SOURCE);
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(eVar, (long) i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x006c }
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource$okhttp()     // Catch:{ all -> 0x006c }
            r0.setTrailers(r3)     // Catch:{ all -> 0x006c }
            goto L_0x004f
        L_0x0048:
            r2.hasResponseHeaders = r1     // Catch:{ all -> 0x006c }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x006c }
            r0.add(r3)     // Catch:{ all -> 0x006c }
        L_0x004f:
            if (r4 == 0) goto L_0x0058
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.getSource$okhttp()     // Catch:{ all -> 0x006c }
            r3.setFinished$okhttp(r1)     // Catch:{ all -> 0x006c }
        L_0x0058:
            boolean r3 = r2.isOpen()     // Catch:{ all -> 0x006c }
            r2.notifyAll()     // Catch:{ all -> 0x006c }
            ef.v r4 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x006c }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006b
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f20877id
            r3.removeStream$okhttp(r4)
        L_0x006b:
            return
        L_0x006c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode2) {
        C12775o.m28639i(errorCode2, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode2) {
        this.errorCode = errorCode2;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r2.readTimeout.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.Headers takeHeaders() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004a }
            r0.enter()     // Catch:{ all -> 0x004a }
        L_0x0006:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0016
            r2.waitForIo$okhttp()     // Catch:{ all -> 0x0043 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004a }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)     // Catch:{ all -> 0x004a }
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.errorException     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0042
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x004a }
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ all -> 0x004a }
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0043:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch:{ all -> 0x004a }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders():okhttp3.Headers");
    }

    public final synchronized Headers trailers() {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().mo52552t() && this.source.getReadBuffer().mo52552t()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                C12775o.m28636f(errorCode2);
                th = new StreamResetException(errorCode2);
            }
            throw th;
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) {
        boolean z3;
        C12775o.m28639i(list, "responseHeaders");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                z3 = true;
                this.hasResponseHeaders = true;
                if (z) {
                    getSink$okhttp().setFinished(true);
                }
                C11921v vVar = C11921v.f18618a;
            }
            if (!z2) {
                synchronized (this.connection) {
                    if (getConnection().getWriteBytesTotal() < getConnection().getWriteBytesMaximum()) {
                        z3 = false;
                    }
                }
                z2 = z3;
            }
            this.connection.writeHeaders$okhttp(this.f20877id, z, list);
            if (z2) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final C13181z0 writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: Http2Stream.kt */
    public final class FramingSink implements C13175w0 {
        private boolean closed;
        private boolean finished;
        private final C13121c sendBuffer;
        private Headers trailers;

        public FramingSink(Http2Stream http2Stream, boolean z) {
            C12775o.m28639i(http2Stream, "this$0");
            Http2Stream.this = http2Stream;
            this.finished = z;
            this.sendBuffer = new C13121c();
        }

        /* JADX INFO: finally extract failed */
        private final void emitFrame(boolean z) {
            long min;
            boolean z2;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !getFinished() && !getClosed() && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (!z || min != this.sendBuffer.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z3 = z2;
                C11921v vVar = C11921v.f18618a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z3, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (r10.this$0.getSink$okhttp().finished != false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
            if (r10.trailers == null) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
            if (r4 == false) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
            emitFrame(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
            r0 = r10.this$0.getConnection();
            r2 = r10.this$0.getId();
            r4 = r10.trailers;
            kotlin.jvm.internal.C12775o.m28636f(r4);
            r0.writeHeaders$okhttp(r2, r1, okhttp3.internal.Util.toHeaderList(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
            if (r0 == false) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r1 == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
            r10.this$0.getConnection().writeData(r10.this$0.getId(), true, (okio.C13121c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
            r0 = r10.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            setClosed(true);
            r1 = p336ef.C11921v.f18618a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
            r10.this$0.getConnection().flush();
            r10.this$0.cancelStreamIfNecessary$okhttp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r10.getClosed()     // Catch:{ all -> 0x00d6 }
                if (r1 == 0) goto L_0x003f
                monitor-exit(r0)
                return
            L_0x003f:
                okhttp3.internal.http2.ErrorCode r1 = r0.getErrorCode$okhttp()     // Catch:{ all -> 0x00d6 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0049
                r1 = r3
                goto L_0x004a
            L_0x0049:
                r1 = r2
            L_0x004a:
                ef.v r4 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00d6 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink$okhttp()
                boolean r0 = r0.finished
                if (r0 != 0) goto L_0x00bb
                okio.c r0 = r10.sendBuffer
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0065
                r0 = r3
                goto L_0x0066
            L_0x0065:
                r0 = r2
            L_0x0066:
                okhttp3.Headers r4 = r10.trailers
                if (r4 == 0) goto L_0x006c
                r4 = r3
                goto L_0x006d
            L_0x006c:
                r4 = r2
            L_0x006d:
                if (r4 == 0) goto L_0x0096
            L_0x006f:
                okio.c r0 = r10.sendBuffer
                long r4 = r0.size()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x007d
                r10.emitFrame(r2)
                goto L_0x006f
            L_0x007d:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                int r2 = r2.getId()
                okhttp3.Headers r4 = r10.trailers
                kotlin.jvm.internal.C12775o.m28636f(r4)
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r0.writeHeaders$okhttp(r2, r1, r4)
                goto L_0x00bb
            L_0x0096:
                if (r0 == 0) goto L_0x00a6
            L_0x0098:
                okio.c r0 = r10.sendBuffer
                long r0 = r0.size()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00bb
                r10.emitFrame(r3)
                goto L_0x0098
            L_0x00a6:
                if (r1 == 0) goto L_0x00bb
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r4 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r5 = r0.getId()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.writeData(r5, r6, r7, r8)
            L_0x00bb:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r10.setClosed(r3)     // Catch:{ all -> 0x00d3 }
                ef.v r1 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00d3 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary$okhttp()
                return
            L_0x00d3:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00d6:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    http2Stream2.checkOutNotClosed$okhttp();
                    C11921v vVar = C11921v.f18618a;
                }
                while (this.sendBuffer.size() > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public C13181z0 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        public void write(C13121c cVar, long j) {
            C12775o.m28639i(cVar, APIParams.SOURCE);
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(cVar, j);
                while (this.sendBuffer.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FramingSink(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(Http2Stream.this, (i & 1) != 0 ? false : z);
        }
    }
}
