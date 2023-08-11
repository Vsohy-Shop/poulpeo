package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p412pf.C13216e;

@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n125#1:366\n157#1,3:373\n162#1:379\n129#1,4:380\n133#1:385\n121#1:386\n134#1,7:388\n125#1:395\n141#1,6:401\n149#1,3:410\n129#1,4:413\n133#1:418\n121#1:419\n134#1,7:421\n125#1:428\n141#1,6:434\n149#1,3:443\n129#1,4:446\n133#1:451\n121#1:452\n134#1,7:454\n125#1:461\n141#1,6:467\n149#1,3:476\n129#1,4:482\n133#1:487\n121#1:488\n134#1,7:490\n125#1:497\n141#1,6:503\n149#1,3:512\n121#1:515\n121#1:528\n125#1:530\n121#1:541\n125#1:543\n2180#2:363\n2073#2,2:367\n1686#2:369\n2075#2,2:371\n2077#2,3:376\n2180#2:387\n2073#2,2:396\n1686#2:398\n2075#2,2:399\n2077#2,3:407\n2180#2:420\n2073#2,2:429\n1686#2:431\n2075#2,2:432\n2077#2,3:440\n2180#2:453\n2073#2,2:462\n1686#2:464\n2075#2,2:465\n2077#2,3:473\n2180#2:489\n2073#2,2:498\n1686#2:500\n2075#2,2:501\n2077#2,3:509\n2180#2:516\n2180#2:517\n2073#2,2:518\n1686#2:520\n2075#2,5:522\n2180#2:529\n2073#2,2:531\n1686#2:533\n2075#2,2:535\n2077#2,3:538\n2180#2:542\n2073#2,2:544\n1686#2:546\n2075#2,2:548\n2077#2,3:551\n70#3:370\n70#3:384\n70#3:417\n70#3:450\n70#3:486\n70#3:521\n70#3:527\n70#3:534\n70#3:537\n70#3:547\n70#3:550\n288#4,2:479\n1#5:481\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:366\n69#1:373,3\n69#1:379\n70#1:380,4\n70#1:385\n70#1:386\n70#1:388,7\n70#1:395\n70#1:401,6\n70#1:410,3\n71#1:413,4\n71#1:418\n71#1:419\n71#1:421,7\n71#1:428\n71#1:434,6\n71#1:443,3\n72#1:446,4\n72#1:451\n72#1:452\n72#1:454,7\n72#1:461\n72#1:467,6\n72#1:476,3\n85#1:482,4\n85#1:487\n85#1:488\n85#1:490,7\n85#1:497\n85#1:503,6\n85#1:512,3\n117#1:515\n133#1:528\n140#1:530\n154#1:541\n156#1:543\n69#1:363\n69#1:367,2\n69#1:369\n69#1:371,2\n69#1:376,3\n70#1:387\n70#1:396,2\n70#1:398\n70#1:399,2\n70#1:407,3\n71#1:420\n71#1:429,2\n71#1:431\n71#1:432,2\n71#1:440,3\n72#1:453\n72#1:462,2\n72#1:464\n72#1:465,2\n72#1:473,3\n85#1:489\n85#1:498,2\n85#1:500\n85#1:501,2\n85#1:509,3\n117#1:516\n121#1:517\n125#1:518,2\n125#1:520\n125#1:522,5\n133#1:529\n140#1:531,2\n140#1:533\n140#1:535,2\n140#1:538,3\n154#1:542\n156#1:544,2\n156#1:546\n156#1:548,2\n156#1:551,3\n69#1:370\n70#1:384\n71#1:417\n72#1:450\n85#1:486\n125#1:521\n132#1:527\n140#1:534\n141#1:537\n156#1:547\n157#1:550\n77#1:479,2\n*E\n"})
@Stable
/* compiled from: SnapshotStateMap.kt */
public final class SnapshotStateMap<K, V> implements Map<K, V>, StateObject, C13216e {
    public static final int $stable = 0;
    private final Set<Map.Entry<K, V>> entries = new SnapshotMapEntrySet(this);
    private StateRecord firstStateRecord = new StateMapStateRecord(ExtensionsKt.persistentHashMapOf());
    private final Set<K> keys = new SnapshotMapKeySet(this);
    private final Collection<V> values = new SnapshotMapValueSet(this);

    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,360:1\n70#2:361\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n174#1:361\n*E\n"})
    /* compiled from: SnapshotStateMap.kt */
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(PersistentMap<K, ? extends V> persistentMap) {
            C12775o.m28639i(persistentMap, "map");
            this.map = persistentMap;
        }

