package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.l1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5003l1 extends C5240z0 {

    /* renamed from: d */
    private final transient Object[] f5281d;

    /* renamed from: e */
    private final transient int f5282e;

    /* renamed from: f */
    private final transient int f5283f;

    C5003l1(Object[] objArr, int i, int i2) {
        this.f5281d = objArr;
        this.f5282e = i;
        this.f5283f = i2;
    }

    public final Object get(int i) {
        C5053o0.m7294a(i, this.f5283f, "index");
        Object obj = this.f5281d[i + i + this.f5282e];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f5283f;
    }
}
