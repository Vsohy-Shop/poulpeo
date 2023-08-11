package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import kotlin.collections.C12694i;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentOrderedMapContentViews.kt */
public final class PersistentOrderedMapKeys<K, V> extends C12694i<K> implements ImmutableSet<K> {
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapKeys(PersistentOrderedMap<K, V> persistentOrderedMap) {
        C12775o.m28639i(persistentOrderedMap, "map");
        this.map = persistentOrderedMap;
    }

    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public int getSize() {
        return this.map.size();
    }

    public Iterator<K> iterator() {
        return new PersistentOrderedMapKeysIterator(this.map);
    }
}
