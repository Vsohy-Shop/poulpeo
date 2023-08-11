package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p037b6.C2902f;
import p037b6.C2915l0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.f */
final class C6712f extends C2902f {

    /* renamed from: c */
    final /* synthetic */ int f8622c;

    /* renamed from: d */
    final /* synthetic */ String f8623d;

    /* renamed from: e */
    final /* synthetic */ C7790l f8624e;

    /* renamed from: f */
    final /* synthetic */ int f8625f;

    /* renamed from: g */
    final /* synthetic */ C6748o f8626g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6712f(C6748o oVar, C7790l lVar, int i, String str, C7790l lVar2, int i2) {
        super(lVar);
        this.f8626g = oVar;
        this.f8622c = i;
        this.f8623d = str;
        this.f8624e = lVar2;
        this.f8625f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            ((C2915l0) this.f8626g.f8751c.mo28461f()).mo28438S(this.f8626g.f8749a, C6748o.m11475o(this.f8622c, this.f8623d), C6748o.m11480t(), new C6744n(this.f8626g, this.f8624e, this.f8622c, this.f8623d, this.f8625f));
        } catch (RemoteException e) {
            C6748o.f8747f.mo28422d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
