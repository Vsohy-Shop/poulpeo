package p202q6;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p113h8.C8030b;

/* renamed from: q6.u */
/* compiled from: LazySet */
class C9311u<T> implements C8030b<Set<T>> {

    /* renamed from: a */
    private volatile Set<C8030b<T>> f13677a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set<T> f13678b = null;

    C9311u(Collection<C8030b<T>> collection) {
        this.f13677a.addAll(collection);
    }

    /* renamed from: b */
    static C9311u<?> m19159b(Collection<C8030b<?>> collection) {
        return new C9311u<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m19160d() {
        for (C8030b<T> bVar : this.f13677a) {
            this.f13678b.add(bVar.get());
        }
        this.f13677a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo43607a(C8030b<T> bVar) {
        if (this.f13678b == null) {
            this.f13677a.add(bVar);
        } else {
            this.f13678b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f13678b == null) {
            synchronized (this) {
                if (this.f13678b == null) {
                    this.f13678b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m19160d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f13678b);
    }
}
