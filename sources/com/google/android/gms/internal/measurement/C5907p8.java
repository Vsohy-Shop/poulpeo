package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.p8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5907p8 extends C5774h7<Float> implements RandomAccess, C5743fa {

    /* renamed from: e */
    private static final C5907p8 f7274e;

    /* renamed from: c */
    private float[] f7275c;

    /* renamed from: d */
    private int f7276d;

    static {
        C5907p8 p8Var = new C5907p8(new float[0], 0);
        f7274e = p8Var;
        p8Var.zzb();
    }

    C5907p8() {
        this(new float[10], 0);
    }

    /* renamed from: j */
    private final String m9752j(int i) {
        int i2 = this.f7276d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m9753k(int i) {
        if (i < 0 || i >= this.f7276d) {
            throw new IndexOutOfBoundsException(m9752j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo34072b();
        if (i < 0 || i > (i2 = this.f7276d)) {
            throw new IndexOutOfBoundsException(m9752j(i));
        }
        float[] fArr = this.f7275c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f7275c, i, fArr2, i + 1, this.f7276d - i);
            this.f7275c = fArr2;
        }
        this.f7275c[i] = floatValue;
        this.f7276d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo34072b();
        C5708d9.m9018e(collection);
        if (!(collection instanceof C5907p8)) {
            return super.addAll(collection);
        }
        C5907p8 p8Var = (C5907p8) collection;
        int i = p8Var.f7276d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7276d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f7275c;
            if (i3 > fArr.length) {
                this.f7275c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(p8Var.f7275c, 0, this.f7275c, this.f7276d, p8Var.f7276d);
            this.f7276d = i3;
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
    public final void mo34269d(float f) {
        mo34072b();
        int i = this.f7276d;
        float[] fArr = this.f7275c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f7275c = fArr2;
        }
        float[] fArr3 = this.f7275c;
        int i2 = this.f7276d;
        this.f7276d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5907p8)) {
            return super.equals(obj);
        }
        C5907p8 p8Var = (C5907p8) obj;
        if (this.f7276d != p8Var.f7276d) {
            return false;
        }
        float[] fArr = p8Var.f7275c;
        for (int i = 0; i < this.f7276d; i++) {
            if (Float.floatToIntBits(this.f7275c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m9753k(i);
        return Float.valueOf(this.f7275c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7276d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f7275c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f7276d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7275c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5691c9 mo33773m(int i) {
        if (i >= this.f7276d) {
            return new C5907p8(Arrays.copyOf(this.f7275c, i), this.f7276d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo34072b();
        m9753k(i);
        float[] fArr = this.f7275c;
        float f = fArr[i];
        int i2 = this.f7276d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f7276d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo34072b();
        if (i2 >= i) {
            float[] fArr = this.f7275c;
            System.arraycopy(fArr, i2, fArr, i, this.f7276d - i2);
            this.f7276d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo34072b();
        m9753k(i);
        float[] fArr = this.f7275c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f7276d;
    }

    private C5907p8(float[] fArr, int i) {
        this.f7275c = fArr;
        this.f7276d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo34269d(((Float) obj).floatValue());
        return true;
    }
}
