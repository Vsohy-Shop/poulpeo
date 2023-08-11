package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p200q4.C9245r;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4764k0 extends C9245r {

    /* renamed from: a */
    final /* synthetic */ Dialog f5008a;

    /* renamed from: b */
    final /* synthetic */ C4766l0 f5009b;

    C4764k0(C4766l0 l0Var, Dialog dialog) {
        this.f5009b = l0Var;
        this.f5008a = dialog;
    }

    /* renamed from: a */
    public final void mo32526a() {
        this.f5009b.f5013c.m6620o();
        if (this.f5008a.isShowing()) {
            this.f5008a.dismiss();
        }
    }
}
