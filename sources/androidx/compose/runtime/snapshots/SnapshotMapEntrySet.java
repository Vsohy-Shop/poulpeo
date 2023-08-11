package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1179#2,2:361\n1253#2,4:363\n1726#2,3:410\n84#3,2:367\n129#3,4:369\n133#3:374\n121#3:375\n134#3,5:377\n86#3,7:382\n139#3,2:389\n125#3:391\n141#3,6:397\n149#3,3:406\n93#3:409\n70#4:373\n2180#5:376\n2073#5,2:392\n1686#5:394\n2075#5,2:395\n2077#5,3:403\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n209#1:361,2\n209#1:363,4\n216#1:410,3\n210#1:367,2\n210#1:369,4\n210#1:374\n210#1:375\n210#1:377,5\n210#1:382,7\n210#1:389,2\n210#1:391\n210#1:397,6\n210#1:406,3\n210#1:409\n210#1:373\n210#1:376\n210#1:392,2\n210#1:394\n210#1:395,2\n210#1:403,3\n*E\n"})
/* compiled from: SnapshotStateMap.kt */
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotMapEntrySet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
        C12775o.m28639i(snapshotStateMap, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((Map.Entry) obj)).booleanValue();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!C12772l0.m28622n(obj)) {
            return false;
        }
        return contains((Map.Entry) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterable<Map.Entry> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Map.Entry contains : iterable) {
            if (!contains((Object) contains)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new StateMapMutableEntriesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!C12772l0.m28622n(obj)) {
            return false;
        }
        return remove((Map.Entry) obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (getMap().remove(((Map.Entry) it.next()).getKey()) != null || z) {
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
        boolean z2;
        C12775o.m28639i(collection, "elements");
        Iterable<Map.Entry> iterable = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13537l.m30877d(C12714q0.m28413d(C12728x.m28544v(iterable, 10)), 16));
        for (Map.Entry entry : iterable) {
            C11906l a = C11915r.m25707a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a.mo49111c(), a.mo49112d());
        }
        SnapshotStateMap map = getMap();
        boolean z3 = false;
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
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !C12775o.m28634d(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    builder.remove(entry2.getKey());
                    z3 = true;
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
        return z3;
    }

    public Void add(Map.Entry<K, V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Void addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C12775o.m28639i(collection, "elements");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public boolean contains(Map.Entry<K, V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return C12775o.m28634d(getMap().get(entry.getKey()), entry.getValue());
    }

    public boolean remove(Map.Entry<K, V> entry) {
        C12775o.m28639i(entry, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return getMap().remove(entry.getKey()) != null;
    }
}
