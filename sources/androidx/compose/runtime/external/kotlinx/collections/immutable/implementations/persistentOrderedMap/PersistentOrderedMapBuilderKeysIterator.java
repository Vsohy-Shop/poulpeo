package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
public final class PersistentOrderedMapBuilderKeysIterator<K, V> implements Iterator<K>, C13212a {
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderKeysIterator(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        C12775o.m28639i(persistentOrderedMapBuilder, "map");
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime_release(), persistentOrderedMapBuilder);
    }

    public boolean hasNext() {
        return this.internal.hasNext();
    }

    public K next() {
        this.internal.next();
        return this.internal.getLastIteratedKey$runtime_release();
    }

    public void remove() {
        this.internal.remove();
    }
}
