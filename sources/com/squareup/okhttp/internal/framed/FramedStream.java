package com.squareup.okhttp.internal.framed;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okio.C13110a;
import okio.C13121c;
import okio.C13130e;
import okio.C13175w0;
import okio.C13179y0;
import okio.C13181z0;

public final class FramedStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    /* access modifiers changed from: private */
    public final FramedConnection connection;
    /* access modifiers changed from: private */
    public ErrorCode errorCode = null;
    /* access modifiers changed from: private */

    /* renamed from: id */
    public final int f18176id;
    /* access modifiers changed from: private */
    public final StreamTimeout readTimeout = new StreamTimeout();
    private final List<Header> requestHeaders;
    private List<Header> responseHeaders;
    final FramedDataSink sink;
    private final FramedDataSource source;
    long unacknowledgedBytesRead = 0;
    /* access modifiers changed from: private */
    public final StreamTimeout writeTimeout = new StreamTimeout();

    final class FramedDataSink implements C13175w0 {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        /* access modifiers changed from: private */
        public boolean closed;
        /* access modifiers changed from: private */
        public boolean finished;
        private final C13121c sendBuffer = new C13121c();

        FramedDataSink() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            com.squareup.okhttp.internal.framed.FramedStream.access$1100(r11.this$0).exitAndThrowIfTimedOut();
            com.squareup.okhttp.internal.framed.FramedStream.access$1200(r11.this$0);
            r9 = java.lang.Math.min(r11.this$0.bytesLeftInWriteWindow, r11.sendBuffer.size());
            r1 = r11.this$0;
            r1.bytesLeftInWriteWindow -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void emitDataFrame(boolean r12) {
            /*
                r11 = this;
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                monitor-enter(r0)
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0096 }
                com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r1 = r1.writeTimeout     // Catch:{ all -> 0x0096 }
                r1.enter()     // Catch:{ all -> 0x0096 }
            L_0x000c:
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x008b }
                long r2 = r1.bytesLeftInWriteWindow     // Catch:{ all -> 0x008b }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L_0x002a
                boolean r2 = r11.finished     // Catch:{ all -> 0x008b }
                if (r2 != 0) goto L_0x002a
                boolean r2 = r11.closed     // Catch:{ all -> 0x008b }
                if (r2 != 0) goto L_0x002a
                com.squareup.okhttp.internal.framed.ErrorCode r1 = r1.errorCode     // Catch:{ all -> 0x008b }
                if (r1 != 0) goto L_0x002a
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x008b }
                r1.waitForIo()     // Catch:{ all -> 0x008b }
                goto L_0x000c
            L_0x002a:
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0096 }
                com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r1 = r1.writeTimeout     // Catch:{ all -> 0x0096 }
                r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x0096 }
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0096 }
                r1.checkOutNotClosed()     // Catch:{ all -> 0x0096 }
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0096 }
                long r1 = r1.bytesLeftInWriteWindow     // Catch:{ all -> 0x0096 }
                okio.c r3 = r11.sendBuffer     // Catch:{ all -> 0x0096 }
                long r3 = r3.size()     // Catch:{ all -> 0x0096 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0096 }
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0096 }
                long r2 = r1.bytesLeftInWriteWindow     // Catch:{ all -> 0x0096 }
                long r2 = r2 - r9
                r1.bytesLeftInWriteWindow = r2     // Catch:{ all -> 0x0096 }
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r0 = r1.writeTimeout
                r0.enter()
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0080 }
                com.squareup.okhttp.internal.framed.FramedConnection r5 = r0.connection     // Catch:{ all -> 0x0080 }
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0080 }
                int r6 = r0.f18176id     // Catch:{ all -> 0x0080 }
                if (r12 == 0) goto L_0x006f
                okio.c r12 = r11.sendBuffer     // Catch:{ all -> 0x0080 }
                long r0 = r12.size()     // Catch:{ all -> 0x0080 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x006f
                r12 = 1
                goto L_0x0070
            L_0x006f:
                r12 = 0
            L_0x0070:
                r7 = r12
                okio.c r8 = r11.sendBuffer     // Catch:{ all -> 0x0080 }
                r5.writeData(r6, r7, r8, r9)     // Catch:{ all -> 0x0080 }
                com.squareup.okhttp.internal.framed.FramedStream r12 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r12 = r12.writeTimeout
                r12.exitAndThrowIfTimedOut()
                return
            L_0x0080:
                r12 = move-exception
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r0 = r0.writeTimeout
                r0.exitAndThrowIfTimedOut()
                throw r12
            L_0x008b:
                r12 = move-exception
                com.squareup.okhttp.internal.framed.FramedStream r1 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x0096 }
                com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r1 = r1.writeTimeout     // Catch:{ all -> 0x0096 }
                r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x0096 }
                throw r12     // Catch:{ all -> 0x0096 }
            L_0x0096:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.FramedDataSink.emitDataFrame(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            emitDataFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).writeData(com.squareup.okhttp.internal.framed.FramedStream.access$600(r8.this$0), true, (okio.C13121c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
            r2 = r8.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.closed = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).flush();
            com.squareup.okhttp.internal.framed.FramedStream.access$1000(r8.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.this$0.sink.finished != false) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedStream$FramedDataSink r0 = r0.sink
                boolean r0 = r0.finished
                r1 = 1
                if (r0 != 0) goto L_0x0040
                okio.c r0 = r8.sendBuffer
                long r2 = r0.size()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                okio.c r0 = r8.sendBuffer
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
                r8.emitDataFrame(r1)
                goto L_0x001f
            L_0x002d:
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r0.connection
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                int r3 = r0.f18176id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x0040:
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this
                monitor-enter(r2)
                r8.closed = r1     // Catch:{ all -> 0x0055 }
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedConnection r0 = r0.connection
                r0.flush()
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                r0.cancelStreamIfNecessary()
                return
            L_0x0055:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                throw r0
            L_0x0058:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.FramedDataSink.close():void");
        }

        public void flush() {
            synchronized (FramedStream.this) {
                FramedStream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitDataFrame(false);
                FramedStream.this.connection.flush();
            }
        }

        public C13181z0 timeout() {
            return FramedStream.this.writeTimeout;
        }

        public void write(C13121c cVar, long j) {
            this.sendBuffer.write(cVar, j);
            while (this.sendBuffer.size() >= 16384) {
                emitDataFrame(false);
            }
        }
    }

    private final class FramedDataSource implements C13179y0 {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        /* access modifiers changed from: private */
        public boolean closed;
        /* access modifiers changed from: private */
        public boolean finished;
        private final long maxByteCount;
        private final C13121c readBuffer;
        private final C13121c receiveBuffer;

        private void checkNotClosed() {
            if (this.closed) {
                throw new IOException("stream closed");
            } else if (FramedStream.this.errorCode != null) {
                throw new IOException("stream was reset: " + FramedStream.this.errorCode);
            }
        }

        private void waitUntilReadable() {
            FramedStream.this.readTimeout.enter();
            while (this.readBuffer.size() == 0 && !this.finished && !this.closed && FramedStream.this.errorCode == null) {
                try {
                    FramedStream.this.waitForIo();
                } finally {
                    FramedStream.this.readTimeout.exitAndThrowIfTimedOut();
                }
            }
        }

        public void close() {
            synchronized (FramedStream.this) {
                this.closed = true;
                this.readBuffer.mo52514a();
                FramedStream.this.notifyAll();
            }
            FramedStream.this.cancelStreamIfNecessary();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
            r11 = com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).unacknowledgedBytesRead += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
            if (com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).unacknowledgedBytesRead < ((long) (com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).okHttpSettings.getInitialWindowSize(65536) / 2))) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
            com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).writeWindowUpdateLater(0, com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).unacknowledgedBytesRead);
            com.squareup.okhttp.internal.framed.FramedStream.access$500(r8.this$0).unacknowledgedBytesRead = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
            return r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(okio.C13121c r9, long r10) {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00ac
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this
                monitor-enter(r2)
                r8.waitUntilReadable()     // Catch:{ all -> 0x00a9 }
                r8.checkNotClosed()     // Catch:{ all -> 0x00a9 }
                okio.c r3 = r8.readBuffer     // Catch:{ all -> 0x00a9 }
                long r3 = r3.size()     // Catch:{ all -> 0x00a9 }
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L_0x001d
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                r9 = -1
                return r9
            L_0x001d:
                okio.c r3 = r8.readBuffer     // Catch:{ all -> 0x00a9 }
                long r4 = r3.size()     // Catch:{ all -> 0x00a9 }
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x00a9 }
                long r9 = r3.read(r9, r10)     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a9 }
                long r3 = r11.unacknowledgedBytesRead     // Catch:{ all -> 0x00a9 }
                long r3 = r3 + r9
                r11.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.FramedConnection r11 = r11.connection     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.Settings r11 = r11.okHttpSettings     // Catch:{ all -> 0x00a9 }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.getInitialWindowSize(r5)     // Catch:{ all -> 0x00a9 }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x00a9 }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x005c
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.FramedConnection r11 = r11.connection     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.FramedStream r3 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a9 }
                int r3 = r3.f18176id     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.FramedStream r4 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a9 }
                long r6 = r4.unacknowledgedBytesRead     // Catch:{ all -> 0x00a9 }
                r11.writeWindowUpdateLater(r3, r6)     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a9 }
                r11.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x00a9 }
            L_0x005c:
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedConnection r11 = r11.connection
                monitor-enter(r11)
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x00a6 }
                long r3 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x00a6 }
                long r3 = r3 + r9
                r2.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x00a6 }
                long r2 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedStream r4 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedConnection r4 = r4.connection     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.Settings r4 = r4.okHttpSettings     // Catch:{ all -> 0x00a6 }
                int r4 = r4.getInitialWindowSize(r5)     // Catch:{ all -> 0x00a6 }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00a6 }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x00a4
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedStream r3 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedConnection r3 = r3.connection     // Catch:{ all -> 0x00a6 }
                long r3 = r3.unacknowledgedBytesRead     // Catch:{ all -> 0x00a6 }
                r5 = 0
                r2.writeWindowUpdateLater(r5, r3)     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x00a6 }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x00a6 }
                r2.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x00a6 }
            L_0x00a4:
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                return r9
            L_0x00a6:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                throw r9
            L_0x00a9:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                throw r9
            L_0x00ac:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.FramedDataSource.read(okio.c, long):long");
        }

        /* access modifiers changed from: package-private */
        public void receive(C13130e eVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (FramedStream.this) {
                    z = this.finished;
                    z2 = true;
                    if (this.readBuffer.size() + j > this.maxByteCount) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    eVar.skip(j);
                    FramedStream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long read = eVar.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (FramedStream.this) {
                            if (this.readBuffer.size() != 0) {
                                z2 = false;
                            }
                            this.readBuffer.mo52494K(this.receiveBuffer);
                            if (z2) {
                                FramedStream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public C13181z0 timeout() {
            return FramedStream.this.readTimeout;
        }

        private FramedDataSource(long j) {
            this.receiveBuffer = new C13121c();
            this.readBuffer = new C13121c();
            this.maxByteCount = j;
        }
    }

    class StreamTimeout extends C13110a {
        StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() {
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
            FramedStream.this.closeLater(ErrorCode.CANCEL);
        }
    }

    FramedStream(int i, FramedConnection framedConnection, boolean z, boolean z2, List<Header> list) {
        if (framedConnection == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f18176id = i;
            this.connection = framedConnection;
            this.bytesLeftInWriteWindow = (long) framedConnection.peerSettings.getInitialWindowSize(65536);
            FramedDataSource framedDataSource = new FramedDataSource((long) framedConnection.okHttpSettings.getInitialWindowSize(65536));
            this.source = framedDataSource;
            FramedDataSink framedDataSink = new FramedDataSink();
            this.sink = framedDataSink;
            boolean unused = framedDataSource.finished = z2;
            boolean unused2 = framedDataSink.finished = z;
            this.requestHeaders = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    /* access modifiers changed from: private */
    public void cancelStreamIfNecessary() {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            if (this.source.finished || !this.source.closed || (!this.sink.finished && !this.sink.closed)) {
                z = false;
            } else {
                z = true;
            }
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.connection.removeStream(this.f18176id);
        }
    }

    /* access modifiers changed from: private */
    public void checkOutNotClosed() {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        } else if (this.sink.finished) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            throw new IOException("stream was reset: " + this.errorCode);
        }
    }

    private boolean closeInternal(ErrorCode errorCode2) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode2;
            notifyAll();
            this.connection.removeStream(this.f18176id);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public void waitForIo() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* access modifiers changed from: package-private */
    public void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public void close(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynReset(this.f18176id, errorCode2);
        }
    }

    public void closeLater(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynResetLater(this.f18176id, errorCode2);
        }
    }

    public FramedConnection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.f18176id;
    }

    public List<Header> getRequestHeaders() {
        return this.requestHeaders;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r3.readTimeout.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.squareup.okhttp.internal.framed.Header> getResponseHeaders() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r0 = r3.readTimeout     // Catch:{ all -> 0x003d }
            r0.enter()     // Catch:{ all -> 0x003d }
        L_0x0006:
            java.util.List<com.squareup.okhttp.internal.framed.Header> r0 = r3.responseHeaders     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            com.squareup.okhttp.internal.framed.ErrorCode r0 = r3.errorCode     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            r3.waitForIo()     // Catch:{ all -> 0x0036 }
            goto L_0x0006
        L_0x0012:
            com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r0 = r3.readTimeout     // Catch:{ all -> 0x003d }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x003d }
            java.util.List<com.squareup.okhttp.internal.framed.Header> r0 = r3.responseHeaders     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001d
            monitor-exit(r3)
            return r0
        L_0x001d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x003d }
            com.squareup.okhttp.internal.framed.ErrorCode r2 = r3.errorCode     // Catch:{ all -> 0x003d }
            r1.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0036:
            r0 = move-exception
            com.squareup.okhttp.internal.framed.FramedStream$StreamTimeout r1 = r3.readTimeout     // Catch:{ all -> 0x003d }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.getResponseHeaders():java.util.List");
    }

    public C13175w0 getSink() {
        synchronized (this) {
            if (this.responseHeaders == null) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.sink;
    }

    public C13179y0 getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        boolean z;
        if ((this.f18176id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.client == z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isOpen() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.squareup.okhttp.internal.framed.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            com.squareup.okhttp.internal.framed.FramedStream$FramedDataSource r0 = r2.source     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.finished     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0018
            com.squareup.okhttp.internal.framed.FramedStream$FramedDataSource r0 = r2.source     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.closed     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0018:
            com.squareup.okhttp.internal.framed.FramedStream$FramedDataSink r0 = r2.sink     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.finished     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0028
            com.squareup.okhttp.internal.framed.FramedStream$FramedDataSink r0 = r2.sink     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.closed     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0028:
            java.util.List<com.squareup.okhttp.internal.framed.Header> r0 = r2.responseHeaders     // Catch:{ all -> 0x0031 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.isOpen():boolean");
    }

    public C13181z0 readTimeout() {
        return this.readTimeout;
    }

    /* access modifiers changed from: package-private */
    public void receiveData(C13130e eVar, int i) {
        this.source.receive(eVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    public void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            boolean unused = this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f18176id);
        }
    }

    /* access modifiers changed from: package-private */
    public void receiveHeaders(List<Header> list, HeadersMode headersMode) {
        ErrorCode errorCode2;
        boolean z;
        synchronized (this) {
            errorCode2 = null;
            z = true;
            if (this.responseHeaders == null) {
                if (headersMode.failIfHeadersAbsent()) {
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                } else {
                    this.responseHeaders = list;
                    z = isOpen();
                    notifyAll();
                }
            } else if (headersMode.failIfHeadersPresent()) {
                errorCode2 = ErrorCode.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.responseHeaders);
                arrayList.addAll(list);
                this.responseHeaders = arrayList;
            }
        }
        if (errorCode2 != null) {
            closeLater(errorCode2);
        } else if (!z) {
            this.connection.removeStream(this.f18176id);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void receiveRstStream(ErrorCode errorCode2) {
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public void reply(List<Header> list, boolean z) {
        boolean z2;
        synchronized (this) {
            if (list != null) {
                try {
                    if (this.responseHeaders == null) {
                        this.responseHeaders = list;
                        if (!z) {
                            z2 = true;
                            boolean unused = this.sink.finished = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        throw new IllegalStateException("reply already sent");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new NullPointerException("responseHeaders == null");
            }
        }
        this.connection.writeSynReply(this.f18176id, z2, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public C13181z0 writeTimeout() {
        return this.writeTimeout;
    }
}
