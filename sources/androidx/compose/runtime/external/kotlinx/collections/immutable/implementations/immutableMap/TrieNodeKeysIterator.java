package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;

/* compiled from: PersistentHashMapContentIterators.kt */
public final class TrieNodeKeysIterator<K, V> extends TrieNodeBaseIterator<K, V, K> {
    public K next() {
        CommonFunctionsKt.m35307assert(hasNextKey());
        setIndex(getIndex() + 2);
        return getBuffer()[getIndex() - 2];
    }
}
