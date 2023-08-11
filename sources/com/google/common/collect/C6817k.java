package com.google.common.collect;

import com.google.common.collect.C6819l;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.k */
/* compiled from: ImmutableCollection */
public abstract class C6817k<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    private static final Object[] f8927b = new Object[0];

    /* renamed from: com.google.common.collect.k$a */
    /* compiled from: ImmutableCollection */
    public static abstract class C6818a<E> {
        /* renamed from: a */
        static int m11631a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    C6817k() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39421b(Object[] objArr, int i) {
        C6809d0 r = iterator();
        while (r.hasNext()) {
            objArr[i] = r.next();
            i++;
        }
        return i;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo39464d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo39465j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo39466k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo39425q();

    /* renamed from: r */
    public abstract C6809d0<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f8927b);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C6819l.C6821b(toArray());
    }

    public final <T> T[] toArray(T[] tArr) {
        C8012n.m15755n(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d = mo39464d();
            if (d != null) {
                return C6876w.m11865a(d, mo39466k(), mo39465j(), tArr);
            }
            tArr = C6874u.m11862d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo39421b(tArr, 0);
        return tArr;
    }
}
