package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6221m7 extends C6213m {

    /* renamed from: e */
    final /* synthetic */ C6123d8 f7986e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6221m7(C6123d8 d8Var, C6208l5 l5Var) {
        super(l5Var);
        this.f7986e = d8Var;
    }

    /* renamed from: c */
    public final void mo35089c() {
        C6123d8 d8Var = this.f7986e;
        d8Var.mo34778h();
        if (d8Var.mo34842z()) {
            d8Var.f7899a.mo34920b().mo35079v().mo35037a("Inactivity, disconnecting from the service");
            d8Var.mo34823Q();
        }
    }
}
