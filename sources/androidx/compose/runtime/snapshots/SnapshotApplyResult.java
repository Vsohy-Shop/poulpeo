package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Snapshot.kt */
public abstract class SnapshotApplyResult {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    /* compiled from: Snapshot.kt */
    public static final class Failure extends SnapshotApplyResult {
        public static final int $stable = 8;
        private final Snapshot snapshot;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Snapshot snapshot2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(snapshot2, "snapshot");
            this.snapshot = snapshot2;
        }

        public void check() {
            this.snapshot.dispose();
            throw new SnapshotApplyConflictException(this.snapshot);
        }

        public final Snapshot getSnapshot() {
            return this.snapshot;
        }

        public boolean getSucceeded() {
            return false;
        }
    }

    private SnapshotApplyResult() {
    }

    public /* synthetic */ SnapshotApplyResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void check();

    public abstract boolean getSucceeded();

    @StabilityInferred(parameters = 0)
    /* compiled from: Snapshot.kt */
    public static final class Success extends SnapshotApplyResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super((DefaultConstructorMarker) null);
        }

        public boolean getSucceeded() {
            return true;
        }

        public void check() {
        }
    }
}
