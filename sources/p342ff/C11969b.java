package p342ff;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.C12671c;
import kotlin.collections.C12688f;
import kotlin.collections.C12699k;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: ff.b */
/* compiled from: ListBuilder.kt */
public final class C11969b<E> extends C12688f<E> implements RandomAccess, Serializable {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public E[] f18677b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f18678c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f18679d;

    /* renamed from: e */
    private boolean f18680e;

    /* renamed from: f */
    private final C11969b<E> f18681f;

    /* renamed from: g */
    private final C11969b<E> f18682g;

    /* renamed from: ff.b$a */
    /* compiled from: ListBuilder.kt */
    private static final class C11970a<E> implements ListIterator<E>, C13212a {

        /* renamed from: b */
        private final C11969b<E> f18683b;

        /* renamed from: c */
        private int f18684c;

        /* renamed from: d */
        private int f18685d = -1;

        public C11970a(C11969b<E> bVar, int i) {
            C12775o.m28639i(bVar, "list");
            this.f18683b = bVar;
            this.f18684c = i;
        }

        public void add(E e) {
            C11969b<E> bVar = this.f18683b;
            int i = this.f18684c;
            this.f18684c = i + 1;
            bVar.add(i, e);
            this.f18685d = -1;
        }

        public boolean hasNext() {
            if (this.f18684c < this.f18683b.f18679d) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f18684c > 0) {
                return true;
            }
            return false;
        }

