package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.yd */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5236yd extends C5217xb implements RandomAccess, C4998kd, C5101qe {

    /* renamed from: e */
    private static final C5236yd f5609e;

    /* renamed from: c */
    private long[] f5610c;

    /* renamed from: d */
    private int f5611d;

    static {
        C5236yd ydVar = new C5236yd(new long[0], 0);
        f5609e = ydVar;
        ydVar.zzb();
    }

    C5236yd() {
        this(new long[10], 0);
    }

    /* renamed from: E */
    private final void m7704E(int i) {
        if (i < 0 || i >= this.f5611d) {
            throw new IndexOutOfBoundsException(m7706k(i));
        }
    }

    /* renamed from: j */
    public static C5236yd m7705j() {
        return f5609e;
    }

    /* renamed from: k */
    private final String m7706k(int i) {
        int i2 = this.f5611d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5015ld mo32765a(int i) {
        if (i >= this.f5611d) {
            return new C5236yd(Arrays.copyOf(this.f5610c, i), this.f5611d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo33047b();
        if (i < 0 || i > (i2 = this.f5611d)) {
            throw new IndexOutOfBoundsException(m7706k(i));
        }
        long[] jArr = this.f5610c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f5610c, i, jArr2, i + 1, this.f5611d - i);
            this.f5610c = jArr2;
        }
        this.f5610c[i] = longValue;
        this.f5611d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo33047b();
        C5032md.m7198e(collection);
        if (!(collection instanceof C5236yd)) {
            return super.addAll(collection);
        }
        C5236yd ydVar = (C5236yd) collection;
        int i = ydVar.f5611d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5611d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f5610c;
            if (i3 > jArr.length) {
                this.f5610c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(ydVar.f5610c, 0, this.f5610c, this.f5611d, ydVar.f5611d);
            this.f5611d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final long mo33068d(int i) {
        m7704E(i);
        return this.f5610c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5236yd)) {
            return super.equals(obj);
        }
        C5236yd ydVar = (C5236yd) obj;
        if (this.f5611d != ydVar.f5611d) {
            return false;
        }
        long[] jArr = ydVar.f5610c;
        for (int i = 0; i < this.f5611d; i++) {
            if (this.f5610c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m7704E(i);
        return Long.valueOf(this.f5610c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5611d; i2++) {
            i = (i * 31) + C5032md.m7196c(this.f5610c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f5611d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f5610c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33047b();
        m7704E(i);
        long[] jArr = this.f5610c;
        long j = jArr[i];
        int i2 = this.f5611d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f5611d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo33047b();
        if (i2 >= i) {
            long[] jArr = this.f5610c;
            System.arraycopy(jArr, i2, jArr, i, this.f5611d - i2);
            this.f5611d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo33047b();
        m7704E(i);
        long[] jArr = this.f5610c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f5611d;
    }

    private C5236yd(long[] jArr, int i) {
        this.f5610c = jArr;
        this.f5611d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        mo33047b();
        int i = this.f5611d;
        long[] jArr = this.f5610c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f5610c = jArr2;
        }
        long[] jArr3 = this.f5610c;
        int i2 = this.f5611d;
        this.f5611d = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }
}
