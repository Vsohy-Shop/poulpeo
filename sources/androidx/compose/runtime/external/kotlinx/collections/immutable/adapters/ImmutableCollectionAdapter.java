package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: ReadOnlyCollectionAdapters.kt */
public class ImmutableCollectionAdapter<E> implements ImmutableCollection<E>, Collection<E>, C13212a {
    private final Collection<E> impl;

    public ImmutableCollectionAdapter(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "impl");
        this.impl = collection;
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

    public boolean contains(Object obj) {
        return this.impl.contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return this.impl.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.impl.equals(obj);
    }

    public int getSize() {
        return this.impl.size();
    }

    public int hashCode() {
        return this.impl.hashCode();
    }

    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.impl.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super E> predicate) {
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
        return this.impl.toString();
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }
}
