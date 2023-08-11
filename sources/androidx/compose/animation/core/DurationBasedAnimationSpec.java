package androidx.compose.animation.core;

/* compiled from: AnimationSpec.kt */
public interface DurationBasedAnimationSpec<T> extends FiniteAnimationSpec<T> {
    <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
