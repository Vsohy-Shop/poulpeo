package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: Snapshot.kt */
public final class NestedReadonlySnapshot extends Snapshot {
    private final Snapshot parent;
    private final Function1<Object, C11921v> readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, Function1<Object, C11921v> function1, Snapshot snapshot) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        C12775o.m28639i(snapshotIdSet, "invalid");
        C12775o.m28639i(snapshot, "parent");
        this.parent = snapshot;
        snapshot.nestedActivated$runtime_release(this);
        if (function1 != null) {
            Function1<Object, C11921v> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
            if (readObserver$runtime_release != null) {
                function1 = new NestedReadonlySnapshot$readObserver$1$1$1(function1, readObserver$runtime_release);
            }
        } else {
            function1 = snapshot.getReadObserver$runtime_release();
        }
        this.readObserver = function1;
    }

    public void dispose() {
        if (!getDisposed$runtime_release()) {
            if (getId() != this.parent.getId()) {
                closeAndReleasePinning$runtime_release();
            }
            this.parent.nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    public HashSet<StateObject> getModified$runtime_release() {
        return null;
    }

    public final Snapshot getParent() {
        return this.parent;
    }

    public Function1<Object, C11921v> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    public boolean getReadOnly() {
        return true;
    }

    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    public Function1<Object, C11921v> getWriteObserver$runtime_release() {
        return null;
    }

    public boolean hasPendingChanges() {
        return false;
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

    public Void recordModified$runtime_release(StateObject stateObject) {
        C12775o.m28639i(stateObject, "state");
        Void unused = SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    public NestedReadonlySnapshot takeNestedSnapshot(Function1<Object, C11921v> function1) {
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), function1, this.parent);
    }

    public void notifyObjectsInitialized$runtime_release() {
    }
}
