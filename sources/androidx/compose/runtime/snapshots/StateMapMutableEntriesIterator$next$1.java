package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13216e;

@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#2,4:361\n1#3:365\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n322#1:361,4\n322#1:365\n*E\n"})
/* compiled from: SnapshotStateMap.kt */
public final class StateMapMutableEntriesIterator$next$1 implements Map.Entry<K, V>, C13216e.C13217a {
    private final K key;
    final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
    private V value;

    StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
        this.this$0 = stateMapMutableEntriesIterator;
        Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
        C12775o.m28636f(current);
        this.key = current.getKey();
        Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
        C12775o.m28636f(current2);
        this.value = current2.getValue();
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    /* renamed from: setValue  reason: collision with other method in class */
    public void m35309setValue(V v) {
        this.value = v;
    }

    public V setValue(V v) {
        StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
        if (stateMapMutableEntriesIterator.getMap().getModification$runtime_release() == stateMapMutableEntriesIterator.modification) {
            V value2 = getValue();
            stateMapMutableEntriesIterator.getMap().put(getKey(), v);
            setValue(v);
            return value2;
        }
        throw new ConcurrentModificationException();
    }
}
