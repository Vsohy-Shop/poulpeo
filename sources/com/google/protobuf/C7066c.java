package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
/* compiled from: AbstractProtobufList */
abstract class C7066c<E> extends AbstractList<E> implements C7196z.C7205i<E> {

    /* renamed from: b */
    private boolean f9528b = true;

    C7066c() {
    }

    /* renamed from: D */
    public boolean mo40193D() {
        return this.f9528b;
    }

    public boolean add(E e) {
        mo40196b();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo40196b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40196b() {
        if (!this.f9528b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo40196b();
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

    /* renamed from: l */
    public final void mo40200l() {
        this.f9528b = false;
    }

    public abstract E remove(int i);

    public boolean remove(Object obj) {
        mo40196b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        mo40196b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo40196b();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo40196b();
        return super.addAll(i, collection);
    }
}
