package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okio.C13121c;
import okio.C13133f;
import okio.C13179y0;
import okio.C13181z0;
import p336ef.C11921v;

/* compiled from: Relay.kt */
public final class Relay {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C13133f PREFIX_CLEAN;
    public static final C13133f PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C13121c buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C13133f metadata;
    private int sourceCount;
    private C13179y0 upstream;
    private final C13121c upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: Relay.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Relay edit(File file, C13179y0 y0Var, C13133f fVar, long j) {
            C12775o.m28639i(file, "file");
            C12775o.m28639i(y0Var, "upstream");
            C12775o.m28639i(fVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, y0Var, 0, fVar, j, (DefaultConstructorMarker) null);
            randomAccessFile.setLength(0);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
            return relay;
        }

        public final Relay read(File file) {
            C12775o.m28639i(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            C12775o.m28638h(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            C13121c cVar = new C13121c();
            fileOperator.read(0, cVar, Relay.FILE_HEADER_SIZE);
            C13133f fVar = Relay.PREFIX_CLEAN;
            if (C12775o.m28634d(cVar.mo52534o((long) fVar.mo52590H()), fVar)) {
                long readLong = cVar.readLong();
                long readLong2 = cVar.readLong();
                C13121c cVar2 = new C13121c();
                fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, cVar2, readLong2);
                return new Relay(randomAccessFile, (C13179y0) null, readLong, cVar2.mo52498M(), 0, (DefaultConstructorMarker) null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    /* compiled from: Relay.kt */
    public final class RelaySource implements C13179y0 {
        private FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ Relay this$0;
        private final C13181z0 timeout = new C13181z0();

        public RelaySource(Relay relay) {
            C12775o.m28639i(relay, "this$0");
            this.this$0 = relay;
            RandomAccessFile file = relay.getFile();
            C12775o.m28636f(file);
            FileChannel channel = file.getChannel();
            C12775o.m28638h(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        public void close() {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = this.this$0;
                synchronized (relay) {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile((RandomAccessFile) null);
                        randomAccessFile = file;
                    }
                    C11921v vVar = C11921v.f18618a;
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
            if (r4 != true) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
            r8 = java.lang.Math.min(r2, r1.this$0.getUpstreamPos() - r1.sourcePos);
            r2 = r1.fileOperator;
            kotlin.jvm.internal.C12775o.m28636f(r2);
            r2.read(r1.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r8);
            r1.sourcePos += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r0 = r1.this$0.getUpstream();
            kotlin.jvm.internal.C12775o.m28636f(r0);
            r14 = r0.read(r1.this$0.getUpstreamBuffer(), r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
            if (r14 != -1) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
            r0 = r1.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r2.setUpstreamReader((java.lang.Thread) null);
            r2.notifyAll();
            r0 = p336ef.C11921v.f18618a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r9 = java.lang.Math.min(r14, r2);
            r1.this$0.getUpstreamBuffer().mo52512Y(r20, 0, r9);
            r1.sourcePos += r9;
            r13 = r1.fileOperator;
            kotlin.jvm.internal.C12775o.m28636f(r13);
            r4 = r14;
            r13.write(r1.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r1.this$0.getUpstreamBuffer().clone(), r4);
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x010a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r2.getBuffer().write(r2.getUpstreamBuffer(), r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0124, code lost:
            if (r2.getBuffer().size() <= r2.getBufferMaxSize()) goto L_0x013a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
            r2.getBuffer().skip(r2.getBuffer().size() - r2.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
            r2.setUpstreamPos(r2.getUpstreamPos() + r4);
            r0 = p336ef.C11921v.f18618a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0147, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            r2.setUpstreamReader((java.lang.Thread) null);
            r2.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x014f, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0156, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0159, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r2.setUpstreamReader((java.lang.Thread) null);
            r2.notifyAll();
            r3 = p336ef.C11921v.f18618a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0163, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(okio.C13121c r20, long r21) {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                java.lang.String r0 = "sink"
                r5 = r20
                kotlin.jvm.internal.C12775o.m28639i(r5, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L_0x0012
                r0 = r4
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 == 0) goto L_0x016a
                okhttp3.internal.cache2.Relay r8 = r1.this$0
                monitor-enter(r8)
            L_0x0018:
                long r6 = r8.getUpstreamPos()     // Catch:{ all -> 0x0167 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                r6 = 2
                r9 = -1
                if (r0 == 0) goto L_0x005b
                long r11 = r8.getUpstreamPos()     // Catch:{ all -> 0x0167 }
                okio.c r0 = r8.getBuffer()     // Catch:{ all -> 0x0167 }
                long r13 = r0.size()     // Catch:{ all -> 0x0167 }
                long r11 = r11 - r13
                long r13 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x003a
                r4 = r6
                goto L_0x0076
            L_0x003a:
                long r6 = r8.getUpstreamPos()     // Catch:{ all -> 0x0167 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                long r6 = r6 - r9
                long r9 = java.lang.Math.min(r2, r6)     // Catch:{ all -> 0x0167 }
                okio.c r2 = r8.getBuffer()     // Catch:{ all -> 0x0167 }
                long r3 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                long r6 = r3 - r11
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo52512Y(r3, r4, r6)     // Catch:{ all -> 0x0167 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x0167 }
                monitor-exit(r8)
                return r9
            L_0x005b:
                boolean r0 = r8.getComplete()     // Catch:{ all -> 0x0167 }
                if (r0 == 0) goto L_0x0063
                monitor-exit(r8)
                return r9
            L_0x0063:
                java.lang.Thread r0 = r8.getUpstreamReader()     // Catch:{ all -> 0x0167 }
                if (r0 == 0) goto L_0x006f
                okio.z0 r0 = r1.timeout     // Catch:{ all -> 0x0167 }
                r0.waitUntilNotified(r8)     // Catch:{ all -> 0x0167 }
                goto L_0x0018
            L_0x006f:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0167 }
                r8.setUpstreamReader(r0)     // Catch:{ all -> 0x0167 }
            L_0x0076:
                monitor-exit(r8)
                r11 = 32
                if (r4 != r6) goto L_0x009c
                okhttp3.internal.cache2.Relay r0 = r1.this$0
                long r6 = r0.getUpstreamPos()
                long r8 = r1.sourcePos
                long r6 = r6 - r8
                long r8 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.fileOperator
                kotlin.jvm.internal.C12775o.m28636f(r2)
                long r3 = r1.sourcePos
                long r3 = r3 + r11
                r5 = r20
                r6 = r8
                r2.read(r3, r5, r6)
                long r2 = r1.sourcePos
                long r2 = r2 + r8
                r1.sourcePos = r2
                return r8
            L_0x009c:
                r8 = 0
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                okio.y0 r0 = r0.getUpstream()     // Catch:{ all -> 0x0156 }
                kotlin.jvm.internal.C12775o.m28636f(r0)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch:{ all -> 0x0156 }
                okio.c r4 = r4.getUpstreamBuffer()     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r6 = r1.this$0     // Catch:{ all -> 0x0156 }
                long r6 = r6.getBufferMaxSize()     // Catch:{ all -> 0x0156 }
                long r14 = r0.read(r4, r6)     // Catch:{ all -> 0x0156 }
                int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x00d3
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0156 }
                r0.commit(r2)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r8)     // Catch:{ all -> 0x00d0 }
                r2.notifyAll()     // Catch:{ all -> 0x00d0 }
                ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00d0 }
                monitor-exit(r2)
                return r9
            L_0x00d0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00d3:
                long r9 = java.lang.Math.min(r14, r2)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                okio.c r2 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0156 }
                r6 = 0
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo52512Y(r3, r4, r6)     // Catch:{ all -> 0x0156 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x0156 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch:{ all -> 0x0156 }
                kotlin.jvm.internal.C12775o.m28636f(r13)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0156 }
                long r2 = r2 + r11
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                okio.c r0 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0156 }
                okio.c r16 = r0.clone()     // Catch:{ all -> 0x0156 }
                r4 = r14
                r14 = r2
                r17 = r4
                r13.write(r14, r16, r17)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r2 = r1.this$0     // Catch:{ all -> 0x0156 }
                monitor-enter(r2)     // Catch:{ all -> 0x0156 }
                okio.c r0 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                okio.c r3 = r2.getUpstreamBuffer()     // Catch:{ all -> 0x0153 }
                r0.write(r3, r4)     // Catch:{ all -> 0x0153 }
                okio.c r0 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                long r6 = r0.size()     // Catch:{ all -> 0x0153 }
                long r11 = r2.getBufferMaxSize()     // Catch:{ all -> 0x0153 }
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x013a
                okio.c r0 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                okio.c r3 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                long r6 = r3.size()     // Catch:{ all -> 0x0153 }
                long r11 = r2.getBufferMaxSize()     // Catch:{ all -> 0x0153 }
                long r6 = r6 - r11
                r0.skip(r6)     // Catch:{ all -> 0x0153 }
            L_0x013a:
                long r6 = r2.getUpstreamPos()     // Catch:{ all -> 0x0153 }
                long r6 = r6 + r4
                r2.setUpstreamPos(r6)     // Catch:{ all -> 0x0153 }
                ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0153 }
                monitor-exit(r2)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r8)     // Catch:{ all -> 0x0150 }
                r2.notifyAll()     // Catch:{ all -> 0x0150 }
                monitor-exit(r2)
                return r9
            L_0x0150:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0153:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0156 }
                throw r0     // Catch:{ all -> 0x0156 }
            L_0x0156:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r8)     // Catch:{ all -> 0x0164 }
                r2.notifyAll()     // Catch:{ all -> 0x0164 }
                ef.v r3 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0164 }
                monitor-exit(r2)
                throw r0
            L_0x0164:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0167:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            L_0x016a:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.c, long):long");
        }

        public C13181z0 timeout() {
            return this.timeout;
        }
    }

    static {
        C13133f.C13134a aVar = C13133f.f20903e;
        PREFIX_CLEAN = aVar.mo52622d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.mo52622d("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, C13179y0 y0Var, long j, C13133f fVar, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, y0Var, j, fVar, j2);
    }

    /* access modifiers changed from: private */
    public final void writeHeader(C13133f fVar, long j, long j2) {
        boolean z;
        C13121c cVar = new C13121c();
        cVar.mo52517b0(fVar);
        cVar.mo52501O0(j);
        cVar.mo52501O0(j2);
        if (cVar.size() == FILE_HEADER_SIZE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RandomAccessFile randomAccessFile = this.file;
            C12775o.m28636f(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            C12775o.m28638h(channel, "file!!.channel");
            new FileOperator(channel).write(0, cVar, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) {
        C13121c cVar = new C13121c();
        cVar.mo52517b0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        C12775o.m28636f(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        C12775o.m28638h(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j, cVar, (long) this.metadata.mo52590H());
    }

    public final void commit(long j) {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        C12775o.m28636f(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.mo52590H());
        RandomAccessFile randomAccessFile2 = this.file;
        C12775o.m28636f(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            setComplete(true);
            C11921v vVar = C11921v.f18618a;
        }
        C13179y0 y0Var = this.upstream;
        if (y0Var != null) {
            Util.closeQuietly((Closeable) y0Var);
        }
        this.upstream = null;
    }

    public final C13121c getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final C13179y0 getUpstream() {
        return this.upstream;
    }

    public final C13121c getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public final C13133f metadata() {
        return this.metadata;
    }

    public final C13179y0 newSource() {
        synchronized (this) {
            if (getFile() == null) {
                return null;
            }
            setSourceCount(getSourceCount() + 1);
            return new RelaySource(this);
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(C13179y0 y0Var) {
        this.upstream = y0Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, C13179y0 y0Var, long j, C13133f fVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = y0Var;
        this.upstreamPos = j;
        this.metadata = fVar;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C13121c();
        this.complete = this.upstream == null;
        this.buffer = new C13121c();
    }
}
