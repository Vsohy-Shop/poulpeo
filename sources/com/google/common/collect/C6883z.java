package com.google.common.collect;

/* renamed from: com.google.common.collect.z */
/* compiled from: RegularImmutableSet */
final class C6883z<E> extends C6826n<E> {

    /* renamed from: i */
    static final C6883z<Object> f9032i = new C6883z(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: d */
    final transient Object[] f9033d;

    /* renamed from: e */
    final transient Object[] f9034e;

    /* renamed from: f */
    private final transient int f9035f;

    /* renamed from: g */
    private final transient int f9036g;

    /* renamed from: h */
    private final transient int f9037h;

    C6883z(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f9033d = objArr;
        this.f9034e = objArr2;
        this.f9035f = i2;
        this.f9036g = i;
        this.f9037h = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C6819l<E> mo39419A() {
        return C6819l.m11635t(this.f9033d, this.f9037h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo39420B() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39421b(Object[] objArr, int i) {
        System.arraycopy(this.f9033d, 0, objArr, i, this.f9037h);
        return i + this.f9037h;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f9034e;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = C6816j.m11624b(obj);
        while (true) {
            int i = b & this.f9035f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo39464d() {
        return this.f9033d;
    }

    public int hashCode() {
        return this.f9036g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo39465j() {
        return this.f9037h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo39466k() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo39425q() {
        return false;
    }

    /* renamed from: r */
    public C6809d0<E> iterator() {
        return mo39523s().iterator();
    }

    public int size() {
        return this.f9037h;
    }
}
