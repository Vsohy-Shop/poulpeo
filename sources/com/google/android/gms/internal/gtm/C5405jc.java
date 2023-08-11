package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.jc */
public final class C5405jc {

    /* renamed from: a */
    private final List<C5329ec> f6069a = new ArrayList();

    /* renamed from: b */
    private final List<C5329ec> f6070b = new ArrayList();

    /* renamed from: c */
    private final List<C5329ec> f6071c = new ArrayList();

    /* renamed from: d */
    private final List<C5329ec> f6072d = new ArrayList();

    /* renamed from: a */
    public final C5405jc mo33301a(C5329ec ecVar) {
        this.f6069a.add(ecVar);
        return this;
    }

    /* renamed from: b */
    public final C5405jc mo33302b(C5329ec ecVar) {
        this.f6070b.add(ecVar);
        return this;
    }

    /* renamed from: c */
    public final C5405jc mo33303c(C5329ec ecVar) {
        this.f6071c.add(ecVar);
        return this;
    }

    /* renamed from: d */
    public final C5405jc mo33304d(C5329ec ecVar) {
        this.f6072d.add(ecVar);
        return this;
    }

    /* renamed from: e */
    public final C5375hc mo33305e() {
        return new C5375hc(this.f6069a, this.f6070b, this.f6071c, this.f6072d);
    }
}
