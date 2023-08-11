package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehaviorKt$animateDecay$2 extends C12777p implements Function1<AnimationScope<Float, AnimationVector1D>, C11921v> {
    final /* synthetic */ Function1<Float, C11921v> $onAnimationStep;
    final /* synthetic */ C12757e0 $previousValue;
    final /* synthetic */ float $targetOffset;
    final /* synthetic */ ScrollScope $this_animateDecay;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapFlingBehaviorKt$animateDecay$2(float f, C12757e0 e0Var, ScrollScope scrollScope, Function1<? super Float, C11921v> function1) {
        super(1);
        this.$targetOffset = f;
        this.$previousValue = e0Var;
        this.$this_animateDecay = scrollScope;
        this.$onAnimationStep = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        C12775o.m28639i(animationScope, "$this$animateDecay");
        if (Math.abs(animationScope.getValue().floatValue()) >= Math.abs(this.$targetOffset)) {
            float access$coerceToTarget = SnapFlingBehaviorKt.coerceToTarget(animationScope.getValue().floatValue(), this.$targetOffset);
            SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, this.$this_animateDecay, this.$onAnimationStep, access$coerceToTarget - this.$previousValue.f20408b);
            animationScope.cancelAnimation();
            this.$previousValue.f20408b = access$coerceToTarget;
            return;
        }
        SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, this.$this_animateDecay, this.$onAnimationStep, animationScope.getValue().floatValue() - this.$previousValue.f20408b);
        this.$previousValue.f20408b = animationScope.getValue().floatValue();
    }
}
