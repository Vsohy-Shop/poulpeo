package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6285s5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ boolean f8192b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f8193c;

    C6285s5(C6264q6 q6Var, boolean z) {
        this.f8193c = q6Var;
        this.f8192b = z;
    }

    public final void run() {
        boolean o = this.f8193c.f7899a.mo35204o();
        boolean n = this.f8193c.f7899a.mo35203n();
        this.f8193c.f7899a.mo35200k(this.f8192b);
        if (n == this.f8192b) {
            this.f8193c.f7899a.mo34920b().mo35079v().mo35038b("Default data collection state already set to", Boolean.valueOf(this.f8192b));
        }
        if (this.f8193c.f7899a.mo35204o() == o || this.f8193c.f7899a.mo35204o() != this.f8193c.f7899a.mo35203n()) {
            this.f8193c.f7899a.mo34920b().mo35081x().mo35039c("Default data collection is different than actual status", Boolean.valueOf(this.f8192b), Boolean.valueOf(o));
        }
        this.f8193c.m11039R();
    }
}
