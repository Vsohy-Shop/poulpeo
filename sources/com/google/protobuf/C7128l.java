package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.l */
/* compiled from: DoubleArrayList */
final class C7128l extends C7066c<Double> implements C7196z.C7198b, RandomAccess, C7195y0 {

    /* renamed from: e */
    private static final C7128l f9645e;

    /* renamed from: c */
    private double[] f9646c;

    /* renamed from: d */
    private int f9647d;

    static {
        C7128l lVar = new C7128l(new double[0], 0);
        f9645e = lVar;
        lVar.mo40200l();
    }

    C7128l() {
        this(new double[10], 0);
    }

    /* renamed from: q */
    private void m13408q(int i, double d) {
        int i2;
        mo40196b();
        if (i < 0 || i > (i2 = this.f9647d)) {
            throw new IndexOutOfBoundsException(m13410u(i));
        }
        double[] dArr = this.f9646c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9646c, i, dArr2, i + 1, this.f9647d - i);
            this.f9646c = dArr2;
        }
        this.f9646c[i] = d;
        this.f9647d++;
        this.modCount++;
    }

    /* renamed from: r */
    private void m13409r(int i) {
        if (i < 0 || i >= this.f9647d) {
            throw new IndexOutOfBoundsException(m13410u(i));
        }
    }

    /* renamed from: u */
    private String m13410u(int i) {
        return "Index:" + i + ", Size:" + this.f9647d;
    }

    /* renamed from: A */
    public Double set(int i, Double d) {
        return Double.valueOf(mo40528B(i, d.doubleValue()));
    }

    /* renamed from: B */
    public double mo40528B(int i, double d) {
        mo40196b();
        m13409r(i);
        double[] dArr = this.f9646c;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo40196b();
        C7196z.m13944a(collection);
        if (!(collection instanceof C7128l)) {
            return super.addAll(collection);
        }
        C7128l lVar = (C7128l) collection;
        int i = lVar.f9647d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9647d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f9646c;
            if (i3 > dArr.length) {
                this.f9646c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(lVar.f9646c, 0, this.f9646c, this.f9647d, lVar.f9647d);
            this.f9647d = i3;
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
    public void add(int i, Double d) {
        m13408q(i, d.doubleValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7128l)) {
            return super.equals(obj);
        }
        C7128l lVar = (C7128l) obj;
        if (this.f9647d != lVar.f9647d) {
            return false;
        }
        double[] dArr = lVar.f9646c;
        for (int i = 0; i < this.f9647d; i++) {
            if (Double.doubleToLongBits(this.f9646c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9647d; i2++) {
            i = (i * 31) + C7196z.m13949f(Double.doubleToLongBits(this.f9646c[i2]));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9646c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Double d) {
        mo40535k(d.doubleValue());
        return true;
    }

    /* renamed from: k */
    public void mo40535k(double d) {
        mo40196b();
        int i = this.f9647d;
        double[] dArr = this.f9646c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9646c = dArr2;
        }
        double[] dArr3 = this.f9646c;
        int i2 = this.f9647d;
        this.f9647d = i2 + 1;
        dArr3[i2] = d;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo40196b();
        if (i2 >= i) {
            double[] dArr = this.f9646c;
            System.arraycopy(dArr, i2, dArr, i, this.f9647d - i2);
            this.f9647d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Double get(int i) {
        return Double.valueOf(mo40540t(i));
    }

    public int size() {
        return this.f9647d;
    }

    /* renamed from: t */
    public double mo40540t(int i) {
        m13409r(i);
        return this.f9646c[i];
    }

    /* renamed from: v */
    public C7196z.C7198b mo40188n(int i) {
        if (i >= this.f9647d) {
            return new C7128l(Arrays.copyOf(this.f9646c, i), this.f9647d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public Double remove(int i) {
        mo40196b();
        m13409r(i);
        double[] dArr = this.f9646c;
        double d = dArr[i];
        int i2 = this.f9647d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9647d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    private C7128l(double[] dArr, int i) {
        this.f9646c = dArr;
        this.f9647d = i;
    }
}
