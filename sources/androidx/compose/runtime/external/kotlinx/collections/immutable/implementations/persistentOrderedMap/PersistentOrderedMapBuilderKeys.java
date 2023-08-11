package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
public final class PersistentOrderedMapBuilderKeys<K, V> extends C12692h<K> {
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderKeys(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        C12775o.m28639i(persistentOrderedMapBuilder, "builder");
        this.builder = persistentOrderedMapBuilder;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.builder.clear();
    }

    public boolean contains(Object obj) {
        return this.builder.containsKey(obj);
    }

    public int getSize() {
        return this.builder.size();
    }

    public Iterator<K> iterator() {
        return new PersistentOrderedMapBuilderKeysIterator(this.builder);
    }

    public boolean remove(Object obj) {
        if (!this.builder.containsKey(obj)) {
            return false;
        }
        this.builder.remove(obj);
        return true;
    }
}
