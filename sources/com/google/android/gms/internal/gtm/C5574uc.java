package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.uc */
public final class C5574uc extends C5528rc<Boolean> {

    /* renamed from: c */
    private static final Map<String, C5491p5> f6364c;

    /* renamed from: b */
    private final Boolean f6365b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C5508q7.f6257a);
        hashMap.put("toString", new C5539s8());
        f6364c = Collections.unmodifiableMap(hashMap);
    }

    public C5574uc(Boolean bool) {
        C9713p.m20275j(bool);
        this.f6365b = bool;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return this.f6365b;
    }

    /* renamed from: e */
    public final boolean mo33144e(String str) {
        return f6364c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5574uc) || ((Boolean) ((C5574uc) obj).mo33142a()) != this.f6365b) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C5491p5 mo33146f(String str) {
        if (mo33144e(str)) {
            return f6364c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type BooleanWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    public final String toString() {
        return this.f6365b.toString();
    }
}
