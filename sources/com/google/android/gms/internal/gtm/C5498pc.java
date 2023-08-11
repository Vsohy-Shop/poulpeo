package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.pc */
public final class C5498pc {

    /* renamed from: a */
    private final Integer f6239a;

    /* renamed from: b */
    private final Object f6240b;

    /* renamed from: c */
    private final List<Integer> f6241c = new ArrayList();

    /* renamed from: d */
    private boolean f6242d = false;

    public C5498pc(int i, Object obj) {
        this.f6239a = Integer.valueOf(i);
        this.f6240b = obj;
    }

    /* renamed from: a */
    public final C5498pc mo33460a(int i) {
        this.f6241c.add(Integer.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public final C5498pc mo33461b(boolean z) {
        this.f6242d = true;
        return this;
    }

    /* renamed from: c */
    public final C5465nc mo33462c() {
        C9713p.m20275j(this.f6239a);
        C9713p.m20275j(this.f6240b);
        return new C5465nc(this.f6239a, this.f6240b, this.f6241c, this.f6242d);
    }
}
