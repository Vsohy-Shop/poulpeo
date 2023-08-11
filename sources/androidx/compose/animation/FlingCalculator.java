package androidx.compose.animation;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

/* compiled from: FlingCalculator.kt */
public final class FlingCalculator {
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    @StabilityInferred(parameters = 0)
    /* compiled from: FlingCalculator.kt */
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f, float f2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = flingInfo.initialVelocity;
            }
            if ((i & 2) != 0) {
                f2 = flingInfo.distance;
            }
            if ((i & 4) != 0) {
                j = flingInfo.duration;
            }
            return flingInfo.copy(f, f2, j);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        public final FlingInfo copy(float f, float f2, long j) {
            return new FlingInfo(f, f2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            if (C12775o.m28634d(Float.valueOf(this.initialVelocity), Float.valueOf(flingInfo.initialVelocity)) && C12775o.m28634d(Float.valueOf(this.distance), Float.valueOf(flingInfo.distance)) && this.duration == flingInfo.duration) {
                return true;
            }
            return false;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public final float position(long j) {
            float f;
            long j2 = this.duration;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return this.distance * Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(f).getDistanceCoefficient();
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public final float velocity(long j) {
            float f;
            long j2 = this.duration;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return (((AndroidFlingSpline.INSTANCE.flingPosition(f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / ((float) this.duration)) * 1000.0f;
        }
    }

    public FlingCalculator(float f, Density density2) {
        C12775o.m28639i(density2, "density");
        this.friction = f;
        this.density = density2;
        this.magicPhysicalCoefficient = computeDeceleration(density2);
    }

    private final float computeDeceleration(Density density2) {
        return FlingCalculatorKt.computeDeceleration(0.84f, density2.getDensity());
    }

    private final double getSplineDeceleration(float f) {
        return AndroidFlingSpline.INSTANCE.deceleration(f, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        double splineDeceleration = getSplineDeceleration(f);
        return (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) FlingCalculatorKt.DecelerationRate) / (((double) FlingCalculatorKt.DecelerationRate) - 1.0d)) * splineDeceleration));
    }

    public final long flingDuration(float f) {
        return (long) (Math.exp(getSplineDeceleration(f) / (((double) FlingCalculatorKt.DecelerationRate) - 1.0d)) * 1000.0d);
    }

    public final FlingInfo flingInfo(float f) {
        double splineDeceleration = getSplineDeceleration(f);
        double access$getDecelerationRate$p = ((double) FlingCalculatorKt.DecelerationRate) - 1.0d;
        return new FlingInfo(f, (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) FlingCalculatorKt.DecelerationRate) / access$getDecelerationRate$p) * splineDeceleration)), (long) (Math.exp(splineDeceleration / access$getDecelerationRate$p) * 1000.0d));
    }

    public final Density getDensity() {
        return this.density;
    }
}
