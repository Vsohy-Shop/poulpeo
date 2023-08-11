package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6273r4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6103c f8168b;

    /* renamed from: c */
    final /* synthetic */ C6289s9 f8169c;

    /* renamed from: d */
    final /* synthetic */ C6175i5 f8170d;

    C6273r4(C6175i5 i5Var, C6103c cVar, C6289s9 s9Var) {
        this.f8170d = i5Var;
        this.f8168b = cVar;
        this.f8169c = s9Var;
    }

    public final void run() {
        this.f8170d.f7865a.mo34926e();
        if (this.f8168b.f7654d.mo35057A() == null) {
            this.f8170d.f7865a.mo34945s(this.f8168b, this.f8169c);
        } else {
            this.f8170d.f7865a.mo34950x(this.f8168b, this.f8169c);
        }
    }
}
