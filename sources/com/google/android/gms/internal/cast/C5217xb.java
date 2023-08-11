package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.xb */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
abstract class C5217xb extends AbstractList implements C5015ld {

    /* renamed from: b */
    private boolean f5591b = true;

    C5217xb() {
    }

    public boolean add(Object obj) {
        mo33047b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo33047b();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33047b() {
        if (!this.f5591b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo33047b();
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

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        mo33047b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo33047b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo33047b();
        return super.retainAll(collection);
    }

    /* renamed from: x */
    public final boolean mo32880x() {
        return this.f5591b;
    }

    public final void zzb() {
        this.f5591b = false;
    }

    public boolean addAll(Collection collection) {
        mo33047b();
        return super.addAll(collection);
    }
}