        public E next() {
            if (this.f18684c < this.f18683b.f18679d) {
                int i = this.f18684c;
                this.f18684c = i + 1;
                this.f18685d = i;
                return this.f18683b.f18677b[this.f18683b.f18678c + this.f18685d];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f18684c;
        }

        public E previous() {
            int i = this.f18684c;
            if (i > 0) {
                int i2 = i - 1;
                this.f18684c = i2;
                this.f18685d = i2;
                return this.f18683b.f18677b[this.f18683b.f18678c + this.f18685d];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f18684c - 1;
        }

        public void remove() {
            boolean z;
            int i = this.f18685d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f18683b.remove(i);
                this.f18684c = this.f18685d;
                this.f18685d = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e) {
            boolean z;
            int i = this.f18685d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f18683b.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private C11969b(E[] eArr, int i, int i2, boolean z, C11969b<E> bVar, C11969b<E> bVar2) {
        this.f18677b = eArr;
        this.f18678c = i;
        this.f18679d = i2;
        this.f18680e = z;
        this.f18681f = bVar;
        this.f18682g = bVar2;
    }

    /* renamed from: A */
    private final void m25937A(int i, int i2) {
        m25950z(i2);
        E[] eArr = this.f18677b;
        Object[] unused = C12708o.m28342i(eArr, eArr, i + i2, i, this.f18678c + this.f18679d);
        this.f18679d += i2;
    }

    /* renamed from: B */
    private final boolean m25938B() {
        C11969b<E> bVar;
        if (this.f18680e || ((bVar = this.f18682g) != null && bVar.f18680e)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private final E m25939F(int i) {
        C11969b<E> bVar = this.f18681f;
        if (bVar != null) {
            this.f18679d--;
            return bVar.m25939F(i);
        }
        E[] eArr = this.f18677b;
        E e = eArr[i];
        Object[] unused = C12708o.m28342i(eArr, eArr, i, i + 1, this.f18678c + this.f18679d);
        C11971c.m25957f(this.f18677b, (this.f18678c + this.f18679d) - 1);
        this.f18679d--;
        return e;
    }

    /* renamed from: G */
    private final void m25940G(int i, int i2) {
        C11969b<E> bVar = this.f18681f;
        if (bVar != null) {
            bVar.m25940G(i, i2);
        } else {
            E[] eArr = this.f18677b;
            Object[] unused = C12708o.m28342i(eArr, eArr, i, i + i2, this.f18679d);
            E[] eArr2 = this.f18677b;
            int i3 = this.f18679d;
            C11971c.m25958g(eArr2, i3 - i2, i3);
        }
        this.f18679d -= i2;
    }

    /* renamed from: H */
    private final int m25941H(int i, int i2, Collection<? extends E> collection, boolean z) {
        C11969b<E> bVar = this.f18681f;
        if (bVar != null) {
            int H = bVar.m25941H(i, i2, collection, z);
            this.f18679d -= H;
            return H;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f18677b[i5]) == z) {
                E[] eArr = this.f18677b;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f18677b;
        Object[] unused = C12708o.m28342i(eArr2, eArr2, i + i4, i2 + i, this.f18679d);
        E[] eArr3 = this.f18677b;
        int i7 = this.f18679d;
        C11971c.m25958g(eArr3, i7 - i6, i7);
        this.f18679d -= i6;
        return i6;
    }

    /* renamed from: q */
    private final void m25945q(int i, Collection<? extends E> collection, int i2) {
        C11969b<E> bVar = this.f18681f;
        if (bVar != null) {
            bVar.m25945q(i, collection, i2);
            this.f18677b = this.f18681f.f18677b;
            this.f18679d += i2;
            return;
        }
        m25937A(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f18677b[i + i3] = it.next();
        }
    }

    /* renamed from: r */
    private final void m25946r(int i, E e) {
        C11969b<E> bVar = this.f18681f;
        if (bVar != null) {
            bVar.m25946r(i, e);
            this.f18677b = this.f18681f.f18677b;
            this.f18679d++;
            return;
        }
        m25937A(i, 1);
        this.f18677b[i] = e;
    }

    /* renamed from: t */
    private final void m25947t() {
        if (m25938B()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u */
    private final boolean m25948u(List<?> list) {
        return C11971c.m25959h(this.f18677b, this.f18678c, this.f18679d, list);
    }

    /* renamed from: v */
    private final void m25949v(int i) {
        if (this.f18681f != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            E[] eArr = this.f18677b;
            if (i > eArr.length) {
                this.f18677b = C11971c.m25956e(this.f18677b, C12699k.f20373e.mo50588a(eArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    private final Object writeReplace() {
        if (m25938B()) {
            return new C11982h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: z */
    private final void m25950z(int i) {
        m25949v(this.f18679d + i);
    }

    public boolean add(E e) {
        m25947t();
        m25946r(this.f18678c + this.f18679d, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        m25947t();
        int size = collection.size();
        m25945q(this.f18678c + this.f18679d, collection, size);
        return size > 0;
    }

    public void clear() {
        m25947t();
        m25940G(this.f18678c, this.f18679d);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof List) && m25948u((List) obj))) {
            return true;
        }
        return false;
    }

    public E get(int i) {
        C12671c.Companion.mo50423b(i, this.f18679d);
        return this.f18677b[this.f18678c + i];
    }

    public int getSize() {
        return this.f18679d;
    }

    public int hashCode() {
        return C11971c.m25960i(this.f18677b, this.f18678c, this.f18679d);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.f18679d; i++) {
            if (C12775o.m28634d(this.f18677b[this.f18678c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.f18679d == 0) {
            return true;
        }
        return false;
    }

    public Iterator<E> iterator() {
        return new C11970a(this, 0);
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.f18679d - 1; i >= 0; i--) {
            if (C12775o.m28634d(this.f18677b[this.f18678c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C11970a(this, 0);
    }

    public boolean remove(Object obj) {
        m25947t();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        m25947t();
        if (m25941H(this.f18678c, this.f18679d, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public E removeAt(int i) {
        m25947t();
        C12671c.Companion.mo50423b(i, this.f18679d);
        return m25939F(this.f18678c + i);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        m25947t();
        if (m25941H(this.f18678c, this.f18679d, collection, true) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final List<E> mo49301s() {
        if (this.f18681f == null) {
            m25947t();
            this.f18680e = true;
            return this;
        }
        throw new IllegalStateException();
    }

    public E set(int i, E e) {
        m25947t();
        C12671c.Companion.mo50423b(i, this.f18679d);
        E[] eArr = this.f18677b;
        int i2 = this.f18678c;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    public List<E> subList(int i, int i2) {
        C11969b<E> bVar;
        C12671c.Companion.mo50425d(i, i2, this.f18679d);
        E[] eArr = this.f18677b;
        int i3 = this.f18678c + i;
        int i4 = i2 - i;
        boolean z = this.f18680e;
        C11969b<E> bVar2 = this.f18682g;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new C11969b(eArr, i3, i4, z, this, bVar);
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, "destination");
        int length = tArr.length;
        int i = this.f18679d;
        if (length < i) {
            E[] eArr = this.f18677b;
            int i2 = this.f18678c;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C12775o.m28638h(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.f18677b;
        C12775o.m28637g(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.f18678c;
        Object[] unused = C12708o.m28342i(eArr2, tArr, 0, i3, this.f18679d + i3);
        int length2 = tArr.length;
        int i4 = this.f18679d;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public String toString() {
        return C11971c.m25961j(this.f18677b, this.f18678c, this.f18679d);
    }

    public ListIterator<E> listIterator(int i) {
        C12671c.Companion.mo50424c(i, this.f18679d);
        return new C11970a(this, i);
    }

    public void add(int i, E e) {
        m25947t();
        C12671c.Companion.mo50424c(i, this.f18679d);
        m25946r(this.f18678c + i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        m25947t();
        C12671c.Companion.mo50424c(i, this.f18679d);
        int size = collection.size();
        m25945q(this.f18678c + i, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        E[] eArr = this.f18677b;
        int i = this.f18678c;
        Object[] p = C12708o.m28349p(eArr, i, this.f18679d + i);
        C12775o.m28637g(p, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return p;
    }

    public C11969b() {
        this(10);
    }

    public C11969b(int i) {
        this(C11971c.m25955d(i), 0, 0, false, (C11969b) null, (C11969b) null);
    }
}
