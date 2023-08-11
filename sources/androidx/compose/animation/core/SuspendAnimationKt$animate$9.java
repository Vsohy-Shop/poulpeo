package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$9 extends C12777p implements Function1<Long, C11921v> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1<AnimationScope<T, V>, C11921v> $block;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ Ref$ObjectRef<AnimationScope<T, V>> $lateInitScope;
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animate$9(Ref$ObjectRef<AnimationScope<T, V>> ref$ObjectRef, float f, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, C11921v> function1) {
        super(1);
        this.$lateInitScope = ref$ObjectRef;
        this.$durationScale = f;
        this.$animation = animation;
        this.$this_animate = animationState;
        this.$block = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C11921v.f18618a;
    }

    public final void invoke(long j) {
        T t = this.$lateInitScope.f20403b;
        C12775o.m28636f(t);
        SuspendAnimationKt.doAnimationFrameWithScale((AnimationScope) t, j, this.$durationScale, this.$animation, this.$this_animate, this.$block);
    }
}
