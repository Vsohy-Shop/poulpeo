package kotlin.collections;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import okhttp3.HttpUrl;
import p412pf.C13212a;

/* renamed from: kotlin.collections.i0 */
/* compiled from: Sets.kt */
public final class C12696i0 implements Set, Serializable, C13212a {

    /* renamed from: b */
    public static final C12696i0 f20368b = new C12696i0();
    private static final long serialVersionUID = 3406603774387020532L;

    private C12696i0() {
    }

    private final Object readResolve() {
        return f20368b;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo50531b(Void voidR) {
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
        return mo50531b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C12775o.m28639i(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C12689f0.f20365b;
    }

    /* renamed from: j */
    public int mo50539j() {
        return 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo50539j();
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }
}
