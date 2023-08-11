package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.C12775o;

/* compiled from: VectorizedAnimationSpec.kt */
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    /* compiled from: VectorizedAnimationSpec.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> long getDurationNanos(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            C12775o.m28639i(v, "initialValue");
            C12775o.m28639i(v2, "targetValue");
            C12775o.m28639i(v3, "initialVelocity");
            return VectorizedDurationBasedAnimationSpec.super.getDurationNanos(v, v2, v3);
        }

        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            C12775o.m28639i(v, "initialValue");
            C12775o.m28639i(v2, "targetValue");
            C12775o.m28639i(v3, "initialVelocity");
            return VectorizedDurationBasedAnimationSpec.super.getEndVelocity(v, v2, v3);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec) {
            return VectorizedDurationBasedAnimationSpec.super.isInfinite();
        }
    }

    int getDelayMillis();

    int getDurationMillis();

    long getDurationNanos(V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return ((long) (getDelayMillis() + getDurationMillis())) * AnimationKt.MillisToNanos;
    }
}
