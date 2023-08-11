package com.google.common.collect;

import java.util.NoSuchElementException;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.a */
/* compiled from: AbstractIndexedListIterator */
abstract class C6802a<E> extends C6811e0<E> {

    /* renamed from: b */
    private final int f8920b;

    /* renamed from: c */
    private int f8921c;

    protected C6802a(int i, int i2) {
        C8012n.m15758q(i2, i);
        this.f8920b = i;
        this.f8921c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo39409a(int i);

    public final boolean hasNext() {
        if (this.f8921c < this.f8920b) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.f8921c > 0) {
            return true;
        }
        return false;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f8921c;
            this.f8921c = i + 1;
            return mo39409a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f8921c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f8921c - 1;
            this.f8921c = i;
            return mo39409a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f8921c - 1;
    }
}
