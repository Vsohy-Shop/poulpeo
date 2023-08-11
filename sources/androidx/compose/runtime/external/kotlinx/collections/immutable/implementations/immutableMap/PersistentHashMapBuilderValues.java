package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.collections.C12685e;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class PersistentHashMapBuilderValues<K, V> extends C12685e<V> {
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderValues(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C12775o.m28639i(persistentHashMapBuilder, "builder");
        this.builder = persistentHashMapBuilder;
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
        return new PersistentHashMapBuilderValuesIterator(this.builder);
    }
}
