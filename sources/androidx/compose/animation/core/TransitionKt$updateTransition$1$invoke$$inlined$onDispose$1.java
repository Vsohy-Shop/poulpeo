package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: Effects.kt */
public final class TransitionKt$updateTransition$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ Transition $transition$inlined;

    public TransitionKt$updateTransition$1$invoke$$inlined$onDispose$1(Transition transition) {
        this.$transition$inlined = transition;
    }

    public void dispose() {
        this.$transition$inlined.onTransitionEnd$animation_core_release();
    }
}
