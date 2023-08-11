package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.C12775o;

/* compiled from: VectorizedAnimationSpec.kt */
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    /* compiled from: VectorizedAnimationSpec.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
            C12775o.m28639i(v, "initialValue");
            C12775o.m28639i(v2, "targetValue");
            C12775o.m28639i(v3, "initialVelocity");
            return VectorizedAnimationSpec.super.getEndVelocity(v, v2, v3);
        }
    }

    long getDurationNanos(V v, V v2, V v3);

    V getEndVelocity(V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return getVelocityFromNanos(getDurationNanos(v, v2, v3), v, v2, v3);
    }

    V getValueFromNanos(long j, V v, V v2, V v3);

    V getVelocityFromNanos(long j, V v, V v2, V v3);

    boolean isInfinite();
}
