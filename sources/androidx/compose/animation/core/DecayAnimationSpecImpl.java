package androidx.compose.animation.core;

import kotlin.jvm.internal.C12775o;

/* compiled from: DecayAnimationSpec.kt */
final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {
    private final FloatDecayAnimationSpec floatDecaySpec;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        C12775o.m28639i(floatDecayAnimationSpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecayAnimationSpec;
    }

    public <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        C12775o.m28639i(twoWayConverter, "typeConverter");
        return new VectorizedFloatDecaySpec(this.floatDecaySpec);
    }
}
