package p109h4;

/* renamed from: h4.i0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final /* synthetic */ class C7941i0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7944j0 f11130b;

    /* renamed from: c */
    public final /* synthetic */ int f11131c;

    public /* synthetic */ C7941i0(C7944j0 j0Var, int i) {
        this.f11130b = j0Var;
        this.f11131c = i;
    }

    public final void run() {
        C7944j0 j0Var = this.f11130b;
        int i = this.f11131c;
        if (i == 0) {
            j0Var.f11145a.f11160F = 2;
            j0Var.f11145a.f11163m = true;
            j0Var.f11145a.f11164n = true;
            synchronized (j0Var.f11145a.f11159E) {
                for (C7927e1 a : j0Var.f11145a.f11159E) {
                    a.mo41688a();
                }
            }
            return;
        }
        j0Var.f11145a.f11160F = 1;
        synchronized (j0Var.f11145a.f11159E) {
            for (C7927e1 b : j0Var.f11145a.f11159E) {
                b.mo41689b(i);
            }
        }
        j0Var.f11145a.m15646R();
    }
}
