package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.f8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5741f8 extends C5774h7<Double> implements RandomAccess, C5743fa {

    /* renamed from: e */
    private static final C5741f8 f6940e;

    /* renamed from: c */
    private double[] f6941c;

    /* renamed from: d */
    private int f6942d;

    static {
        C5741f8 f8Var = new C5741f8(new double[0], 0);
        f6940e = f8Var;
        f8Var.zzb();
    }

    C5741f8() {
        this(new double[10], 0);
    }

    /* renamed from: j */
    private final String m9230j(int i) {
        int i2 = this.f6942d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m9231k(int i) {
        if (i < 0 || i >= this.f6942d) {
            throw new IndexOutOfBoundsException(m9230j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo34072b();
        if (i < 0 || i > (i2 = this.f6942d)) {
            throw new IndexOutOfBoundsException(m9230j(i));
        }
        double[] dArr = this.f6941c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f6941c, i, dArr2, i + 1, this.f6942d - i);
            this.f6941c = dArr2;
        }
        this.f6941c[i] = doubleValue;
        this.f6942d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo34072b();
        C5708d9.m9018e(collection);
        if (!(collection instanceof C5741f8)) {
            return super.addAll(collection);
        }
        C5741f8 f8Var = (C5741f8) collection;
        int i = f8Var.f6942d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6942d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f6941c;
            if (i3 > dArr.length) {
                this.f6941c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(f8Var.f6941c, 0, this.f6941c, this.f6942d, f8Var.f6942d);
            this.f6942d = i3;
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
    public final void mo34005d(double d) {
        mo34072b();
        int i = this.f6942d;
        double[] dArr = this.f6941c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f6941c = dArr2;
        }
        double[] dArr3 = this.f6941c;
        int i2 = this.f6942d;
        this.f6942d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5741f8)) {
            return super.equals(obj);
        }
        C5741f8 f8Var = (C5741f8) obj;
        if (this.f6942d != f8Var.f6942d) {
            return false;
        }
        double[] dArr = f8Var.f6941c;
        for (int i = 0; i < this.f6942d; i++) {
            if (Double.doubleToLongBits(this.f6941c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m9231k(i);
        return Double.valueOf(this.f6941c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6942d; i2++) {
            i = (i * 31) + C5708d9.m9016c(Double.doubleToLongBits(this.f6941c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f6942d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6941c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5691c9 mo33773m(int i) {
        if (i >= this.f6942d) {
            return new C5741f8(Arrays.copyOf(this.f6941c, i), this.f6942d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo34072b();
        m9231k(i);
        double[] dArr = this.f6941c;
        double d = dArr[i];
        int i2 = this.f6942d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f6942d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo34072b();
        if (i2 >= i) {
            double[] dArr = this.f6941c;
            System.arraycopy(dArr, i2, dArr, i, this.f6942d - i2);
            this.f6942d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo34072b();
        m9231k(i);
        double[] dArr = this.f6941c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f6942d;
    }

    private C5741f8(double[] dArr, int i) {
        this.f6941c = dArr;
        this.f6942d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo34005d(((Double) obj).doubleValue());
        return true;
    }
}
