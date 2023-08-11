package kotlin.collections;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import okhttp3.HttpUrl;
import p412pf.C13212a;

/* renamed from: kotlin.collections.g0 */
/* compiled from: Collections.kt */
public final class C12691g0 implements List, Serializable, RandomAccess, C13212a {

    /* renamed from: b */
    public static final C12691g0 f20366b = new C12691g0();
    private static final long serialVersionUID = -7390468764508069838L;

    private C12691g0() {
    }

    private final Object readResolve() {
        return f20366b;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo50475b(Void voidR) {
        C12775o.m28639i(voidR, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo50475b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C12775o.m28639i(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo50490q((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C12689f0.f20365b;
    }

    /* renamed from: j */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    /* renamed from: k */
    public int mo50486k() {
        return 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo50491r((Void) obj);
    }

    public ListIterator listIterator() {
        return C12689f0.f20365b;
    }

    /* renamed from: q */
    public int mo50490q(Void voidR) {
        C12775o.m28639i(voidR, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return -1;
    }

    /* renamed from: r */
    public int mo50491r(Void voidR) {
        C12775o.m28639i(voidR, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return -1;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo50486k();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C12689f0.f20365b;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }
}
