package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6131e5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6190j9 f7741b;

    /* renamed from: c */
    final /* synthetic */ C6289s9 f7742c;

    /* renamed from: d */
    final /* synthetic */ C6175i5 f7743d;

    C6131e5(C6175i5 i5Var, C6190j9 j9Var, C6289s9 s9Var) {
        this.f7743d = i5Var;
        this.f7741b = j9Var;
        this.f7742c = s9Var;
    }

    public final void run() {
        this.f7743d.f7865a.mo34926e();
        if (this.f7741b.mo35057A() == null) {
            this.f7743d.f7865a.mo34946t(this.f7741b, this.f7742c);
        } else {
            this.f7743d.f7865a.mo34952z(this.f7741b, this.f7742c);
        }
    }
}
