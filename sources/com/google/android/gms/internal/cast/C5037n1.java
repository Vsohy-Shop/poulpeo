package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.n1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5037n1 extends C4866d1 {

    /* renamed from: i */
    private static final Object[] f5385i;

    /* renamed from: j */
    static final C5037n1 f5386j;

    /* renamed from: d */
    final transient Object[] f5387d;

    /* renamed from: e */
    private final transient int f5388e;

    /* renamed from: f */
    final transient Object[] f5389f;

    /* renamed from: g */
    private final transient int f5390g;

    /* renamed from: h */
    private final transient int f5391h;

    static {
        Object[] objArr = new Object[0];
        f5385i = objArr;
        f5386j = new C5037n1(objArr, 0, objArr, 0, 0);
    }

    C5037n1(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f5387d = objArr;
        this.f5388e = i;
        this.f5389f = objArr2;
        this.f5390g = i2;
        this.f5391h = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32793b(Object[] objArr, int i) {
        System.arraycopy(this.f5387d, 0, objArr, 0, this.f5391h);
        return this.f5391h;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f5389f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = C5121s0.m7441a(obj.hashCode());
        while (true) {
            int i = a & this.f5390g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo32794d() {
        return this.f5391h;
    }

    public final int hashCode() {
        return this.f5388e;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo32723k().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo32796j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Object[] mo32797q() {
        return this.f5387d;
    }

    /* renamed from: r */
    public final C5088q1 mo32724r() {
        return mo32723k().listIterator(0);
    }

    public final int size() {
        return this.f5391h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C5240z0 mo32725t() {
        return C5240z0.m7712u(this.f5387d, this.f5391h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo32726z() {
        return true;
    }
}
