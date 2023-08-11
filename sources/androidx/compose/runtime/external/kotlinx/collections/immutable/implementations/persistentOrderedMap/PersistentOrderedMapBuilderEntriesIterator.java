package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, C13212a {
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        C12775o.m28639i(persistentOrderedMapBuilder, "map");
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime_release(), persistentOrderedMapBuilder);
    }

    public boolean hasNext() {
        return this.internal.hasNext();
    }

    public void remove() {
        this.internal.remove();
    }

    public Map.Entry<K, V> next() {
        return new MutableMapEntry(this.internal.getBuilder$runtime_release().getHashMapBuilder$runtime_release(), this.internal.getLastIteratedKey$runtime_release(), this.internal.next());
    }
}
