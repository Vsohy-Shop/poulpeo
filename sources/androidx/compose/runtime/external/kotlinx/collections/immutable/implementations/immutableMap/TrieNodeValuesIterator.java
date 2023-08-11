package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;

/* compiled from: PersistentHashMapContentIterators.kt */
public final class TrieNodeValuesIterator<K, V> extends TrieNodeBaseIterator<K, V, V> {
    public V next() {
        CommonFunctionsKt.m35307assert(hasNextKey());
        setIndex(getIndex() + 2);
        return getBuffer()[getIndex() - 1];
    }
}
