package androidx.compose.animation.core;

/* compiled from: SpringSimulation.kt */
public final class SpringSimulation {
    private double dampedFreq;
    private float dampingRatio = 1.0f;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    private final void init() {
        boolean z;
        if (!this.initialized) {
            if (this.finalPosition == SpringSimulationKt.getUNSET()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                float f = this.dampingRatio;
                double d = ((double) f) * ((double) f);
                if (f > 1.0f) {
                    double d2 = this.naturalFreq;
                    double d3 = d - ((double) 1);
                    this.gammaPlus = (((double) (-f)) * d2) + (d2 * Math.sqrt(d3));
                    double d4 = this.naturalFreq;
                    this.gammaMinus = (((double) (-this.dampingRatio)) * d4) - (d4 * Math.sqrt(d3));
                } else if (f >= 0.0f && f < 1.0f) {
                    this.dampedFreq = this.naturalFreq * Math.sqrt(((double) 1) - d);
                }
                this.initialized = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public final float getAcceleration(float f, float f2) {
        float f3 = f - this.finalPosition;
        double d = this.naturalFreq;
        return (float) (((-(d * d)) * ((double) f3)) - (((d * 2.0d) * ((double) this.dampingRatio)) * ((double) f2)));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final void setDampingRatio(float f) {
        if (f >= 0.0f) {
            this.dampingRatio = f;
            this.initialized = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() > 0.0f) {
            this.naturalFreq = Math.sqrt((double) f);
            this.initialized = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release  reason: not valid java name */
    public final long m32913updateValuesIJZedt4$animation_core_release(float f, float f2, long j) {
        double d;
        double d2;
        boolean z;
        float f3 = f2;
        init();
        float f4 = f - this.finalPosition;
        double d3 = ((double) j) / 1000.0d;
        float f5 = this.dampingRatio;
        if (f5 > 1.0f) {
            double d4 = (double) f4;
            double d5 = this.gammaMinus;
            double d6 = (double) f3;
            double d7 = this.gammaPlus;
            double d8 = d4 - (((d5 * d4) - d6) / (d5 - d7));
            double d9 = ((d4 * d5) - d6) / (d5 - d7);
            d2 = (Math.exp(d5 * d3) * d8) + (Math.exp(this.gammaPlus * d3) * d9);
            double d10 = this.gammaMinus;
            double exp = d8 * d10 * Math.exp(d10 * d3);
            double d11 = this.gammaPlus;
            d = exp + (d9 * d11 * Math.exp(d11 * d3));
        } else {
            if (f5 == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                double d12 = (double) f3;
                double d13 = this.naturalFreq;
                double d14 = (double) f4;
                double d15 = d12 + (d13 * d14);
                double d16 = d14 + (d15 * d3);
                double exp2 = Math.exp((-d13) * d3) * d16;
                double exp3 = d16 * Math.exp((-this.naturalFreq) * d3);
                double d17 = this.naturalFreq;
                d = (exp3 * (-d17)) + (d15 * Math.exp((-d17) * d3));
                d2 = exp2;
            } else {
                double d18 = this.naturalFreq;
                double d19 = (double) f4;
                double d20 = (((double) 1) / this.dampedFreq) * ((((double) f5) * d18 * d19) + ((double) f3));
                double exp4 = Math.exp(((double) (-f5)) * d18 * d3) * ((Math.cos(this.dampedFreq * d3) * d19) + (Math.sin(this.dampedFreq * d3) * d20));
                double d21 = this.naturalFreq;
                float f6 = this.dampingRatio;
                double d22 = (-d21) * exp4 * ((double) f6);
                double exp5 = Math.exp(((double) (-f6)) * d21 * d3);
                double d23 = this.dampedFreq;
                double d24 = exp4;
                double sin = (-d23) * d19 * Math.sin(d23 * d3);
                double d25 = this.dampedFreq;
                d = d22 + (exp5 * (sin + (d20 * d25 * Math.cos(d25 * d3))));
                d2 = d24;
            }
        }
        return SpringSimulationKt.Motion((float) (d2 + ((double) this.finalPosition)), (float) d);
    }
}
