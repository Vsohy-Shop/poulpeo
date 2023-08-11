package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: InfiniteTransition.kt */
final class InfiniteTransitionKt$animateValue$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ InfiniteRepeatableSpec<T> $animationSpec;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransitionKt$animateValue$1(T t, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, T t2, InfiniteRepeatableSpec<T> infiniteRepeatableSpec) {
        super(0);
        this.$initialValue = t;
        this.$transitionAnimation = transitionAnimationState;
        this.$targetValue = t2;
        this.$animationSpec = infiniteRepeatableSpec;
    }

    public final void invoke() {
        if (!C12775o.m28634d(this.$initialValue, this.$transitionAnimation.getInitialValue()) || !C12775o.m28634d(this.$targetValue, this.$transitionAnimation.getTargetValue())) {
            this.$transitionAnimation.updateValues(this.$initialValue, this.$targetValue, this.$animationSpec);
        }
    }
}
