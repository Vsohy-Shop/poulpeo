package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.v */
/* compiled from: FloatArrayList */
final class C7182v extends C7066c<Float> implements C7196z.C7202f, RandomAccess, C7195y0 {

    /* renamed from: e */
    private static final C7182v f9832e;

    /* renamed from: c */
    private float[] f9833c;

    /* renamed from: d */
    private int f9834d;

    static {
        C7182v vVar = new C7182v(new float[0], 0);
        f9832e = vVar;
        vVar.mo40200l();
    }

    C7182v() {
        this(new float[10], 0);
    }

    /* renamed from: q */
    private void m13850q(int i, float f) {
        int i2;
        mo40196b();
        if (i < 0 || i > (i2 = this.f9834d)) {
            throw new IndexOutOfBoundsException(m13852u(i));
        }
        float[] fArr = this.f9833c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f9833c, i, fArr2, i + 1, this.f9834d - i);
            this.f9833c = fArr2;
        }
        this.f9833c[i] = f;
        this.f9834d++;
        this.modCount++;
    }

    /* renamed from: r */
    private void m13851r(int i) {
        if (i < 0 || i >= this.f9834d) {
            throw new IndexOutOfBoundsException(m13852u(i));
        }
    }

    /* renamed from: u */
    private String m13852u(int i) {
        return "Index:" + i + ", Size:" + this.f9834d;
    }

    /* renamed from: A */
    public Float set(int i, Float f) {
        return Float.valueOf(mo40665B(i, f.floatValue()));
    }

    /* renamed from: B */
    public float mo40665B(int i, float f) {
        mo40196b();
        m13851r(i);
        float[] fArr = this.f9833c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo40196b();
        C7196z.m13944a(collection);
        if (!(collection instanceof C7182v)) {
            return super.addAll(collection);
        }
        C7182v vVar = (C7182v) collection;
        int i = vVar.f9834d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9834d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f9833c;
            if (i3 > fArr.length) {
                this.f9833c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(vVar.f9833c, 0, this.f9833c, this.f9834d, vVar.f9834d);
            this.f9834d = i3;
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
    public void add(int i, Float f) {
        m13850q(i, f.floatValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7182v)) {
            return super.equals(obj);
        }
        C7182v vVar = (C7182v) obj;
        if (this.f9834d != vVar.f9834d) {
            return false;
        }
        float[] fArr = vVar.f9833c;
        for (int i = 0; i < this.f9834d; i++) {
            if (Float.floatToIntBits(this.f9833c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9834d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f9833c[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9833c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Float f) {
        mo40672k(f.floatValue());
        return true;
    }

    /* renamed from: k */
    public void mo40672k(float f) {
        mo40196b();
        int i = this.f9834d;
        float[] fArr = this.f9833c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9833c = fArr2;
        }
        float[] fArr3 = this.f9833c;
        int i2 = this.f9834d;
        this.f9834d = i2 + 1;
        fArr3[i2] = f;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo40196b();
        if (i2 >= i) {
            float[] fArr = this.f9833c;
            System.arraycopy(fArr, i2, fArr, i, this.f9834d - i2);
            this.f9834d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Float get(int i) {
        return Float.valueOf(mo40677t(i));
    }

    public int size() {
        return this.f9834d;
    }

    /* renamed from: t */
    public float mo40677t(int i) {
        m13851r(i);
        return this.f9833c[i];
    }

    /* renamed from: v */
    public C7196z.C7202f mo40188n(int i) {
        if (i >= this.f9834d) {
            return new C7182v(Arrays.copyOf(this.f9833c, i), this.f9834d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public Float remove(int i) {
        mo40196b();
        m13851r(i);
        float[] fArr = this.f9833c;
        float f = fArr[i];
        int i2 = this.f9834d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f9834d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    private C7182v(float[] fArr, int i) {
        this.f9833c = fArr;
        this.f9834d = i;
    }
}
