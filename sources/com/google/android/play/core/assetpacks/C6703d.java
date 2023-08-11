package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;
import p037b6.C2902f;
import p037b6.C2915l0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.d */
final class C6703d extends C2902f {

    /* renamed from: c */
    final /* synthetic */ Map f8591c;

    /* renamed from: d */
    final /* synthetic */ C7790l f8592d;

    /* renamed from: e */
    final /* synthetic */ C6748o f8593e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6703d(C6748o oVar, C7790l lVar, Map map, C7790l lVar2) {
        super(lVar);
        this.f8593e = oVar;
        this.f8591c = map;
        this.f8592d = lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            ((C2915l0) this.f8593e.f8751c.mo28461f()).mo28439W2(this.f8593e.f8749a, C6748o.m11471k(this.f8591c), new C6736l(this.f8593e, this.f8592d));
        } catch (RemoteException e) {
            C6748o.f8747f.mo28422d(e, "syncPacks", new Object[0]);
            this.f8592d.mo41437d(new RuntimeException(e));
        }
    }
}
