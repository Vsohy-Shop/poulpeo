package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.g1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4918g1 extends C5240z0 {

    /* renamed from: f */
    static final C5240z0 f5227f = new C4918g1(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f5228d;

    /* renamed from: e */
    private final transient int f5229e;

    C4918g1(Object[] objArr, int i) {
        this.f5228d = objArr;
        this.f5229e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32793b(Object[] objArr, int i) {
        System.arraycopy(this.f5228d, 0, objArr, 0, this.f5229e);
        return this.f5229e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo32794d() {
        return this.f5229e;
    }

    public final Object get(int i) {
        C5053o0.m7294a(i, this.f5229e, "index");
        Object obj = this.f5228d[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo32796j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Object[] mo32797q() {
        return this.f5228d;
    }

    public final int size() {
        return this.f5229e;
    }
}
