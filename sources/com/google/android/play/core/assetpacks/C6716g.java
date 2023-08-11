package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p037b6.C2902f;
import p037b6.C2915l0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.g */
final class C6716g extends C2902f {

    /* renamed from: c */
    final /* synthetic */ int f8638c;

    /* renamed from: d */
    final /* synthetic */ C7790l f8639d;

    /* renamed from: e */
    final /* synthetic */ C6748o f8640e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6716g(C6748o oVar, C7790l lVar, int i, C7790l lVar2) {
        super(lVar);
        this.f8640e = oVar;
        this.f8638c = i;
        this.f8639d = lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            ((C2915l0) this.f8640e.f8751c.mo28461f()).mo28437P2(this.f8640e.f8749a, C6748o.m11474n(this.f8638c), C6748o.m11480t(), new C6728j(this.f8640e, this.f8639d, (int[]) null));
        } catch (RemoteException e) {
            C6748o.f8747f.mo28422d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
