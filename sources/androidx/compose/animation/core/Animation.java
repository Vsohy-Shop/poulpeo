package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: Animation.kt */
public interface Animation<T, V extends AnimationVector> {

    /* compiled from: Animation.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVector> boolean isFinishedFromNanos(Animation<T, V> animation, long j) {
            return Animation.super.isFinishedFromNanos(j);
        }
    }

    long getDurationNanos();

    T getTargetValue();

    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j);

    V getVelocityVectorFromNanos(long j);

    boolean isFinishedFromNanos(long j) {
        if (j >= getDurationNanos()) {
            return true;
        }
        return false;
    }

    boolean isInfinite();
}
