package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1855#2,2:361\n1726#2,3:406\n84#3,2:363\n129#3,4:365\n133#3:370\n121#3:371\n134#3,5:373\n86#3,7:378\n139#3,2:385\n125#3:387\n141#3,6:393\n149#3,3:402\n93#3:405\n70#4:369\n2180#5:372\n2073#5,2:388\n1686#5:390\n2075#5,2:391\n2077#5,3:399\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n227#1:361,2\n237#1:406,3\n234#1:363,2\n234#1:365,4\n234#1:370\n234#1:371\n234#1:373,5\n234#1:378,7\n234#1:385,2\n234#1:387\n234#1:393,6\n234#1:402,3\n234#1:405\n234#1:369\n234#1:372\n234#1:388,2\n234#1:390\n234#1:391,2\n234#1:399,3\n*E\n"})
/* compiled from: SnapshotStateMap.kt */
final class SnapshotMapKeySet<K, V> extends SnapshotMapSet<K, V, K> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotMapKeySet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
        C12775o.m28639i(snapshotStateMap, "map");
    }

    public boolean contains(Object obj) {
        return getMap().containsKey(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object containsKey : iterable) {
            if (!getMap().containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public boolean remove(Object obj) {
        if (getMap().remove(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (getMap().remove(it.next()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        PersistentMap map$runtime_release;
        int modification$runtime_release;
        boolean z;
        Snapshot current;
        C12775o.m28639i(collection, "elements");
        Set F0 = C12686e0.m28209F0(collection);
        SnapshotStateMap map = getMap();
        boolean z2 = false;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                C12775o.m28637g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(map$runtime_release);
            PersistentMap.Builder builder = map$runtime_release.builder();
            Iterator it = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (!F0.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z2 = true;
                }
            }
            C11921v vVar2 = C11921v.f18618a;
            PersistentMap build = builder.build();
            if (C12775o.m28634d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                synchronized (SnapshotStateMapKt.sync) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!z);
        return z2;
    }

    public Void add(K k) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Void addAll(Collection<? extends K> collection) {
        C12775o.m28639i(collection, "elements");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public StateMapMutableKeysIterator<K, V> iterator() {
        return new StateMapMutableKeysIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
