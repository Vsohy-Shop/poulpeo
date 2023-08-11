package androidx.compose.animation.core;

import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;

/* compiled from: DecayAnimationSpec.kt */
public final class DecayAnimationSpecKt {
    public static final <T, V extends AnimationVector> T calculateTargetValue(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2) {
        C12775o.m28639i(decayAnimationSpec, "<this>");
        C12775o.m28639i(twoWayConverter, "typeConverter");
        return twoWayConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(twoWayConverter).getTargetValue((AnimationVector) twoWayConverter.getConvertToVector().invoke(t), (AnimationVector) twoWayConverter.getConvertToVector().invoke(t2)));
    }

    public static final <T> DecayAnimationSpec<T> exponentialDecay(float f, float f2) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f, f2));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.1f;
        }
        return exponentialDecay(f, f2);
    }

    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        C12775o.m28639i(floatDecayAnimationSpec, "<this>");
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(DecayAnimationSpec<Float> decayAnimationSpec, float f, float f2) {
        C12775o.m28639i(decayAnimationSpec, "<this>");
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(C12763h.f20419a)).getTargetValue(AnimationVectorsKt.AnimationVector(f), AnimationVectorsKt.AnimationVector(f2))).getValue();
    }
}
