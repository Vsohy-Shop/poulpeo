package okio;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.C12775o;

/* renamed from: okio.r */
/* compiled from: JvmFileHandle.kt */
public final class C13162r extends C13138h {

    /* renamed from: f */
    private final RandomAccessFile f20958f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13162r(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        C12775o.m28639i(randomAccessFile, "randomAccessFile");
        this.f20958f = randomAccessFile;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public synchronized void mo52629G() {
        this.f20958f.close();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return r2;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo52630O(long r2, byte[] r4, int r5, int r6) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)     // Catch:{ all -> 0x0021 }
            java.io.RandomAccessFile r0 = r1.f20958f     // Catch:{ all -> 0x0021 }
            r0.seek(r2)     // Catch:{ all -> 0x0021 }
            r2 = 0
        L_0x000c:
            if (r2 >= r6) goto L_0x001f
            java.io.RandomAccessFile r3 = r1.f20958f     // Catch:{ all -> 0x0021 }
            int r0 = r6 - r2
            int r3 = r3.read(r4, r5, r0)     // Catch:{ all -> 0x0021 }
            r0 = -1
            if (r3 != r0) goto L_0x001d
            if (r2 != 0) goto L_0x001f
            monitor-exit(r1)
            return r0
        L_0x001d:
            int r2 = r2 + r3
            goto L_0x000c
        L_0x001f:
            monitor-exit(r1)
            return r2
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13162r.mo52630O(long, byte[], int, int):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public synchronized long mo52631Q() {
        return this.f20958f.length();
    }
}
