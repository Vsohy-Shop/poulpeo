package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p201q5.C9257d;
import p231t4.C9713p;
import p242u4.C9882a;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6188j7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f7902b;

    /* renamed from: c */
    final /* synthetic */ C6123d8 f7903c;

    C6188j7(C6123d8 d8Var, C6289s9 s9Var) {
        this.f7903c = d8Var;
        this.f7902b = s9Var;
    }

    public final void run() {
        C9257d H = this.f7903c.f7724d;
        if (H == null) {
            this.f7903c.f7899a.mo34920b().mo35075r().mo35037a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C9713p.m20275j(this.f7902b);
            H.mo34759e1(this.f7902b);
            this.f7903c.f7899a.mo35181C().mo34862t();
            this.f7903c.mo34834r(H, (C9882a) null, this.f7902b);
            this.f7903c.m10532E();
        } catch (RemoteException e) {
            this.f7903c.f7899a.mo34920b().mo35075r().mo35038b("Failed to send app launch to the service", e);
        }
    }
}
