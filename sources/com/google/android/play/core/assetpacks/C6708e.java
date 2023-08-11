package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p037b6.C2902f;
import p037b6.C2915l0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.e */
final class C6708e extends C2902f {

    /* renamed from: c */
    final /* synthetic */ int f8601c;

    /* renamed from: d */
    final /* synthetic */ String f8602d;

    /* renamed from: e */
    final /* synthetic */ String f8603e;

    /* renamed from: f */
    final /* synthetic */ int f8604f;

    /* renamed from: g */
    final /* synthetic */ C7790l f8605g;

    /* renamed from: h */
    final /* synthetic */ C6748o f8606h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6708e(C6748o oVar, C7790l lVar, int i, String str, String str2, int i2, C7790l lVar2) {
        super(lVar);
        this.f8606h = oVar;
        this.f8601c = i;
        this.f8602d = str;
        this.f8603e = str2;
        this.f8604f = i2;
        this.f8605g = lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            ((C2915l0) this.f8606h.f8751c.mo28461f()).mo28440r0(this.f8606h.f8749a, C6748o.m11476p(this.f8601c, this.f8602d, this.f8603e, this.f8604f), C6748o.m11480t(), new C6728j(this.f8606h, this.f8605g, (char[]) null));
        } catch (RemoteException e) {
            C6748o.f8747f.mo28422d(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
