package p465ye;

import p386lg.C12860b;

/* renamed from: ye.c */
/* compiled from: DeferredScalarSubscription */
public class C13921c<T> extends C13919a<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: b */
    protected final C12860b<? super T> f22825b;

    /* renamed from: c */
    protected T f22826c;

    public C13921c(C12860b<? super T> bVar) {
        this.f22825b = bVar;
    }

    public void cancel() {
        set(4);
        this.f22826c = null;
    }

    public final void clear() {
        lazySet(32);
        this.f22826c = null;
    }

    /* renamed from: g */
    public final int mo50862g(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: h */
    public final void mo50776h(long j) {
        T t;
        if (C13925g.m32188g(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (t = this.f22826c) != null) {
                            this.f22826c = null;
                            C12860b<? super T> bVar = this.f22825b;
                            bVar.mo50773d(t);
                            if (get() != 4) {
                                bVar.mo50772b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    /* renamed from: i */
    public final void mo53657i(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    C12860b<? super T> bVar = this.f22825b;
                    bVar.mo50773d(t);
                    if (get() != 4) {
                        bVar.mo50772b();
                        return;
                    }
                    return;
                }
                this.f22826c = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f22826c = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f22826c = t;
        lazySet(16);
        C12860b<? super T> bVar2 = this.f22825b;
        bVar2.mo50773d(t);
        if (get() != 4) {
            bVar2.mo50772b();
        }
    }

    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f22826c;
        this.f22826c = null;
        return t;
    }
}
