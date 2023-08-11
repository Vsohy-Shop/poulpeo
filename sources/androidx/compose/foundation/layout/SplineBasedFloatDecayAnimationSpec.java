package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: WindowInsetsConnection.android.kt */
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        C12775o.m28639i(density, "density");
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f) {
        return AndroidFlingSpline.INSTANCE.deceleration(f, WindowInsetsConnection_androidKt.PlatformFlingScrollFriction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        return ((float) (((double) (WindowInsetsConnection_androidKt.PlatformFlingScrollFriction * this.magicPhysicalCoefficient)) * Math.exp((WindowInsetsConnection_androidKt.DecelerationRate / WindowInsetsConnection_androidKt.DecelMinusOne) * getSplineDeceleration(f)))) * Math.signum(f);
    }

    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    public long getDurationNanos(float f, float f2) {
        return (long) (Math.exp(getSplineDeceleration(f2) / WindowInsetsConnection_androidKt.DecelMinusOne) * 1.0E9d);
    }

    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    public float getValueFromNanos(long j, float f, float f2) {
        float f3;
        long durationNanos = getDurationNanos(0.0f, f2);
        if (durationNanos > 0) {
            f3 = ((float) j) / ((float) durationNanos);
        } else {
            f3 = 1.0f;
        }
        return f + (flingDistance(f2) * AndroidFlingSpline.FlingResult.m33180getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m33175flingPositionLfoxSSI(f3)));
    }

    public float getVelocityFromNanos(long j, float f, float f2) {
        float f3;
        long durationNanos = getDurationNanos(0.0f, f2);
        if (durationNanos > 0) {
            f3 = ((float) j) / ((float) durationNanos);
        } else {
            f3 = 1.0f;
        }
        return ((AndroidFlingSpline.FlingResult.m33181getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m33175flingPositionLfoxSSI(f3)) * flingDistance(f2)) / ((float) durationNanos)) * 1.0E9f;
    }
}
