package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Map;

/* compiled from: PersistentHashMapContentIterators.kt */
public final class TrieNodeEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    public Map.Entry<K, V> next() {
        CommonFunctionsKt.m35307assert(hasNextKey());
        setIndex(getIndex() + 2);
        return new MapEntry(getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
