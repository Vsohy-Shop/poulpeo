package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nPersistentHashMapContentIterators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentIterators.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* compiled from: PersistentHashMapContentIterators.kt */
public class MapEntry<K, V> implements Map.Entry<K, V>, C13212a {
    private final K key;
    private final V value;

    public MapEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !C12775o.m28634d(entry.getKey(), getKey()) || !C12775o.m28634d(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        Object key2 = getKey();
        int i2 = 0;
        if (key2 != null) {
            i = key2.hashCode();
        } else {
            i = 0;
        }
        Object value2 = getValue();
        if (value2 != null) {
            i2 = value2.hashCode();
        }
        return i ^ i2;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
