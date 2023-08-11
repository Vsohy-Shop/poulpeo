package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$3 extends C12777p implements Function1<AnimationScope<T, V>, C11921v> {
    final /* synthetic */ C13088o<T, T, C11921v> $block;
    final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animate$3(C13088o<? super T, ? super T, C11921v> oVar, TwoWayConverter<T, V> twoWayConverter) {
        super(1);
        this.$block = oVar;
        this.$typeConverter = twoWayConverter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AnimationScope<T, V> animationScope) {
        C12775o.m28639i(animationScope, "$this$animate");
        this.$block.invoke(animationScope.getValue(), this.$typeConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
    }
}
