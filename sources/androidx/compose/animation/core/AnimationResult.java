package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: Animatable.kt */
public final class AnimationResult<T, V extends AnimationVector> {
    public static final int $stable = 0;
    private final AnimationEndReason endReason;
    private final AnimationState<T, V> endState;

    public AnimationResult(AnimationState<T, V> animationState, AnimationEndReason animationEndReason) {
        C12775o.m28639i(animationState, "endState");
        C12775o.m28639i(animationEndReason, "endReason");
        this.endState = animationState;
        this.endReason = animationEndReason;
    }

    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    public final AnimationState<T, V> getEndState() {
        return this.endState;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
