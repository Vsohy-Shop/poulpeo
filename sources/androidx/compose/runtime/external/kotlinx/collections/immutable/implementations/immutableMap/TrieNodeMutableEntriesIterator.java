package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public final class TrieNodeMutableEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<K, V>> {
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;

    public TrieNodeMutableEntriesIterator(PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator) {
        C12775o.m28639i(persistentHashMapBuilderEntriesIterator, "parentIterator");
        this.parentIterator = persistentHashMapBuilderEntriesIterator;
    }

    public Map.Entry<K, V> next() {
        CommonFunctionsKt.m35307assert(hasNextKey());
        setIndex(getIndex() + 2);
        return new MutableMapEntry(this.parentIterator, getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
