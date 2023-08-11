package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.f */
/* compiled from: ComparatorOrdering */
final class C6812f<T> extends C6875v<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final Comparator<T> f8926b;

    C6812f(Comparator<T> comparator) {
        this.f8926b = (Comparator) C8012n.m15755n(comparator);
    }

    public int compare(T t, T t2) {
        return this.f8926b.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6812f) {
            return this.f8926b.equals(((C6812f) obj).f8926b);
        }
        return false;
    }

    public int hashCode() {
        return this.f8926b.hashCode();
    }

    public String toString() {
        return this.f8926b.toString();
    }
}
