package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.appboy.Constants;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final /* synthetic */ class C6211l8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6222m8 f7959b;

    public /* synthetic */ C6211l8(C6222m8 m8Var) {
        this.f7959b = m8Var;
    }

    public final void run() {
        C6222m8 m8Var = this.f7959b;
        C6233n8 n8Var = m8Var.f7989d;
        long j = m8Var.f7987b;
        long j2 = m8Var.f7988c;
        n8Var.f8028b.mo34778h();
        n8Var.f8028b.f7899a.mo34920b().mo35074q().mo35037a("Application going to the background");
        boolean z = true;
        n8Var.f8028b.f7899a.mo35184F().f8447q.mo35300a(true);
        Bundle bundle = new Bundle();
        if (!n8Var.f8028b.f7899a.mo35211z().mo34875D()) {
            n8Var.f8028b.f8205e.mo35265b(j2);
            if (n8Var.f8028b.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7583h0)) {
                C6266q8 q8Var = n8Var.f8028b.f8205e;
                long j3 = q8Var.f8157b;
                q8Var.f8157b = j2;
                bundle.putLong("_et", j2 - j3);
                C6234n9.m10936x(n8Var.f8028b.f7899a.mo35188K().mo34791t(true), bundle, true);
            } else {
                z = false;
            }
            n8Var.f8028b.f8205e.mo35267d(false, z, j2);
        }
        n8Var.f8028b.f7899a.mo35186I().mo35258v("auto", Constants.APPBOY_PUSH_APPBOY_KEY, j, bundle);
    }
}
