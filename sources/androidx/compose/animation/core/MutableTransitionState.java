package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: Transition.kt */
public final class MutableTransitionState<S> {
    public static final int $stable = 0;
    private final MutableState currentState$delegate;
    private final MutableState isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final MutableState targetState$delegate;

    public MutableTransitionState(S s) {
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final S getCurrentState() {
        return this.currentState$delegate.getValue();
    }

    public final S getTargetState() {
        return this.targetState$delegate.getValue();
    }

    public final boolean isIdle() {
        if (!C12775o.m28634d(getCurrentState(), getTargetState()) || isRunning$animation_core_release()) {
            return false;
        }
        return true;
    }

    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setCurrentState$animation_core_release(S s) {
        this.currentState$delegate.setValue(s);
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTargetState(S s) {
        this.targetState$delegate.setValue(s);
    }
}
