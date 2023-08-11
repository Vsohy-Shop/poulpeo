package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.wa */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6021wa extends C5800j {

    /* renamed from: d */
    final /* synthetic */ C6039xc f7458d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6021wa(C6022wb wbVar, String str, C6039xc xcVar) {
        super("getValue");
        this.f7458d = xcVar;
    }

    /* renamed from: a */
    public final C5914q mo33875a(C6015w4 w4Var, List<C5914q> list) {
        C6032x5.m10247h("getValue", 2, list);
        C5914q b = w4Var.mo34573b(list.get(0));
        C5914q b2 = w4Var.mo34573b(list.get(1));
        String a = this.f7458d.mo34613a(b.mo33956b());
        if (a != null) {
            return new C5978u(a);
        }
        return b2;
    }
}
