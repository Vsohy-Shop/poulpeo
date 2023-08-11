package androidx.compose.animation.core;

/* compiled from: AnimationSpec.kt */
public interface AnimationSpec<T> {
    <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
