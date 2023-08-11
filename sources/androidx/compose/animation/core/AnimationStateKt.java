package androidx.compose.animation.core;

import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;

/* compiled from: AnimationState.kt */
public final class AnimationStateKt {
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f, float f2, long j, long j2, boolean z) {
        return new AnimationState(VectorConvertersKt.getVectorConverter(C12763h.f20419a), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f2), j, j2, z);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = Long.MIN_VALUE;
        long j4 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        if ((i & 8) == 0) {
            j3 = j2;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return AnimationState(f, f2, j4, j3, z);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(AnimationState<T, V> animationState, T t, V v, long j, long j2, boolean z) {
        AnimationState<T, V> animationState2 = animationState;
        C12775o.m28639i(animationState, "<this>");
        return new AnimationState(animationState.getTypeConverter(), t, v, j, j2, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        AnimationVector animationVector2 = animationVector;
        if ((i & 4) != 0) {
            j = animationState.getLastFrameTimeNanos();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = animationState.getFinishedTimeNanos();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = animationState.isRunning();
        }
        return copy(animationState, obj, animationVector2, j3, j4, z);
    }

    public static final <T, V extends AnimationVector> V createZeroVectorFrom(TwoWayConverter<T, V> twoWayConverter, T t) {
        C12775o.m28639i(twoWayConverter, "<this>");
        return AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t));
    }

    public static final boolean isFinished(AnimationState<?, ?> animationState) {
        C12775o.m28639i(animationState, "<this>");
        if (animationState.getFinishedTimeNanos() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j, long j2, boolean z, int i, Object obj3) {
        return AnimationState(twoWayConverter, obj, obj2, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }

    public static final AnimationState<Float, AnimationVector1D> copy(AnimationState<Float, AnimationVector1D> animationState, float f, float f2, long j, long j2, boolean z) {
        AnimationState<Float, AnimationVector1D> animationState2 = animationState;
        C12775o.m28639i(animationState, "<this>");
        return new AnimationState(animationState.getTypeConverter(), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f2), j, j2, z);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(TwoWayConverter<T, V> twoWayConverter, T t, T t2, long j, long j2, boolean z) {
        C12775o.m28639i(twoWayConverter, "typeConverter");
        T t3 = t2;
        return new AnimationState(twoWayConverter, t, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t2), j, j2, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) animationState.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = animationState.getLastFrameTimeNanos();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = animationState.getFinishedTimeNanos();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = animationState.isRunning();
        }
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f, f3, j3, j4, z);
    }
}
