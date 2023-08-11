package p267w7;

import p330df.C11814a;

/* renamed from: w7.b */
/* compiled from: DoubleCheck */
public final class C10131b<T> implements C11814a<T> {

    /* renamed from: c */
    private static final Object f15324c = new Object();

    /* renamed from: a */
    private volatile C11814a<T> f15325a;

    /* renamed from: b */
    private volatile Object f15326b = f15324c;

    private C10131b(C11814a<T> aVar) {
        this.f15325a = aVar;
    }

    /* renamed from: a */
    public static <P extends C11814a<T>, T> C11814a<T> m21319a(P p) {
        C10133d.m21325b(p);
        if (p instanceof C10131b) {
            return p;
        }
        return new C10131b(p);
    }

    /* renamed from: b */
    public static Object m21320b(Object obj, Object obj2) {
        boolean z;
        if (obj != f15324c) {
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
        T t = this.f15326b;
        T t2 = f15324c;
        if (t == t2) {
            synchronized (this) {
                t = this.f15326b;
                if (t == t2) {
                    t = this.f15325a.get();
                    this.f15326b = m21320b(this.f15326b, t);
                    this.f15325a = null;
                }
            }
        }
        return t;
    }
}
