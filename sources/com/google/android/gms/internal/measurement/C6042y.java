package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6042y {

    /* renamed from: a */
    final Map<String, C6026x> f7472a = new HashMap();

    /* renamed from: b */
    final C5835l0 f7473b = new C5835l0();

    public C6042y() {
        mo34617b(new C6010w());
        mo34617b(new C6058z());
        mo34617b(new C5648a0());
        mo34617b(new C5716e0());
        mo34617b(new C5801j0());
        mo34617b(new C5818k0());
        mo34617b(new C5851m0());
    }

    /* renamed from: a */
    public final C5914q mo34616a(C6015w4 w4Var, C5914q qVar) {
        C6026x xVar;
        C6032x5.m10242c(w4Var);
        if (!(qVar instanceof C5930r)) {
            return qVar;
        }
        C5930r rVar = (C5930r) qVar;
        ArrayList<C5914q> e = rVar.mo34309e();
        String a = rVar.mo34308a();
        if (this.f7472a.containsKey(a)) {
            xVar = this.f7472a.get(a);
        } else {
            xVar = this.f7473b;
        }
        return xVar.mo33643a(a, w4Var, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34617b(C6026x xVar) {
        for (C5867n0 b : xVar.f7464a) {
            this.f7472a.put(b.mo34195b().toString(), xVar);
        }
    }
}
