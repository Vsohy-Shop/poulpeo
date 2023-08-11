package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6276r7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f8179b;

    /* renamed from: c */
    final /* synthetic */ C6123d8 f8180c;

    C6276r7(C6123d8 d8Var, C6289s9 s9Var) {
        this.f8180c = d8Var;
        this.f8179b = s9Var;
    }

    public final void run() {
        C9257d H = this.f8180c.f7724d;
        if (H == null) {
            this.f8180c.f7899a.mo34920b().mo35075r().mo35037a("Failed to send consent settings to service");
            return;
        }
        try {
            C9713p.m20275j(this.f8179b);
            H.mo34752D1(this.f8179b);
            this.f8180c.m10532E();
        } catch (RemoteException e) {
            this.f8180c.f7899a.mo34920b().mo35075r().mo35038b("Failed to send consent settings to the service", e);
        }
    }
}
