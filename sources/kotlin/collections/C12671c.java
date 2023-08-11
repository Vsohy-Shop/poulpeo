package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p412pf.C13212a;

/* renamed from: kotlin.collections.c */
/* compiled from: AbstractList.kt */
public abstract class C12671c<E> extends C12662a<E> implements List<E> {
    public static final C12672a Companion = new C12672a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.collections.c$a */
    /* compiled from: AbstractList.kt */
    public static final class C12672a {
        private C12672a() {
        }

        public /* synthetic */ C12672a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo50422a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo50423b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo50424c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: d */
        public final void mo50425d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: e */
        public final boolean mo50426e(Collection<?> collection, Collection<?> collection2) {
            C12775o.m28639i(collection, "c");
            C12775o.m28639i(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object d : collection) {
                if (!C12775o.m28634d(d, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int mo50427f(Collection<?> collection) {
            int i;
            C12775o.m28639i(collection, "c");
            int i2 = 1;
            for (Object next : collection) {
                int i3 = i2 * 31;
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }
    }

    /* renamed from: kotlin.collections.c$b */
    /* compiled from: AbstractList.kt */
    private class C12673b implements Iterator<E>, C13212a {

        /* renamed from: b */
        private int f20353b;

        public C12673b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo50428a() {
            return this.f20353b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo50429c(int i) {
            this.f20353b = i;
        }

        public boolean hasNext() {
            if (this.f20353b < C12671c.this.size()) {
                return true;
            }
            return false;
        }

        public E next() {
            if (hasNext()) {
                C12671c<E> cVar = C12671c.this;
                int i = this.f20353b;
                this.f20353b = i + 1;
                return cVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$c */
    /* compiled from: AbstractList.kt */
    private class C12674c extends C12671c<E>.b implements ListIterator<E> {
        public C12674c(int i) {
            super();
            C12671c.Companion.mo50424c(i, C12671c.this.size());
            mo50429c(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            if (mo50428a() > 0) {
                return true;
            }
            return false;
        }

        public int nextIndex() {
            return mo50428a();
        }

        public E previous() {
            if (hasPrevious()) {
                C12671c<E> cVar = C12671c.this;
                mo50429c(mo50428a() - 1);
                return cVar.get(mo50428a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo50428a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$d */
    /* compiled from: AbstractList.kt */
    private static final class C12675d<E> extends C12671c<E> implements RandomAccess {

        /* renamed from: b */
        private final C12671c<E> f20356b;

        /* renamed from: c */
        private final int f20357c;

        /* renamed from: d */
        private int f20358d;

        public C12675d(C12671c<? extends E> cVar, int i, int i2) {
            C12775o.m28639i(cVar, "list");
            this.f20356b = cVar;
            this.f20357c = i;
            C12671c.Companion.mo50425d(i, i2, cVar.size());
            this.f20358d = i2 - i;
        }

        public E get(int i) {
            C12671c.Companion.mo50423b(i, this.f20358d);
            return this.f20356b.get(this.f20357c + i);
        }

        public int getSize() {
            return this.f20358d;
        }
    }

    protected C12671c() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return Companion.mo50426e(this, (Collection) obj);
    }

    public abstract E get(int i);

    public abstract int getSize();

    public int hashCode() {
        return Companion.mo50427f(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object d : this) {
            if (C12775o.m28634d(d, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C12673b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C12775o.m28634d(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C12674c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C12675d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C12674c(i);
    }
}
