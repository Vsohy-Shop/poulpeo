package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public final class PersistentHashMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, C13212a {
    private final PersistentHashMapBuilderBaseIterator<K, V, Map.Entry<K, V>> base;

    public PersistentHashMapBuilderEntriesIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C12775o.m28639i(persistentHashMapBuilder, "builder");
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeMutableEntriesIterator(this);
        }
        this.base = new PersistentHashMapBuilderBaseIterator<>(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }

    public boolean hasNext() {
        return this.base.hasNext();
    }

    public void remove() {
        this.base.remove();
    }

    public final void setValue(K k, V v) {
        this.base.setValue(k, v);
    }

    public Map.Entry<K, V> next() {
        return this.base.next();
    }
}
