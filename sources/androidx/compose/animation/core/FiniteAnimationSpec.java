package androidx.compose.animation.core;

/* compiled from: AnimationSpec.kt */
public interface FiniteAnimationSpec<T> extends AnimationSpec<T> {
    <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
