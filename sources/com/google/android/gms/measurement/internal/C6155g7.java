package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6155g7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f7797b;

    /* renamed from: c */
    final /* synthetic */ C6123d8 f7798c;

    C6155g7(C6123d8 d8Var, C6289s9 s9Var) {
        this.f7798c = d8Var;
        this.f7797b = s9Var;
    }

    public final void run() {
        C9257d H = this.f7798c.f7724d;
        if (H == null) {
            this.f7798c.f7899a.mo34920b().mo35075r().mo35037a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C9713p.m20275j(this.f7797b);
            H.mo34762i0(this.f7797b);
        } catch (RemoteException e) {
            this.f7798c.f7899a.mo34920b().mo35075r().mo35038b("Failed to reset data on the service: remote exception", e);
        }
        this.f7798c.m10532E();
    }
}
