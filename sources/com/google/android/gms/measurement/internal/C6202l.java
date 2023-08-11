package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6202l implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6208l5 f7930b;

    /* renamed from: c */
    final /* synthetic */ C6213m f7931c;

    C6202l(C6213m mVar, C6208l5 l5Var) {
        this.f7931c = mVar;
        this.f7930b = l5Var;
    }

    public final void run() {
        this.f7930b.mo34924d();
        if (C6092b.m10462a()) {
            this.f7930b.mo34919a().mo35110z(this);
            return;
        }
        boolean e = this.f7931c.mo35091e();
        this.f7931c.f7968c = 0;
        if (e) {
            this.f7931c.mo35089c();
        }
    }
}
