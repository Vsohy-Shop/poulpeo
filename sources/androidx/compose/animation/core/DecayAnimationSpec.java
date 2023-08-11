package androidx.compose.animation.core;

/* compiled from: DecayAnimationSpec.kt */
public interface DecayAnimationSpec<T> {
    <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
