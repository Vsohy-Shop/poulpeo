package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import kotlin.collections.C12694i;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashMapContentViews.kt */
public final class PersistentHashMapKeys<K, V> extends C12694i<K> implements ImmutableSet<K> {
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapKeys(PersistentHashMap<K, V> persistentHashMap) {
        C12775o.m28639i(persistentHashMap, "map");
        this.map = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public int getSize() {
        return this.map.size();
    }

    public Iterator<K> iterator() {
        return new PersistentHashMapKeysIterator(this.map.getNode$runtime_release());
    }
}
