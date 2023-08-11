package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6210l7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f7956b;

    /* renamed from: c */
    final /* synthetic */ Bundle f7957c;

    /* renamed from: d */
    final /* synthetic */ C6123d8 f7958d;

    C6210l7(C6123d8 d8Var, C6289s9 s9Var, Bundle bundle) {
        this.f7958d = d8Var;
        this.f7956b = s9Var;
        this.f7957c = bundle;
    }

    public final void run() {
        C9257d H = this.f7958d.f7724d;
        if (H == null) {
            this.f7958d.f7899a.mo34920b().mo35075r().mo35037a("Failed to send default event parameters to service");
            return;
        }
        try {
            C9713p.m20275j(this.f7956b);
            H.mo34756R(this.f7957c, this.f7956b);
        } catch (RemoteException e) {
            this.f7958d.f7899a.mo34920b().mo35075r().mo35038b("Failed to send default event parameters to service", e);
        }
    }
}