        public void assign(StateRecord stateRecord) {
            C12775o.m28639i(stateRecord, "value");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.sync) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                C11921v vVar = C11921v.f18618a;
            }
        }

        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setMap$runtime_release(PersistentMap<K, ? extends V> persistentMap) {
            C12775o.m28639i(persistentMap, "<set-?>");
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    private final <R> R mutate(Function1<? super Map<K, V>, ? extends R> function1) {
        PersistentMap map$runtime_release;
        int modification$runtime_release;
        R invoke;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    C11921v vVar = C11921v.f18618a;
                    C12773m.m28629b(1);
                } finally {
                    C12773m.m28629b(1);
                    C12773m.m28628a(1);
                }
            }
            C12773m.m28628a(1);
            C12775o.m28636f(map$runtime_release);
            PersistentMap.Builder builder = map$runtime_release.builder();
            invoke = function1.invoke(builder);
            PersistentMap build = builder.build();
            if (C12775o.m28634d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    synchronized (SnapshotStateMapKt.sync) {
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        C12773m.m28629b(1);
                    }
                    C12773m.m28628a(1);
                    C12773m.m28629b(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C12773m.m28628a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return invoke;
    }

    private final void update(Function1<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> function1) {
        Snapshot current;
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2);
        PersistentMap persistentMap = (PersistentMap) function1.invoke(stateMapStateRecord.getMap$runtime_release());
        if (persistentMap != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    synchronized (SnapshotStateMapKt.sync) {
                        stateMapStateRecord3.setMap$runtime_release(persistentMap);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                        C12773m.m28629b(1);
                    }
                    C12773m.m28628a(1);
                    C12773m.m28629b(1);
                } catch (Throwable th) {
                    C12773m.m28629b(1);
                    C12773m.m28628a(1);
                    throw th;
                }
            }
            C12773m.m28628a(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(Function1<? super StateMapStateRecord<K, V>, ? extends R> function1) {
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return function1.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord2));
    }

    private final <R> R writable(Function1<? super StateMapStateRecord<K, V>, ? extends R> function1) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord2;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = function1.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    public final boolean all$runtime_release(Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        for (Map.Entry invoke : (ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()) {
            if (!function1.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        for (Map.Entry invoke : (ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()) {
            if (function1.invoke(invoke).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2);
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                synchronized (SnapshotStateMapKt.sync) {
                    stateMapStateRecord3.setMap$runtime_release(persistentHashMapOf);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                }
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    public boolean containsKey(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(obj);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public V get(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().get(obj);
    }

    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2)).getMap$runtime_release();
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord firstStateRecord2 = getFirstStateRecord();
        C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord2, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    public Collection<V> getValues() {
        return this.values;
    }

    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public void prependStateRecord(StateRecord stateRecord) {
        C12775o.m28639i(stateRecord, "value");
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    public V put(K k, V v) {
        PersistentMap map$runtime_release;
        int modification$runtime_release;
        V put;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(map$runtime_release);
            PersistentMap.Builder builder = map$runtime_release.builder();
            put = builder.put(k, v);
            PersistentMap build = builder.build();
            if (C12775o.m28634d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                synchronized (SnapshotStateMapKt.sync) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return put;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        PersistentMap map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean z;
        C12775o.m28639i(map, TypedValues.TransitionType.S_FROM);
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(map$runtime_release);
            PersistentMap.Builder builder = map$runtime_release.builder();
            builder.putAll(map);
            PersistentMap build = builder.build();
            if (!C12775o.m28634d(build, map$runtime_release)) {
                StateRecord firstStateRecord3 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord3;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    synchronized (SnapshotStateMapKt.sync) {
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            z = true;
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z);
    }

    public V remove(Object obj) {
        PersistentMap map$runtime_release;
        int modification$runtime_release;
        V remove;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C11921v vVar = C11921v.f18618a;
            }
            C12775o.m28636f(map$runtime_release);
            PersistentMap.Builder builder = map$runtime_release.builder();
            remove = builder.remove(obj);
            PersistentMap build = builder.build();
            if (C12775o.m28634d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                synchronized (SnapshotStateMapKt.sync) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return remove;
    }

    public final boolean removeIf$runtime_release(Function1<? super Map.Entry<K, V>, Boolean> function1) {
        PersistentMap map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean z;
        C12775o.m28639i(function1, "predicate");
        boolean z2 = false;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    C12775o.m28637g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord2);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    C11921v vVar = C11921v.f18618a;
                    C12773m.m28629b(1);
                } finally {
                    C12773m.m28629b(1);
                    C12773m.m28628a(1);
                }
            }
            C12773m.m28628a(1);
            C12775o.m28636f(map$runtime_release);
            PersistentMap.Builder builder = map$runtime_release.builder();
            for (Map.Entry entry : entrySet()) {
                if (function1.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z2 = true;
                }
            }
            C11921v vVar2 = C11921v.f18618a;
            PersistentMap build = builder.build();
            if (C12775o.m28634d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord3 = getFirstStateRecord();
            C12775o.m28637g(firstStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord3;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    synchronized (SnapshotStateMapKt.sync) {
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        C12773m.m28629b(1);
                    }
                    C12773m.m28628a(1);
                    C12773m.m28629b(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C12773m.m28628a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return z2;
    }

    public final boolean removeValue$runtime_release(V v) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12775o.m28634d(((Map.Entry) obj).getValue(), v)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }
}
