package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final /* synthetic */ class C6241o5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6264q6 f8053b;

    public /* synthetic */ C6241o5(C6264q6 q6Var) {
        this.f8053b = q6Var;
    }

    public final void run() {
        C6264q6 q6Var = this.f8053b;
        q6Var.mo34778h();
        if (!q6Var.f7899a.mo35184F().f8448r.mo35301b()) {
            long a = q6Var.f7899a.mo35184F().f8449s.mo35384a();
            q6Var.f7899a.mo35184F().f8449s.mo35385b(1 + a);
            q6Var.f7899a.mo35211z();
            if (a >= 5) {
                q6Var.f7899a.mo34920b().mo35080w().mo35037a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                q6Var.f7899a.mo35184F().f8448r.mo35300a(true);
                return;
            }
            q6Var.f7899a.mo35199j();
            return;
        }
        q6Var.f7899a.mo34920b().mo35074q().mo35037a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
