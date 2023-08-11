package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5713de;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6098b5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6290t f7644b;

    /* renamed from: c */
    final /* synthetic */ C6289s9 f7645c;

    /* renamed from: d */
    final /* synthetic */ C6175i5 f7646d;

    C6098b5(C6175i5 i5Var, C6290t tVar, C6289s9 s9Var) {
        this.f7646d = i5Var;
        this.f7644b = tVar;
        this.f7645c = s9Var;
    }

    public final void run() {
        C6290t b3 = this.f7646d.mo34969b3(this.f7644b, this.f7645c);
        C5713de.m9057b();
        if (this.f7646d.f7865a.mo34912T().mo34873B((String) null, C6084a3.f7611v0)) {
            this.f7646d.mo34970e3(b3, this.f7645c);
        } else {
            this.f7646d.m10692J(b3, this.f7645c);
        }
    }
}
