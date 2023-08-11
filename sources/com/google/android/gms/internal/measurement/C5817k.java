package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final /* synthetic */ class C5817k {
    /* renamed from: a */
    public static C5914q m9474a(C5850m mVar, C5914q qVar, C6015w4 w4Var, List<C5914q> list) {
        if (mVar.mo33962j(qVar.mo33956b())) {
            C5914q q = mVar.mo33964q(qVar.mo33956b());
            if (q instanceof C5800j) {
                return ((C5800j) q).mo33875a(w4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.mo33956b()}));
        } else if ("hasOwnProperty".equals(qVar.mo33956b())) {
            C6032x5.m10247h("hasOwnProperty", 1, list);
            if (mVar.mo33962j(w4Var.mo34573b(list.get(0)).mo33956b())) {
                return C5914q.f7294T;
            }
            return C5914q.f7295U;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.mo33956b()}));
        }
    }

    /* renamed from: b */
    public static Iterator<C5914q> m9475b(Map<String, C5914q> map) {
        return new C5834l(map.keySet().iterator());
    }
}
