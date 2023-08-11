package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: InfiniteTransition.kt */
final class InfiniteTransitionKt$animateValue$2 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ InfiniteTransition $this_animateValue;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransitionKt$animateValue$2(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState) {
        super(1);
        this.$this_animateValue = infiniteTransition;
        this.$transitionAnimation = transitionAnimationState;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        this.$this_animateValue.addAnimation$animation_core_release(this.$transitionAnimation);
        return new InfiniteTransitionKt$animateValue$2$invoke$$inlined$onDispose$1(this.$this_animateValue, this.$transitionAnimation);
    }
}
