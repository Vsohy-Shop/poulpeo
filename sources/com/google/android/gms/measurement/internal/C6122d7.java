package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5785i1;
import java.util.List;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6122d7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f7717b;

    /* renamed from: c */
    final /* synthetic */ String f7718c;

    /* renamed from: d */
    final /* synthetic */ C6289s9 f7719d;

    /* renamed from: e */
    final /* synthetic */ boolean f7720e;

    /* renamed from: f */
    final /* synthetic */ C5785i1 f7721f;

    /* renamed from: g */
    final /* synthetic */ C6123d8 f7722g;

    C6122d7(C6123d8 d8Var, String str, String str2, C6289s9 s9Var, boolean z, C5785i1 i1Var) {
        this.f7722g = d8Var;
        this.f7717b = str;
        this.f7718c = str2;
        this.f7719d = s9Var;
        this.f7720e = z;
        this.f7721f = i1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C9257d H = this.f7722g.f7724d;
            if (H == null) {
                this.f7722g.f7899a.mo34920b().mo35075r().mo35039c("Failed to get user properties; not connected to service", this.f7717b, this.f7718c);
                this.f7722g.f7899a.mo35191N().mo35119E(this.f7721f, bundle2);
                return;
            }
            C9713p.m20275j(this.f7719d);
            List<C6190j9> J1 = H.mo34755J1(this.f7717b, this.f7718c, this.f7720e, this.f7719d);
            bundle = new Bundle();
            if (J1 != null) {
                for (C6190j9 next : J1) {
                    String str = next.f7910f;
                    if (str != null) {
                        bundle.putString(next.f7907c, str);
                    } else {
                        Long l = next.f7909e;
                        if (l != null) {
                            bundle.putLong(next.f7907c, l.longValue());
                        } else {
                            Double d = next.f7912h;
                            if (d != null) {
                                bundle.putDouble(next.f7907c, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f7722g.m10532E();
                this.f7722g.f7899a.mo35191N().mo35119E(this.f7721f, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f7722g.f7899a.mo34920b().mo35075r().mo35039c("Failed to get user properties; remote exception", this.f7717b, e);
                    this.f7722g.f7899a.mo35191N().mo35119E(this.f7721f, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f7722g.f7899a.mo35191N().mo35119E(this.f7721f, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f7722g.f7899a.mo34920b().mo35075r().mo35039c("Failed to get user properties; remote exception", this.f7717b, e);
            this.f7722g.f7899a.mo35191N().mo35119E(this.f7721f, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f7722g.f7899a.mo35191N().mo35119E(this.f7721f, bundle2);
            throw th;
        }
    }
}
