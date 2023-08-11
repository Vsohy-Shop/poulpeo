package p245u7;

import p234t7.C9763a;
import p330df.C11814a;

/* renamed from: u7.a */
/* compiled from: DoubleCheck */
public final class C9895a<T> implements C11814a<T>, C9763a<T> {

    /* renamed from: c */
    private static final Object f14797c = new Object();

    /* renamed from: a */
    private volatile C11814a<T> f14798a;

    /* renamed from: b */
    private volatile Object f14799b = f14797c;

    private C9895a(C11814a<T> aVar) {
        this.f14798a = aVar;
    }

    /* renamed from: a */
    public static <P extends C11814a<T>, T> C9763a<T> m20561a(P p) {
        if (p instanceof C9763a) {
            return (C9763a) p;
        }
        return new C9895a((C11814a) C9898d.m20566b(p));
    }

    /* renamed from: b */
    public static <P extends C11814a<T>, T> C11814a<T> m20562b(P p) {
        C9898d.m20566b(p);
        if (p instanceof C9895a) {
            return p;
        }
        return new C9895a(p);
    }

    /* renamed from: c */
    public static Object m20563c(Object obj, Object obj2) {
        boolean z;
        if (obj != f14797c) {
            z = true;
        } else {
            z = false;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f14799b;
        T t2 = f14797c;
        if (t == t2) {
            synchronized (this) {
                t = this.f14799b;
                if (t == t2) {
                    t = this.f14798a.get();
                    this.f14799b = m20563c(this.f14799b, t);
                    this.f14798a = null;
                }
            }
        }
        return t;
    }
}
