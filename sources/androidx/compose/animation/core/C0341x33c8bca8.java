package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;

/* renamed from: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0341x33c8bca8 implements DisposableEffectResult {
    final /* synthetic */ Transition.DeferredAnimation $lazyAnim$inlined;
    final /* synthetic */ Transition $this_createDeferredAnimation$inlined;

    public C0341x33c8bca8(Transition transition, Transition.DeferredAnimation deferredAnimation) {
        this.$this_createDeferredAnimation$inlined = transition;
        this.$lazyAnim$inlined = deferredAnimation;
    }

    public void dispose() {
        this.$this_createDeferredAnimation$inlined.removeAnimation$animation_core_release((Transition<S>.DeferredAnimation<?, ?>) this.$lazyAnim$inlined);
    }
}
