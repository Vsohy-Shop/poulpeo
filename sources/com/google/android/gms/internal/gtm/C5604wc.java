package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.wc */
public final class C5604wc extends C5528rc<C5491p5> {

    /* renamed from: c */
    private static final Map<String, C5491p5> f6450c;

    /* renamed from: b */
    private C5491p5 f6451b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C5508q7.f6257a);
        f6450c = Collections.unmodifiableMap(hashMap);
    }

    public C5604wc(C5491p5 p5Var) {
        this.f6451b = p5Var;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return this.f6451b;
    }

    /* renamed from: e */
    public final boolean mo33144e(String str) {
        return f6450c.containsKey(str);
    }

    /* renamed from: f */
    public final C5491p5 mo33146f(String str) {
        if (mo33144e(str)) {
            return f6450c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type InstructionReference.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public final Iterator<C5528rc<?>> mo33147g() {
        return mo33501h();
    }

    public final String toString() {
        return this.f6451b.toString();
    }
}
