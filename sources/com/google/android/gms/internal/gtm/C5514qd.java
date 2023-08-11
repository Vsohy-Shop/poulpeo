package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.qd */
public final class C5514qd extends C10810n<C5514qd> {

    /* renamed from: a */
    private final Map<String, Object> f6262a = new HashMap();

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5514qd qdVar = (C5514qd) nVar;
        C9713p.m20275j(qdVar);
        qdVar.f6262a.putAll(this.f6262a);
    }

    /* renamed from: e */
    public final void mo33487e(String str, String str2) {
        C9713p.m20271f(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C9713p.m20272g(str, "Name can not be empty or \"&\"");
        this.f6262a.put(str, str2);
    }

    /* renamed from: f */
    public final Map<String, Object> mo33488f() {
        return Collections.unmodifiableMap(this.f6262a);
    }

    public final String toString() {
        return C10810n.m23055a(this.f6262a);
    }
}
