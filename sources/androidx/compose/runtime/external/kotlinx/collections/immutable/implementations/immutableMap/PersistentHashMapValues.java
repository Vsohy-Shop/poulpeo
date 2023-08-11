package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import kotlin.collections.C12662a;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashMapContentViews.kt */
public final class PersistentHashMapValues<K, V> extends C12662a<V> implements ImmutableCollection<V> {
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapValues(PersistentHashMap<K, V> persistentHashMap) {
        C12775o.m28639i(persistentHashMap, "map");
        this.map = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    public int getSize() {
        return this.map.size();
    }

    public Iterator<V> iterator() {
        return new PersistentHashMapValuesIterator(this.map.getNode$runtime_release());
    }
}
