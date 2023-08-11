package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p201q5.C9257d;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6199k7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6319v6 f7926b;

    /* renamed from: c */
    final /* synthetic */ C6123d8 f7927c;

    C6199k7(C6123d8 d8Var, C6319v6 v6Var) {
        this.f7927c = d8Var;
        this.f7926b = v6Var;
    }

    public final void run() {
        C9257d H = this.f7927c.f7724d;
        if (H == null) {
            this.f7927c.f7899a.mo34920b().mo35075r().mo35037a("Failed to send current screen to service");
            return;
        }
        try {
            C6319v6 v6Var = this.f7926b;
            if (v6Var == null) {
                H.mo34754G1(0, (String) null, (String) null, this.f7927c.f7899a.mo34927f().getPackageName());
            } else {
                H.mo34754G1(v6Var.f8325c, v6Var.f8323a, v6Var.f8324b, this.f7927c.f7899a.mo34927f().getPackageName());
            }
            this.f7927c.m10532E();
        } catch (RemoteException e) {
            this.f7927c.f7899a.mo34920b().mo35075r().mo35038b("Failed to send current screen to the service", e);
        }
    }
}
