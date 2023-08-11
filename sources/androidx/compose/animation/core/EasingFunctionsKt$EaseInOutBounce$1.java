package androidx.compose.animation.core;

/* compiled from: EasingFunctions.kt */
final class EasingFunctionsKt$EaseInOutBounce$1 implements Easing {
    public static final EasingFunctionsKt$EaseInOutBounce$1 INSTANCE = new EasingFunctionsKt$EaseInOutBounce$1();

    EasingFunctionsKt$EaseInOutBounce$1() {
    }

    public final float transform(float f) {
        float f2;
        if (((double) f) < 0.5d) {
            f2 = ((float) 1) - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - (f * 2.0f));
        } else {
            f2 = ((float) 1) + EasingFunctionsKt.getEaseOutBounce().transform((f * 2.0f) - 1.0f);
        }
        return f2 / 2.0f;
    }
}
