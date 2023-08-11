package p169n3;

import p159m3.C8821a;
import p330df.C11814a;

/* renamed from: n3.a */
/* compiled from: DoubleCheck */
public final class C8900a<T> implements C11814a<T>, C8821a<T> {

    /* renamed from: c */
    private static final Object f12913c = new Object();

    /* renamed from: a */
    private volatile C11814a<T> f12914a;

    /* renamed from: b */
    private volatile Object f12915b = f12913c;

    private C8900a(C11814a<T> aVar) {
        this.f12914a = aVar;
    }

    /* renamed from: a */
    public static <P extends C11814a<T>, T> C8821a<T> m18029a(P p) {
        if (p instanceof C8821a) {
            return (C8821a) p;
        }
        return new C8900a((C11814a) C8903d.m18034b(p));
    }

    /* renamed from: b */
    public static <P extends C11814a<T>, T> C11814a<T> m18030b(P p) {
        C8903d.m18034b(p);
        if (p instanceof C8900a) {
            return p;
        }
        return new C8900a(p);
    }

    /* renamed from: c */
    public static Object m18031c(Object obj, Object obj2) {
        boolean z;
        if (obj != f12913c) {
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
        T t = this.f12915b;
        T t2 = f12913c;
        if (t == t2) {
            synchronized (this) {
                t = this.f12915b;
                if (t == t2) {
                    t = this.f12914a.get();
                    this.f12915b = m18031c(this.f12915b, t);
                    this.f12914a = null;
                }
            }
        }
        return t;
    }
}
