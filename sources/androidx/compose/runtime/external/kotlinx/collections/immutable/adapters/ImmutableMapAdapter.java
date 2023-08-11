package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: ReadOnlyCollectionAdapters.kt */
public final class ImmutableMapAdapter<K, V> implements ImmutableMap<K, V>, Map<K, V>, C13212a {
    private final ImmutableSet<Map.Entry<K, V>> entries;
    private final Map<K, V> impl;
    private final ImmutableSet<K> keys;
    private final ImmutableCollection<V> values;

    public ImmutableMapAdapter(Map<K, ? extends V> map) {
        C12775o.m28639i(map, "impl");
        this.impl = map;
        this.keys = new ImmutableSetAdapter(map.keySet());
        this.values = new ImmutableCollectionAdapter(map.values());
        this.entries = new ImmutableSetAdapter(map.entrySet());
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.impl.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.impl.containsValue(obj);
    }

    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        return this.impl.equals(obj);
    }

    public V get(Object obj) {
        return this.impl.get(obj);
    }

    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    public ImmutableSet<K> getKeys() {
        return this.keys;
    }

    public int getSize() {
        return this.impl.size();
    }

    public ImmutableCollection<V> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.impl.hashCode();
    }

    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return this.impl.toString();
    }

    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
