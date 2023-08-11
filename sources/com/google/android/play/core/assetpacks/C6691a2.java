package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import p037b6.C2895b0;

/* renamed from: com.google.android.play.core.assetpacks.a2 */
final class C6691a2 {

    /* renamed from: a */
    private final C6792z f8564a;

    /* renamed from: b */
    private final C2895b0<C6697b3> f8565b;

    /* renamed from: c */
    private final C6730j1 f8566c;

    /* renamed from: d */
    private final C2895b0<Executor> f8567d;

    /* renamed from: e */
    private final C6777v0 f8568e;

    C6691a2(C6792z zVar, C2895b0<C6697b3> b0Var, C6730j1 j1Var, C2895b0<Executor> b0Var2, C6777v0 v0Var) {
        this.f8564a = zVar;
        this.f8565b = b0Var;
        this.f8566c = j1Var;
        this.f8567d = b0Var2;
        this.f8568e = v0Var;
    }

    /* renamed from: a */
    public final void mo39262a(C6790y1 y1Var) {
        File m = this.f8564a.mo39390m(y1Var.f8700b, y1Var.f8907c, y1Var.f8908d);
        File v = this.f8564a.mo39398v(y1Var.f8700b, y1Var.f8907c, y1Var.f8908d);
        if (!m.exists() || !v.exists()) {
            throw new C6761r0(String.format("Cannot find pack files to move for pack %s.", new Object[]{y1Var.f8700b}), y1Var.f8699a);
        }
        File b = this.f8564a.mo39381b(y1Var.f8700b, y1Var.f8907c, y1Var.f8908d);
        b.mkdirs();
        if (m.renameTo(b)) {
            new File(this.f8564a.mo39381b(y1Var.f8700b, y1Var.f8907c, y1Var.f8908d), "merge.tmp").delete();
            File j = this.f8564a.mo39387j(y1Var.f8700b, y1Var.f8907c, y1Var.f8908d);
            j.mkdirs();
            if (v.renameTo(j)) {
                C6792z zVar = this.f8564a;
                zVar.getClass();
                this.f8567d.mo28418a().execute(C6794z1.m11603a(zVar));
                this.f8566c.mo39318d(y1Var.f8700b, y1Var.f8907c, y1Var.f8908d);
                this.f8568e.mo39376b(y1Var.f8700b);
                this.f8565b.mo28418a().mo39270a(y1Var.f8699a, y1Var.f8700b);
                return;
            }
            throw new C6761r0("Cannot move metadata files to final location.", y1Var.f8699a);
        }
        throw new C6761r0("Cannot move merged pack files to final location.", y1Var.f8699a);
    }
}
