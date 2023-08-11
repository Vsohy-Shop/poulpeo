package p037b6;

/* renamed from: b6.d0 */
public final class C2899d0<T> implements C2901e0, C2895b0 {

    /* renamed from: c */
    private static final Object f1300c = new Object();

    /* renamed from: a */
    private volatile C2901e0<T> f1301a;

    /* renamed from: b */
    private volatile Object f1302b = f1300c;

    private C2899d0(C2901e0<T> e0Var) {
        this.f1301a = e0Var;
    }

    /* renamed from: a */
    public static <P extends C2901e0<T>, T> C2901e0<T> m2306a(P p) {
        C2924q.m2388c(p);
        return p instanceof C2899d0 ? p : new C2899d0(p);
    }

    /* renamed from: b */
    public static <P extends C2901e0<T>, T> C2895b0<T> m2307b(P p) {
        if (p instanceof C2895b0) {
            return (C2895b0) p;
        }
        C2924q.m2388c(p);
        return new C2899d0(p);
    }

    /* renamed from: a */
    public final T mo23536a() {
        T t = this.f1302b;
        T t2 = f1300c;
        if (t == t2) {
            synchronized (this) {
                t = this.f1302b;
                if (t == t2) {
                    t = this.f1301a.mo23536a();
                    T t3 = this.f1302b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f1302b = t;
                    this.f1301a = null;
                }
            }
        }
        return t;
    }
}
