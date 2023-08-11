package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final /* synthetic */ VectorizedFloatAnimationSpec<V> $$delegate_0;
    private final float dampingRatio;
    private final float stiffness;

    private VectorizedSpringSpec(float f, float f2, Animations animations) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.$$delegate_0 = new VectorizedFloatAnimationSpec<>(animations);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public long getDurationNanos(V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.$$delegate_0.getDurationNanos(v, v2, v3);
    }

    public V getEndVelocity(V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.$$delegate_0.getEndVelocity(v, v2, v3);
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public V getValueFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.$$delegate_0.getValueFromNanos(j, v, v2, v3);
    }

    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.$$delegate_0.getVelocityFromNanos(j, v, v2, v3);
    }

    public boolean isInfinite() {
        return this.$$delegate_0.isInfinite();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedSpringSpec(float f, float f2, AnimationVector animationVector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : animationVector);
    }

    public VectorizedSpringSpec(float f, float f2, V v) {
        this(f, f2, VectorizedAnimationSpecKt.createSpringAnimations(v, f, f2));
    }
}
