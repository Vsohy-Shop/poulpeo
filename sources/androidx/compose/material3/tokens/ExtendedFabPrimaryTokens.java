package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: ExtendedFabPrimaryTokens.kt */
public final class ExtendedFabPrimaryTokens {
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
    private static final float ContainerElevation;
    private static final float ContainerHeight = C1232Dp.m38468constructorimpl((float) 56.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerLarge;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    public static final ExtendedFabPrimaryTokens INSTANCE = new ExtendedFabPrimaryTokens();
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize = C1232Dp.m38468constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelLarge;
    private static final float LoweredContainerElevation;
    private static final float LoweredFocusContainerElevation;
    private static final float LoweredHoverContainerElevation;
    private static final float LoweredPressedContainerElevation;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m34880getLevel3D9Ej5fM();
        FocusContainerElevation = elevationTokens.m34880getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        FocusIconColor = colorSchemeKeyTokens;
        FocusLabelTextColor = colorSchemeKeyTokens;
        HoverContainerElevation = elevationTokens.m34881getLevel4D9Ej5fM();
        HoverIconColor = colorSchemeKeyTokens;
        HoverLabelTextColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        LabelTextColor = colorSchemeKeyTokens;
        LoweredContainerElevation = elevationTokens.m34878getLevel1D9Ej5fM();
        LoweredFocusContainerElevation = elevationTokens.m34878getLevel1D9Ej5fM();
        LoweredHoverContainerElevation = elevationTokens.m34879getLevel2D9Ej5fM();
        LoweredPressedContainerElevation = elevationTokens.m34878getLevel1D9Ej5fM();
        PressedContainerElevation = elevationTokens.m34880getLevel3D9Ej5fM();
        PressedIconColor = colorSchemeKeyTokens;
        PressedLabelTextColor = colorSchemeKeyTokens;
    }

    private ExtendedFabPrimaryTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34883getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m34884getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34885getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34886getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34887getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    /* renamed from: getLoweredContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34888getLoweredContainerElevationD9Ej5fM() {
        return LoweredContainerElevation;
    }

    /* renamed from: getLoweredFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34889getLoweredFocusContainerElevationD9Ej5fM() {
        return LoweredFocusContainerElevation;
    }

    /* renamed from: getLoweredHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34890getLoweredHoverContainerElevationD9Ej5fM() {
        return LoweredHoverContainerElevation;
    }

    /* renamed from: getLoweredPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34891getLoweredPressedContainerElevationD9Ej5fM() {
        return LoweredPressedContainerElevation;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34892getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }
}
