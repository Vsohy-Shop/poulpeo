package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5785i1;
import p201q5.C9257d;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6232n7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6290t f8023b;

    /* renamed from: c */
    final /* synthetic */ String f8024c;

    /* renamed from: d */
    final /* synthetic */ C5785i1 f8025d;

    /* renamed from: e */
    final /* synthetic */ C6123d8 f8026e;

    C6232n7(C6123d8 d8Var, C6290t tVar, String str, C5785i1 i1Var) {
        this.f8026e = d8Var;
        this.f8023b = tVar;
        this.f8024c = str;
        this.f8025d = i1Var;
    }

    public final void run() {
        C6251p4 p4Var;
        byte[] bArr = null;
        try {
            C9257d H = this.f8026e.f7724d;
            if (H == null) {
                this.f8026e.f7899a.mo34920b().mo35075r().mo35037a("Discarding data. Failed to send event to service to bundle");
                p4Var = this.f8026e.f7899a;
            } else {
                bArr = H.mo34757S0(this.f8023b, this.f8024c);
                this.f8026e.m10532E();
                p4Var = this.f8026e.f7899a;
            }
        } catch (RemoteException e) {
            this.f8026e.f7899a.mo34920b().mo35075r().mo35038b("Failed to send event to the service to bundle", e);
            p4Var = this.f8026e.f7899a;
        } catch (Throwable th) {
            this.f8026e.f7899a.mo35191N().mo35120F(this.f8025d, bArr);
            throw th;
        }
        p4Var.mo35191N().mo35120F(this.f8025d, bArr);
    }
}
