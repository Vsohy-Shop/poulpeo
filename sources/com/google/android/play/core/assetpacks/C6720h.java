package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p037b6.C2902f;
import p037b6.C2915l0;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C6720h extends C2902f {

    /* renamed from: c */
    final /* synthetic */ int f8648c;

    /* renamed from: d */
    final /* synthetic */ String f8649d;

    /* renamed from: e */
    final /* synthetic */ String f8650e;

    /* renamed from: f */
    final /* synthetic */ int f8651f;

    /* renamed from: g */
    final /* synthetic */ C7790l f8652g;

    /* renamed from: h */
    final /* synthetic */ C6748o f8653h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6720h(C6748o oVar, C7790l lVar, int i, String str, String str2, int i2, C7790l lVar2) {
        super(lVar);
        this.f8653h = oVar;
        this.f8648c = i;
        this.f8649d = str;
        this.f8650e = str2;
        this.f8651f = i2;
        this.f8652g = lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            ((C2915l0) this.f8653h.f8751c.mo28461f()).mo28442v2(this.f8653h.f8749a, C6748o.m11476p(this.f8648c, this.f8649d, this.f8650e, this.f8651f), C6748o.m11480t(), new C6732k(this.f8653h, this.f8652g));
        } catch (RemoteException e) {
            C6748o.f8747f.mo28423e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f8649d, this.f8650e, Integer.valueOf(this.f8651f), Integer.valueOf(this.f8648c));
            this.f8652g.mo41437d(new RuntimeException(e));
        }
    }
}
