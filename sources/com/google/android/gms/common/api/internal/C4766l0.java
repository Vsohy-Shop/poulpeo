package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4766l0 implements Runnable {

    /* renamed from: b */
    private final C4762j0 f5012b;

    /* renamed from: c */
    final /* synthetic */ C4768m0 f5013c;

    C4766l0(C4768m0 m0Var, C4762j0 j0Var) {
        this.f5013c = m0Var;
        this.f5012b = j0Var;
    }

    @MainThread
    public final void run() {
        if (this.f5013c.f5016c) {
            ConnectionResult b = this.f5012b.mo32525b();
            if (b.mo32337H()) {
                C4768m0 m0Var = this.f5013c;
                m0Var.f4936b.startActivityForResult(GoogleApiActivity.m6407a(m0Var.mo32447b(), (PendingIntent) C9713p.m20275j(b.mo32336G()), this.f5012b.mo32524a(), false), 1);
                return;
            }
            C4768m0 m0Var2 = this.f5013c;
            if (m0Var2.f5019f.mo32343b(m0Var2.mo32447b(), b.mo32334A(), (String) null) != null) {
                C4768m0 m0Var3 = this.f5013c;
                m0Var3.f5019f.mo32359w(m0Var3.mo32447b(), this.f5013c.f4936b, b.mo32334A(), 2, this.f5013c);
            } else if (b.mo32334A() == 18) {
                C4768m0 m0Var4 = this.f5013c;
                Dialog r = m0Var4.f5019f.mo32354r(m0Var4.mo32447b(), this.f5013c);
                C4768m0 m0Var5 = this.f5013c;
                m0Var5.f5019f.mo32355s(m0Var5.mo32447b().getApplicationContext(), new C4764k0(this, r));
            } else {
                this.f5013c.m6619l(b, this.f5012b.mo32524a());
            }
        }
    }
}
