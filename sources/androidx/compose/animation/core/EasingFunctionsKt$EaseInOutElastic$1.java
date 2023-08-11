package androidx.compose.animation.core;

/* compiled from: EasingFunctions.kt */
final class EasingFunctionsKt$EaseInOutElastic$1 implements Easing {
    public static final EasingFunctionsKt$EaseInOutElastic$1 INSTANCE = new EasingFunctionsKt$EaseInOutElastic$1();

    EasingFunctionsKt$EaseInOutElastic$1() {
    }

    public final float transform(float f) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        if (f == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return 1.0f;
        }
        if (0.0f > f || f > 0.5f) {
            z3 = false;
        }
        if (z3) {
            double d = (double) 2.0f;
            float f2 = f * 20.0f;
            return (float) ((-(((double) ((float) Math.pow(d, (double) (f2 - 10.0f)))) * Math.sin(((double) (f2 - 11.125f)) * 1.3962634015954636d))) / d);
        }
        double d2 = (double) 2.0f;
        return ((float) ((((double) ((float) Math.pow(d2, (double) ((-20.0f * f) + 10.0f)))) * Math.sin(((double) ((f * 20.0f) - 11.125f)) * 1.3962634015954636d)) / d2)) + 1.0f;
    }
}
