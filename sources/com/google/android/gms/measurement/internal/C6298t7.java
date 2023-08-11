package com.google.android.gms.measurement.internal;

import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6298t7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f8246b;

    /* renamed from: c */
    final /* synthetic */ boolean f8247c;

    /* renamed from: d */
    final /* synthetic */ C6103c f8248d;

    /* renamed from: e */
    final /* synthetic */ C6103c f8249e;

    /* renamed from: f */
    final /* synthetic */ C6123d8 f8250f;

    C6298t7(C6123d8 d8Var, boolean z, C6289s9 s9Var, boolean z2, C6103c cVar, C6103c cVar2) {
        this.f8250f = d8Var;
        this.f8246b = s9Var;
        this.f8247c = z2;
        this.f8248d = cVar;
        this.f8249e = cVar2;
    }

    public final void run() {
        C6103c cVar;
        C9257d H = this.f8250f.f7724d;
        if (H == null) {
            this.f8250f.f7899a.mo34920b().mo35075r().mo35037a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C9713p.m20275j(this.f8246b);
        C6123d8 d8Var = this.f8250f;
        if (this.f8247c) {
            cVar = null;
        } else {
            cVar = this.f8248d;
        }
        d8Var.mo34834r(H, cVar, this.f8246b);
        this.f8250f.m10532E();
    }
}
