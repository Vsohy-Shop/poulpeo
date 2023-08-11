package p109h4;

/* renamed from: h4.g0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final /* synthetic */ class C7933g0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7944j0 f11109b;

    /* renamed from: c */
    public final /* synthetic */ int f11110c;

    public /* synthetic */ C7933g0(C7944j0 j0Var, int i) {
        this.f11109b = j0Var;
        this.f11110c = i;
    }

    public final void run() {
        C7944j0 j0Var = this.f11109b;
        int i = this.f11110c;
        j0Var.f11145a.f11160F = 3;
        synchronized (j0Var.f11145a.f11159E) {
            for (C7927e1 c : j0Var.f11145a.f11159E) {
                c.mo41690c(i);
            }
        }
    }
}
