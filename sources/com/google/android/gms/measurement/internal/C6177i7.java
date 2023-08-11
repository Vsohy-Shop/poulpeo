package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5785i1;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6177i7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f7870b;

    /* renamed from: c */
    final /* synthetic */ C5785i1 f7871c;

    /* renamed from: d */
    final /* synthetic */ C6123d8 f7872d;

    C6177i7(C6123d8 d8Var, C6289s9 s9Var, C5785i1 i1Var) {
        this.f7872d = d8Var;
        this.f7870b = s9Var;
        this.f7871c = i1Var;
    }

    public final void run() {
        C6251p4 p4Var;
        String str = null;
        try {
            if (!this.f7872d.f7899a.mo35184F().mo35425q().mo43554k()) {
                this.f7872d.f7899a.mo34920b().mo35081x().mo35037a("Analytics storage consent denied; will not get app instance id");
                this.f7872d.f7899a.mo35186I().mo35224C((String) null);
                this.f7872d.f7899a.mo35184F().f8437g.mo35401b((String) null);
                p4Var = this.f7872d.f7899a;
            } else {
                C9257d H = this.f7872d.f7724d;
                if (H == null) {
                    this.f7872d.f7899a.mo34920b().mo35075r().mo35037a("Failed to get app instance id");
                    p4Var = this.f7872d.f7899a;
                } else {
                    C9713p.m20275j(this.f7870b);
                    str = H.mo34764v0(this.f7870b);
                    if (str != null) {
                        this.f7872d.f7899a.mo35186I().mo35224C(str);
                        this.f7872d.f7899a.mo35184F().f8437g.mo35401b(str);
                    }
                    this.f7872d.m10532E();
                    p4Var = this.f7872d.f7899a;
                }
            }
        } catch (RemoteException e) {
            this.f7872d.f7899a.mo34920b().mo35075r().mo35038b("Failed to get app instance id", e);
            p4Var = this.f7872d.f7899a;
        } catch (Throwable th) {
            this.f7872d.f7899a.mo35191N().mo35123I(this.f7871c, (String) null);
            throw th;
        }
        p4Var.mo35191N().mo35123I(this.f7871c, str);
    }
}
