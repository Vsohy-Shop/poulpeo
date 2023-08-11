package com.google.common.collect;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.n */
/* compiled from: ImmutableSet */
public abstract class C6826n<E> extends C6817k<E> implements Set<E> {
    @RetainedWith

    /* renamed from: c */
    private transient C6819l<E> f8944c;

    /* renamed from: com.google.common.collect.n$a */
    /* compiled from: ImmutableSet */
    private static class C6827a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final Object[] f8945b;

        C6827a(Object[] objArr) {
            this.f8945b = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return C6826n.m11674z(this.f8945b);
        }
    }

    C6826n() {
    }

    /* renamed from: F */
    public static <E> C6826n<E> m11667F() {
        return C6883z.f9032i;
    }

    /* renamed from: G */
    public static <E> C6826n<E> m11668G(E e) {
        return new C6805b0(e);
    }

    /* renamed from: H */
    public static <E> C6826n<E> m11669H(E e, E e2, E e3) {
        return m11672u(3, e, e2, e3);
    }

    /* renamed from: I */
    private static boolean m11670I(int i, int i2) {
        if (i < (i2 >> 1) + (i2 >> 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    static int m11671t(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C8012n.m15746e(z, "collection too large");
        return BasicMeasure.EXACTLY;
    }

    /* renamed from: u */
    private static <E> C6826n<E> m11672u(int i, Object... objArr) {
        if (i == 0) {
            return m11667F();
        }
        if (i == 1) {
            return m11668G(objArr[0]);
        }
        int t = m11671t(i);
        Object[] objArr2 = new Object[t];
        int i2 = t - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a = C6874u.m11859a(objArr[i5], i5);
            int hashCode = a.hashCode();
            int a2 = C6816j.m11623a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    objArr[i4] = a;
                    objArr2[i6] = a;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj.equals(a)) {
                    break;
                } else {
                    a2++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new C6805b0(objArr[0], i3);
        }
        if (m11671t(i4) < t / 2) {
            return m11672u(i4, objArr);
        }
        if (m11670I(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C6883z(objArr, i3, objArr2, i2, i4);
    }

    /* renamed from: v */
    public static <E> C6826n<E> m11673v(Collection<? extends E> collection) {
        if ((collection instanceof C6826n) && !(collection instanceof SortedSet)) {
            C6826n<E> nVar = (C6826n) collection;
            if (!nVar.mo39425q()) {
                return nVar;
            }
        }
        Object[] array = collection.toArray();
        return m11672u(array.length, array);
    }

    /* renamed from: z */
    public static <E> C6826n<E> m11674z(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m11667F();
        }
        if (length != 1) {
            return m11672u(eArr.length, (Object[]) eArr.clone());
        }
        return m11668G(eArr[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C6819l<E> mo39419A() {
        return C6819l.m11634s(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo39420B() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6826n) || !mo39420B() || !((C6826n) obj).mo39420B() || hashCode() == obj.hashCode()) {
            return C6803a0.m11609a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C6803a0.m11610b(this);
    }

    /* renamed from: r */
    public abstract C6809d0<E> iterator();

    /* renamed from: s */
    public C6819l<E> mo39523s() {
        C6819l<E> lVar = this.f8944c;
        if (lVar != null) {
            return lVar;
        }
        C6819l<E> A = mo39419A();
        this.f8944c = A;
        return A;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C6827a(toArray());
    }
}
