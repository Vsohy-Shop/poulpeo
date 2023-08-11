package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;

/* compiled from: SnapshotMutableState.kt */
public interface SnapshotMutableState<T> extends MutableState<T> {
    SnapshotMutationPolicy<T> getPolicy();
}
