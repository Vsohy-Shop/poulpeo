package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.od */
public final class C5484od extends C10810n<C5484od> {

    /* renamed from: a */
    private Map<Integer, String> f6221a = new HashMap(4);

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        ((C5484od) nVar).f6221a.putAll(this.f6221a);
    }

    /* renamed from: e */
    public final Map<Integer, String> mo33433e() {
        return Collections.unmodifiableMap(this.f6221a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6221a.entrySet()) {
            String valueOf = String.valueOf(next.getKey());
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append(TypedValues.Custom.S_DIMENSION);
            sb.append(valueOf);
            hashMap.put(sb.toString(), next.getValue());
        }
        return C10810n.m23055a(hashMap);
    }
}
