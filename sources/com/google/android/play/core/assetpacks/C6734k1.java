package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import p037b6.C2899d0;
import p037b6.C2901e0;

/* renamed from: com.google.android.play.core.assetpacks.k1 */
public final class C6734k1 implements C2901e0<C6730j1> {

    /* renamed from: a */
    private final C2901e0<C6792z> f8693a;

    /* renamed from: b */
    private final C2901e0<C6697b3> f8694b;

    /* renamed from: c */
    private final C2901e0<C6777v0> f8695c;

    /* renamed from: d */
    private final C2901e0<Executor> f8696d;

    public C6734k1(C2901e0<C6792z> e0Var, C2901e0<C6697b3> e0Var2, C2901e0<C6777v0> e0Var3, C2901e0<Executor> e0Var4) {
        this.f8693a = e0Var;
        this.f8694b = e0Var2;
        this.f8695c = e0Var3;
        this.f8696d = e0Var4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23536a() {
        C6792z a = this.f8693a.mo23536a();
        return new C6730j1(a, C2899d0.m2307b(this.f8694b), this.f8695c.mo23536a(), C2899d0.m2307b(this.f8696d));
    }
}
