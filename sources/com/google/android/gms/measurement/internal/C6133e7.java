package com.google.android.gms.measurement.internal;

import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6133e7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f7745b;

    /* renamed from: c */
    final /* synthetic */ boolean f7746c;

    /* renamed from: d */
    final /* synthetic */ C6190j9 f7747d;

    /* renamed from: e */
    final /* synthetic */ C6123d8 f7748e;

    C6133e7(C6123d8 d8Var, C6289s9 s9Var, boolean z, C6190j9 j9Var) {
        this.f7748e = d8Var;
        this.f7745b = s9Var;
        this.f7746c = z;
        this.f7747d = j9Var;
    }

    public final void run() {
        C6190j9 j9Var;
        C9257d H = this.f7748e.f7724d;
        if (H == null) {
            this.f7748e.f7899a.mo34920b().mo35075r().mo35037a("Discarding data. Failed to set user property");
            return;
        }
        C9713p.m20275j(this.f7745b);
        C6123d8 d8Var = this.f7748e;
        if (this.f7746c) {
            j9Var = null;
        } else {
            j9Var = this.f7747d;
        }
        d8Var.mo34834r(H, j9Var, this.f7745b);
        this.f7748e.m10532E();
    }
}
