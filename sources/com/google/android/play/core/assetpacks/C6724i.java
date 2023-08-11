package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p037b6.C2902f;
import p037b6.C2915l0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.i */
final class C6724i extends C2902f {

    /* renamed from: c */
    final /* synthetic */ C7790l f8666c;

    /* renamed from: d */
    final /* synthetic */ C6748o f8667d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6724i(C6748o oVar, C7790l lVar, C7790l lVar2) {
        super(lVar);
        this.f8667d = oVar;
        this.f8666c = lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            ((C2915l0) this.f8667d.f8752d.mo28461f()).mo28436J2(this.f8667d.f8749a, C6748o.m11480t(), new C6740m(this.f8667d, this.f8666c));
        } catch (RemoteException e) {
            C6748o.f8747f.mo28422d(e, "keepAlive", new Object[0]);
        }
    }
}
