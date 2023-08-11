package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.C12775o;

/* compiled from: SnapFlingBehavior.kt */
final class AnimationResult<T, V extends AnimationVector> {
    private final AnimationState<T, V> currentAnimationState;
    private final T remainingOffset;

    public AnimationResult(T t, AnimationState<T, V> animationState) {
        C12775o.m28639i(animationState, "currentAnimationState");
        this.remainingOffset = t;
        this.currentAnimationState = animationState;
    }

    public final T component1() {
        return this.remainingOffset;
    }

    public final AnimationState<T, V> component2() {
        return this.currentAnimationState;
    }

    public final AnimationState<T, V> getCurrentAnimationState() {
        return this.currentAnimationState;
    }

    public final T getRemainingOffset() {
        return this.remainingOffset;
    }
}
