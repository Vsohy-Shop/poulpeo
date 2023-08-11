package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import p037b6.C2895b0;
import p037b6.C2899d0;
import p037b6.C2901e0;

/* renamed from: com.google.android.play.core.assetpacks.s1 */
public final class C6766s1 implements C2901e0<C6762r1> {

    /* renamed from: a */
    private final C2901e0<String> f8817a;

    /* renamed from: b */
    private final C2901e0<C6768t> f8818b;

    /* renamed from: c */
    private final C2901e0<C6777v0> f8819c;

    /* renamed from: d */
    private final C2901e0<Context> f8820d;

    /* renamed from: e */
    private final C2901e0<C6701c2> f8821e;

    /* renamed from: f */
    private final C2901e0<Executor> f8822f;

    public C6766s1(C2901e0<String> e0Var, C2901e0<C6768t> e0Var2, C2901e0<C6777v0> e0Var3, C2901e0<Context> e0Var4, C2901e0<C6701c2> e0Var5, C2901e0<Executor> e0Var6) {
        this.f8817a = e0Var;
        this.f8818b = e0Var2;
        this.f8819c = e0Var3;
        this.f8820d = e0Var4;
        this.f8821e = e0Var5;
        this.f8822f = e0Var6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23536a() {
        File file;
        String a = this.f8817a.mo23536a();
        C6768t a2 = this.f8818b.mo23536a();
        C6777v0 a3 = this.f8819c.mo23536a();
        Context b = ((C6791y2) this.f8820d).mo23536a();
        C6701c2 a4 = this.f8821e.mo23536a();
        C2895b0<Executor> b2 = C2899d0.m2307b(this.f8822f);
        C6768t tVar = a2;
        C6777v0 v0Var = a3;
        C6701c2 c2Var = a4;
        if (a != null) {
            file = new File(b.getExternalFilesDir((String) null), a);
        } else {
            file = b.getExternalFilesDir((String) null);
        }
        return new C6762r1(file, tVar, v0Var, b, c2Var, b2);
    }
}
