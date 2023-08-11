package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentOrderedMapContentIterators.kt */
public final class PersistentOrderedMapEntriesIterator<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, C13212a {
    private final PersistentOrderedMapLinksIterator<K, V> internal;

    public PersistentOrderedMapEntriesIterator(PersistentOrderedMap<K, V> persistentOrderedMap) {
        C12775o.m28639i(persistentOrderedMap, "map");
        this.internal = new PersistentOrderedMapLinksIterator<>(persistentOrderedMap.getFirstKey$runtime_release(), persistentOrderedMap.getHashMap$runtime_release());
    }

    public boolean hasNext() {
        return this.internal.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Map.Entry<K, V> next() {
        return new MapEntry(this.internal.getNextKey$runtime_release(), this.internal.next().getValue());
    }
}
