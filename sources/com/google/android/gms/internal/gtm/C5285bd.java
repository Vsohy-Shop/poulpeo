package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.bd */
public final class C5285bd extends C5528rc<Map<String, C5528rc<?>>> {

    /* renamed from: c */
    private static final Map<String, C5491p5> f5888c;

    /* renamed from: b */
    private boolean f5889b = false;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C5508q7.f6257a);
        f5888c = Collections.unmodifiableMap(hashMap);
    }

    public C5285bd(Map<String, C5528rc<?>> map) {
        this.f6287a = (Map) C9713p.m20275j(map);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return this.f6287a;
    }

    /* renamed from: d */
    public final C5528rc<?> mo33143d(String str) {
        C5528rc<?> d = super.mo33143d(str);
        if (d == null) {
            return C5618xc.f6732h;
        }
        return d;
    }

    /* renamed from: e */
    public final boolean mo33144e(String str) {
        return f5888c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5285bd) {
            return this.f6287a.entrySet().equals(((Map) ((C5285bd) obj).mo33142a()).entrySet());
        }
        return false;
    }

    /* renamed from: f */
    public final C5491p5 mo33146f(String str) {
        if (mo33144e(str)) {
            return f5888c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type ListWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public final Iterator<C5528rc<?>> mo33147g() {
        return mo33501h();
    }

    /* renamed from: i */
    public final boolean mo33148i() {
        return this.f5889b;
    }

    /* renamed from: j */
    public final void mo33149j() {
        this.f5889b = true;
    }

    public final String toString() {
        return this.f6287a.toString();
    }
}
