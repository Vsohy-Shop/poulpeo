package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.m */
final class C6740m extends C6728j<Void> {

    /* renamed from: c */
    final /* synthetic */ C6748o f8705c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6740m(C6748o oVar, C7790l<Void> lVar) {
        super(oVar, lVar);
        this.f8705c = oVar;
    }

    /* renamed from: p */
    public final void mo28455p(Bundle bundle, Bundle bundle2) {
        super.mo28455p(bundle, bundle2);
        if (!this.f8705c.f8753e.compareAndSet(true, false)) {
            C6748o.f8747f.mo28425g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f8705c.mo39269a();
        }
    }
}
