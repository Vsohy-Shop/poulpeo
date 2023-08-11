package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Snapshot.kt */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;
    private final MutableSnapshot previousSnapshot;
    private final Function1<Object, C11921v> specifiedReadObserver;
    private final Function1<Object, C11921v> specifiedWriteObserver;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.getReadObserver$runtime_release();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransparentObserverMutableSnapshot(androidx.compose.runtime.snapshots.MutableSnapshot r5, kotlin.jvm.functions.Function1<java.lang.Object, p336ef.C11921v> r6, kotlin.jvm.functions.Function1<java.lang.Object, p336ef.C11921v> r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.Companion
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.getEMPTY()
            if (r5 == 0) goto L_0x000e
            kotlin.jvm.functions.Function1 r1 = r5.getReadObserver$runtime_release()
            if (r1 != 0) goto L_0x001c
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            kotlin.jvm.functions.Function1 r1 = r1.getReadObserver$runtime_release()
        L_0x001c:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver(r6, r1, r8)
            if (r5 == 0) goto L_0x0028
            kotlin.jvm.functions.Function1 r2 = r5.getWriteObserver$runtime_release()
            if (r2 != 0) goto L_0x0036
        L_0x0028:
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot
            java.lang.Object r2 = r2.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2
            kotlin.jvm.functions.Function1 r2 = r2.getWriteObserver$runtime_release()
        L_0x0036:
            kotlin.jvm.functions.Function1 r2 = androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver(r7, r2)
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            r4.previousSnapshot = r5
            r4.specifiedReadObserver = r6
            r4.specifiedWriteObserver = r7
            r4.mergeParentObservers = r8
            r4.ownsPreviousSnapshot = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot.<init>(androidx.compose.runtime.snapshots.MutableSnapshot, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    private final MutableSnapshot getCurrentSnapshot() {
        MutableSnapshot mutableSnapshot = this.previousSnapshot;
        if (mutableSnapshot != null) {
            return mutableSnapshot;
        }
        Object obj = SnapshotKt.currentGlobalSnapshot.get();
        C12775o.m28638h(obj, "currentGlobalSnapshot.get()");
        return (MutableSnapshot) obj;
    }

    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime_release(true);
        if (this.ownsPreviousSnapshot && (mutableSnapshot = this.previousSnapshot) != null) {
            mutableSnapshot.dispose();
        }
    }

    public int getId() {
        return getCurrentSnapshot().getId();
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    public Set<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    public final Function1<Object, C11921v> getSpecifiedReadObserver$runtime_release() {
        return this.specifiedReadObserver;
    }

    public final Function1<Object, C11921v> getSpecifiedWriteObserver$runtime_release() {
        return this.specifiedWriteObserver;
    }

    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    public void recordModified$runtime_release(StateObject stateObject) {
        C12775o.m28639i(stateObject, "state");
        getCurrentSnapshot().recordModified$runtime_release(stateObject);
    }

    public void setId$runtime_release(int i) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        C12775o.m28639i(snapshotIdSet, "value");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public void setModified(Set<StateObject> set) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, (Object) null);
        Function1 access$mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release());
        if (!this.mergeParentObservers) {
            return new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot((Function1<Object, C11921v>) null, access$mergedWriteObserver), mergedReadObserver$default, access$mergedWriteObserver, false, true);
        }
        return getCurrentSnapshot().takeNestedMutableSnapshot(mergedReadObserver$default, access$mergedWriteObserver);
    }

    public Snapshot takeNestedSnapshot(Function1<Object, C11921v> function1) {
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, (Object) null);
        if (!this.mergeParentObservers) {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot((Function1<Object, C11921v>) null), mergedReadObserver$default, true);
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    public Void nestedActivated$runtime_release(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Void nestedDeactivated$runtime_release(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
