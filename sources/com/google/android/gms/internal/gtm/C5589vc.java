package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.vc */
public final class C5589vc extends C5528rc<Double> {

    /* renamed from: c */
    private static final Map<String, C5491p5> f6389c;

    /* renamed from: b */
    private Double f6390b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C5508q7.f6257a);
        hashMap.put("toString", new C5539s8());
        f6389c = Collections.unmodifiableMap(hashMap);
    }

    public C5589vc(Double d) {
        C9713p.m20275j(d);
        this.f6390b = d;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return this.f6390b;
    }

    /* renamed from: e */
    public final boolean mo33144e(String str) {
        return f6389c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5589vc) {
            return this.f6390b.equals((Double) ((C5589vc) obj).mo33142a());
        }
        return false;
    }

    /* renamed from: f */
    public final C5491p5 mo33146f(String str) {
        if (mo33144e(str)) {
            return f6389c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type DoubleWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    public final String toString() {
        return this.f6390b.toString();
    }
}
