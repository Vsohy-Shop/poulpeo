package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p037b6.C2895b0;
import p037b6.C2900e;
import p087f6.C7604a;

/* renamed from: com.google.android.play.core.assetpacks.s2 */
final class C6767s2 {

    /* renamed from: j */
    private static final C2900e f8823j = new C2900e("AssetPackManager");

    /* renamed from: a */
    private final C6792z f8824a;

    /* renamed from: b */
    private final C2895b0<C6697b3> f8825b;

    /* renamed from: c */
    private final C6768t f8826c;

    /* renamed from: d */
    private final C7604a f8827d;

    /* renamed from: e */
    private final C6730j1 f8828e;

    /* renamed from: f */
    private final C6777v0 f8829f;

    /* renamed from: g */
    private final C6729j0 f8830g;

    /* renamed from: h */
    private final C2895b0<Executor> f8831h;

    /* renamed from: i */
    private final Handler f8832i = new Handler(Looper.getMainLooper());

    C6767s2(C6792z zVar, C2895b0<C6697b3> b0Var, C6768t tVar, C7604a aVar, C6730j1 j1Var, C6777v0 v0Var, C6729j0 j0Var, C2895b0<Executor> b0Var2) {
        this.f8824a = zVar;
        this.f8825b = b0Var;
        this.f8826c = tVar;
        this.f8827d = aVar;
        this.f8828e = j1Var;
        this.f8829f = v0Var;
        this.f8830g = j0Var;
        this.f8831h = b0Var2;
    }

    /* renamed from: d */
    private final void m11523d() {
        this.f8831h.mo28418a().execute(new C6755p2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39361b(boolean z) {
        boolean d = this.f8826c.mo29932d();
        this.f8826c.mo29931c(z);
        if (z && !d) {
            m11523d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo39362c() {
        C6792z zVar = this.f8824a;
        zVar.getClass();
        this.f8825b.mo28418a().mo39268a(this.f8824a.mo39389l()).mo41424d(this.f8831h.mo28418a(), C6759q2.m11503b(zVar)).mo41422b(this.f8831h.mo28418a(), C6763r2.f8804a);
    }
}
