package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.n */
final class C6744n extends C6728j<Void> {

    /* renamed from: c */
    final int f8713c;

    /* renamed from: d */
    final String f8714d;

    /* renamed from: e */
    final int f8715e;

    /* renamed from: f */
    final /* synthetic */ C6748o f8716f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6744n(C6748o oVar, C7790l<Void> lVar, int i, String str, int i2) {
        super(oVar, lVar);
        this.f8716f = oVar;
        this.f8713c = i;
        this.f8714d = str;
        this.f8715e = i2;
    }

    /* renamed from: b */
    public final void mo28451b(Bundle bundle) {
        this.f8716f.f8751c.mo28459b();
        int i = bundle.getInt("error_code");
        C6748o.f8747f.mo28423e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f8715e;
        if (i2 > 0) {
            this.f8716f.m11467g(this.f8713c, this.f8714d, i2 - 1);
        }
    }
}
