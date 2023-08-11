package com.squareup.okhttp.internal.framed;

import androidx.core.location.LocationRequestCompat;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FrameReader;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;

public final class FramedConnection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    /* access modifiers changed from: private */
    public static final ExecutorService executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp FramedConnection", true));
    long bytesLeftInWriteWindow;
    final boolean client;
    /* access modifiers changed from: private */
    public final Set<Integer> currentPushRequests;
    final FrameWriter frameWriter;
    /* access modifiers changed from: private */
    public final String hostName;
    private long idleStartTimeNs;
    /* access modifiers changed from: private */
    public int lastGoodStreamId;
    /* access modifiers changed from: private */
    public final Listener listener;
    private int nextPingId;
    /* access modifiers changed from: private */
    public int nextStreamId;
    Settings okHttpSettings;
    final Settings peerSettings;
    private Map<Integer, Ping> pings;
    final Protocol protocol;
    private final ExecutorService pushExecutor;
    /* access modifiers changed from: private */
    public final PushObserver pushObserver;
    final Reader readerRunnable;
    /* access modifiers changed from: private */
    public boolean receivedInitialPeerSettings;
    /* access modifiers changed from: private */
    public boolean shutdown;
    final Socket socket;
    /* access modifiers changed from: private */
    public final Map<Integer, FramedStream> streams;
    long unacknowledgedBytesRead;
    final Variant variant;

    public static class Builder {
        /* access modifiers changed from: private */
        public boolean client;
        /* access modifiers changed from: private */
        public String hostName;
        /* access modifiers changed from: private */
        public Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        /* access modifiers changed from: private */
        public Protocol protocol = Protocol.SPDY_3;
        /* access modifiers changed from: private */
        public PushObserver pushObserver = PushObserver.CANCEL;
        /* access modifiers changed from: private */
        public C13127d sink;
        /* access modifiers changed from: private */
        public Socket socket;
        /* access modifiers changed from: private */
        public C13130e source;

        public Builder(boolean z) {
            this.client = z;
        }

        public FramedConnection build() {
            return new FramedConnection(this);
        }

        public Builder listener(Listener listener2) {
            this.listener = listener2;
            return this;
        }

        public Builder protocol(Protocol protocol2) {
            this.protocol = protocol2;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver2) {
            this.pushObserver = pushObserver2;
            return this;
        }

        public Builder socket(Socket socket2) {
            return socket(socket2, ((InetSocketAddress) socket2.getRemoteSocketAddress()).getHostName(), C13145j0.m29739d(C13145j0.m29748m(socket2)), C13145j0.m29738c(C13145j0.m29744i(socket2)));
        }

        public Builder socket(Socket socket2, String str, C13130e eVar, C13127d dVar) {
            this.socket = socket2;
            this.hostName = str;
            this.source = eVar;
            this.sink = dVar;
            return this;
        }
    }

    class Reader extends NamedRunnable implements FrameReader.Handler {
        final FrameReader frameReader;

        private void ackSettingsLater(final Settings settings) {
            FramedConnection.executor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{FramedConnection.this.hostName}) {
                public void execute() {
                    try {
                        FramedConnection.this.frameWriter.ackSettings(settings);
                    } catch (IOException unused) {
                    }
                }
            });
        }

        public void data(boolean z, int i, C13130e eVar, int i2) {
            if (FramedConnection.this.pushedStream(i)) {
                FramedConnection.this.pushDataLater(i, eVar, i2, z);
                return;
            }
            FramedStream stream = FramedConnection.this.getStream(i);
            if (stream == null) {
                FramedConnection.this.writeSynResetLater(i, ErrorCode.INVALID_STREAM);
                eVar.skip((long) i2);
                return;
            }
            stream.receiveData(eVar, i2);
            if (z) {
                stream.receiveFin();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            com.squareup.okhttp.internal.framed.FramedConnection.access$1200(r5.this$0, r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
            r4 = r2;
            r2 = r1;
            r1 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void execute() {
            /*
                r5 = this;
                com.squareup.okhttp.internal.framed.ErrorCode r0 = com.squareup.okhttp.internal.framed.ErrorCode.INTERNAL_ERROR
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.client     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 != 0) goto L_0x000d
                com.squareup.okhttp.internal.framed.FrameReader r1 = r5.frameReader     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                r1.readConnectionPreface()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            L_0x000d:
                com.squareup.okhttp.internal.framed.FrameReader r1 = r5.frameReader     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.nextFrame(r5)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 == 0) goto L_0x0016
                goto L_0x000d
            L_0x0016:
                com.squareup.okhttp.internal.framed.ErrorCode r1 = com.squareup.okhttp.internal.framed.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                com.squareup.okhttp.internal.framed.ErrorCode r0 = com.squareup.okhttp.internal.framed.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0024 }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ IOException -> 0x002b }
                r2.close(r1, r0)     // Catch:{ IOException -> 0x002b }
                goto L_0x002b
            L_0x0020:
                r1 = move-exception
                r2 = r0
                goto L_0x0035
            L_0x0023:
                r1 = r0
            L_0x0024:
                com.squareup.okhttp.internal.framed.ErrorCode r0 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0031 }
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ IOException -> 0x002b }
                r1.close(r0, r0)     // Catch:{ IOException -> 0x002b }
            L_0x002b:
                com.squareup.okhttp.internal.framed.FrameReader r0 = r5.frameReader
                com.squareup.okhttp.internal.Util.closeQuietly((java.io.Closeable) r0)
                return
            L_0x0031:
                r2 = move-exception
                r4 = r2
                r2 = r1
                r1 = r4
            L_0x0035:
                com.squareup.okhttp.internal.framed.FramedConnection r3 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ IOException -> 0x003a }
                r3.close(r2, r0)     // Catch:{ IOException -> 0x003a }
            L_0x003a:
                com.squareup.okhttp.internal.framed.FrameReader r0 = r5.frameReader
                com.squareup.okhttp.internal.Util.closeQuietly((java.io.Closeable) r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.Reader.execute():void");
        }

        public void goAway(int i, ErrorCode errorCode, C13133f fVar) {
            FramedStream[] framedStreamArr;
            fVar.mo52590H();
            synchronized (FramedConnection.this) {
                framedStreamArr = (FramedStream[]) FramedConnection.this.streams.values().toArray(new FramedStream[FramedConnection.this.streams.size()]);
                boolean unused = FramedConnection.this.shutdown = true;
            }
            for (FramedStream framedStream : framedStreamArr) {
                if (framedStream.getId() > i && framedStream.isLocallyInitiated()) {
                    framedStream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    FramedConnection.this.removeStream(framedStream.getId());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
            if (r14.failIfStreamPresent() == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
            r0.closeLater(com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR);
            r8.this$0.removeStream(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
            r0.receiveHeaders(r13, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
            r0.receiveFin();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void headers(boolean r9, boolean r10, int r11, int r12, java.util.List<com.squareup.okhttp.internal.framed.Header> r13, com.squareup.okhttp.internal.framed.HeadersMode r14) {
            /*
                r8 = this;
                com.squareup.okhttp.internal.framed.FramedConnection r12 = com.squareup.okhttp.internal.framed.FramedConnection.this
                boolean r12 = r12.pushedStream(r11)
                if (r12 == 0) goto L_0x000e
                com.squareup.okhttp.internal.framed.FramedConnection r9 = com.squareup.okhttp.internal.framed.FramedConnection.this
                r9.pushHeadersLater(r11, r13, r10)
                return
            L_0x000e:
                com.squareup.okhttp.internal.framed.FramedConnection r12 = com.squareup.okhttp.internal.framed.FramedConnection.this
                monitor-enter(r12)
                com.squareup.okhttp.internal.framed.FramedConnection r0 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                boolean r0 = r0.shutdown     // Catch:{ all -> 0x00a5 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x001b:
                com.squareup.okhttp.internal.framed.FramedConnection r0 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.FramedStream r0 = r0.getStream(r11)     // Catch:{ all -> 0x00a5 }
                if (r0 != 0) goto L_0x008a
                boolean r14 = r14.failIfStreamAbsent()     // Catch:{ all -> 0x00a5 }
                if (r14 == 0) goto L_0x0032
                com.squareup.okhttp.internal.framed.FramedConnection r9 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.ErrorCode r10 = com.squareup.okhttp.internal.framed.ErrorCode.INVALID_STREAM     // Catch:{ all -> 0x00a5 }
                r9.writeSynResetLater(r11, r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x0032:
                com.squareup.okhttp.internal.framed.FramedConnection r14 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                int r14 = r14.lastGoodStreamId     // Catch:{ all -> 0x00a5 }
                if (r11 > r14) goto L_0x003c
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x003c:
                int r14 = r11 % 2
                com.squareup.okhttp.internal.framed.FramedConnection r0 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                int r0 = r0.nextStreamId     // Catch:{ all -> 0x00a5 }
                r1 = 2
                int r0 = r0 % r1
                if (r14 != r0) goto L_0x004a
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x004a:
                com.squareup.okhttp.internal.framed.FramedStream r14 = new com.squareup.okhttp.internal.framed.FramedStream     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.FramedConnection r4 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                r2 = r14
                r3 = r11
                r5 = r9
                r6 = r10
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.FramedConnection r9 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                int unused = r9.lastGoodStreamId = r11     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.FramedConnection r9 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                java.util.Map r9 = r9.streams     // Catch:{ all -> 0x00a5 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r9.put(r10, r14)     // Catch:{ all -> 0x00a5 }
                java.util.concurrent.ExecutorService r9 = com.squareup.okhttp.internal.framed.FramedConnection.executor     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.FramedConnection$Reader$1 r10 = new com.squareup.okhttp.internal.framed.FramedConnection$Reader$1     // Catch:{ all -> 0x00a5 }
                java.lang.String r13 = "OkHttp %s stream %d"
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                java.lang.String r1 = r1.hostName     // Catch:{ all -> 0x00a5 }
                r2 = 0
                r0[r2] = r1     // Catch:{ all -> 0x00a5 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r1 = 1
                r0[r1] = r11     // Catch:{ all -> 0x00a5 }
                r10.<init>(r13, r0, r14)     // Catch:{ all -> 0x00a5 }
                r9.execute(r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x008a:
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                boolean r9 = r14.failIfStreamPresent()
                if (r9 == 0) goto L_0x009c
                com.squareup.okhttp.internal.framed.ErrorCode r9 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR
                r0.closeLater(r9)
                com.squareup.okhttp.internal.framed.FramedConnection r9 = com.squareup.okhttp.internal.framed.FramedConnection.this
                r9.removeStream(r11)
                return
            L_0x009c:
                r0.receiveHeaders(r13, r14)
                if (r10 == 0) goto L_0x00a4
                r0.receiveFin()
            L_0x00a4:
                return
            L_0x00a5:
                r9 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.Reader.headers(boolean, boolean, int, int, java.util.List, com.squareup.okhttp.internal.framed.HeadersMode):void");
        }

        public void ping(boolean z, int i, int i2) {
            if (z) {
                Ping access$2400 = FramedConnection.this.removePing(i);
                if (access$2400 != null) {
                    access$2400.receive();
                    return;
                }
                return;
            }
            FramedConnection.this.writePingLater(true, i, i2, (Ping) null);
        }

        public void pushPromise(int i, int i2, List<Header> list) {
            FramedConnection.this.pushRequestLater(i2, list);
        }

        public void rstStream(int i, ErrorCode errorCode) {
            if (FramedConnection.this.pushedStream(i)) {
                FramedConnection.this.pushResetLater(i, errorCode);
                return;
            }
            FramedStream removeStream = FramedConnection.this.removeStream(i);
            if (removeStream != null) {
                removeStream.receiveRstStream(errorCode);
            }
        }

        /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void settings(boolean r11, com.squareup.okhttp.internal.framed.Settings r12) {
            /*
                r10 = this;
                com.squareup.okhttp.internal.framed.FramedConnection r0 = com.squareup.okhttp.internal.framed.FramedConnection.this
                monitor-enter(r0)
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.Settings r1 = r1.peerSettings     // Catch:{ all -> 0x00ab }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.getInitialWindowSize(r2)     // Catch:{ all -> 0x00ab }
                if (r11 == 0) goto L_0x0016
                com.squareup.okhttp.internal.framed.FramedConnection r11 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.Settings r11 = r11.peerSettings     // Catch:{ all -> 0x00ab }
                r11.clear()     // Catch:{ all -> 0x00ab }
            L_0x0016:
                com.squareup.okhttp.internal.framed.FramedConnection r11 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.Settings r11 = r11.peerSettings     // Catch:{ all -> 0x00ab }
                r11.merge(r12)     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.FramedConnection r11 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.Protocol r11 = r11.getProtocol()     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.Protocol r3 = com.squareup.okhttp.Protocol.HTTP_2     // Catch:{ all -> 0x00ab }
                if (r11 != r3) goto L_0x002a
                r10.ackSettingsLater(r12)     // Catch:{ all -> 0x00ab }
            L_0x002a:
                com.squareup.okhttp.internal.framed.FramedConnection r11 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.Settings r11 = r11.peerSettings     // Catch:{ all -> 0x00ab }
                int r11 = r11.getInitialWindowSize(r2)     // Catch:{ all -> 0x00ab }
                r12 = -1
                r2 = 1
                r3 = 0
                r5 = 0
                if (r11 == r12) goto L_0x0079
                if (r11 == r1) goto L_0x0079
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                boolean r1 = r1.receivedInitialPeerSettings     // Catch:{ all -> 0x00ab }
                if (r1 != 0) goto L_0x004f
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                r1.addBytesToWriteWindow(r11)     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                boolean unused = r1.receivedInitialPeerSettings = r2     // Catch:{ all -> 0x00ab }
            L_0x004f:
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.util.Map r1 = r1.streams     // Catch:{ all -> 0x00ab }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ab }
                if (r1 != 0) goto L_0x007a
                com.squareup.okhttp.internal.framed.FramedConnection r1 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.util.Map r1 = r1.streams     // Catch:{ all -> 0x00ab }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.FramedConnection r5 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.util.Map r5 = r5.streams     // Catch:{ all -> 0x00ab }
                int r5 = r5.size()     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.FramedStream[] r5 = new com.squareup.okhttp.internal.framed.FramedStream[r5]     // Catch:{ all -> 0x00ab }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ all -> 0x00ab }
                r5 = r1
                com.squareup.okhttp.internal.framed.FramedStream[] r5 = (com.squareup.okhttp.internal.framed.FramedStream[]) r5     // Catch:{ all -> 0x00ab }
                goto L_0x007a
            L_0x0079:
                r11 = r3
            L_0x007a:
                java.util.concurrent.ExecutorService r1 = com.squareup.okhttp.internal.framed.FramedConnection.executor     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.FramedConnection$Reader$2 r6 = new com.squareup.okhttp.internal.framed.FramedConnection$Reader$2     // Catch:{ all -> 0x00ab }
                java.lang.String r7 = "OkHttp %s settings"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ab }
                com.squareup.okhttp.internal.framed.FramedConnection r8 = com.squareup.okhttp.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.lang.String r8 = r8.hostName     // Catch:{ all -> 0x00ab }
                r9 = 0
                r2[r9] = r8     // Catch:{ all -> 0x00ab }
                r6.<init>(r7, r2)     // Catch:{ all -> 0x00ab }
                r1.execute(r6)     // Catch:{ all -> 0x00ab }
                monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                if (r5 == 0) goto L_0x00aa
                int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r0 == 0) goto L_0x00aa
                int r0 = r5.length
            L_0x009b:
                if (r9 >= r0) goto L_0x00aa
                r1 = r5[r9]
                monitor-enter(r1)
                r1.addBytesToWriteWindow(r11)     // Catch:{ all -> 0x00a7 }
                monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
                int r9 = r9 + 1
                goto L_0x009b
            L_0x00a7:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
                throw r11
            L_0x00aa:
                return
            L_0x00ab:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.Reader.settings(boolean, com.squareup.okhttp.internal.framed.Settings):void");
        }

        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (FramedConnection.this) {
                    FramedConnection framedConnection = FramedConnection.this;
                    framedConnection.bytesLeftInWriteWindow += j;
                    framedConnection.notifyAll();
                }
                return;
            }
            FramedStream stream = FramedConnection.this.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                }
            }
        }

        private Reader(FrameReader frameReader2) {
            super("OkHttp %s", FramedConnection.this.hostName);
            this.frameReader = frameReader2;
        }

        public void ackSettings() {
        }

        public void alternateService(int i, String str, C13133f fVar, String str2, int i2, long j) {
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }
    }

    /* access modifiers changed from: private */
    public void pushDataLater(int i, C13130e eVar, int i2, boolean z) {
        final C13121c cVar = new C13121c();
        long j = (long) i2;
        eVar.mo52533m0(j);
        eVar.read(cVar, j);
        if (cVar.size() == j) {
            final int i3 = i;
            final int i4 = i2;
            final boolean z2 = z;
            this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostName, Integer.valueOf(i)}) {
                public void execute() {
                    try {
                        boolean onData = FramedConnection.this.pushObserver.onData(i3, cVar, i4, z2);
                        if (onData) {
                            FramedConnection.this.frameWriter.rstStream(i3, ErrorCode.CANCEL);
                        }
                        if (onData || z2) {
                            synchronized (FramedConnection.this) {
                                FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i3));
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        throw new IOException(cVar.size() + " != " + i2);
    }

    /* access modifiers changed from: private */
    public void pushHeadersLater(int i, List<Header> list, boolean z) {
        final int i2 = i;
        final List<Header> list2 = list;
        final boolean z2 = z;
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostName, Integer.valueOf(i)}) {
            public void execute() {
                boolean onHeaders = FramedConnection.this.pushObserver.onHeaders(i2, list2, z2);
                if (onHeaders) {
                    try {
                        FramedConnection.this.frameWriter.rstStream(i2, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (onHeaders || z2) {
                    synchronized (FramedConnection.this) {
                        FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i2));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void pushRequestLater(int i, List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            final int i2 = i;
            final List<Header> list2 = list;
            this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostName, Integer.valueOf(i)}) {
                public void execute() {
                    if (FramedConnection.this.pushObserver.onRequest(i2, list2)) {
                        try {
                            FramedConnection.this.frameWriter.rstStream(i2, ErrorCode.CANCEL);
                            synchronized (FramedConnection.this) {
                                FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i2));
                            }
                        } catch (IOException unused) {
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void pushResetLater(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostName, Integer.valueOf(i)}) {
            public void execute() {
                FramedConnection.this.pushObserver.onReset(i2, errorCode2);
                synchronized (FramedConnection.this) {
                    FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i2));
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean pushedStream(int i) {
        if (this.protocol == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public synchronized Ping removePing(int i) {
        Ping ping;
        Map<Integer, Ping> map = this.pings;
        if (map != null) {
            ping = map.remove(Integer.valueOf(i));
        } else {
            ping = null;
        }
        return ping;
    }

    private synchronized void setIdle(boolean z) {
        long j;
        if (z) {
            try {
                j = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = LocationRequestCompat.PASSIVE_INTERVAL;
        }
        this.idleStartTimeNs = j;
    }

    /* access modifiers changed from: private */
    public void writePing(boolean z, int i, int i2, Ping ping) {
        synchronized (this.frameWriter) {
            if (ping != null) {
                ping.send();
            }
            this.frameWriter.ping(z, i, i2);
        }
    }

    /* access modifiers changed from: private */
    public void writePingLater(boolean z, int i, int i2, Ping ping) {
        final boolean z2 = z;
        final int i3 = i;
        final int i4 = i2;
        final Ping ping2 = ping;
        executor.execute(new NamedRunnable("OkHttp %s ping %08x%08x", new Object[]{this.hostName, Integer.valueOf(i), Integer.valueOf(i2)}) {
            public void execute() {
                try {
                    FramedConnection.this.writePing(z2, i3, i4, ping2);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public void close() {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush() {
        this.frameWriter.flush();
    }

    public synchronized long getIdleStartTimeNs() {
        return this.idleStartTimeNs;
    }

    public Protocol getProtocol() {
        return this.protocol;
    }

    /* access modifiers changed from: package-private */
    public synchronized FramedStream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public synchronized boolean isIdle() {
        boolean z;
        if (this.idleStartTimeNs != LocationRequestCompat.PASSIVE_INTERVAL) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }

    public FramedStream newStream(List<Header> list, boolean z, boolean z2) {
        return newStream(0, list, z, z2);
    }

    public synchronized int openStreamCount() {
        return this.streams.size();
    }

    public Ping ping() {
        int i;
        Ping ping = new Ping();
        synchronized (this) {
            if (!this.shutdown) {
                i = this.nextPingId;
                this.nextPingId = i + 2;
                if (this.pings == null) {
                    this.pings = new HashMap();
                }
                this.pings.put(Integer.valueOf(i), ping);
            } else {
                throw new IOException("shutdown");
            }
        }
        writePing(false, i, 1330343787, ping);
        return ping;
    }

    public FramedStream pushStream(int i, List<Header> list, boolean z) {
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        } else if (this.protocol == Protocol.HTTP_2) {
            return newStream(i, list, z, false);
        } else {
            throw new IllegalStateException("protocol != HTTP_2");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized FramedStream removeStream(int i) {
        FramedStream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        if (remove != null && this.streams.isEmpty()) {
            setIdle(true);
        }
        notifyAll();
        return remove;
    }

    public void sendConnectionPreface() {
        this.frameWriter.connectionPreface();
        this.frameWriter.settings(this.okHttpSettings);
        int initialWindowSize = this.okHttpSettings.getInitialWindowSize(65536);
        if (initialWindowSize != 65536) {
            this.frameWriter.windowUpdate(0, (long) (initialWindowSize - 65536));
        }
    }

    public void setSettings(Settings settings) {
        synchronized (this.frameWriter) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.okHttpSettings.merge(settings);
                    this.frameWriter.settings(settings);
                } else {
                    throw new IOException("shutdown");
                }
            }
        }
    }

    public void shutdown(ErrorCode errorCode) {
        synchronized (this.frameWriter) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.shutdown = true;
                    int i = this.lastGoodStreamId;
                    this.frameWriter.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.frameWriter.maxDataLength());
        r6 = (long) r2;
        r8.bytesLeftInWriteWindow -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeData(int r9, boolean r10, okio.C13121c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            com.squareup.okhttp.internal.framed.FrameWriter r12 = r8.frameWriter
            r12.data(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0060
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.bytesLeftInWriteWindow     // Catch:{ InterruptedException -> 0x0058 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, com.squareup.okhttp.internal.framed.FramedStream> r2 = r8.streams     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r2 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0056 }
            int r2 = (int) r4     // Catch:{ all -> 0x0056 }
            com.squareup.okhttp.internal.framed.FrameWriter r4 = r8.frameWriter     // Catch:{ all -> 0x0056 }
            int r4 = r4.maxDataLength()     // Catch:{ all -> 0x0056 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0056 }
            long r4 = r8.bytesLeftInWriteWindow     // Catch:{ all -> 0x0056 }
            long r6 = (long) r2     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.bytesLeftInWriteWindow = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            com.squareup.okhttp.internal.framed.FrameWriter r4 = r8.frameWriter
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            r4.data(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x005e
        L_0x0058:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x005e:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.writeData(int, boolean, okio.c, long):void");
    }

    /* access modifiers changed from: package-private */
    public void writeSynReply(int i, boolean z, List<Header> list) {
        this.frameWriter.synReply(z, i, list);
    }

    /* access modifiers changed from: package-private */
    public void writeSynReset(int i, ErrorCode errorCode) {
        this.frameWriter.rstStream(i, errorCode);
    }

    /* access modifiers changed from: package-private */
    public void writeSynResetLater(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        executor.submit(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostName, Integer.valueOf(i)}) {
            public void execute() {
                try {
                    FramedConnection.this.writeSynReset(i2, errorCode2);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void writeWindowUpdateLater(int i, long j) {
        final int i2 = i;
        final long j2 = j;
        executor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostName, Integer.valueOf(i)}) {
            public void execute() {
                try {
                    FramedConnection.this.frameWriter.windowUpdate(i2, j2);
                } catch (IOException unused) {
                }
            }
        });
    }

    private FramedConnection(Builder builder) {
        this.streams = new HashMap();
        this.idleStartTimeNs = System.nanoTime();
        this.unacknowledgedBytesRead = 0;
        this.okHttpSettings = new Settings();
        Settings settings = new Settings();
        this.peerSettings = settings;
        this.receivedInitialPeerSettings = false;
        this.currentPushRequests = new LinkedHashSet();
        Protocol access$000 = builder.protocol;
        this.protocol = access$000;
        this.pushObserver = builder.pushObserver;
        boolean access$200 = builder.client;
        this.client = access$200;
        this.listener = builder.listener;
        int i = 2;
        this.nextStreamId = builder.client ? 1 : 2;
        if (builder.client && access$000 == Protocol.HTTP_2) {
            this.nextStreamId += 2;
        }
        this.nextPingId = builder.client ? 1 : i;
        if (builder.client) {
            this.okHttpSettings.set(7, 0, 16777216);
        }
        String access$400 = builder.hostName;
        this.hostName = access$400;
        if (access$000 == Protocol.HTTP_2) {
            this.variant = new Http2();
            this.pushExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(String.format("OkHttp %s Push Observer", new Object[]{access$400}), true));
            settings.set(7, 0, 65535);
            settings.set(5, 0, 16384);
        } else if (access$000 == Protocol.SPDY_3) {
            this.variant = new Spdy3();
            this.pushExecutor = null;
        } else {
            throw new AssertionError(access$000);
        }
        this.bytesLeftInWriteWindow = (long) settings.getInitialWindowSize(65536);
        this.socket = builder.socket;
        this.frameWriter = this.variant.newWriter(builder.sink, access$200);
        Reader reader = new Reader(this.variant.newReader(builder.source, access$200));
        this.readerRunnable = reader;
        new Thread(reader).start();
    }

    /* access modifiers changed from: private */
    public void close(ErrorCode errorCode, ErrorCode errorCode2) {
        int i;
        FramedStream[] framedStreamArr;
        Ping[] pingArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                framedStreamArr = (FramedStream[]) this.streams.values().toArray(new FramedStream[this.streams.size()]);
                this.streams.clear();
                setIdle(false);
            } else {
                framedStreamArr = null;
            }
            Map<Integer, Ping> map = this.pings;
            if (map != null) {
                this.pings = null;
                pingArr = (Ping[]) map.values().toArray(new Ping[this.pings.size()]);
            }
        }
        if (framedStreamArr != null) {
            for (FramedStream close : framedStreamArr) {
                try {
                    close.close(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        if (pingArr != null) {
            for (Ping cancel : pingArr) {
                cancel.cancel();
            }
        }
        try {
            this.frameWriter.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    private FramedStream newStream(int i, List<Header> list, boolean z, boolean z2) {
        int i2;
        FramedStream framedStream;
        boolean z3 = !z;
        boolean z4 = !z2;
        synchronized (this.frameWriter) {
            synchronized (this) {
                if (!this.shutdown) {
                    i2 = this.nextStreamId;
                    this.nextStreamId = i2 + 2;
                    framedStream = new FramedStream(i2, this, z3, z4, list);
                    if (framedStream.isOpen()) {
                        this.streams.put(Integer.valueOf(i2), framedStream);
                        setIdle(false);
                    }
                } else {
                    throw new IOException("shutdown");
                }
            }
            if (i == 0) {
                this.frameWriter.synStream(z3, z4, i2, i, list);
            } else if (!this.client) {
                this.frameWriter.pushPromise(i, i2, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (!z) {
            this.frameWriter.flush();
        }
        return framedStream;
    }

    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() {
            public void onStream(FramedStream framedStream) {
                framedStream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public abstract void onStream(FramedStream framedStream);

        public void onSettings(FramedConnection framedConnection) {
        }
    }
}
