package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C6019w8 extends C5774h7<Integer> implements RandomAccess, C5657a9, C5743fa {

    /* renamed from: e */
    private static final C6019w8 f7455e;

    /* renamed from: c */
    private int[] f7456c;

    /* renamed from: d */
    private int f7457d;

    static {
        C6019w8 w8Var = new C6019w8(new int[0], 0);
        f7455e = w8Var;
        w8Var.zzb();
    }

    C6019w8() {
        this(new int[10], 0);
    }

    /* renamed from: j */
    public static C6019w8 m10215j() {
        return f7455e;
    }

    /* renamed from: k */
    private final String m10216k(int i) {
        int i2 = this.f7457d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: q */
    private final void m10217q(int i) {
        if (i < 0 || i >= this.f7457d) {
            throw new IndexOutOfBoundsException(m10216k(i));
        }
    }

    /* renamed from: E */
    public final void mo34586E(int i) {
        mo34072b();
        int i2 = this.f7457d;
        int[] iArr = this.f7456c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f7456c = iArr2;
        }
        int[] iArr3 = this.f7456c;
        int i3 = this.f7457d;
        this.f7457d = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: a */
    public final C5657a9 mo33773m(int i) {
        if (i >= this.f7457d) {
            return new C6019w8(Arrays.copyOf(this.f7456c, i), this.f7457d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo34072b();
        if (i < 0 || i > (i2 = this.f7457d)) {
            throw new IndexOutOfBoundsException(m10216k(i));
        }
        int[] iArr = this.f7456c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f7456c, i, iArr2, i + 1, this.f7457d - i);
            this.f7456c = iArr2;
        }
        this.f7456c[i] = intValue;
        this.f7457d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo34072b();
        C5708d9.m9018e(collection);
        if (!(collection instanceof C6019w8)) {
            return super.addAll(collection);
        }
        C6019w8 w8Var = (C6019w8) collection;
        int i = w8Var.f7457d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7457d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f7456c;
            if (i3 > iArr.length) {
                this.f7456c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(w8Var.f7456c, 0, this.f7456c, this.f7457d, w8Var.f7457d);
            this.f7457d = i3;
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
    public final int mo34589d(int i) {
        m10217q(i);
        return this.f7456c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6019w8)) {
            return super.equals(obj);
        }
        C6019w8 w8Var = (C6019w8) obj;
        if (this.f7457d != w8Var.f7457d) {
            return false;
        }
        int[] iArr = w8Var.f7456c;
        for (int i = 0; i < this.f7457d; i++) {
            if (this.f7456c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m10217q(i);
        return Integer.valueOf(this.f7456c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7457d; i2++) {
            i = (i * 31) + this.f7456c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f7457d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7456c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo34072b();
        m10217q(i);
        int[] iArr = this.f7456c;
        int i2 = iArr[i];
        int i3 = this.f7457d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f7457d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo34072b();
        if (i2 >= i) {
            int[] iArr = this.f7456c;
            System.arraycopy(iArr, i2, iArr, i, this.f7457d - i2);
            this.f7457d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo34072b();
        m10217q(i);
        int[] iArr = this.f7456c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f7457d;
    }

    private C6019w8(int[] iArr, int i) {
        this.f7456c = iArr;
        this.f7457d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo34586E(((Integer) obj).intValue());
        return true;
    }
}
