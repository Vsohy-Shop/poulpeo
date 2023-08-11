package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.b1 */
/* compiled from: ProtobufArrayList */
final class C7065b1<E> extends C7066c<E> implements RandomAccess {

    /* renamed from: e */
    private static final C7065b1<Object> f9525e;

    /* renamed from: c */
    private E[] f9526c;

    /* renamed from: d */
    private int f9527d;

    static {
        C7065b1<Object> b1Var = new C7065b1<>(new Object[0], 0);
        f9525e = b1Var;
        b1Var.mo40200l();
    }

    private C7065b1(E[] eArr, int i) {
        this.f9526c = eArr;
        this.f9527d = i;
    }

    /* renamed from: d */
    private static <E> E[] m12801d(int i) {
        return new Object[i];
    }

    /* renamed from: j */
    public static <E> C7065b1<E> m12802j() {
        return f9525e;
    }

    /* renamed from: k */
    private void m12803k(int i) {
        if (i < 0 || i >= this.f9527d) {
            throw new IndexOutOfBoundsException(m12804q(i));
        }
    }

    /* renamed from: q */
    private String m12804q(int i) {
        return "Index:" + i + ", Size:" + this.f9527d;
    }

    public boolean add(E e) {
        mo40196b();
        int i = this.f9527d;
        E[] eArr = this.f9526c;
        if (i == eArr.length) {
            this.f9526c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f9526c;
        int i2 = this.f9527d;
        this.f9527d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        m12803k(i);
        return this.f9526c[i];
    }

    /* renamed from: r */
    public C7065b1<E> mo40188n(int i) {
        if (i >= this.f9527d) {
            return new C7065b1<>(Arrays.copyOf(this.f9526c, i), this.f9527d);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo40196b();
        m12803k(i);
        E[] eArr = this.f9526c;
        E e = eArr[i];
        int i2 = this.f9527d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f9527d--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo40196b();
        m12803k(i);
        E[] eArr = this.f9526c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f9527d;
    }

    public void add(int i, E e) {
        int i2;
        mo40196b();
        if (i < 0 || i > (i2 = this.f9527d)) {
            throw new IndexOutOfBoundsException(m12804q(i));
        }
        E[] eArr = this.f9526c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] d = m12801d(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f9526c, 0, d, 0, i);
            System.arraycopy(this.f9526c, i, d, i + 1, this.f9527d - i);
            this.f9526c = d;
        }
        this.f9526c[i] = e;
        this.f9527d++;
        this.modCount++;
    }
}
