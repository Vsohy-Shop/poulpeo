package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.C12775o;

@ExperimentalAnimationApi
/* compiled from: AnimatedVisibility.kt */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    private final MutableState<IntSize> targetSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m38620boximpl(IntSize.Companion.m38633getZeroYbymL2g()), (SnapshotMutationPolicy) null, 2, (Object) null);
    private Transition<EnterExitState> transition;

    public AnimatedVisibilityScopeImpl(Transition<EnterExitState> transition2) {
        C12775o.m28639i(transition2, "transition");
        this.transition = transition2;
    }

    public final MutableState<IntSize> getTargetSize$animation_release() {
        return this.targetSize;
    }

    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(Transition<EnterExitState> transition2) {
        C12775o.m28639i(transition2, "<set-?>");
        this.transition = transition2;
    }
}
