package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.ed */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4896ed extends C5217xb implements RandomAccess, C4964id, C5101qe {

    /* renamed from: e */
    private static final C4896ed f5206e;

    /* renamed from: c */
    private int[] f5207c;

    /* renamed from: d */
    private int f5208d;

    static {
        C4896ed edVar = new C4896ed(new int[0], 0);
        f5206e = edVar;
        edVar.zzb();
    }

    C4896ed() {
        this(new int[10], 0);
    }

    /* renamed from: j */
    public static C4896ed m6949j() {
        return f5206e;
    }

    /* renamed from: k */
    private final String m6950k(int i) {
        int i2 = this.f5208d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: q */
    private final void m6951q(int i) {
        if (i < 0 || i >= this.f5208d) {
            throw new IndexOutOfBoundsException(m6950k(i));
        }
    }

    /* renamed from: E */
    public final void mo32764E(int i) {
        mo33047b();
        int i2 = this.f5208d;
        int[] iArr = this.f5207c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5207c = iArr2;
        }
        int[] iArr3 = this.f5207c;
        int i3 = this.f5208d;
        this.f5208d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo33047b();
        if (i < 0 || i > (i2 = this.f5208d)) {
            throw new IndexOutOfBoundsException(m6950k(i));
        }
        int[] iArr = this.f5207c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f5207c, i, iArr2, i + 1, this.f5208d - i);
            this.f5207c = iArr2;
        }
        this.f5207c[i] = intValue;
        this.f5208d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo33047b();
        C5032md.m7198e(collection);
        if (!(collection instanceof C4896ed)) {
            return super.addAll(collection);
        }
        C4896ed edVar = (C4896ed) collection;
        int i = edVar.f5208d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5208d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f5207c;
            if (i3 > iArr.length) {
                this.f5207c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(edVar.f5207c, 0, this.f5207c, this.f5208d, edVar.f5208d);
            this.f5208d = i3;
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
    public final int mo32770d(int i) {
        m6951q(i);
        return this.f5207c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4896ed)) {
            return super.equals(obj);
        }
        C4896ed edVar = (C4896ed) obj;
        if (this.f5208d != edVar.f5208d) {
            return false;
        }
        int[] iArr = edVar.f5207c;
        for (int i = 0; i < this.f5208d; i++) {
            if (this.f5207c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C4964id mo32765a(int i) {
        if (i >= this.f5208d) {
            return new C4896ed(Arrays.copyOf(this.f5207c, i), this.f5208d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m6951q(i);
        return Integer.valueOf(this.f5207c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5208d; i2++) {
            i = (i * 31) + this.f5207c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f5208d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f5207c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33047b();
        m6951q(i);
        int[] iArr = this.f5207c;
        int i2 = iArr[i];
        int i3 = this.f5208d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f5208d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo33047b();
        if (i2 >= i) {
            int[] iArr = this.f5207c;
            System.arraycopy(iArr, i2, iArr, i, this.f5208d - i2);
            this.f5208d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo33047b();
        m6951q(i);
        int[] iArr = this.f5207c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f5208d;
    }

    private C4896ed(int[] iArr, int i) {
        this.f5207c = iArr;
        this.f5208d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo32764E(((Integer) obj).intValue());
        return true;
    }
}
