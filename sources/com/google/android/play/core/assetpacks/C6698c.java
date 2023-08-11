package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.List;
import p037b6.C2902f;
import p037b6.C2915l0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.c */
final class C6698c extends C2902f {

    /* renamed from: c */
    final /* synthetic */ List f8579c;

    /* renamed from: d */
    final /* synthetic */ C7790l f8580d;

    /* renamed from: e */
    final /* synthetic */ C6748o f8581e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6698c(C6748o oVar, C7790l lVar, List list, C7790l lVar2) {
        super(lVar);
        this.f8581e = oVar;
        this.f8579c = list;
        this.f8580d = lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            ((C2915l0) this.f8581e.f8751c.mo28461f()).mo28441t2(this.f8581e.f8749a, C6748o.m11465e(this.f8579c), C6748o.m11480t(), new C6728j(this.f8581e, this.f8580d, (byte[]) null));
        } catch (RemoteException e) {
            C6748o.f8747f.mo28422d(e, "cancelDownloads(%s)", this.f8579c);
        }
    }
}
