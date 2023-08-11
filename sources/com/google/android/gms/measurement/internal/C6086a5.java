package com.google.android.gms.measurement.internal;

import p201q5.C9254a;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6086a5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f7623b;

    /* renamed from: c */
    final /* synthetic */ C6175i5 f7624c;

    C6086a5(C6175i5 i5Var, C6289s9 s9Var) {
        this.f7624c = i5Var;
        this.f7623b = s9Var;
    }

    public final void run() {
        this.f7624c.f7865a.mo34926e();
        C6157g9 c3 = this.f7624c.f7865a;
        C6289s9 s9Var = this.f7623b;
        c3.mo34919a().mo34778h();
        c3.mo34929g();
        C9713p.m20271f(s9Var.f8207b);
        C9254a b = C9254a.m18988b(s9Var.f8228w);
        C9254a U = c3.mo34913U(s9Var.f8207b);
        c3.mo34920b().mo35079v().mo35039c("Setting consent, package, consent", s9Var.f8207b, b);
        c3.mo34951y(s9Var.f8207b, b);
        if (b.mo43555m(U)) {
            c3.mo34947u(s9Var);
        }
    }
}
