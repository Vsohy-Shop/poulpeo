package com.google.common.collect;

import p111h6.C8012n;

/* renamed from: com.google.common.collect.x */
/* compiled from: RegularImmutableList */
class C6877x<E> extends C6819l<E> {

    /* renamed from: f */
    static final C6819l<Object> f9015f = new C6877x(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f9016d;

    /* renamed from: e */
    private final transient int f9017e;

    C6877x(Object[] objArr, int i) {
        this.f9016d = objArr;
        this.f9017e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39421b(Object[] objArr, int i) {
        System.arraycopy(this.f9016d, 0, objArr, i, this.f9017e);
        return i + this.f9017e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo39464d() {
        return this.f9016d;
    }

    public E get(int i) {
        C8012n.m15753l(i, this.f9017e);
        return this.f9016d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo39465j() {
        return this.f9017e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo39466k() {
        return 0;
    }

    public int size() {
        return this.f9017e;
    }
}
