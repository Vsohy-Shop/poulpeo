package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.cast.v0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C5172v0 extends AbstractCollection implements Serializable {

    /* renamed from: b */
    private static final Object[] f5560b = new Object[0];

    C5172v0() {
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32793b(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo32794d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo32796j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public abstract C5240z0 mo32723k();

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Object[] mo32797q() {
        return null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f5560b);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] q = mo32797q();
            if (q != null) {
                return Arrays.copyOfRange(q, mo32796j(), mo32794d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo32793b(objArr, 0);
        return objArr;
    }
}
