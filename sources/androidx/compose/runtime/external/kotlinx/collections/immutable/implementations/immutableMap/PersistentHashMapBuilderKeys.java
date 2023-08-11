package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class PersistentHashMapBuilderKeys<K, V> extends C12692h<K> {
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderKeys(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C12775o.m28639i(persistentHashMapBuilder, "builder");
        this.builder = persistentHashMapBuilder;
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
        return new PersistentHashMapBuilderKeysIterator(this.builder);
    }

    public boolean remove(Object obj) {
        if (!this.builder.containsKey(obj)) {
            return false;
        }
        this.builder.remove(obj);
        return true;
    }
}
