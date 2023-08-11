package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.f */
/* compiled from: BooleanArrayList */
final class C7077f extends C7066c<Boolean> implements C7196z.C7197a, RandomAccess, C7195y0 {

    /* renamed from: e */
    private static final C7077f f9552e;

    /* renamed from: c */
    private boolean[] f9553c;

    /* renamed from: d */
    private int f9554d;

    static {
        C7077f fVar = new C7077f(new boolean[0], 0);
        f9552e = fVar;
        fVar.mo40200l();
    }

    C7077f() {
        this(new boolean[10], 0);
    }

    /* renamed from: k */
    private void m12954k(int i, boolean z) {
        int i2;
        mo40196b();
        if (i < 0 || i > (i2 = this.f9554d)) {
            throw new IndexOutOfBoundsException(m12956u(i));
        }
        boolean[] zArr = this.f9553c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f9553c, i, zArr2, i + 1, this.f9554d - i);
            this.f9553c = zArr2;
        }
        this.f9553c[i] = z;
        this.f9554d++;
        this.modCount++;
    }

    /* renamed from: r */
    private void m12955r(int i) {
        if (i < 0 || i >= this.f9554d) {
            throw new IndexOutOfBoundsException(m12956u(i));
        }
    }

    /* renamed from: u */
    private String m12956u(int i) {
        return "Index:" + i + ", Size:" + this.f9554d;
    }

    /* renamed from: A */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo40284B(i, bool.booleanValue()));
    }

    /* renamed from: B */
    public boolean mo40284B(int i, boolean z) {
        mo40196b();
        m12955r(i);
        boolean[] zArr = this.f9553c;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo40196b();
        C7196z.m13944a(collection);
        if (!(collection instanceof C7077f)) {
            return super.addAll(collection);
        }
        C7077f fVar = (C7077f) collection;
        int i = fVar.f9554d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9554d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9553c;
            if (i3 > zArr.length) {
                this.f9553c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fVar.f9553c, 0, this.f9553c, this.f9554d, fVar.f9554d);
            this.f9554d = i3;
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
    public void add(int i, Boolean bool) {
        m12954k(i, bool.booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7077f)) {
            return super.equals(obj);
        }
        C7077f fVar = (C7077f) obj;
        if (this.f9554d != fVar.f9554d) {
            return false;
        }
        boolean[] zArr = fVar.f9553c;
        for (int i = 0; i < this.f9554d; i++) {
            if (this.f9553c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9554d; i2++) {
            i = (i * 31) + C7196z.m13946c(this.f9553c[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9553c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Boolean bool) {
        mo40291q(bool.booleanValue());
        return true;
    }

    /* renamed from: q */
    public void mo40291q(boolean z) {
        mo40196b();
        int i = this.f9554d;
        boolean[] zArr = this.f9553c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9553c = zArr2;
        }
        boolean[] zArr3 = this.f9553c;
        int i2 = this.f9554d;
        this.f9554d = i2 + 1;
        zArr3[i2] = z;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo40196b();
        if (i2 >= i) {
            boolean[] zArr = this.f9553c;
            System.arraycopy(zArr, i2, zArr, i, this.f9554d - i2);
            this.f9554d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Boolean get(int i) {
        return Boolean.valueOf(mo40296t(i));
    }

    public int size() {
        return this.f9554d;
    }

    /* renamed from: t */
    public boolean mo40296t(int i) {
        m12955r(i);
        return this.f9553c[i];
    }

    /* renamed from: v */
    public C7196z.C7197a mo40188n(int i) {
        if (i >= this.f9554d) {
            return new C7077f(Arrays.copyOf(this.f9553c, i), this.f9554d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public Boolean remove(int i) {
        mo40196b();
        m12955r(i);
        boolean[] zArr = this.f9553c;
        boolean z = zArr[i];
        int i2 = this.f9554d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f9554d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    private C7077f(boolean[] zArr, int i) {
        this.f9553c = zArr;
        this.f9554d = i;
    }
}
