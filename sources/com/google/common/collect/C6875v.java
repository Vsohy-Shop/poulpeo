package com.google.common.collect;

import java.util.Comparator;
import p111h6.C7999f;

/* renamed from: com.google.common.collect.v */
/* compiled from: Ordering */
public abstract class C6875v<T> implements Comparator<T> {
    protected C6875v() {
    }

    /* renamed from: a */
    public static <T> C6875v<T> m11863a(Comparator<T> comparator) {
        if (comparator instanceof C6875v) {
            return (C6875v) comparator;
        }
        return new C6812f(comparator);
    }

    /* renamed from: b */
    public <F> C6875v<F> mo39684b(C7999f<F, ? extends T> fVar) {
        return new C6806c(fVar, this);
    }

    public abstract int compare(T t, T t2);
}
