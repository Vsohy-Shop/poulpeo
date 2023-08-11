package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.gc */
public final class C5359gc {

    /* renamed from: a */
    private final Map<String, C5465nc> f6016a = new HashMap();

    /* renamed from: b */
    private C5465nc f6017b;

    /* renamed from: a */
    public final C5359gc mo33221a(String str, C5465nc ncVar) {
        this.f6016a.put(str, ncVar);
        return this;
    }

    /* renamed from: b */
    public final C5359gc mo33222b(C5465nc ncVar) {
        this.f6017b = ncVar;
        return this;
    }

    /* renamed from: c */
    public final C5329ec mo33223c() {
        return new C5329ec(this.f6016a, this.f6017b);
    }
}
