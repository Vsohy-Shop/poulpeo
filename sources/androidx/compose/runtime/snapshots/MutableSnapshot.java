package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n955#1,2:2192\n961#1,3:2196\n964#1,6:2201\n955#1,2:2227\n961#1,3:2231\n964#1,6:2236\n955#1,9:2252\n964#1,6:2263\n1686#2:2194\n1686#2:2199\n1686#2:2207\n1686#2:2221\n1686#2:2229\n1686#2:2234\n1686#2:2247\n1686#2:2250\n1686#2:2261\n1686#2:2269\n1686#2:2271\n70#3:2195\n70#3:2200\n70#3:2208\n70#3:2222\n70#3:2230\n70#3:2235\n70#3:2248\n70#3:2251\n70#3:2262\n70#3:2270\n70#3:2272\n33#4,6:2209\n33#4,6:2215\n33#4,4:2243\n38#4:2249\n1855#5,2:2223\n1855#5,2:2225\n184#6:2242\n1#7:2273\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n661#1:2192,2\n661#1:2196,3\n661#1:2201,6\n786#1:2227,2\n786#1:2231,3\n786#1:2236,6\n972#1:2252,9\n972#1:2263,6\n662#1:2194\n661#1:2199\n710#1:2207\n761#1:2221\n787#1:2229\n786#1:2234\n939#1:2247\n963#1:2250\n972#1:2261\n975#1:2269\n1000#1:2271\n662#1:2195\n661#1:2200\n710#1:2208\n761#1:2222\n787#1:2230\n786#1:2235\n939#1:2248\n963#1:2251\n972#1:2262\n975#1:2270\n1000#1:2272\n747#1:2209,6\n753#1:2215,6\n936#1:2243,4\n936#1:2249\n764#1:2223,2\n765#1:2225,2\n833#1:2242\n*E\n"})
/* compiled from: Snapshot.kt */
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;
    private Set<StateObject> modified;
    private SnapshotIdSet previousIds = SnapshotIdSet.Companion.getEMPTY();
    private int[] previousPinnedSnapshots = new int[0];
    private final Function1<Object, C11921v> readObserver;
    private int snapshots = 1;
    private final Function1<Object, C11921v> writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i, SnapshotIdSet snapshotIdSet, Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        C12775o.m28639i(snapshotIdSet, "invalid");
        this.readObserver = function1;
        this.writeObserver = function12;
    }

    private final void abandon() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied$runtime_release();
            setModified((Set<StateObject>) null);
            int id = getId();
            for (StateObject firstStateRecord : modified$runtime_release) {
                for (StateRecord firstStateRecord2 = firstStateRecord.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext$runtime_release()) {
                    if (firstStateRecord2.getSnapshotId$runtime_release() == id || C12686e0.m28214S(this.previousIds, Integer.valueOf(firstStateRecord2.getSnapshotId$runtime_release()))) {
                        firstStateRecord2.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
    }

    public final <T> T advance$runtime_release(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "block");
        recordPrevious$runtime_release(getId());
        T invoke = aVar.invoke();
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
                    setId$runtime_release(access$getNextSnapshotId$p);
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                    C11921v vVar = C11921v.f18618a;
                    C12773m.m28629b(1);
                } catch (Throwable th) {
                    C12773m.m28629b(1);
                    C12773m.m28628a(1);
                    throw th;
                }
            }
            C12773m.m28628a(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return invoke;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d2, code lost:
        r2 = (java.util.List) r1.mo49109a();
        r1 = (java.util.Set) r1.mo49110b();
        r9.applied = true;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e1, code lost:
        if (r1 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e7, code lost:
        if (r1.isEmpty() == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ec, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
        if (r5 != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
        r5 = r2.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f4, code lost:
        if (r6 >= r5) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f6, code lost:
        ((p404of.C13088o) r2.get(r6)).invoke(r1, r9);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        if (r0 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        if (r0.isEmpty() == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010c, code lost:
        if (r4 != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010e, code lost:
        r4 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0112, code lost:
        if (r3 >= r4) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0114, code lost:
        ((p404of.C13088o) r2.get(r3)).invoke(r0, r9);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        r2 = androidx.compose.runtime.snapshots.SnapshotKt.getLock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0124, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        releasePinnedSnapshotsForCloseLocked$runtime_release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0128, code lost:
        if (r1 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012a, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0132, code lost:
        if (r1.hasNext() == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked((androidx.compose.runtime.snapshots.StateObject) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
        if (r0 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0148, code lost:
        if (r0.hasNext() == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014a, code lost:
        boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked((androidx.compose.runtime.snapshots.StateObject) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0154, code lost:
        r0 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
        return androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r9 = this;
            java.util.Set r0 = r9.getModified$runtime_release()
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "currentGlobalSnapshot.get()"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = (androidx.compose.runtime.snapshots.MutableSnapshot) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = androidx.compose.runtime.snapshots.SnapshotKt.openSnapshots
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            int r4 = r4.getId()
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r3.clear(r4)
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.optimisticMerges(r2, r9, r3)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.validateOpen(r9)     // Catch:{ all -> 0x015d }
            r4 = 1
            if (r0 == 0) goto L_0x0094
            int r5 = r0.size()     // Catch:{ all -> 0x015d }
            if (r5 != 0) goto L_0x0044
            goto L_0x0094
        L_0x0044:
            java.util.concurrent.atomic.AtomicReference r5 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot     // Catch:{ all -> 0x015d }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x015d }
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch:{ all -> 0x015d }
            int r6 = androidx.compose.runtime.snapshots.SnapshotKt.nextSnapshotId     // Catch:{ all -> 0x015d }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = androidx.compose.runtime.snapshots.SnapshotKt.openSnapshots     // Catch:{ all -> 0x015d }
            int r8 = r5.getId()     // Catch:{ all -> 0x015d }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = r7.clear(r8)     // Catch:{ all -> 0x015d }
            androidx.compose.runtime.snapshots.SnapshotApplyResult r2 = r9.innerApplyLocked$runtime_release(r6, r2, r7)     // Catch:{ all -> 0x015d }
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r6 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch:{ all -> 0x015d }
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r2, r6)     // Catch:{ all -> 0x015d }
            if (r6 != 0) goto L_0x006c
            monitor-exit(r3)
            return r2
        L_0x006c:
            r9.closeLocked$runtime_release()     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "previousGlobalSnapshot"
            kotlin.jvm.internal.C12775o.m28638h(r5, r2)     // Catch:{ all -> 0x015d }
            kotlin.jvm.functions.Function1 r2 = androidx.compose.runtime.snapshots.SnapshotKt.emptyLambda     // Catch:{ all -> 0x015d }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.takeNewGlobalSnapshot(r5, r2)     // Catch:{ all -> 0x015d }
            java.util.Set r2 = r5.getModified$runtime_release()     // Catch:{ all -> 0x015d }
            r9.setModified(r1)     // Catch:{ all -> 0x015d }
            r5.setModified(r1)     // Catch:{ all -> 0x015d }
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch:{ all -> 0x015d }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x015d }
            java.util.List r1 = kotlin.collections.C12686e0.m28207D0(r1)     // Catch:{ all -> 0x015d }
            ef.l r1 = p336ef.C11915r.m25707a(r1, r2)     // Catch:{ all -> 0x015d }
            goto L_0x00d1
        L_0x0094:
            r9.closeLocked$runtime_release()     // Catch:{ all -> 0x015d }
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot     // Catch:{ all -> 0x015d }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x015d }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2     // Catch:{ all -> 0x015d }
            java.lang.String r5 = "previousGlobalSnapshot"
            kotlin.jvm.internal.C12775o.m28638h(r2, r5)     // Catch:{ all -> 0x015d }
            kotlin.jvm.functions.Function1 r5 = androidx.compose.runtime.snapshots.SnapshotKt.emptyLambda     // Catch:{ all -> 0x015d }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.takeNewGlobalSnapshot(r2, r5)     // Catch:{ all -> 0x015d }
            java.util.Set r2 = r2.getModified$runtime_release()     // Catch:{ all -> 0x015d }
            if (r2 == 0) goto L_0x00c9
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x015d }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00c9
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch:{ all -> 0x015d }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x015d }
            java.util.List r1 = kotlin.collections.C12686e0.m28207D0(r1)     // Catch:{ all -> 0x015d }
            ef.l r1 = p336ef.C11915r.m25707a(r1, r2)     // Catch:{ all -> 0x015d }
            goto L_0x00d1
        L_0x00c9:
            java.util.List r2 = kotlin.collections.C12726w.m28524k()     // Catch:{ all -> 0x015d }
            ef.l r1 = p336ef.C11915r.m25707a(r2, r1)     // Catch:{ all -> 0x015d }
        L_0x00d1:
            monitor-exit(r3)
            java.lang.Object r2 = r1.mo49109a()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.mo49110b()
            java.util.Set r1 = (java.util.Set) r1
            r9.applied = r4
            r3 = 0
            if (r1 == 0) goto L_0x00ec
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r5 = r3
            goto L_0x00ed
        L_0x00ec:
            r5 = r4
        L_0x00ed:
            if (r5 != 0) goto L_0x0102
            int r5 = r2.size()
            r6 = r3
        L_0x00f4:
            if (r6 >= r5) goto L_0x0102
            java.lang.Object r7 = r2.get(r6)
            of.o r7 = (p404of.C13088o) r7
            r7.invoke(r1, r9)
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x0102:
            if (r0 == 0) goto L_0x010c
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r4 = r3
        L_0x010c:
            if (r4 != 0) goto L_0x0120
            int r4 = r2.size()
        L_0x0112:
            if (r3 >= r4) goto L_0x0120
            java.lang.Object r5 = r2.get(r3)
            of.o r5 = (p404of.C13088o) r5
            r5.invoke(r0, r9)
            int r3 = r3 + 1
            goto L_0x0112
        L_0x0120:
            java.lang.Object r2 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r2)
            r9.releasePinnedSnapshotsForCloseLocked$runtime_release()     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x013e
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x015a }
        L_0x012e:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x015a }
            if (r3 == 0) goto L_0x013e
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x015a }
            androidx.compose.runtime.snapshots.StateObject r3 = (androidx.compose.runtime.snapshots.StateObject) r3     // Catch:{ all -> 0x015a }
            boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked(r3)     // Catch:{ all -> 0x015a }
            goto L_0x012e
        L_0x013e:
            if (r0 == 0) goto L_0x0156
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x015a }
        L_0x0144:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x0154
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x015a }
            androidx.compose.runtime.snapshots.StateObject r1 = (androidx.compose.runtime.snapshots.StateObject) r1     // Catch:{ all -> 0x015a }
            boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked(r1)     // Catch:{ all -> 0x015a }
            goto L_0x0144
        L_0x0154:
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x015a }
        L_0x0156:
            monitor-exit(r2)
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            return r0
        L_0x015a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x015d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId()).andNot(this.previousIds);
    }

    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            nestedDeactivated$runtime_release(this);
        }
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    public Set<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    public Function1<Object, C11921v> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    public boolean getReadOnly() {
        return false;
    }

    public Function1<Object, C11921v> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public boolean hasPendingChanges() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null || !(!modified$runtime_release.isEmpty())) {
            return false;
        }
        return true;
    }

    public final SnapshotApplyResult innerApplyLocked$runtime_release(int i, Map<StateRecord, ? extends StateRecord> map, SnapshotIdSet snapshotIdSet) {
        StateRecord access$readable;
        StateRecord stateRecord;
        C11906l lVar;
        C12775o.m28639i(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet or = getInvalid$runtime_release().set(getId()).mo12044or(this.previousIds);
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        C12775o.m28636f(modified$runtime_release);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (StateObject next : modified$runtime_release) {
            StateRecord firstStateRecord = next.getFirstStateRecord();
            StateRecord access$readable2 = SnapshotKt.readable(firstStateRecord, i, snapshotIdSet);
            if (!(access$readable2 == null || (access$readable = SnapshotKt.readable(firstStateRecord, getId(), or)) == null || C12775o.m28634d(access$readable2, access$readable))) {
                StateRecord access$readable3 = SnapshotKt.readable(firstStateRecord, getId(), getInvalid$runtime_release());
                if (access$readable3 != null) {
                    if (map == null || (stateRecord = (StateRecord) map.get(access$readable2)) == null) {
                        stateRecord = next.mergeRecords(access$readable, access$readable2, access$readable3);
                    }
                    if (stateRecord == null) {
                        return new SnapshotApplyResult.Failure(this);
                    }
                    if (!C12775o.m28634d(stateRecord, access$readable3)) {
                        if (C12775o.m28634d(stateRecord, access$readable2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(C11915r.m25707a(next, access$readable2.create()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!C12775o.m28634d(stateRecord, access$readable)) {
                                lVar = C11915r.m25707a(next, stateRecord);
                            } else {
                                lVar = C11915r.m25707a(next, access$readable.create());
                            }
                            arrayList.add(lVar);
                        }
                    }
                } else {
                    Void unused = SnapshotKt.readError();
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C11906l lVar2 = (C11906l) arrayList.get(i2);
                StateObject stateObject = (StateObject) lVar2.mo49109a();
                StateRecord stateRecord2 = (StateRecord) lVar2.mo49110b();
                stateRecord2.setSnapshotId$runtime_release(getId());
                synchronized (SnapshotKt.getLock()) {
                    stateRecord2.setNext$runtime_release(stateObject.getFirstStateRecord());
                    stateObject.prependStateRecord(stateRecord2);
                    C11921v vVar = C11921v.f18618a;
                }
            }
        }
        if (arrayList2 != null) {
            modified$runtime_release.removeAll(arrayList2);
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    public void nestedActivated$runtime_release(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        this.snapshots++;
    }

    public void nestedDeactivated$runtime_release(Snapshot snapshot) {
        boolean z;
        C12775o.m28639i(snapshot, "snapshot");
        int i = this.snapshots;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.snapshots = i2;
            if (i2 == 0 && !this.applied) {
                abandon();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void notifyObjectsInitialized$runtime_release() {
        if (!this.applied && !getDisposed$runtime_release()) {
            advance$runtime_release();
        }
    }

    public void recordModified$runtime_release(StateObject stateObject) {
        C12775o.m28639i(stateObject, "state");
        Set modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new HashSet();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(stateObject);
    }

    public final void recordPrevious$runtime_release(int i) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(i);
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshotIdSet) {
        C12775o.m28639i(snapshotIdSet, "snapshots");
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.mo12044or(snapshotIdSet);
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i) {
        if (i >= 0) {
            this.previousPinnedSnapshots = C12708o.m28356w(this.previousPinnedSnapshots, i);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        boolean z;
        C12775o.m28639i(iArr, "handles");
        boolean z2 = true;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int[] iArr2 = this.previousPinnedSnapshots;
            if (iArr2.length != 0) {
                z2 = false;
            }
            if (z2) {
                this.previousPinnedSnapshots = iArr;
            } else {
                this.previousPinnedSnapshots = C12708o.m28357x(iArr2, iArr);
            }
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked$runtime_release();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void releasePreviouslyPinnedSnapshotsLocked$runtime_release() {
        for (int releasePinningLocked : this.previousPinnedSnapshots) {
            SnapshotKt.releasePinningLocked(releasePinningLocked);
        }
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    public void setModified(Set<StateObject> set) {
        this.modified = set;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        C12775o.m28639i(snapshotIdSet, "<set-?>");
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        C12775o.m28639i(iArr, "<set-?>");
        this.previousPinnedSnapshots = iArr;
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(access$getNextSnapshotId$p);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(access$getNextSnapshotId$p));
            nestedMutableSnapshot = new NestedMutableSnapshot(access$getNextSnapshotId$p, SnapshotKt.addRange(invalid$runtime_release, getId() + 1, access$getNextSnapshotId$p), SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, (Object) null), SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int access$getNextSnapshotId$p2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p2 + 1;
                setId$runtime_release(access$getNextSnapshotId$p2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                C11921v vVar = C11921v.f18618a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    public Snapshot takeNestedSnapshot(Function1<Object, C11921v> function1) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(access$getNextSnapshotId$p);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(access$getNextSnapshotId$p, SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, access$getNextSnapshotId$p), function1, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                int access$getNextSnapshotId$p2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p2 + 1;
                setId$runtime_release(access$getNextSnapshotId$p2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                C11921v vVar = C11921v.f18618a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void validateNotApplied$runtime_release() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    public final void validateNotAppliedOrPinned$runtime_release() {
        boolean z;
        boolean z2 = true;
        if (this.applied) {
            if (this.pinningTrackingHandle >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        C11921v vVar = C11921v.f18618a;
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
                setId$runtime_release(access$getNextSnapshotId$p);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
    }

    public Snapshot getRoot() {
        return this;
    }
}
