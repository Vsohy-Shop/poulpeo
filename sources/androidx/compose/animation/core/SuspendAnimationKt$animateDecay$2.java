package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animateDecay$2 extends C12777p implements Function1<AnimationScope<Float, AnimationVector1D>, C11921v> {
    final /* synthetic */ C13088o<Float, Float, C11921v> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animateDecay$2(C13088o<? super Float, ? super Float, C11921v> oVar) {
        super(1);
        this.$block = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        C12775o.m28639i(animationScope, "$this$animate");
        this.$block.invoke(animationScope.getValue(), Float.valueOf(animationScope.getVelocityVector().getValue()));
    }
}
