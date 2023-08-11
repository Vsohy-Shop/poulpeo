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

@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n84#2,2:361\n129#2,4:363\n133#2:368\n121#2:369\n134#2,5:371\n86#2,7:376\n139#2,2:383\n125#2:385\n141#2,6:391\n149#2,3:400\n93#2:403\n84#2,2:404\n129#2,4:406\n133#2:411\n121#2:412\n134#2,5:414\n86#2,7:419\n139#2,2:426\n125#2:428\n141#2,6:434\n149#2,3:443\n93#2:446\n70#3:367\n70#3:410\n2180#4:370\n2073#4,2:386\n1686#4:388\n2075#4,2:389\n2077#4,3:397\n2180#4:413\n2073#4,2:429\n1686#4:431\n2075#4,2:432\n2077#4,3:440\n1726#5,3:447\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n250#1:361,2\n250#1:363,4\n250#1:368\n250#1:369\n250#1:371,5\n250#1:376,7\n250#1:383,2\n250#1:385\n250#1:391,6\n250#1:400,3\n250#1:403\n254#1:404,2\n254#1:406,4\n254#1:411\n254#1:412\n254#1:414,5\n254#1:419,7\n254#1:426,2\n254#1:428\n254#1:434,6\n254#1:443,3\n254#1:446\n250#1:367\n254#1:410\n250#1:370\n250#1:386,2\n250#1:388\n250#1:389,2\n250#1:397,3\n254#1:413\n254#1:429,2\n254#1:431\n254#1:432,2\n254#1:440,3\n258#1:447,3\n*E\n"})
/* compiled from: SnapshotStateMap.kt */
final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotMapValueSet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
        C12775o.m28639i(snapshotStateMap, "map");
    }

    public boolean contains(Object obj) {
        return getMap().containsValue(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object containsValue : iterable) {
            if (!getMap().containsValue(containsValue)) {
                return false;
            }
        }
        return true;
    }

    public boolean remove(Object obj) {
        return getMap().removeValue$runtime_release(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
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
                if (F0.contains(entry.getValue())) {
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
                if (!F0.contains(entry.getValue())) {
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

    public Void add(V v) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Void addAll(Collection<? extends V> collection) {
        C12775o.m28639i(collection, "elements");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public StateMapMutableValuesIterator<K, V> iterator() {
        return new StateMapMutableValuesIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
