package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.C12775o;

/* compiled from: VectorizedAnimationSpec.kt */
public interface VectorizedFiniteAnimationSpec<V extends AnimationVector> extends VectorizedAnimationSpec<V> {

    /* compiled from: VectorizedAnimationSpec.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec, V v, V v2, V v3) {
            C12775o.m28639i(v, "initialValue");
            C12775o.m28639i(v2, "targetValue");
            C12775o.m28639i(v3, "initialVelocity");
            return VectorizedFiniteAnimationSpec.super.getEndVelocity(v, v2, v3);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec) {
            return VectorizedFiniteAnimationSpec.super.isInfinite();
        }
    }

    boolean isInfinite() {
        return false;
    }
}
