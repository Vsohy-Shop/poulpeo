package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentOrderedMapContentIterators.kt */
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, C13212a {
    private final Map<K, LinkedValue<V>> hashMap;
    private int index;
    private Object nextKey;

    public PersistentOrderedMapLinksIterator(Object obj, Map<K, LinkedValue<V>> map) {
        C12775o.m28639i(map, "hashMap");
        this.nextKey = obj;
        this.hashMap = map;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Object getNextKey$runtime_release() {
        return this.nextKey;
    }

    public boolean hasNext() {
        if (this.index < this.hashMap.size()) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i) {
        this.index = i;
    }

    public final void setNextKey$runtime_release(Object obj) {
        this.nextKey = obj;
    }

    public LinkedValue<V> next() {
        if (hasNext()) {
            LinkedValue<V> linkedValue = this.hashMap.get(this.nextKey);
            if (linkedValue != null) {
                LinkedValue<V> linkedValue2 = linkedValue;
                this.index++;
                this.nextKey = linkedValue2.getNext();
                return linkedValue2;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        throw new NoSuchElementException();
    }
}
