package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.g0 */
/* compiled from: LongArrayList */
final class C7084g0 extends C7066c<Long> implements C7196z.C7204h, RandomAccess, C7195y0 {

    /* renamed from: e */
    private static final C7084g0 f9558e;

    /* renamed from: c */
    private long[] f9559c;

    /* renamed from: d */
    private int f9560d;

    static {
        C7084g0 g0Var = new C7084g0(new long[0], 0);
        f9558e = g0Var;
        g0Var.mo40200l();
    }

    C7084g0() {
        this(new long[10], 0);
    }

    /* renamed from: k */
    private void m12983k(int i, long j) {
        int i2;
        mo40196b();
        if (i < 0 || i > (i2 = this.f9560d)) {
            throw new IndexOutOfBoundsException(m12985u(i));
        }
        long[] jArr = this.f9559c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9559c, i, jArr2, i + 1, this.f9560d - i);
            this.f9559c = jArr2;
        }
        this.f9559c[i] = j;
        this.f9560d++;
        this.modCount++;
    }

    /* renamed from: r */
    private void m12984r(int i) {
        if (i < 0 || i >= this.f9560d) {
            throw new IndexOutOfBoundsException(m12985u(i));
        }
    }

    /* renamed from: u */
    private String m12985u(int i) {
        return "Index:" + i + ", Size:" + this.f9560d;
    }

    /* renamed from: A */
    public Long set(int i, Long l) {
        return Long.valueOf(mo40304B(i, l.longValue()));
    }

    /* renamed from: B */
    public long mo40304B(int i, long j) {
        mo40196b();
        m12984r(i);
        long[] jArr = this.f9559c;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo40196b();
        C7196z.m13944a(collection);
        if (!(collection instanceof C7084g0)) {
            return super.addAll(collection);
        }
        C7084g0 g0Var = (C7084g0) collection;
        int i = g0Var.f9560d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9560d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9559c;
            if (i3 > jArr.length) {
                this.f9559c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(g0Var.f9559c, 0, this.f9559c, this.f9560d, g0Var.f9560d);
            this.f9560d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void add(int i, Long l) {
        m12983k(i, l.longValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7084g0)) {
            return super.equals(obj);
        }
        C7084g0 g0Var = (C7084g0) obj;
        if (this.f9560d != g0Var.f9560d) {
            return false;
        }
        long[] jArr = g0Var.f9559c;
        for (int i = 0; i < this.f9560d; i++) {
            if (this.f9559c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9560d; i2++) {
            i = (i * 31) + C7196z.m13949f(this.f9559c[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9559c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Long l) {
        mo40311q(l.longValue());
        return true;
    }

    /* renamed from: q */
    public void mo40311q(long j) {
        mo40196b();
        int i = this.f9560d;
        long[] jArr = this.f9559c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9559c = jArr2;
        }
        long[] jArr3 = this.f9559c;
        int i2 = this.f9560d;
        this.f9560d = i2 + 1;
        jArr3[i2] = j;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo40196b();
        if (i2 >= i) {
            long[] jArr = this.f9559c;
            System.arraycopy(jArr, i2, jArr, i, this.f9560d - i2);
            this.f9560d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Long get(int i) {
        return Long.valueOf(mo40316t(i));
    }

    public int size() {
        return this.f9560d;
    }

    /* renamed from: t */
    public long mo40316t(int i) {
        m12984r(i);
        return this.f9559c[i];
    }

    /* renamed from: v */
    public C7196z.C7204h mo40188n(int i) {
        if (i >= this.f9560d) {
            return new C7084g0(Arrays.copyOf(this.f9559c, i), this.f9560d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public Long remove(int i) {
        mo40196b();
        m12984r(i);
        long[] jArr = this.f9559c;
        long j = jArr[i];
        int i2 = this.f9560d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9560d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    private C7084g0(long[] jArr, int i) {
        this.f9559c = jArr;
        this.f9560d = i;
    }
}
