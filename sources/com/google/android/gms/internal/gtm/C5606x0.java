package com.google.android.gms.internal.gtm;

import p210r4.C9379a;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.x0 */
public final class C5606x0<V> {

    /* renamed from: a */
    private final V f6714a;

    /* renamed from: b */
    private final C9379a<V> f6715b;

    private C5606x0(C9379a<V> aVar, V v) {
        C9713p.m20275j(aVar);
        this.f6715b = aVar;
        this.f6714a = v;
    }

    /* renamed from: b */
    static C5606x0<Float> m8638b(String str, float f, float f2) {
        Float valueOf = Float.valueOf(0.5f);
        return new C5606x0<>(C9379a.m19405a(str, valueOf), valueOf);
    }

    /* renamed from: c */
    static C5606x0<Integer> m8639c(String str, int i, int i2) {
        return new C5606x0<>(C9379a.m19406b(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    /* renamed from: d */
    static C5606x0<Long> m8640d(String str, long j, long j2) {
        return new C5606x0<>(C9379a.m19407c(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* renamed from: e */
    static C5606x0<String> m8641e(String str, String str2, String str3) {
        return new C5606x0<>(C9379a.m19408d(str, str3), str2);
    }

    /* renamed from: f */
    static C5606x0<Boolean> m8642f(String str, boolean z, boolean z2) {
        return new C5606x0<>(C9379a.m19409e(str, z2), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final V mo33605a() {
        return this.f6714a;
    }
}
