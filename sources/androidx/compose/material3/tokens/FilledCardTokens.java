package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: FilledCardTokens.kt */
public final class FilledCardTokens {
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerMedium;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerElevation;
    public static final float DisabledContainerOpacity = 0.38f;
    private static final float DraggedContainerElevation;
    private static final float FocusContainerElevation;
    private static final float HoverContainerElevation;
    public static final FilledCardTokens INSTANCE = new FilledCardTokens();
    private static final ColorSchemeKeyTokens IconColor = ColorSchemeKeyTokens.Primary;
    private static final float IconSize = C1232Dp.m38468constructorimpl((float) 24.0d);
    private static final float PressedContainerElevation;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        ContainerColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        DisabledContainerColor = colorSchemeKeyTokens;
        DisabledContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        DraggedContainerElevation = elevationTokens.m34880getLevel3D9Ej5fM();
        FocusContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        HoverContainerElevation = elevationTokens.m34878getLevel1D9Ej5fM();
        PressedContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
    }

    private FilledCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34954getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34955getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34956getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34957getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34958getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34959getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34960getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }
}
