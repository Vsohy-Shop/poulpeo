package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.collections.C12685e;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
public final class PersistentOrderedMapBuilderValues<K, V> extends C12685e<V> {
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderValues(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        C12775o.m28639i(persistentOrderedMapBuilder, "builder");
        this.builder = persistentOrderedMapBuilder;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.builder.clear();
    }

    public boolean contains(Object obj) {
        return this.builder.containsValue(obj);
    }

    public int getSize() {
        return this.builder.size();
    }

    public Iterator<V> iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.builder);
    }
}
