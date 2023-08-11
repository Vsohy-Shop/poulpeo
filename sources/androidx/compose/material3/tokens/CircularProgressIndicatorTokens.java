package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: CircularProgressIndicatorTokens.kt */
public final class CircularProgressIndicatorTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorWidth = C1232Dp.m38468constructorimpl((float) 4.0d);
    private static final ShapeKeyTokens ActiveShape = ShapeKeyTokens.CornerNone;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
    public static final CircularProgressIndicatorTokens INSTANCE = new CircularProgressIndicatorTokens();
    private static final float Size = C1232Dp.m38468constructorimpl((float) 48.0d);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
    }

    private CircularProgressIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM  reason: not valid java name */
    public final float m34800getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    public final ShapeKeyTokens getActiveShape() {
        return ActiveShape;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorFourColor() {
        return FourColorActiveIndicatorFourColor;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorOneColor() {
        return FourColorActiveIndicatorOneColor;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorThreeColor() {
        return FourColorActiveIndicatorThreeColor;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorTwoColor() {
        return FourColorActiveIndicatorTwoColor;
    }

    /* renamed from: getSize-D9Ej5fM  reason: not valid java name */
    public final float m34801getSizeD9Ej5fM() {
        return Size;
    }
}
