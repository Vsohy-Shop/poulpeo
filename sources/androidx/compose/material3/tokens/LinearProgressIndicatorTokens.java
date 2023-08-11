package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: LinearProgressIndicatorTokens.kt */
public final class LinearProgressIndicatorTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorHeight;
    private static final ShapeKeyTokens ActiveShape;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
    public static final LinearProgressIndicatorTokens INSTANCE = new LinearProgressIndicatorTokens();
    private static final ColorSchemeKeyTokens TrackColor = ColorSchemeKeyTokens.SurfaceVariant;
    private static final float TrackHeight;
    private static final ShapeKeyTokens TrackShape;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f = (float) 4.0d;
        ActiveIndicatorHeight = C1232Dp.m38468constructorimpl(f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ActiveShape = shapeKeyTokens;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        TrackHeight = C1232Dp.m38468constructorimpl(f);
        TrackShape = shapeKeyTokens;
    }

    private LinearProgressIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m35006getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
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

    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    /* renamed from: getTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m35007getTrackHeightD9Ej5fM() {
        return TrackHeight;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }
}
