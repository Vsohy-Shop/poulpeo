package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#1:2192\n1686#1:2195\n1686#1:2197\n1686#1:2199\n1686#1:2207\n1686#1:2211\n1686#1:2214\n1686#1:2216\n1686#1:2218\n1686#1:2220\n1686#1:2222\n1686#1:2224\n70#2:2193\n70#2:2194\n70#2:2196\n70#2:2198\n70#2:2200\n70#2:2208\n70#2:2212\n70#2:2215\n70#2:2217\n70#2:2219\n70#2:2221\n70#2:2223\n70#2:2225\n33#3,6:2201\n1855#4,2:2209\n1#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n596#1:2192\n1739#1:2195\n1757#1:2197\n1766#1:2199\n1772#1:2207\n1841#1:2211\n1985#1:2214\n1994#1:2216\n2062#1:2218\n2074#1:2220\n2102#1:2222\n2167#1:2224\n596#1:2193\n1686#1:2194\n1739#1:2196\n1757#1:2198\n1766#1:2200\n1772#1:2208\n1841#1:2212\n1985#1:2215\n1994#1:2217\n2062#1:2219\n2074#1:2221\n2102#1:2223\n2167#1:2225\n1767#1:2201,6\n1773#1:2209,2\n*E\n"})
/* compiled from: Snapshot.kt */
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;
    /* access modifiers changed from: private */
    public static final List<C13088o<Set<? extends Object>, Snapshot, C11921v>> applyObservers = new ArrayList();
    /* access modifiers changed from: private */
    public static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;
    /* access modifiers changed from: private */
    public static final Function1<SnapshotIdSet, C11921v> emptyLambda = SnapshotKt$emptyLambda$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final List<Function1<Object, C11921v>> globalWriteObservers = new ArrayList();
    private static final Object lock = new Object();
    /* access modifiers changed from: private */
    public static int nextSnapshotId;
    /* access modifiers changed from: private */
    public static SnapshotIdSet openSnapshots;
    private static final SnapshotDoubleIndexHeap pinningTable = new SnapshotDoubleIndexHeap();
    private static final Snapshot snapshotInitializer;
    /* access modifiers changed from: private */
    public static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        int i = nextSnapshotId;
        nextSnapshotId = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        C12775o.m28638h(globalSnapshot2, "currentGlobalSnapshot.get()");
        snapshotInitializer = globalSnapshot2;
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, int i, int i2) {
        C12775o.m28639i(snapshotIdSet, "<this>");
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.set(i);
            i++;
        }
        return snapshotIdSet;
    }

    /* access modifiers changed from: private */
    public static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        GlobalSnapshot globalSnapshot;
        T takeNewGlobalSnapshot;
        List D0;
        Snapshot snapshot = snapshotInitializer;
        C12775o.m28637g(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) snapshot;
        synchronized (getLock()) {
            globalSnapshot = currentGlobalSnapshot.get();
            C12775o.m28638h(globalSnapshot, "currentGlobalSnapshot.get()");
            takeNewGlobalSnapshot = takeNewGlobalSnapshot(globalSnapshot, function1);
        }
        Set<StateObject> modified$runtime_release = globalSnapshot.getModified$runtime_release();
        if (modified$runtime_release != null) {
            synchronized (getLock()) {
                D0 = C12686e0.m28207D0(applyObservers);
            }
            int size = D0.size();
            for (int i = 0; i < size; i++) {
                ((C13088o) D0.get(i)).invoke(modified$runtime_release, globalSnapshot);
            }
        }
        synchronized (getLock()) {
            if (modified$runtime_release != null) {
                for (StateObject overwriteUnusedRecordsLocked : modified$runtime_release) {
                    overwriteUnusedRecordsLocked(overwriteUnusedRecordsLocked);
                }
                C11921v vVar = C11921v.f18618a;
            }
        }
        return takeNewGlobalSnapshot;
    }

    /* access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1<Object, C11921v> function1, boolean z) {
        MutableSnapshot mutableSnapshot;
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (!z2 && snapshot != null) {
            return new TransparentObserverSnapshot(snapshot, function1, false, z);
        }
        if (z2) {
            mutableSnapshot = (MutableSnapshot) snapshot;
        } else {
            mutableSnapshot = null;
        }
        return new TransparentObserverMutableSnapshot(mutableSnapshot, function1, (Function1<Object, C11921v>) null, false, z);
    }

    static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z);
    }

    public static final <T extends StateRecord> T current(T t, Snapshot snapshot) {
        C12775o.m28639i(t, "r");
        C12775o.m28639i(snapshot, "snapshot");
        T readable = readable(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (readable != null) {
            return readable;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        if (snapshot != null) {
            return snapshot;
        }
        GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
        C12775o.m28638h(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    public static final Object getLock() {
        return lock;
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    /* access modifiers changed from: private */
    public static final Function1<Object, C11921v> mergedReadObserver(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 != null && function12 != null && !C12775o.m28634d(function1, function12)) {
            return new SnapshotKt$mergedReadObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(function1, function12, z);
    }

    /* access modifiers changed from: private */
    public static final Function1<Object, C11921v> mergedWriteObserver(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
        if (function1 != null && function12 != null && !C12775o.m28634d(function1, function12)) {
            return new SnapshotKt$mergedWriteObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t, StateObject stateObject) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        T usedLocked = usedLocked(stateObject);
        if (usedLocked != null) {
            usedLocked.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return usedLocked;
        }
        T create = t.create();
        create.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        create.setNext$runtime_release(stateObject.getFirstStateRecord());
        C12775o.m28637g(create, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$13");
        stateObject.prependStateRecord(create);
        C12775o.m28637g(create, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return create;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        T newWritableRecordLocked;
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        C12775o.m28639i(snapshot, "snapshot");
        synchronized (getLock()) {
            newWritableRecordLocked = newWritableRecordLocked(t, stateObject, snapshot);
        }
        return newWritableRecordLocked;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t, StateObject stateObject, Snapshot snapshot) {
        T newOverwritableRecordLocked = newOverwritableRecordLocked(t, stateObject);
        newOverwritableRecordLocked.assign(t);
        newOverwritableRecordLocked.setSnapshotId$runtime_release(snapshot.getId());
        return newOverwritableRecordLocked;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        C12775o.m28639i(snapshot, "snapshot");
        C12775o.m28639i(stateObject, "state");
        Function1<Object, C11921v> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    /* access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord readable;
        Set<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet or = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).mo12044or(mutableSnapshot2.getPreviousIds$runtime_release());
        HashMap hashMap = null;
        for (StateObject next : modified$runtime_release) {
            StateRecord firstStateRecord = next.getFirstStateRecord();
            StateRecord readable2 = readable(firstStateRecord, id, snapshotIdSet);
            if (!(readable2 == null || (readable = readable(firstStateRecord, id, or)) == null || C12775o.m28634d(readable2, readable))) {
                StateRecord readable3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                if (readable3 != null) {
                    StateRecord mergeRecords = next.mergeRecords(readable, readable2, readable3);
                    if (mergeRecords == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(readable2, mergeRecords);
                    hashMap = hashMap;
                } else {
                    readError();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends StateRecord, R> R overwritable(T t, StateObject stateObject, T t2, Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R invoke;
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        C12775o.m28639i(t2, "candidate");
        C12775o.m28639i(function1, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = function1.invoke(overwritableRecord(t, stateObject, current, t2));
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        notifyWrite(current, stateObject);
        return invoke;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t, StateObject stateObject, Snapshot snapshot, T t2) {
        T newOverwritableRecordLocked;
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        C12775o.m28639i(snapshot, "snapshot");
        C12775o.m28639i(t2, "candidate");
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t2.getSnapshotId$runtime_release() == id) {
            return t2;
        }
        synchronized (getLock()) {
            newOverwritableRecordLocked = newOverwritableRecordLocked(t, stateObject);
        }
        newOverwritableRecordLocked.setSnapshotId$runtime_release(id);
        snapshot.recordModified$runtime_release(stateObject);
        return newOverwritableRecordLocked;
    }

    /* access modifiers changed from: private */
    public static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        StateRecord stateRecord2 = null;
        int i = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            int snapshotId$runtime_release = firstStateRecord.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release > lowestOrDefault) {
                    i++;
                } else if (stateRecord2 == null) {
                    stateRecord2 = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    } else {
                        stateRecord = firstStateRecord;
                    }
                    stateRecord2.setSnapshotId$runtime_release(0);
                    stateRecord2.assign(stateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        if (i < 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid((StateRecord) t, i, snapshotIdSet) && (t2 == null || t2.getSnapshotId$runtime_release() < t.getSnapshotId$runtime_release())) {
                t2 = t;
            }
            t = t.getNext$runtime_release();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    /* access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T sync(C13074a<? extends T> aVar) {
        T invoke;
        C12775o.m28639i(aVar, "block");
        synchronized (getLock()) {
            try {
                invoke = aVar.invoke();
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        return invoke;
    }

    /* access modifiers changed from: private */
    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T invoke = function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i = nextSnapshotId;
            nextSnapshotId = i + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i);
            C11921v vVar = C11921v.f18618a;
        }
        return invoke;
    }

    /* access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (Snapshot) advanceGlobalSnapshot(new SnapshotKt$takeNewSnapshot$1(function1));
    }

    public static final int trackPinning(int i, SnapshotIdSet snapshotIdSet) {
        int add;
        C12775o.m28639i(snapshotIdSet, "invalid");
        int lowest = snapshotIdSet.lowest(i);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, lowestOrDefault, empty)) {
                if (stateRecord == null) {
                    stateRecord = firstStateRecord;
                } else if (firstStateRecord.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release()) {
                    return firstStateRecord;
                } else {
                    return stateRecord;
                }
            }
        }
        return null;
    }

    private static final boolean valid(int i, int i2, SnapshotIdSet snapshotIdSet) {
        return i2 != 0 && i2 <= i && !snapshotIdSet.get(i2);
    }

    /* access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        if (!openSnapshots.get(snapshot.getId())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(T t, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(function1, "block");
        return function1.invoke(current(t));
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R invoke;
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        C12775o.m28639i(function1, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = function1.invoke(writableRecord(t, stateObject, current));
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        notifyWrite(current, stateObject);
        return invoke;
    }

    public static final <T extends StateRecord> T writableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        C12775o.m28639i(snapshot, "snapshot");
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(stateObject);
        }
        T readable = readable(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (readable == null) {
            readError();
            throw new KotlinNothingValueException();
        } else if (readable.getSnapshotId$runtime_release() == snapshot.getId()) {
            return readable;
        } else {
            T newWritableRecord = newWritableRecord(readable, stateObject, snapshot);
            snapshot.recordModified$runtime_release(stateObject);
            return newWritableRecord;
        }
    }

    public static final <T extends StateRecord> T current(T t) {
        T readable;
        C12775o.m28639i(t, "r");
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T readable2 = readable(t, current.getId(), current.getInvalid$runtime_release());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            readable = readable(t, current2.getId(), current2.getInvalid$runtime_release());
        }
        if (readable != null) {
            return readable;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    private static final boolean valid(StateRecord stateRecord, int i, SnapshotIdSet snapshotIdSet) {
        return valid(i, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject) {
        T readable;
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        Function1<Object, C11921v> readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T readable2 = readable(t, current.getId(), current.getInvalid$runtime_release());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            C12775o.m28637g(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
            readable = readable(firstStateRecord, current2.getId(), current2.getInvalid$runtime_release());
            if (readable == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return readable;
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, Snapshot snapshot, Function1<? super T, ? extends R> function1) {
        R invoke;
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        C12775o.m28639i(snapshot, "snapshot");
        C12775o.m28639i(function1, "block");
        synchronized (getLock()) {
            try {
                invoke = function1.invoke(writableRecord(t, stateObject, snapshot));
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        notifyWrite(snapshot, stateObject);
        return invoke;
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject, Snapshot snapshot) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(stateObject, "state");
        C12775o.m28639i(snapshot, "snapshot");
        Function1<Object, C11921v> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T readable = readable(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (readable != null) {
            return readable;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(SnapshotKt$advanceGlobalSnapshot$3.INSTANCE);
    }
}
