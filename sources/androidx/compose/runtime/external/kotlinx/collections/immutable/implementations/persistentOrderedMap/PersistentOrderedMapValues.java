package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import kotlin.collections.C12662a;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentOrderedMapContentViews.kt */
public final class PersistentOrderedMapValues<K, V> extends C12662a<V> implements ImmutableCollection<V> {
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapValues(PersistentOrderedMap<K, V> persistentOrderedMap) {
        C12775o.m28639i(persistentOrderedMap, "map");
        this.map = persistentOrderedMap;
    }

    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    public int getSize() {
        return this.map.size();
    }

    public Iterator<V> iterator() {
        return new PersistentOrderedMapValuesIterator(this.map);
    }
}
