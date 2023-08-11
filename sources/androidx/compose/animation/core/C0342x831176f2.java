package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;

/* renamed from: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0342x831176f2 implements DisposableEffectResult {
    final /* synthetic */ Transition $this_createTransitionAnimation$inlined;
    final /* synthetic */ Transition.TransitionAnimationState $transitionAnimation$inlined;

    public C0342x831176f2(Transition transition, Transition.TransitionAnimationState transitionAnimationState) {
        this.$this_createTransitionAnimation$inlined = transition;
        this.$transitionAnimation$inlined = transitionAnimationState;
    }

    public void dispose() {
        this.$this_createTransitionAnimation$inlined.removeAnimation$animation_core_release((Transition<S>.TransitionAnimationState<?, ?>) this.$transitionAnimation$inlined);
    }
}
