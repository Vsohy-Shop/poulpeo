package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.jvm.internal.C12775o;

/* compiled from: SnapshotContextElement.kt */
public final class SnapshotContextElementKt {
    @ExperimentalComposeApi
    public static final SnapshotContextElement asContextElement(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "<this>");
        return new SnapshotContextElementImpl(snapshot);
    }
}
