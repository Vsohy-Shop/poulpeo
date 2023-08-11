package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6307u5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ long f8292b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f8293c;

    C6307u5(C6264q6 q6Var, long j) {
        this.f8293c = q6Var;
        this.f8292b = j;
    }

    public final void run() {
        this.f8293c.f7899a.mo35184F().f8441k.mo35385b(this.f8292b);
        this.f8293c.f7899a.mo34920b().mo35074q().mo35038b("Session timeout duration set", Long.valueOf(this.f8292b));
    }
}
