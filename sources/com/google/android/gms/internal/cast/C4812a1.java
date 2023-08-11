package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.a1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4812a1 {

    /* renamed from: a */
    private final Object f5111a;

    /* renamed from: b */
    private final Object f5112b;

    /* renamed from: c */
    private final Object f5113c;

    C4812a1(Object obj, Object obj2, Object obj3) {
        this.f5111a = obj;
        this.f5112b = obj2;
        this.f5113c = obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException mo32612a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f5111a + "=" + this.f5112b + " and " + this.f5111a + "=" + this.f5113c);
    }
}
