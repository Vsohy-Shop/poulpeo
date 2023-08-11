package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.kf */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5833kf {

    /* renamed from: a */
    final TreeMap<Integer, C5898p> f7038a = new TreeMap<>();

    /* renamed from: b */
    final TreeMap<Integer, C5898p> f7039b = new TreeMap<>();

    /* renamed from: c */
    private static final int m9526c(C6015w4 w4Var, C5898p pVar, C5914q qVar) {
        C5914q a = pVar.mo33875a(w4Var, Collections.singletonList(qVar));
        if (a instanceof C5783i) {
            return C6032x5.m10241b(a.mo33971y().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo34146a(String str, int i, C5898p pVar, String str2) {
        TreeMap<Integer, C5898p> treeMap;
        String str3;
        if ("create".equals(str2)) {
            treeMap = this.f7039b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f7038a;
        } else {
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str3 = "Unknown callback type: ".concat(valueOf);
            } else {
                str3 = new String("Unknown callback type: ");
            }
            throw new IllegalStateException(str3);
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo34147b(C6015w4 w4Var, C5681c cVar) {
        C6004v9 v9Var = new C6004v9(cVar);
        for (Integer num : this.f7038a.keySet()) {
            C5664b b = cVar.mo33724b().clone();
            int c = m9526c(w4Var, this.f7038a.get(num), v9Var);
            if (c == 2 || c == -1) {
                cVar.mo33729f(b);
            }
        }
        for (Integer num2 : this.f7039b.keySet()) {
            m9526c(w4Var, this.f7039b.get(num2), v9Var);
        }
    }
}
