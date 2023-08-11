package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: Animation.kt */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;

    public DecayAnimation(VectorizedDecayAnimationSpec<V> vectorizedDecayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, V v) {
        C12775o.m28639i(vectorizedDecayAnimationSpec, "animationSpec");
        C12775o.m28639i(twoWayConverter, "typeConverter");
        C12775o.m28639i(v, "initialVelocityVector");
        this.animationSpec = vectorizedDecayAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = t;
        V v2 = (AnimationVector) getTypeConverter().getConvertToVector().invoke(t);
        this.initialValueVector = v2;
        this.initialVelocityVector = AnimationVectorsKt.copy(v);
        this.targetValue = getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec.getTargetValue(v2, v));
        this.durationNanos = vectorizedDecayAnimationSpec.getDurationNanos(v2, v);
        V copy = AnimationVectorsKt.copy(vectorizedDecayAnimationSpec.getVelocityFromNanos(getDurationNanos(), v2, v));
        this.endVelocity = copy;
        int size$animation_core_release = copy.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v3 = this.endVelocity;
            v3.set$animation_core_release(i, C13537l.m30885l(v3.get$animation_core_release(i), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
    }

    public T getTargetValue() {
        return this.targetValue;
    }

    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public T getValueFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    public V getVelocityVectorFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }

    public boolean isInfinite() {
        return this.isInfinite;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, V v) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t, v);
        C12775o.m28639i(decayAnimationSpec, "animationSpec");
        C12775o.m28639i(twoWayConverter, "typeConverter");
        C12775o.m28639i(v, "initialVelocityVector");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t2));
        C12775o.m28639i(decayAnimationSpec, "animationSpec");
        C12775o.m28639i(twoWayConverter, "typeConverter");
    }
}
