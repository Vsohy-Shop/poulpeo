package p037b6;

/* renamed from: b6.c0 */
public final class C2897c0<T> implements C2901e0<T> {

    /* renamed from: a */
    private C2901e0<T> f1299a;

    /* renamed from: b */
    public static <T> void m2303b(C2901e0<T> e0Var, C2901e0<T> e0Var2) {
        C2924q.m2388c(e0Var2);
        C2897c0 c0Var = (C2897c0) e0Var;
        if (c0Var.f1299a == null) {
            c0Var.f1299a = e0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final T mo23536a() {
        C2901e0<T> e0Var = this.f1299a;
        if (e0Var != null) {
            return e0Var.mo23536a();
        }
        throw new IllegalStateException();
    }
}
