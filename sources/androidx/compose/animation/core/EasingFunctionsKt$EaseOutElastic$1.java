package androidx.compose.animation.core;

/* compiled from: EasingFunctions.kt */
final class EasingFunctionsKt$EaseOutElastic$1 implements Easing {
    public static final EasingFunctionsKt$EaseOutElastic$1 INSTANCE = new EasingFunctionsKt$EaseOutElastic$1();

    EasingFunctionsKt$EaseOutElastic$1() {
    }

    public final float transform(float f) {
        boolean z;
        boolean z2 = true;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        if (f != 1.0f) {
            z2 = false;
        }
        if (z2) {
            return 1.0f;
        }
        return (float) ((((double) ((float) Math.pow((double) 2.0f, (double) (-10.0f * f)))) * Math.sin(((double) ((f * 10.0f) - 0.75f)) * 2.0943951023931953d)) + ((double) 1.0f));
    }
}
