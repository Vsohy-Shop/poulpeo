package androidx.compose.animation.core;

import kotlin.jvm.internal.C12775o;

/* compiled from: FloatAnimationSpec.kt */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* compiled from: FloatAnimationSpec.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
            return FloatAnimationSpec.super.getEndVelocity(f, f2, f3);
        }

        @Deprecated
        public static <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(FloatAnimationSpec floatAnimationSpec, TwoWayConverter<Float, V> twoWayConverter) {
            C12775o.m28639i(twoWayConverter, "converter");
            return FloatAnimationSpec.super.vectorize((TwoWayConverter) twoWayConverter);
        }
    }

    long getDurationNanos(float f, float f2, float f3);

    float getEndVelocity(float f, float f2, float f3) {
        return getVelocityFromNanos(getDurationNanos(f, f2, f3), f, f2, f3);
    }

    float getValueFromNanos(long j, float f, float f2, float f3);

    float getVelocityFromNanos(long j, float f, float f2, float f3);

    <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(TwoWayConverter<Float, V> twoWayConverter) {
        C12775o.m28639i(twoWayConverter, "converter");
        return new VectorizedFloatAnimationSpec<>(this);
    }
}
