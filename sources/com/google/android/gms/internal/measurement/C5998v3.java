package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5998v3 {

    /* renamed from: a */
    final C6042y f7425a;

    /* renamed from: b */
    final C6015w4 f7426b;

    /* renamed from: c */
    final C6015w4 f7427c;

    /* renamed from: d */
    final C6066z7 f7428d;

    public C5998v3() {
        C6042y yVar = new C6042y();
        this.f7425a = yVar;
        C6015w4 w4Var = new C6015w4((C6015w4) null, yVar);
        this.f7427c = w4Var;
        this.f7426b = w4Var.mo34572a();
        C6066z7 z7Var = new C6066z7();
        this.f7428d = z7Var;
        w4Var.mo34578g("require", new C5782hf(z7Var));
        z7Var.mo34687a("internal.platform", C5981u2.f7410b);
        w4Var.mo34578g("runtime.counter", new C5783i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final C5914q mo34543a(C6015w4 w4Var, C5920q5... q5VarArr) {
        C5914q qVar = C5914q.f7289O;
        for (C5920q5 a : q5VarArr) {
            qVar = C6049y6.m10303a(a);
            C6032x5.m10242c(this.f7427c);
            if ((qVar instanceof C5930r) || (qVar instanceof C5898p)) {
                qVar = this.f7425a.mo34616a(w4Var, qVar);
            }
        }
        return qVar;
    }
}
