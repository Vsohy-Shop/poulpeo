package androidx.compose.runtime;

import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;

/* compiled from: ActualAndroid.android.kt */
public final class ActualAndroid_androidKt {
    private static final Lazy DefaultMonotonicFrameClock$delegate = C11901h.m25690b(ActualAndroid_androidKt$DefaultMonotonicFrameClock$2.INSTANCE);
    private static final boolean DisallowDefaultMonotonicFrameClock = false;
    private static final String LogTag = "ComposeInternal";

    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        C12775o.m28639i(snapshotMutationPolicy, "policy");
        return new ParcelableSnapshotMutableState(t, snapshotMutationPolicy);
    }

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    public static final void logError(String str, Throwable th) {
        C12775o.m28639i(str, "message");
        C12775o.m28639i(th, "e");
        Log.e(LogTag, str, th);
    }

    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}
