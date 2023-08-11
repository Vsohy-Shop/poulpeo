package p109h4;

import com.google.android.gms.tasks.Task;

/* renamed from: h4.f0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final /* synthetic */ class C7929f0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7944j0 f11100b;

    /* renamed from: c */
    public final /* synthetic */ int f11101c;

    public /* synthetic */ C7929f0(C7944j0 j0Var, int i) {
        this.f11100b = j0Var;
        this.f11101c = i;
    }

    public final void run() {
        C7944j0 j0Var = this.f11100b;
        int i = this.f11101c;
        C7947k0.m15660g0(j0Var.f11145a);
        j0Var.f11145a.f11160F = 1;
        synchronized (j0Var.f11145a.f11159E) {
            for (C7927e1 d : j0Var.f11145a.f11159E) {
                d.mo41691d(i);
            }
        }
        j0Var.f11145a.m15646R();
        C7947k0 k0Var = j0Var.f11145a;
        Task unused = k0Var.m15644P(k0Var.f11161k);
    }
}
