package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y */
/* compiled from: IntArrayList */
final class C7194y extends C7066c<Integer> implements C7196z.C7203g, RandomAccess, C7195y0 {

    /* renamed from: e */
    private static final C7194y f9857e;

    /* renamed from: c */
    private int[] f9858c;

    /* renamed from: d */
    private int f9859d;

    static {
        C7194y yVar = new C7194y(new int[0], 0);
        f9857e = yVar;
        yVar.mo40200l();
    }

    C7194y() {
        this(new int[10], 0);
    }

    /* renamed from: q */
    private void m13931q(int i, int i2) {
        int i3;
        mo40196b();
        if (i < 0 || i > (i3 = this.f9859d)) {
            throw new IndexOutOfBoundsException(m13933u(i));
        }
        int[] iArr = this.f9858c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f9858c, i, iArr2, i + 1, this.f9859d - i);
            this.f9858c = iArr2;
        }
        this.f9858c[i] = i2;
        this.f9859d++;
        this.modCount++;
    }

    /* renamed from: r */
    private void m13932r(int i) {
        if (i < 0 || i >= this.f9859d) {
            throw new IndexOutOfBoundsException(m13933u(i));
        }
    }

    /* renamed from: u */
    private String m13933u(int i) {
        return "Index:" + i + ", Size:" + this.f9859d;
    }

    /* renamed from: A */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo40712B(i, num.intValue()));
    }

    /* renamed from: B */
    public int mo40712B(int i, int i2) {
        mo40196b();
        m13932r(i);
        int[] iArr = this.f9858c;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo40196b();
        C7196z.m13944a(collection);
        if (!(collection instanceof C7194y)) {
            return super.addAll(collection);
        }
        C7194y yVar = (C7194y) collection;
        int i = yVar.f9859d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9859d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f9858c;
            if (i3 > iArr.length) {
                this.f9858c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(yVar.f9858c, 0, this.f9858c, this.f9859d, yVar.f9859d);
            this.f9859d = i3;
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
    public void add(int i, Integer num) {
        m13931q(i, num.intValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7194y)) {
            return super.equals(obj);
        }
        C7194y yVar = (C7194y) obj;
        if (this.f9859d != yVar.f9859d) {
            return false;
        }
        int[] iArr = yVar.f9858c;
        for (int i = 0; i < this.f9859d; i++) {
            if (this.f9858c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9859d; i2++) {
            i = (i * 31) + this.f9858c[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9858c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Integer num) {
        mo40719k(num.intValue());
        return true;
    }

    /* renamed from: k */
    public void mo40719k(int i) {
        mo40196b();
        int i2 = this.f9859d;
        int[] iArr = this.f9858c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f9858c = iArr2;
        }
        int[] iArr3 = this.f9858c;
        int i3 = this.f9859d;
        this.f9859d = i3 + 1;
        iArr3[i3] = i;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo40196b();
        if (i2 >= i) {
            int[] iArr = this.f9858c;
            System.arraycopy(iArr, i2, iArr, i, this.f9859d - i2);
            this.f9859d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer get(int i) {
        return Integer.valueOf(mo40724t(i));
    }

    public int size() {
        return this.f9859d;
    }

    /* renamed from: t */
    public int mo40724t(int i) {
        m13932r(i);
        return this.f9858c[i];
    }

    /* renamed from: v */
    public C7196z.C7203g mo40188n(int i) {
        if (i >= this.f9859d) {
            return new C7194y(Arrays.copyOf(this.f9858c, i), this.f9859d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public Integer remove(int i) {
        mo40196b();
        m13932r(i);
        int[] iArr = this.f9858c;
        int i2 = iArr[i];
        int i3 = this.f9859d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f9859d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    private C7194y(int[] iArr, int i) {
        this.f9858c = iArr;
        this.f9859d = i;
    }
}
