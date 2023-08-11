package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5842l7 extends C5774h7<Boolean> implements RandomAccess, C5743fa {

    /* renamed from: e */
    private static final C5842l7 f7048e;

    /* renamed from: c */
    private boolean[] f7049c;

    /* renamed from: d */
    private int f7050d;

    static {
        C5842l7 l7Var = new C5842l7(new boolean[0], 0);
        f7048e = l7Var;
        l7Var.zzb();
    }

    C5842l7() {
        this(new boolean[10], 0);
    }

    /* renamed from: j */
    private final String m9553j(int i) {
        int i2 = this.f7050d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m9554k(int i) {
        if (i < 0 || i >= this.f7050d) {
            throw new IndexOutOfBoundsException(m9553j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo34072b();
        if (i < 0 || i > (i2 = this.f7050d)) {
            throw new IndexOutOfBoundsException(m9553j(i));
        }
        boolean[] zArr = this.f7049c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f7049c, i, zArr2, i + 1, this.f7050d - i);
            this.f7049c = zArr2;
        }
        this.f7049c[i] = booleanValue;
        this.f7050d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo34072b();
        C5708d9.m9018e(collection);
        if (!(collection instanceof C5842l7)) {
            return super.addAll(collection);
        }
        C5842l7 l7Var = (C5842l7) collection;
        int i = l7Var.f7050d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7050d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f7049c;
            if (i3 > zArr.length) {
                this.f7049c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(l7Var.f7049c, 0, this.f7049c, this.f7050d, l7Var.f7050d);
            this.f7050d = i3;
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
    public final void mo34167d(boolean z) {
        mo34072b();
        int i = this.f7050d;
        boolean[] zArr = this.f7049c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f7049c = zArr2;
        }
        boolean[] zArr3 = this.f7049c;
        int i2 = this.f7050d;
        this.f7050d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5842l7)) {
            return super.equals(obj);
        }
        C5842l7 l7Var = (C5842l7) obj;
        if (this.f7050d != l7Var.f7050d) {
            return false;
        }
        boolean[] zArr = l7Var.f7049c;
        for (int i = 0; i < this.f7050d; i++) {
            if (this.f7049c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m9554k(i);
        return Boolean.valueOf(this.f7049c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7050d; i2++) {
            i = (i * 31) + C5708d9.m9014a(this.f7049c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f7050d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7049c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5691c9 mo33773m(int i) {
        if (i >= this.f7050d) {
            return new C5842l7(Arrays.copyOf(this.f7049c, i), this.f7050d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo34072b();
        m9554k(i);
        boolean[] zArr = this.f7049c;
        boolean z = zArr[i];
        int i2 = this.f7050d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f7050d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo34072b();
        if (i2 >= i) {
            boolean[] zArr = this.f7049c;
            System.arraycopy(zArr, i2, zArr, i, this.f7050d - i2);
            this.f7050d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo34072b();
        m9554k(i);
        boolean[] zArr = this.f7049c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f7050d;
    }

    private C5842l7(boolean[] zArr, int i) {
        this.f7049c = zArr;
        this.f7050d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo34167d(((Boolean) obj).booleanValue());
        return true;
    }
}
