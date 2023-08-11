package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$6 extends C12777p implements Function1<Long, C11921v> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1<AnimationScope<T, V>, C11921v> $block;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ V $initialVelocityVector;
    final /* synthetic */ Ref$ObjectRef<AnimationScope<T, V>> $lateInitScope;
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animate$6(Ref$ObjectRef<AnimationScope<T, V>> ref$ObjectRef, T t, Animation<T, V> animation, V v, AnimationState<T, V> animationState, float f, Function1<? super AnimationScope<T, V>, C11921v> function1) {
        super(1);
        this.$lateInitScope = ref$ObjectRef;
        this.$initialValue = t;
        this.$animation = animation;
        this.$initialVelocityVector = v;
        this.$this_animate = animationState;
        this.$durationScale = f;
        this.$block = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C11921v.f18618a;
    }

    public final void invoke(long j) {
        Ref$ObjectRef<AnimationScope<T, V>> ref$ObjectRef = this.$lateInitScope;
        T t = this.$initialValue;
        TwoWayConverter<T, V> typeConverter = this.$animation.getTypeConverter();
        V v = this.$initialVelocityVector;
        T targetValue = this.$animation.getTargetValue();
        final AnimationState<T, V> animationState = this.$this_animate;
        AnimationScope animationScope = new AnimationScope(t, typeConverter, v, j, targetValue, j, true, new C13074a<C11921v>() {
            public final void invoke() {
                animationState.setRunning$animation_core_release(false);
            }
        });
        SuspendAnimationKt.doAnimationFrameWithScale(animationScope, j, this.$durationScale, this.$animation, this.$this_animate, this.$block);
        ref$ObjectRef.f20403b = animationScope;
    }
}
