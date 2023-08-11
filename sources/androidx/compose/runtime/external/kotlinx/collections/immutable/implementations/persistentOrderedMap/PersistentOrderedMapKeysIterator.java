package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentOrderedMapContentIterators.kt */
public final class PersistentOrderedMapKeysIterator<K, V> implements Iterator<K>, C13212a {
    private final PersistentOrderedMapLinksIterator<K, V> internal;

    public PersistentOrderedMapKeysIterator(PersistentOrderedMap<K, V> persistentOrderedMap) {
        C12775o.m28639i(persistentOrderedMap, "map");
        this.internal = new PersistentOrderedMapLinksIterator<>(persistentOrderedMap.getFirstKey$runtime_release(), persistentOrderedMap.getHashMap$runtime_release());
    }

    public boolean hasNext() {
        return this.internal.hasNext();
    }

    public K next() {
        K nextKey$runtime_release = this.internal.getNextKey$runtime_release();
        this.internal.next();
        return nextKey$runtime_release;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
