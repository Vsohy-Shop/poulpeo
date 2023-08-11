package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: FloatAnimationSpec.kt */
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public long getDurationNanos(float f, float f2, float f3) {
        float stiffness2 = this.spring.getStiffness();
        float dampingRatio2 = this.spring.getDampingRatio();
        float f4 = f - f2;
        float f5 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness2, dampingRatio2, f3 / f5, f4 / f5, 1.0f) * AnimationKt.MillisToNanos;
    }

    public float getEndVelocity(float f, float f2, float f3) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public float getValueFromNanos(long j, float f, float f2, float f3) {
        long j2 = j / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f2);
        return Motion.m32906getValueimpl(this.spring.m32913updateValuesIJZedt4$animation_core_release(f, f3, j2));
    }

    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long j2 = j / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f2);
        return Motion.m32907getVelocityimpl(this.spring.m32913updateValuesIJZedt4$animation_core_release(f, f3, j2));
    }

    public FloatSpringSpec(float f, float f2, float f3) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = f3;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f);
        springSimulation.setStiffness(f2);
        this.spring = springSimulation;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatSpringSpec(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
