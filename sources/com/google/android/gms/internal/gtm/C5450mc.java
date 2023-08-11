package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.mc */
public final class C5450mc {

    /* renamed from: a */
    private List<C5476o5> f6130a = new ArrayList();

    /* renamed from: b */
    private String f6131b;

    /* renamed from: a */
    public final C5450mc mo33361a(C5476o5 o5Var) {
        this.f6130a.add(o5Var);
        return this;
    }

    /* renamed from: b */
    public final C5450mc mo33362b(String str) {
        this.f6131b = str;
        return this;
    }

    /* renamed from: c */
    public final C5420kc mo33363c() {
        return new C5420kc(this.f6131b, this.f6130a);
    }
}
