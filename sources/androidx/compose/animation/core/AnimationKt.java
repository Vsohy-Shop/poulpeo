package androidx.compose.animation.core;

import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;

/* compiled from: Animation.kt */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;

    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2) {
        C12775o.m28639i(floatDecayAnimationSpec, "animationSpec");
        return new DecayAnimation<>(DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), VectorConvertersKt.getVectorConverter(C12763h.f20419a), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f2));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f, f2);
    }

    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3) {
        C12775o.m28639i(animationSpec, "animationSpec");
        C12775o.m28639i(twoWayConverter, "typeConverter");
        return new TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t3));
    }

    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        C12775o.m28639i(vectorizedAnimationSpec, "<this>");
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return new TargetBasedAnimation(vectorizedAnimationSpec, VectorConvertersKt.TwoWayConverter(AnimationKt$createAnimation$1.INSTANCE, AnimationKt$createAnimation$2.INSTANCE), v, v2, v3);
    }

    public static final long getDurationMillis(Animation<?, ?> animation) {
        C12775o.m28639i(animation, "<this>");
        return animation.getDurationNanos() / MillisToNanos;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(Animation<T, V> animation, long j) {
        C12775o.m28639i(animation, "<this>");
        return animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j));
    }
}
