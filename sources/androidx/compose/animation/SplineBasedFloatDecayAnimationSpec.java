package androidx.compose.animation;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: SplineBasedFloatDecayAnimationSpec.kt */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final FlingCalculator flingCalculator;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        C12775o.m28639i(density, "density");
        this.flingCalculator = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    private final float flingDistance(float f) {
        return this.flingCalculator.flingDistance(f) * Math.signum(f);
    }

    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    public long getDurationNanos(float f, float f2) {
        return this.flingCalculator.flingDuration(f2) * AnimationKt.MillisToNanos;
    }

    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    public float getValueFromNanos(long j, float f, float f2) {
        return f + this.flingCalculator.flingInfo(f2).position(j / AnimationKt.MillisToNanos);
    }

    public float getVelocityFromNanos(long j, float f, float f2) {
        return this.flingCalculator.flingInfo(f2).velocity(j / AnimationKt.MillisToNanos);
    }
}
