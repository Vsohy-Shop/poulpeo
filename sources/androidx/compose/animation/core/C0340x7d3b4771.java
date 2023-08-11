package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;

/* renamed from: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0340x7d3b4771 implements DisposableEffectResult {
    final /* synthetic */ Transition $this_createChildTransitionInternal$inlined;
    final /* synthetic */ Transition $transition$inlined;

    public C0340x7d3b4771(Transition transition, Transition transition2) {
        this.$this_createChildTransitionInternal$inlined = transition;
        this.$transition$inlined = transition2;
    }

    public void dispose() {
        this.$this_createChildTransitionInternal$inlined.removeTransition$animation_core_release(this.$transition$inlined);
    }
}
