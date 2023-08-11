package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5785i1;
import java.util.ArrayList;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6320v7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f8329b;

    /* renamed from: c */
    final /* synthetic */ String f8330c;

    /* renamed from: d */
    final /* synthetic */ C6289s9 f8331d;

    /* renamed from: e */
    final /* synthetic */ C5785i1 f8332e;

    /* renamed from: f */
    final /* synthetic */ C6123d8 f8333f;

    C6320v7(C6123d8 d8Var, String str, String str2, C6289s9 s9Var, C5785i1 i1Var) {
        this.f8333f = d8Var;
        this.f8329b = str;
        this.f8330c = str2;
        this.f8331d = s9Var;
        this.f8332e = i1Var;
    }

    public final void run() {
        C6251p4 p4Var;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C9257d H = this.f8333f.f7724d;
            if (H == null) {
                this.f8333f.f7899a.mo34920b().mo35075r().mo35039c("Failed to get conditional properties; not connected to service", this.f8329b, this.f8330c);
                p4Var = this.f8333f.f7899a;
            } else {
                C9713p.m20275j(this.f8331d);
                arrayList = C6234n9.m10935u(H.mo34761g1(this.f8329b, this.f8330c, this.f8331d));
                this.f8333f.m10532E();
                p4Var = this.f8333f.f7899a;
            }
        } catch (RemoteException e) {
            this.f8333f.f7899a.mo34920b().mo35075r().mo35040d("Failed to get conditional properties; remote exception", this.f8329b, this.f8330c, e);
            p4Var = this.f8333f.f7899a;
        } catch (Throwable th) {
            this.f8333f.f7899a.mo35191N().mo35118D(this.f8332e, arrayList);
            throw th;
        }
        p4Var.mo35191N().mo35118D(this.f8332e, arrayList);
    }
}
