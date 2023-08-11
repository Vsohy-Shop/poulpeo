package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: SnapshotStateMap.kt */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, C13212a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateMapMutableEntriesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
        C12775o.m28639i(snapshotStateMap, "map");
        C12775o.m28639i(it, "iterator");
    }

    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
