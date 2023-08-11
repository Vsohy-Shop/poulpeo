package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.n1 */
/* compiled from: UnmodifiableLazyStringList */
public class C7136n1 extends AbstractList<String> implements C7075e0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7075e0 f9657b;

    /* renamed from: com.google.protobuf.n1$a */
    /* compiled from: UnmodifiableLazyStringList */
    class C7137a implements ListIterator<String> {

        /* renamed from: b */
        ListIterator<String> f9658b;

        /* renamed from: c */
        final /* synthetic */ int f9659c;

        C7137a(int i) {
            this.f9659c = i;
            this.f9658b = C7136n1.this.f9657b.listIterator(i);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f9658b.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f9658b.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f9658b.hasNext();
        }

        public boolean hasPrevious() {
            return this.f9658b.hasPrevious();
        }

        public int nextIndex() {
            return this.f9658b.nextIndex();
        }

        public int previousIndex() {
            return this.f9658b.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.n1$b */
    /* compiled from: UnmodifiableLazyStringList */
    class C7138b implements Iterator<String> {

        /* renamed from: b */
        Iterator<String> f9661b;

        C7138b() {
            this.f9661b = C7136n1.this.f9657b.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f9661b.next();
        }

        public boolean hasNext() {
            return this.f9661b.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7136n1(C7075e0 e0Var) {
        this.f9657b = e0Var;
    }

    /* renamed from: C */
    public Object mo40214C(int i) {
        return this.f9657b.mo40214C(i);
    }

    /* renamed from: d */
    public String get(int i) {
        return (String) this.f9657b.get(i);
    }

    public Iterator<String> iterator() {
        return new C7138b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C7137a(i);
    }

    /* renamed from: o */
    public void mo40219o(C7086h hVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public List<?> mo40220p() {
        return this.f9657b.mo40220p();
    }

    public int size() {
        return this.f9657b.size();
    }

    /* renamed from: w */
    public C7075e0 mo40226w() {
        return this;
    }
}
