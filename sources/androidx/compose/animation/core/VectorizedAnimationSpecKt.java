package androidx.compose.animation.core;

import kotlin.jvm.internal.C12775o;

/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedAnimationSpecKt {
    private static final int InfiniteIterations = Integer.MAX_VALUE;

    /* access modifiers changed from: private */
    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j) {
        return C13537l.m30888o(j - ((long) vectorizedDurationBasedAnimationSpec.getDelayMillis()), 0, (long) vectorizedDurationBasedAnimationSpec.getDurationMillis());
    }

    /* access modifiers changed from: private */
    public static final <V extends AnimationVector> Animations createSpringAnimations(V v, float f, float f2) {
        if (v != null) {
            return new VectorizedAnimationSpecKt$createSpringAnimations$1(v, f, f2);
        }
        return new VectorizedAnimationSpecKt$createSpringAnimations$2(f, f2);
    }

    public static final <V extends AnimationVector> long getDurationMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        C12775o.m28639i(vectorizedAnimationSpec, "<this>");
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return vectorizedAnimationSpec.getDurationNanos(v, v2, v3) / AnimationKt.MillisToNanos;
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j, V v, V v2, V v3) {
        C12775o.m28639i(vectorizedAnimationSpec, "<this>");
        C12775o.m28639i(v, "start");
        C12775o.m28639i(v2, "end");
        C12775o.m28639i(v3, "startVelocity");
        return vectorizedAnimationSpec.getValueFromNanos(j * AnimationKt.MillisToNanos, v, v2, v3);
    }
}
