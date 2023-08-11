package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.C12775o;

/* compiled from: DecayAnimationSpec.kt */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        C12775o.m28639i(floatDecayAnimationSpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    public long getDurationNanos(V v, V v2) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.velocityVector;
        if (v3 == null) {
            C12775o.m28656z("velocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        long j = 0;
        for (int i = 0; i < size$animation_core_release; i++) {
            j = Math.max(j, this.floatDecaySpec.getDurationNanos(v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        return j;
    }

    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    public V getTargetValue(V v, V v2) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "initialVelocity");
        if (this.targetVector == null) {
            this.targetVector = AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.targetVector;
        if (v3 == null) {
            C12775o.m28656z("targetVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.targetVector;
            if (v4 == null) {
                C12775o.m28656z("targetVector");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.floatDecaySpec.getTargetValue(v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.targetVector;
        if (v5 != null) {
            return v5;
        }
        C12775o.m28656z("targetVector");
        return null;
    }

    public V getValueFromNanos(long j, V v, V v2) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.valueVector;
        if (v3 == null) {
            C12775o.m28656z("valueVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.valueVector;
            if (v4 == null) {
                C12775o.m28656z("valueVector");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.floatDecaySpec.getValueFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.valueVector;
        if (v5 != null) {
            return v5;
        }
        C12775o.m28656z("valueVector");
        return null;
    }

    public V getVelocityFromNanos(long j, V v, V v2) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.velocityVector;
        if (v3 == null) {
            C12775o.m28656z("velocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.velocityVector;
            if (v4 == null) {
                C12775o.m28656z("velocityVector");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.floatDecaySpec.getVelocityFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.velocityVector;
        if (v5 != null) {
            return v5;
        }
        C12775o.m28656z("velocityVector");
        return null;
    }
}
