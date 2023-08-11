package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6284s4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6103c f8190b;

    /* renamed from: c */
    final /* synthetic */ C6175i5 f8191c;

    C6284s4(C6175i5 i5Var, C6103c cVar) {
        this.f8191c = i5Var;
        this.f8190b = cVar;
    }

    public final void run() {
        this.f8191c.f7865a.mo34926e();
        if (this.f8190b.f7654d.mo35057A() == null) {
            this.f8191c.f7865a.mo34944r(this.f8190b);
        } else {
            this.f8191c.f7865a.mo34949w(this.f8190b);
        }
    }
}
