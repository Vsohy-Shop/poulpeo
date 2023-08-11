package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6088a7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6319v6 f7627b;

    /* renamed from: c */
    final /* synthetic */ long f7628c;

    /* renamed from: d */
    final /* synthetic */ C6111c7 f7629d;

    C6088a7(C6111c7 c7Var, C6319v6 v6Var, long j) {
        this.f7629d = c7Var;
        this.f7627b = v6Var;
        this.f7628c = j;
    }

    public final void run() {
        this.f7629d.m10495q(this.f7627b, false, this.f7628c);
        C6111c7 c7Var = this.f7629d;
        c7Var.f7678e = null;
        c7Var.f7899a.mo35189L().mo34837u((C6319v6) null);
    }
}
