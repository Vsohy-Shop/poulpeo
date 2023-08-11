package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.p325io.RealConnection;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.C13175w0;
import okio.C13181z0;

public final class StreamAllocation {
    public final Address address;
    private boolean canceled;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    private boolean released;
    private RouteSelector routeSelector;
    private HttpStream stream;

    public StreamAllocation(ConnectionPool connectionPool2, Address address2) {
        this.connectionPool = connectionPool2;
        this.address = address2;
    }

    private void connectionFailed(IOException iOException) {
        synchronized (this.connectionPool) {
            if (this.routeSelector != null) {
                RealConnection realConnection = this.connection;
                if (realConnection.streamCount == 0) {
                    this.routeSelector.connectFailed(realConnection.getRoute(), iOException);
                } else {
                    this.routeSelector = null;
                }
            }
        }
        connectionFailed();
    }

    private void deallocate(boolean z, boolean z2, boolean z3) {
        RealConnection realConnection;
        RealConnection realConnection2;
        synchronized (this.connectionPool) {
            realConnection = null;
            if (z3) {
                try {
                    this.stream = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z2) {
                this.released = true;
            }
            RealConnection realConnection3 = this.connection;
            if (realConnection3 != null) {
                if (z) {
                    realConnection3.noNewStreams = true;
                }
                if (this.stream == null && (this.released || realConnection3.noNewStreams)) {
                    release(realConnection3);
                    RealConnection realConnection4 = this.connection;
                    if (realConnection4.streamCount > 0) {
                        this.routeSelector = null;
                    }
                    if (realConnection4.allocations.isEmpty()) {
                        this.connection.idleAtNanos = System.nanoTime();
                        if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                            realConnection2 = this.connection;
                            this.connection = null;
                            realConnection = realConnection2;
                        }
                    }
                    realConnection2 = null;
                    this.connection = null;
                    realConnection = realConnection2;
                }
            }
        }
        if (realConnection != null) {
            Util.closeQuietly(realConnection.getSocket());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r7 = new com.squareup.okhttp.internal.p325io.RealConnection(r8.routeSelector.next());
        acquire(r7);
        r1 = r8.connectionPool;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        com.squareup.okhttp.internal.Internal.instance.put(r8.connectionPool, r7);
        r8.connection = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r8.canceled != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        r7.connect(r9, r10, r11, r8.address.getConnectionSpecs(), r12);
        routeDatabase().connected(r7.getRoute());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        throw new java.io.IOException("Canceled");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.okhttp.internal.p325io.RealConnection findConnection(int r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            com.squareup.okhttp.ConnectionPool r0 = r8.connectionPool
            monitor-enter(r0)
            boolean r1 = r8.released     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x008f
            com.squareup.okhttp.internal.http.HttpStream r1 = r8.stream     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0087
            boolean r1 = r8.canceled     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x007f
            com.squareup.okhttp.internal.io.RealConnection r1 = r8.connection     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.noNewStreams     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return r1
        L_0x0019:
            com.squareup.okhttp.internal.Internal r1 = com.squareup.okhttp.internal.Internal.instance     // Catch:{ all -> 0x0097 }
            com.squareup.okhttp.ConnectionPool r2 = r8.connectionPool     // Catch:{ all -> 0x0097 }
            com.squareup.okhttp.Address r3 = r8.address     // Catch:{ all -> 0x0097 }
            com.squareup.okhttp.internal.io.RealConnection r1 = r1.get(r2, r3, r8)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0029
            r8.connection = r1     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return r1
        L_0x0029:
            com.squareup.okhttp.internal.http.RouteSelector r1 = r8.routeSelector     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x003a
            com.squareup.okhttp.internal.http.RouteSelector r1 = new com.squareup.okhttp.internal.http.RouteSelector     // Catch:{ all -> 0x0097 }
            com.squareup.okhttp.Address r2 = r8.address     // Catch:{ all -> 0x0097 }
            com.squareup.okhttp.internal.RouteDatabase r3 = r8.routeDatabase()     // Catch:{ all -> 0x0097 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0097 }
            r8.routeSelector = r1     // Catch:{ all -> 0x0097 }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            com.squareup.okhttp.internal.http.RouteSelector r0 = r8.routeSelector
            com.squareup.okhttp.Route r0 = r0.next()
            com.squareup.okhttp.internal.io.RealConnection r7 = new com.squareup.okhttp.internal.io.RealConnection
            r7.<init>(r0)
            r8.acquire(r7)
            com.squareup.okhttp.ConnectionPool r1 = r8.connectionPool
            monitor-enter(r1)
            com.squareup.okhttp.internal.Internal r0 = com.squareup.okhttp.internal.Internal.instance     // Catch:{ all -> 0x007c }
            com.squareup.okhttp.ConnectionPool r2 = r8.connectionPool     // Catch:{ all -> 0x007c }
            r0.put(r2, r7)     // Catch:{ all -> 0x007c }
            r8.connection = r7     // Catch:{ all -> 0x007c }
            boolean r0 = r8.canceled     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            com.squareup.okhttp.Address r0 = r8.address
            java.util.List r5 = r0.getConnectionSpecs()
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r1.connect(r2, r3, r4, r5, r6)
            com.squareup.okhttp.internal.RouteDatabase r9 = r8.routeDatabase()
            com.squareup.okhttp.Route r10 = r7.getRoute()
            r9.connected(r10)
            return r7
        L_0x0074:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x007c }
            java.lang.String r10 = "Canceled"
            r9.<init>(r10)     // Catch:{ all -> 0x007c }
            throw r9     // Catch:{ all -> 0x007c }
        L_0x007c:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            throw r9
        L_0x007f:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "Canceled"
            r9.<init>(r10)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x0087:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "stream != null"
            r9.<init>(r10)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x008f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "released"
            r9.<init>(r10)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.StreamAllocation.findConnection(int, int, int, boolean):com.squareup.okhttp.internal.io.RealConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.isHealthy(r8) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.okhttp.internal.p325io.RealConnection findHealthyConnection(int r4, int r5, int r6, boolean r7, boolean r8) {
        /*
            r3 = this;
        L_0x0000:
            com.squareup.okhttp.internal.io.RealConnection r0 = r3.findConnection(r4, r5, r6, r7)
            com.squareup.okhttp.ConnectionPool r1 = r3.connectionPool
            monitor-enter(r1)
            int r2 = r0.streamCount     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.isHealthy(r8)
            if (r1 == 0) goto L_0x0015
            return r0
        L_0x0015:
            r3.connectionFailed()
            goto L_0x0000
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.StreamAllocation.findHealthyConnection(int, int, int, boolean, boolean):com.squareup.okhttp.internal.io.RealConnection");
    }

    private boolean isRecoverable(IOException iOException) {
        if (!(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException)) {
            return true;
        }
        return false;
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public void acquire(RealConnection realConnection) {
        realConnection.allocations.add(new WeakReference(this));
    }

    public void cancel() {
        HttpStream httpStream;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpStream = this.stream;
            realConnection = this.connection;
        }
        if (httpStream != null) {
            httpStream.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public synchronized RealConnection connection() {
        return this.connection;
    }

    public HttpStream newStream(int i, int i2, int i3, boolean z, boolean z2) {
        HttpStream httpStream;
        try {
            RealConnection findHealthyConnection = findHealthyConnection(i, i2, i3, z, z2);
            if (findHealthyConnection.framedConnection != null) {
                httpStream = new Http2xStream(this, findHealthyConnection.framedConnection);
            } else {
                findHealthyConnection.getSocket().setSoTimeout(i2);
                C13181z0 timeout = findHealthyConnection.source.timeout();
                long j = (long) i2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeout.timeout(j, timeUnit);
                findHealthyConnection.sink.timeout().timeout((long) i3, timeUnit);
                httpStream = new Http1xStream(this, findHealthyConnection.source, findHealthyConnection.sink);
            }
            synchronized (this.connectionPool) {
                findHealthyConnection.streamCount++;
                this.stream = httpStream;
            }
            return httpStream;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    public void noNewStreams() {
        deallocate(true, false, false);
    }

    public boolean recover(RouteException routeException) {
        if (this.connection != null) {
            connectionFailed(routeException.getLastConnectException());
        }
        RouteSelector routeSelector2 = this.routeSelector;
        return (routeSelector2 == null || routeSelector2.hasNext()) && isRecoverable(routeException);
    }

    public void release() {
        deallocate(false, true, false);
    }

    public HttpStream stream() {
        HttpStream httpStream;
        synchronized (this.connectionPool) {
            httpStream = this.stream;
        }
        return httpStream;
    }

    public void streamFinished(HttpStream httpStream) {
        synchronized (this.connectionPool) {
            if (httpStream != null) {
                if (httpStream == this.stream) {
                }
            }
            throw new IllegalStateException("expected " + this.stream + " but was " + httpStream);
        }
        deallocate(false, false, true);
    }

    public String toString() {
        return this.address.toString();
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (realConnection.allocations.get(i).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private boolean isRecoverable(RouteException routeException) {
        IOException lastConnectException = routeException.getLastConnectException();
        if (lastConnectException instanceof ProtocolException) {
            return false;
        }
        if (lastConnectException instanceof InterruptedIOException) {
            return lastConnectException instanceof SocketTimeoutException;
        }
        if ((!(lastConnectException instanceof SSLHandshakeException) || !(lastConnectException.getCause() instanceof CertificateException)) && !(lastConnectException instanceof SSLPeerUnverifiedException)) {
            return true;
        }
        return false;
    }

    public boolean recover(IOException iOException, C13175w0 w0Var) {
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            int i = realConnection.streamCount;
            connectionFailed(iOException);
            if (i == 1) {
                return false;
            }
        }
        boolean z = w0Var == null || (w0Var instanceof RetryableSink);
        RouteSelector routeSelector2 = this.routeSelector;
        return (routeSelector2 == null || routeSelector2.hasNext()) && isRecoverable(iOException) && z;
    }

    public void connectionFailed() {
        deallocate(true, false, true);
    }
}
