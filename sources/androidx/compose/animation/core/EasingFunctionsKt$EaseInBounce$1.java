package androidx.compose.animation.core;

/* compiled from: EasingFunctions.kt */
final class EasingFunctionsKt$EaseInBounce$1 implements Easing {
    public static final EasingFunctionsKt$EaseInBounce$1 INSTANCE = new EasingFunctionsKt$EaseInBounce$1();

    EasingFunctionsKt$EaseInBounce$1() {
    }

    public final float transform(float f) {
        return ((float) 1) - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - f);
    }
}
