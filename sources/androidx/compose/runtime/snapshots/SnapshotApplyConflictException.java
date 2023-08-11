package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: Snapshot.kt */
public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotApplyConflictException(Snapshot snapshot2) {
        C12775o.m28639i(snapshot2, "snapshot");
        this.snapshot = snapshot2;
    }

    public final Snapshot getSnapshot() {
        return this.snapshot;
    }
}
