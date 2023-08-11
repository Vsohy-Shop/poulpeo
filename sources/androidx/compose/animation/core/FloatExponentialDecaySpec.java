package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: FloatDecayAnimationSpec.kt */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    public FloatExponentialDecaySpec() {
        this(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    }

    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    public long getDurationNanos(float f, float f2) {
        return ((long) ((((float) Math.log((double) (getAbsVelocityThreshold() / Math.abs(f2)))) * 1000.0f) / this.friction)) * AnimationKt.MillisToNanos;
    }

    public float getTargetValue(float f, float f2) {
        if (Math.abs(f2) <= getAbsVelocityThreshold()) {
            return f;
        }
        double log = Math.log((double) Math.abs(getAbsVelocityThreshold() / f2));
        float f3 = this.friction;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((((double) f3) * ((log / ((double) f3)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    public float getValueFromNanos(long j, float f, float f2) {
        long j2 = j / AnimationKt.MillisToNanos;
        float f3 = this.friction;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((double) ((f3 * ((float) j2)) / 1000.0f))));
    }

    public float getVelocityFromNanos(long j, float f, float f2) {
        return f2 * ((float) Math.exp((double) ((((float) (j / AnimationKt.MillisToNanos)) / 1000.0f) * this.friction)));
    }

    public FloatExponentialDecaySpec(float f, float f2) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f2));
        this.friction = Math.max(1.0E-4f, f) * -4.2f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatExponentialDecaySpec(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.1f : f2);
    }
}
