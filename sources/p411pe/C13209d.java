package p411pe;

import p307af.C10885a;
import p341fe.C11961q;

/* renamed from: pe.d */
/* compiled from: DeferredScalarDisposable */
public class C13209d<T> extends C13207b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: b */
    protected final C11961q<? super T> f21018b;

    /* renamed from: c */
    protected T f21019c;

    public C13209d(C11961q<? super T> qVar) {
        this.f21018b = qVar;
    }

    public final void clear() {
        lazySet(32);
        this.f21019c = null;
    }

    public void dispose() {
        set(4);
        this.f21019c = null;
    }

    /* renamed from: e */
    public final void mo52861e() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f21018b.mo46139b();
        }
    }

    /* renamed from: f */
    public final void mo52862f(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C11961q<? super T> qVar = this.f21018b;
            if (i == 8) {
                this.f21019c = t;
                lazySet(16);
                qVar.mo46141d(null);
            } else {
                lazySet(2);
                qVar.mo46141d(t);
            }
            if (get() != 4) {
                qVar.mo46139b();
            }
        }
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
    public final void mo52863h(Throwable th) {
        if ((get() & 54) != 0) {
            C10885a.m23270q(th);
            return;
        }
        lazySet(2);
        this.f21018b.onError(th);
    }

    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
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
        T t = this.f21019c;
        this.f21019c = null;
        lazySet(32);
        return t;
    }
}
