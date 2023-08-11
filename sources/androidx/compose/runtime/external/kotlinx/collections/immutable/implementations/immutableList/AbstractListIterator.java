package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p412pf.C13212a;

/* compiled from: AbstractListIterator.kt */
public abstract class AbstractListIterator<E> implements ListIterator<E>, C13212a {
    private int index;
    private int size;

    public AbstractListIterator(int i, int i2) {
        this.index = i;
        this.size = i2;
    }

    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime_release() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$runtime_release() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    public boolean hasNext() {
        if (this.index < this.size) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.index > 0) {
            return true;
        }
        return false;
    }

    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int nextIndex() {
        return this.index;
    }

    public int previousIndex() {
        return this.index - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setSize(int i) {
        this.size = i;
    }
}
