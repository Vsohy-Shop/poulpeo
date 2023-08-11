package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: ReadOnlyCollectionAdapters.kt */
public final class ImmutableListAdapter<E> implements ImmutableList<E>, List<E>, C13212a {
    private final List<E> impl;

    public ImmutableListAdapter(List<? extends E> list) {
        C12775o.m28639i(list, "impl");
        this.impl = list;
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
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

    public E get(int i) {
        return this.impl.get(i);
    }

    public int getSize() {
        return this.impl.size();
    }

    public int hashCode() {
        return this.impl.hashCode();
    }

    public int indexOf(Object obj) {
        return this.impl.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.impl.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.impl.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.impl.listIterator();
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public String toString() {
        return this.impl.toString();
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<E> listIterator(int i) {
        return this.impl.listIterator(i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ImmutableList<E> subList(int i, int i2) {
        return new ImmutableListAdapter(this.impl.subList(i, i2));
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }
}
