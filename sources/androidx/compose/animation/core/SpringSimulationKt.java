package androidx.compose.animation.core;

/* compiled from: SpringSimulation.kt */
public final class SpringSimulationKt {
    private static final float UNSET = Float.MAX_VALUE;
    private static final double VelocityThresholdMultiplier = 62.5d;

    public static final long Motion(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return Motion.m32901constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    public static final float getUNSET() {
        return UNSET;
    }
}
