package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: Snapshot.kt */
public final class ReadonlySnapshot extends Snapshot {
    private final Function1<Object, C11921v> readObserver;
    private int snapshots = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, Function1<Object, C11921v> function1) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        C12775o.m28639i(snapshotIdSet, "invalid");
        this.readObserver = function1;
    }

    public void dispose() {
        if (!getDisposed$runtime_release()) {
            nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    public HashSet<StateObject> getModified$runtime_release() {
        return null;
    }

    public Function1<Object, C11921v> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    public boolean getReadOnly() {
        return true;
    }

    public Function1<Object, C11921v> getWriteObserver$runtime_release() {
        return null;
    }

    public boolean hasPendingChanges() {
        return false;
    }

    public void nestedActivated$runtime_release(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        this.snapshots++;
    }

    public void nestedDeactivated$runtime_release(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    public void recordModified$runtime_release(StateObject stateObject) {
        C12775o.m28639i(stateObject, "state");
        Void unused = SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    public void setModified(HashSet<StateObject> hashSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Snapshot takeNestedSnapshot(Function1<Object, C11921v> function1) {
        SnapshotKt.validateOpen(this);
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), function1, this);
    }

    public Snapshot getRoot() {
        return this;
    }

    public void notifyObjectsInitialized$runtime_release() {
    }
}
