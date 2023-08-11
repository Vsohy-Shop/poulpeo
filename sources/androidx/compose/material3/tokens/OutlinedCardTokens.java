package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: OutlinedCardTokens.kt */
public final class OutlinedCardTokens {
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerMedium;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
    private static final float DisabledContainerElevation;
    private static final ColorSchemeKeyTokens DisabledOutlineColor;
    public static final float DisabledOutlineOpacity = 0.12f;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens DraggedOutlineColor;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverOutlineColor;
    public static final OutlinedCardTokens INSTANCE = new OutlinedCardTokens();
    private static final ColorSchemeKeyTokens IconColor = ColorSchemeKeyTokens.Primary;
    private static final float IconSize = C1232Dp.m38468constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens OutlineColor;
    private static final float OutlineWidth = C1232Dp.m38468constructorimpl((float) 1.0d);
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedOutlineColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        DisabledContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Outline;
        DisabledOutlineColor = colorSchemeKeyTokens;
        DraggedContainerElevation = elevationTokens.m34880getLevel3D9Ej5fM();
        DraggedOutlineColor = colorSchemeKeyTokens;
        FocusContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        HoverContainerElevation = elevationTokens.m34878getLevel1D9Ej5fM();
        HoverOutlineColor = colorSchemeKeyTokens;
        OutlineColor = colorSchemeKeyTokens;
        PressedContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        PressedOutlineColor = colorSchemeKeyTokens;
    }

    private OutlinedCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35054getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35055getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return DisabledOutlineColor;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35056getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getDraggedOutlineColor() {
        return DraggedOutlineColor;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35057getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return FocusOutlineColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35058getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoverOutlineColor() {
        return HoverOutlineColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m35059getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getOutlineColor() {
        return OutlineColor;
    }

    /* renamed from: getOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m35060getOutlineWidthD9Ej5fM() {
        return OutlineWidth;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35061getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedOutlineColor() {
        return PressedOutlineColor;
    }
}
