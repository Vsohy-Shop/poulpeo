package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.m9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5860m9 extends C5774h7<Long> implements RandomAccess, C5674b9, C5743fa {

    /* renamed from: e */
    private static final C5860m9 f7067e;

    /* renamed from: c */
    private long[] f7068c;

    /* renamed from: d */
    private int f7069d;

    static {
        C5860m9 m9Var = new C5860m9(new long[0], 0);
        f7067e = m9Var;
        m9Var.zzb();
    }

    C5860m9() {
        this(new long[10], 0);
    }

    /* renamed from: d */
    public static C5860m9 m9632d() {
        return f7067e;
    }

    /* renamed from: k */
    private final String m9633k(int i) {
        int i2 = this.f7069d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: q */
    private final void m9634q(int i) {
        if (i < 0 || i >= this.f7069d) {
            throw new IndexOutOfBoundsException(m9633k(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo34072b();
        if (i < 0 || i > (i2 = this.f7069d)) {
            throw new IndexOutOfBoundsException(m9633k(i));
        }
        long[] jArr = this.f7068c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f7068c, i, jArr2, i + 1, this.f7069d - i);
            this.f7068c = jArr2;
        }
        this.f7068c[i] = longValue;
        this.f7069d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo34072b();
        C5708d9.m9018e(collection);
        if (!(collection instanceof C5860m9)) {
            return super.addAll(collection);
        }
        C5860m9 m9Var = (C5860m9) collection;
        int i = m9Var.f7069d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7069d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f7068c;
            if (i3 > jArr.length) {
                this.f7068c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(m9Var.f7068c, 0, this.f7068c, this.f7069d, m9Var.f7069d);
            this.f7069d = i3;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5860m9)) {
            return super.equals(obj);
        }
        C5860m9 m9Var = (C5860m9) obj;
        if (this.f7069d != m9Var.f7069d) {
            return false;
        }
        long[] jArr = m9Var.f7068c;
        for (int i = 0; i < this.f7069d; i++) {
            if (this.f7068c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final long mo33702g(int i) {
        m9634q(i);
        return this.f7068c[i];
    }

    public final /* synthetic */ Object get(int i) {
        m9634q(i);
        return Long.valueOf(this.f7068c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7069d; i2++) {
            i = (i * 31) + C5708d9.m9016c(this.f7068c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C5674b9 mo33773m(int i) {
        if (i >= this.f7069d) {
            return new C5860m9(Arrays.copyOf(this.f7068c, i), this.f7069d);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f7069d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7068c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo34184j(long j) {
        mo34072b();
        int i = this.f7069d;
        long[] jArr = this.f7068c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f7068c = jArr2;
        }
        long[] jArr3 = this.f7068c;
        int i2 = this.f7069d;
        this.f7069d = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo34072b();
        m9634q(i);
        long[] jArr = this.f7068c;
        long j = jArr[i];
        int i2 = this.f7069d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f7069d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo34072b();
        if (i2 >= i) {
            long[] jArr = this.f7068c;
            System.arraycopy(jArr, i2, jArr, i, this.f7069d - i2);
            this.f7069d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo34072b();
        m9634q(i);
        long[] jArr = this.f7068c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f7069d;
    }

    private C5860m9(long[] jArr, int i) {
        this.f7068c = jArr;
        this.f7069d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo34184j(((Long) obj).longValue());
        return true;
    }
}
