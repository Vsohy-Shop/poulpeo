package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.l */
/* compiled from: ImmutableList */
public abstract class C6819l<E> extends C6817k<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final C6811e0<Object> f8928c = new C6820a(C6877x.f9015f, 0);

    /* renamed from: com.google.common.collect.l$a */
    /* compiled from: ImmutableList */
    static class C6820a<E> extends C6802a<E> {

        /* renamed from: d */
        private final C6819l<E> f8929d;

        C6820a(C6819l<E> lVar, int i) {
            super(lVar.size(), i);
            this.f8929d = lVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo39409a(int i) {
            return this.f8929d.get(i);
        }
    }

    /* renamed from: com.google.common.collect.l$b */
    /* compiled from: ImmutableList */
    static class C6821b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final Object[] f8930b;

        C6821b(Object[] objArr) {
            this.f8930b = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return C6819l.m11637v(this.f8930b);
        }
    }

    /* renamed from: com.google.common.collect.l$c */
    /* compiled from: ImmutableList */
    class C6822c extends C6819l<E> {

        /* renamed from: d */
        final transient int f8931d;

        /* renamed from: e */
        final transient int f8932e;

        C6822c(int i, int i2) {
            this.f8931d = i;
            this.f8932e = i2;
        }

        /* renamed from: G */
        public C6819l<E> subList(int i, int i2) {
            C8012n.m15760s(i, i2, this.f8932e);
            C6819l lVar = C6819l.this;
            int i3 = this.f8931d;
            return lVar.subList(i + i3, i2 + i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Object[] mo39464d() {
            return C6819l.this.mo39464d();
        }

        public E get(int i) {
            C8012n.m15753l(i, this.f8932e);
            return C6819l.this.get(i + this.f8931d);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C6819l.super.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo39465j() {
            return C6819l.this.mo39466k() + this.f8931d + this.f8932e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo39466k() {
            return C6819l.this.mo39466k() + this.f8931d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C6819l.super.listIterator();
        }

        public int size() {
            return this.f8932e;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C6819l.super.listIterator(i);
        }
    }

    C6819l() {
    }

    /* renamed from: B */
    public static <E> C6819l<E> m11632B() {
        return C6877x.f9015f;
    }

    /* renamed from: F */
    public static <E> C6819l<E> m11633F(E e) {
        return m11636u(e);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    static <E> C6819l<E> m11634s(Object[] objArr) {
        return m11635t(objArr, objArr.length);
    }

    /* renamed from: t */
    static <E> C6819l<E> m11635t(Object[] objArr, int i) {
        if (i == 0) {
            return m11632B();
        }
        return new C6877x(objArr, i);
    }

    /* renamed from: u */
    private static <E> C6819l<E> m11636u(Object... objArr) {
        return m11634s(C6874u.m11860b(objArr));
    }

    /* renamed from: v */
    public static <E> C6819l<E> m11637v(E[] eArr) {
        if (eArr.length == 0) {
            return m11632B();
        }
        return m11636u((Object[]) eArr.clone());
    }

    /* renamed from: A */
    public C6811e0<E> listIterator(int i) {
        C8012n.m15758q(i, size());
        if (isEmpty()) {
            return f8928c;
        }
        return new C6820a(this, i);
    }

    /* renamed from: G */
    public C6819l<E> subList(int i, int i2) {
        C8012n.m15760s(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m11632B();
        }
        return mo39475H(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C6819l<E> mo39475H(int i, int i2) {
        return new C6822c(i, i2 - i);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39421b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return C6830p.m11682a(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6830p.m11683b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6830p.m11685d(this, obj);
    }

    /* renamed from: r */
    public C6809d0<E> iterator() {
        return listIterator();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C6821b(toArray());
    }

    /* renamed from: z */
    public C6811e0<E> listIterator() {
        return listIterator(0);
    }
}
