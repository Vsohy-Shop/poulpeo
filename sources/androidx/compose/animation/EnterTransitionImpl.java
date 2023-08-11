package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: EnterExitTransition.kt */
final class EnterTransitionImpl extends EnterTransition {
    private final TransitionData data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterTransitionImpl(TransitionData transitionData) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(transitionData, "data");
        this.data = transitionData;
    }

    public TransitionData getData$animation_release() {
        return this.data;
    }
}
