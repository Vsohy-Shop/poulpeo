package kotlin.collections;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p412pf.C13212a;

/* renamed from: kotlin.collections.a */
/* compiled from: AbstractCollection.kt */
public abstract class C12662a<E> implements Collection<E>, C13212a {

    /* renamed from: kotlin.collections.a$a */
    /* compiled from: AbstractCollection.kt */
    static final class C12663a extends C12777p implements Function1<E, CharSequence> {

        /* renamed from: g */
        final /* synthetic */ C12662a<E> f20334g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12663a(C12662a<? extends E> aVar) {
            super(1);
            this.f20334g = aVar;
        }

        /* renamed from: b */
        public final CharSequence invoke(E e) {
            if (e == this.f20334g) {
                return "(this Collection)";
            }
            return String.valueOf(e);
        }
    }

    protected C12662a() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object d : this) {
            if (C12775o.m28634d(d, e)) {
                return true;
            }
        }
        return false;
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

    public abstract int getSize();

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract Iterator<E> iterator();

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
        return getSize();
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public String toString() {
        return C12686e0.m28229h0(this, ", ", "[", "]", 0, (CharSequence) null, new C12663a(this), 24, (Object) null);
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        T[] b = C12761g.m28584b(this, tArr);
        C12775o.m28637g(b, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return b;
    }
}
