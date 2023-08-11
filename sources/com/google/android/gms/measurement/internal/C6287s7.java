package com.google.android.gms.measurement.internal;

import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6287s7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f8198b;

    /* renamed from: c */
    final /* synthetic */ boolean f8199c;

    /* renamed from: d */
    final /* synthetic */ C6290t f8200d;

    /* renamed from: e */
    final /* synthetic */ String f8201e;

    /* renamed from: f */
    final /* synthetic */ C6123d8 f8202f;

    C6287s7(C6123d8 d8Var, boolean z, C6289s9 s9Var, boolean z2, C6290t tVar, String str) {
        this.f8202f = d8Var;
        this.f8198b = s9Var;
        this.f8199c = z2;
        this.f8200d = tVar;
        this.f8201e = str;
    }

    public final void run() {
        C6290t tVar;
        C9257d H = this.f8202f.f7724d;
        if (H == null) {
            this.f8202f.f7899a.mo34920b().mo35075r().mo35037a("Discarding data. Failed to send event to service");
            return;
        }
        C9713p.m20275j(this.f8198b);
        C6123d8 d8Var = this.f8202f;
        if (this.f8199c) {
            tVar = null;
        } else {
            tVar = this.f8200d;
        }
        d8Var.mo34834r(H, tVar, this.f8198b);
        this.f8202f.m10532E();
    }
}
