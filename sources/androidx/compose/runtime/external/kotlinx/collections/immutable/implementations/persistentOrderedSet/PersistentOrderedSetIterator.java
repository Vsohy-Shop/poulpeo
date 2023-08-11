package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentOrderedSetIterator.kt */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, C13212a {
    private int index;
    private final Map<E, Links> map;
    private Object nextElement;

    public PersistentOrderedSetIterator(Object obj, Map<E, Links> map2) {
        C12775o.m28639i(map2, "map");
        this.nextElement = obj;
        this.map = map2;
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Map<E, Links> getMap$runtime_release() {
        return this.map;
    }

    public boolean hasNext() {
        if (this.index < this.map.size()) {
            return true;
        }
        return false;
    }

    public E next() {
        checkHasNext();
        E e = this.nextElement;
        this.index++;
        Links links = this.map.get(e);
        if (links != null) {
            this.nextElement = links.getNext();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i) {
        this.index = i;
    }
}
