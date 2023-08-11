package kotlin.collections;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C12751c;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: kotlin.collections.j */
/* compiled from: Collections.kt */
final class C12697j<T> implements Collection<T>, C13212a {

    /* renamed from: b */
    private final T[] f20369b;

    /* renamed from: c */
    private final boolean f20370c;

    public C12697j(T[] tArr, boolean z) {
        C12775o.m28639i(tArr, "values");
        this.f20369b = tArr;
        this.f20370c = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo50549b() {
        return this.f20369b.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C12710p.m28377E(this.f20369b, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        if (this.f20369b.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return C12751c.m28576a(this.f20369b);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo50549b();
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    public final Object[] toArray() {
        return C12723v.m28507b(this.f20369b, this.f20370c);
    }
}
