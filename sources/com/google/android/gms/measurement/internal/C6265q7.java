package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6265q7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f8154b;

    /* renamed from: c */
    final /* synthetic */ C6123d8 f8155c;

    C6265q7(C6123d8 d8Var, C6289s9 s9Var) {
        this.f8155c = d8Var;
        this.f8154b = s9Var;
    }

    public final void run() {
        C9257d H = this.f8155c.f7724d;
        if (H == null) {
            this.f8155c.f7899a.mo34920b().mo35075r().mo35037a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C9713p.m20275j(this.f8154b);
            H.mo34763r1(this.f8154b);
            this.f8155c.m10532E();
        } catch (RemoteException e) {
            this.f8155c.f7899a.mo34920b().mo35075r().mo35038b("Failed to send measurementEnabled to the service", e);
        }
    }
}
