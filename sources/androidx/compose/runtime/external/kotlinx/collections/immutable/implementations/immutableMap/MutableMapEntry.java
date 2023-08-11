package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.jvm.internal.C12775o;
import p412pf.C13216e;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements C13216e.C13217a {
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
    private V value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator, K k, V v) {
        super(k, v);
        C12775o.m28639i(persistentHashMapBuilderEntriesIterator, "parentIterator");
        this.parentIterator = persistentHashMapBuilderEntriesIterator;
        this.value = v;
    }

    public V getValue() {
        return this.value;
    }

    /* renamed from: setValue  reason: collision with other method in class */
    public void m35304setValue(V v) {
        this.value = v;
    }

    public V setValue(V v) {
        V value2 = getValue();
        setValue(v);
        this.parentIterator.setValue(getKey(), v);
        return value2;
    }
}
