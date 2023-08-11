package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: SliderTokens.kt */
public final class SliderTokens {
    private static final ColorSchemeKeyTokens ActiveTrackColor;
    private static final float ActiveTrackHeight;
    private static final ShapeKeyTokens ActiveTrackShape;
    private static final ColorSchemeKeyTokens DisabledActiveTrackColor;
    public static final float DisabledActiveTrackOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledHandleColor;
    private static final float DisabledHandleElevation;
    public static final float DisabledHandleOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledInactiveTrackColor;
    public static final float DisabledInactiveTrackOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FocusHandleColor;
    private static final ColorSchemeKeyTokens HandleColor;
    private static final float HandleElevation;
    private static final float HandleHeight;
    private static final ShapeKeyTokens HandleShape;
    private static final float HandleWidth;
    private static final ColorSchemeKeyTokens HoverHandleColor;
    public static final SliderTokens INSTANCE = new SliderTokens();
    private static final ColorSchemeKeyTokens InactiveTrackColor = ColorSchemeKeyTokens.SurfaceVariant;
    private static final float InactiveTrackHeight;
    private static final ShapeKeyTokens InactiveTrackShape;
    private static final ColorSchemeKeyTokens LabelContainerColor;
    private static final float LabelContainerElevation;
    private static final float LabelContainerHeight = C1232Dp.m38468constructorimpl((float) 28.0d);
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelMedium;
    private static final ColorSchemeKeyTokens OverlapHandleOutlineColor;
    private static final float OverlapHandleOutlineWidth = C1232Dp.m38468constructorimpl((float) 1.0d);
    private static final ColorSchemeKeyTokens PressedHandleColor;
    private static final float StateLayerSize = C1232Dp.m38468constructorimpl((float) 40.0d);
    private static final ColorSchemeKeyTokens TickMarksActiveContainerColor;
    public static final float TickMarksActiveContainerOpacity = 0.38f;
    private static final ShapeKeyTokens TickMarksContainerShape;
    private static final float TickMarksContainerSize = C1232Dp.m38468constructorimpl((float) 2.0d);
    private static final ColorSchemeKeyTokens TickMarksDisabledContainerColor;
    public static final float TickMarksDisabledContainerOpacity = 0.38f;
    private static final ColorSchemeKeyTokens TickMarksInactiveContainerColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    public static final float TickMarksInactiveContainerOpacity = 0.38f;
    private static final float TrackElevation;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveTrackColor = colorSchemeKeyTokens;
        float f = (float) 4.0d;
        ActiveTrackHeight = C1232Dp.m38468constructorimpl(f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveTrackShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveTrackColor = colorSchemeKeyTokens2;
        DisabledHandleColor = colorSchemeKeyTokens2;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DisabledHandleElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        DisabledInactiveTrackColor = colorSchemeKeyTokens2;
        FocusHandleColor = colorSchemeKeyTokens;
        HandleColor = colorSchemeKeyTokens;
        HandleElevation = elevationTokens.m34878getLevel1D9Ej5fM();
        float f2 = (float) 20.0d;
        HandleHeight = C1232Dp.m38468constructorimpl(f2);
        HandleShape = shapeKeyTokens;
        HandleWidth = C1232Dp.m38468constructorimpl(f2);
        HoverHandleColor = colorSchemeKeyTokens;
        InactiveTrackHeight = C1232Dp.m38468constructorimpl(f);
        InactiveTrackShape = shapeKeyTokens;
        LabelContainerColor = colorSchemeKeyTokens;
        LabelContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        LabelTextColor = colorSchemeKeyTokens3;
        PressedHandleColor = colorSchemeKeyTokens;
        TrackElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        OverlapHandleOutlineColor = colorSchemeKeyTokens3;
        TickMarksActiveContainerColor = colorSchemeKeyTokens3;
        TickMarksContainerShape = shapeKeyTokens;
        TickMarksDisabledContainerColor = colorSchemeKeyTokens2;
    }

    private SliderTokens() {
    }

    public final ColorSchemeKeyTokens getActiveTrackColor() {
        return ActiveTrackColor;
    }

    /* renamed from: getActiveTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m35160getActiveTrackHeightD9Ej5fM() {
        return ActiveTrackHeight;
    }

    public final ShapeKeyTokens getActiveTrackShape() {
        return ActiveTrackShape;
    }

    public final ColorSchemeKeyTokens getDisabledActiveTrackColor() {
        return DisabledActiveTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledHandleColor() {
        return DisabledHandleColor;
    }

    /* renamed from: getDisabledHandleElevation-D9Ej5fM  reason: not valid java name */
    public final float m35161getDisabledHandleElevationD9Ej5fM() {
        return DisabledHandleElevation;
    }

    public final ColorSchemeKeyTokens getDisabledInactiveTrackColor() {
        return DisabledInactiveTrackColor;
    }

    public final ColorSchemeKeyTokens getFocusHandleColor() {
        return FocusHandleColor;
    }

    public final ColorSchemeKeyTokens getHandleColor() {
        return HandleColor;
    }

    /* renamed from: getHandleElevation-D9Ej5fM  reason: not valid java name */
    public final float m35162getHandleElevationD9Ej5fM() {
        return HandleElevation;
    }

    /* renamed from: getHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m35163getHandleHeightD9Ej5fM() {
        return HandleHeight;
    }

    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* renamed from: getHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m35164getHandleWidthD9Ej5fM() {
        return HandleWidth;
    }

    public final ColorSchemeKeyTokens getHoverHandleColor() {
        return HoverHandleColor;
    }

    public final ColorSchemeKeyTokens getInactiveTrackColor() {
        return InactiveTrackColor;
    }

    /* renamed from: getInactiveTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m35165getInactiveTrackHeightD9Ej5fM() {
        return InactiveTrackHeight;
    }

    public final ShapeKeyTokens getInactiveTrackShape() {
        return InactiveTrackShape;
    }

    public final ColorSchemeKeyTokens getLabelContainerColor() {
        return LabelContainerColor;
    }

    /* renamed from: getLabelContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35166getLabelContainerElevationD9Ej5fM() {
        return LabelContainerElevation;
    }

    /* renamed from: getLabelContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m35167getLabelContainerHeightD9Ej5fM() {
        return LabelContainerHeight;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getOverlapHandleOutlineColor() {
        return OverlapHandleOutlineColor;
    }

    /* renamed from: getOverlapHandleOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m35168getOverlapHandleOutlineWidthD9Ej5fM() {
        return OverlapHandleOutlineWidth;
    }

    public final ColorSchemeKeyTokens getPressedHandleColor() {
        return PressedHandleColor;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM  reason: not valid java name */
    public final float m35169getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getTickMarksActiveContainerColor() {
        return TickMarksActiveContainerColor;
    }

    public final ShapeKeyTokens getTickMarksContainerShape() {
        return TickMarksContainerShape;
    }

    /* renamed from: getTickMarksContainerSize-D9Ej5fM  reason: not valid java name */
    public final float m35170getTickMarksContainerSizeD9Ej5fM() {
        return TickMarksContainerSize;
    }

    public final ColorSchemeKeyTokens getTickMarksDisabledContainerColor() {
        return TickMarksDisabledContainerColor;
    }

    public final ColorSchemeKeyTokens getTickMarksInactiveContainerColor() {
        return TickMarksInactiveContainerColor;
    }

    /* renamed from: getTrackElevation-D9Ej5fM  reason: not valid java name */
    public final float m35171getTrackElevationD9Ej5fM() {
        return TrackElevation;
    }
}
