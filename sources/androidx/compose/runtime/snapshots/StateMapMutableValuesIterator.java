package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: SnapshotStateMap.kt */
final class StateMapMutableValuesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<V>, C13212a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateMapMutableValuesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
        C12775o.m28639i(snapshotStateMap, "map");
        C12775o.m28639i(it, "iterator");
    }

    public V next() {
        Map.Entry next = getNext();
        if (next != null) {
            advance();
            return next.getValue();
        }
        throw new IllegalStateException();
    }
}
