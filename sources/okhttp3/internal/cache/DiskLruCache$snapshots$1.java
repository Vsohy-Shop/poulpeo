package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.cache.DiskLruCache;
import p336ef.C11921v;
import p412pf.C13212a;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, C13212a {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        C12775o.m28638h(it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    public boolean hasNext() {
        DiskLruCache.Snapshot snapshot;
        if (this.nextSnapshot != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next == null) {
                    snapshot = null;
                } else {
                    snapshot = next.snapshot$okhttp();
                }
                if (snapshot != null) {
                    this.nextSnapshot = snapshot;
                    return true;
                }
            }
            C11921v vVar = C11921v.f18618a;
            return false;
        }
    }

    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot != null) {
            try {
                this.this$0.remove(snapshot.key());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }

    public DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            C12775o.m28636f(snapshot);
            return snapshot;
        }
        throw new NoSuchElementException();
    }
}
