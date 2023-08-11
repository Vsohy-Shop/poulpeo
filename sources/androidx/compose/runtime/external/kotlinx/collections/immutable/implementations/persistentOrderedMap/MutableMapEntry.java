package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p412pf.C13216e;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements C13216e.C13217a {
    private LinkedValue<V> links;
    private final Map<K, LinkedValue<V>> mutableMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableMapEntry(Map<K, LinkedValue<V>> map, K k, LinkedValue<V> linkedValue) {
        super(k, linkedValue.getValue());
        C12775o.m28639i(map, "mutableMap");
        C12775o.m28639i(linkedValue, "links");
        this.mutableMap = map;
        this.links = linkedValue;
    }

    public V getValue() {
        return this.links.getValue();
    }

    public V setValue(V v) {
        V value = this.links.getValue();
        this.links = this.links.withValue(v);
        this.mutableMap.put(getKey(), this.links);
        return value;
    }
}
