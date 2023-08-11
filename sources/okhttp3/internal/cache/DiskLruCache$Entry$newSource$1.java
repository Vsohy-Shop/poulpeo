package okhttp3.internal.cache;

import okhttp3.internal.cache.DiskLruCache;
import okio.C13150m;
import okio.C13179y0;
import p336ef.C11921v;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$Entry$newSource$1 extends C13150m {
    final /* synthetic */ C13179y0 $fileSource;
    private boolean closed;
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Entry this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$Entry$newSource$1(C13179y0 y0Var, DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        super(y0Var);
        this.$fileSource = y0Var;
        this.this$0 = diskLruCache;
        this.this$1 = entry;
    }

    public void close() {
        super.close();
        if (!this.closed) {
            this.closed = true;
            DiskLruCache diskLruCache = this.this$0;
            DiskLruCache.Entry entry = this.this$1;
            synchronized (diskLruCache) {
                entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                    diskLruCache.removeEntry$okhttp(entry);
                }
                C11921v vVar = C11921v.f18618a;
            }
        }
    }
}
