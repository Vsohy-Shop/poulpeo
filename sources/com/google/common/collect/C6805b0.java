package com.google.common.collect;

import p111h6.C8012n;

/* renamed from: com.google.common.collect.b0 */
/* compiled from: SingletonImmutableSet */
final class C6805b0<E> extends C6826n<E> {

    /* renamed from: d */
    final transient E f8922d;

    /* renamed from: e */
    private transient int f8923e;

    C6805b0(E e) {
        this.f8922d = C8012n.m15755n(e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C6819l<E> mo39419A() {
        return C6819l.m11633F(this.f8922d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo39420B() {
        if (this.f8923e != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39421b(Object[] objArr, int i) {
        objArr[i] = this.f8922d;
        return i + 1;
    }

    public boolean contains(Object obj) {
        return this.f8922d.equals(obj);
    }

    public final int hashCode() {
        int i = this.f8923e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f8922d.hashCode();
        this.f8923e = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo39425q() {
        return false;
    }

    /* renamed from: r */
    public C6809d0<E> iterator() {
        return C6828o.m11681c(this.f8922d);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f8922d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    C6805b0(E e, int i) {
        this.f8922d = e;
        this.f8923e = i;
    }
}
