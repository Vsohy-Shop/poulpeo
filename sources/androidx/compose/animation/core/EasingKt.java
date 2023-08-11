package androidx.compose.animation.core;

/* compiled from: Easing.kt */
public final class EasingKt {
    private static final float CubicErrorBound = 0.001f;
    private static final Easing FastOutLinearInEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final Easing FastOutSlowInEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final Easing LinearEasing = EasingKt$LinearEasing$1.INSTANCE;
    private static final Easing LinearOutSlowInEasing = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    public static final Easing getFastOutLinearInEasing() {
        return FastOutLinearInEasing;
    }

    public static final Easing getFastOutSlowInEasing() {
        return FastOutSlowInEasing;
    }

    public static final Easing getLinearEasing() {
        return LinearEasing;
    }

    public static final Easing getLinearOutSlowInEasing() {
        return LinearOutSlowInEasing;
    }
}
