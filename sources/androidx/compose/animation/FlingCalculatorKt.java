package androidx.compose.animation;

/* compiled from: FlingCalculator.kt */
public final class FlingCalculatorKt {
    /* access modifiers changed from: private */
    public static final float DecelerationRate = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;

    /* access modifiers changed from: private */
    public static final float computeDeceleration(float f, float f2) {
        return f2 * 386.0878f * 160.0f * f;
    }
}
