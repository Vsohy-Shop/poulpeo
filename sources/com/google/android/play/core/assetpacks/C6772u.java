package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;
import p024a6.C2209b;
import p037b6.C2895b0;
import p037b6.C2899d0;
import p037b6.C2901e0;

/* renamed from: com.google.android.play.core.assetpacks.u */
public final class C6772u implements C2901e0<C6768t> {

    /* renamed from: a */
    private final C2901e0<Context> f8859a;

    /* renamed from: b */
    private final C2901e0<C6730j1> f8860b;

    /* renamed from: c */
    private final C2901e0<C6765s0> f8861c;

    /* renamed from: d */
    private final C2901e0<C6697b3> f8862d;

    /* renamed from: e */
    private final C2901e0<C6777v0> f8863e;

    /* renamed from: f */
    private final C2901e0<C6729j0> f8864f;

    /* renamed from: g */
    private final C2901e0<C2209b> f8865g;

    /* renamed from: h */
    private final C2901e0<Executor> f8866h;

    /* renamed from: i */
    private final C2901e0<Executor> f8867i;

    public C6772u(C2901e0<Context> e0Var, C2901e0<C6730j1> e0Var2, C2901e0<C6765s0> e0Var3, C2901e0<C6697b3> e0Var4, C2901e0<C6777v0> e0Var5, C2901e0<C6729j0> e0Var6, C2901e0<C2209b> e0Var7, C2901e0<Executor> e0Var8, C2901e0<Executor> e0Var9) {
        this.f8859a = e0Var;
        this.f8860b = e0Var2;
        this.f8861c = e0Var3;
        this.f8862d = e0Var4;
        this.f8863e = e0Var5;
        this.f8864f = e0Var6;
        this.f8865g = e0Var7;
        this.f8866h = e0Var8;
        this.f8867i = e0Var9;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23536a() {
        Context b = ((C6791y2) this.f8859a).mo23536a();
        C6730j1 a = this.f8860b.mo23536a();
        C6765s0 a2 = this.f8861c.mo23536a();
        C2895b0<C6697b3> b2 = C2899d0.m2307b(this.f8862d);
        C6777v0 a3 = this.f8863e.mo23536a();
        C6729j0 a4 = this.f8864f.mo23536a();
        return new C6768t(b, a, a2, b2, a3, a4, this.f8865g.mo23536a(), C2899d0.m2307b(this.f8866h), C2899d0.m2307b(this.f8867i));
    }
}
