package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.pd */
public final class C5499pd extends C10810n<C5499pd> {

    /* renamed from: a */
    private Map<Integer, Double> f6243a = new HashMap(4);

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        ((C5499pd) nVar).f6243a.putAll(this.f6243a);
    }

    /* renamed from: e */
    public final Map<Integer, Double> mo33463e() {
        return Collections.unmodifiableMap(this.f6243a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6243a.entrySet()) {
            String valueOf = String.valueOf(next.getKey());
            StringBuilder sb = new StringBuilder(valueOf.length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), next.getValue());
        }
        return C10810n.m23055a(hashMap);
    }
}
