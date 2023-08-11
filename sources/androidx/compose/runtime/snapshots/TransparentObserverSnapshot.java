package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Snapshot.kt */
public final class TransparentObserverSnapshot extends Snapshot {
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;
    private final Snapshot previousSnapshot;
    private final Function1<Object, C11921v> readObserver;
    private final Snapshot root;
    private final Function1<Object, C11921v> writeObserver;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r4 = r4.getReadObserver$runtime_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransparentObserverSnapshot(androidx.compose.runtime.snapshots.Snapshot r4, kotlin.jvm.functions.Function1<java.lang.Object, p336ef.C11921v> r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.Companion
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.getEMPTY()
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            r3.previousSnapshot = r4
            r3.mergeParentObservers = r6
            r3.ownsPreviousSnapshot = r7
            if (r4 == 0) goto L_0x0019
            kotlin.jvm.functions.Function1 r4 = r4.getReadObserver$runtime_release()
            if (r4 != 0) goto L_0x0027
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            kotlin.jvm.functions.Function1 r4 = r4.getReadObserver$runtime_release()
        L_0x0027:
            kotlin.jvm.functions.Function1 r4 = androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver(r5, r4, r6)
            r3.readObserver = r4
            r3.root = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverSnapshot.<init>(androidx.compose.runtime.snapshots.Snapshot, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    private final Snapshot getCurrentSnapshot() {
        Snapshot snapshot = this.previousSnapshot;
        if (snapshot != null) {
            return snapshot;
        }
        Object obj = SnapshotKt.currentGlobalSnapshot.get();
        C12775o.m28638h(obj, "currentGlobalSnapshot.get()");
        return (Snapshot) obj;
    }

    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (this.ownsPreviousSnapshot && (snapshot = this.previousSnapshot) != null) {
            snapshot.dispose();
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

    public Function1<Object, C11921v> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    public Snapshot getRoot() {
        return this.root;
    }

    public Function1<Object, C11921v> getWriteObserver$runtime_release() {
        return this.writeObserver;
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
