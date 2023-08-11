package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.h7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
abstract class C5774h7<E> extends AbstractList<E> implements C5691c9<E> {

    /* renamed from: b */
    private boolean f6976b = true;

    C5774h7() {
    }

    public boolean add(E e) {
        mo34072b();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo34072b();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34072b() {
        if (!this.f6976b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo34072b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo34072b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo34072b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo34072b();
        return super.retainAll(collection);
    }

    /* renamed from: x */
    public final boolean mo33774x() {
        return this.f6976b;
    }

    public final void zzb() {
        this.f6976b = false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo34072b();
        return super.addAll(collection);
    }
}
