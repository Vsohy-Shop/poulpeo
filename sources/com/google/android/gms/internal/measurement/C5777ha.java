package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ha */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5777ha<E> extends C5774h7<E> implements RandomAccess {

    /* renamed from: e */
    private static final C5777ha<Object> f6979e;

    /* renamed from: c */
    private E[] f6980c;

    /* renamed from: d */
    private int f6981d;

    static {
        C5777ha<Object> haVar = new C5777ha<>(new Object[0], 0);
        f6979e = haVar;
        haVar.zzb();
    }

    private C5777ha(E[] eArr, int i) {
        this.f6980c = eArr;
        this.f6981d = i;
    }

    /* renamed from: d */
    public static <E> C5777ha<E> m9342d() {
        return f6979e;
    }

    /* renamed from: j */
    private final String m9343j(int i) {
        int i2 = this.f6981d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m9344k(int i) {
        if (i < 0 || i >= this.f6981d) {
            throw new IndexOutOfBoundsException(m9343j(i));
        }
    }

    public final void add(int i, E e) {
        int i2;
        mo34072b();
        if (i < 0 || i > (i2 = this.f6981d)) {
            throw new IndexOutOfBoundsException(m9343j(i));
        }
        E[] eArr = this.f6980c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f6980c, i, eArr2, i + 1, this.f6981d - i);
            this.f6980c = eArr2;
        }
        this.f6980c[i] = e;
        this.f6981d++;
        this.modCount++;
    }

    public final E get(int i) {
        m9344k(i);
        return this.f6980c[i];
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5691c9 mo33773m(int i) {
        if (i >= this.f6981d) {
            return new C5777ha(Arrays.copyOf(this.f6980c, i), this.f6981d);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo34072b();
        m9344k(i);
        E[] eArr = this.f6980c;
        E e = eArr[i];
        int i2 = this.f6981d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f6981d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo34072b();
        m9344k(i);
        E[] eArr = this.f6980c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f6981d;
    }

    public final boolean add(E e) {
        mo34072b();
        int i = this.f6981d;
        E[] eArr = this.f6980c;
        if (i == eArr.length) {
            this.f6980c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6980c;
        int i2 = this.f6981d;
        this.f6981d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
