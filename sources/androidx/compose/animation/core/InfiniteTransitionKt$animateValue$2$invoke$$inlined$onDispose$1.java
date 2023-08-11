package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: Effects.kt */
public final class InfiniteTransitionKt$animateValue$2$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ InfiniteTransition $this_animateValue$inlined;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState $transitionAnimation$inlined;

    public InfiniteTransitionKt$animateValue$2$invoke$$inlined$onDispose$1(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        this.$this_animateValue$inlined = infiniteTransition;
        this.$transitionAnimation$inlined = transitionAnimationState;
    }

    public void dispose() {
        this.$this_animateValue$inlined.removeAnimation$animation_core_release(this.$transitionAnimation$inlined);
    }
}
