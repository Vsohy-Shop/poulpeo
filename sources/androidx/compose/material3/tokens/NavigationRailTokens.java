package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: NavigationRailTokens.kt */
public final class NavigationRailTokens {
    private static final ColorSchemeKeyTokens ActiveFocusIconColor;
    private static final ColorSchemeKeyTokens ActiveFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ActiveHoverIconColor;
    private static final ColorSchemeKeyTokens ActiveHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
    private static final float ActiveIndicatorHeight = C1232Dp.m38468constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens ActiveIndicatorShape;
    private static final float ActiveIndicatorWidth;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final ColorSchemeKeyTokens ActivePressedIconColor;
    private static final ColorSchemeKeyTokens ActivePressedLabelTextColor;
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m34877getLevel0D9Ej5fM();
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerNone;
    private static final float ContainerWidth = C1232Dp.m38468constructorimpl((float) 80.0d);
    public static final NavigationRailTokens INSTANCE = new NavigationRailTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveFocusIconColor;
    private static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;
    private static final ColorSchemeKeyTokens InactiveHoverIconColor;
    private static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final ColorSchemeKeyTokens InactivePressedIconColor;
    private static final ColorSchemeKeyTokens InactivePressedLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelMedium;
    private static final ColorSchemeKeyTokens MenuFocusIconColor;
    private static final ColorSchemeKeyTokens MenuHoverIconColor;
    private static final ColorSchemeKeyTokens MenuIconColor;
    private static final float MenuIconSize;
    private static final ColorSchemeKeyTokens MenuPressedIconColor;
    private static final float NoLabelActiveIndicatorHeight;
    private static final ShapeKeyTokens NoLabelActiveIndicatorShape;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        ActiveFocusIconColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        ActiveFocusLabelTextColor = colorSchemeKeyTokens2;
        ActiveHoverIconColor = colorSchemeKeyTokens;
        ActiveHoverLabelTextColor = colorSchemeKeyTokens2;
        ActiveIconColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveIndicatorShape = shapeKeyTokens;
        float f = (float) 56.0d;
        ActiveIndicatorWidth = C1232Dp.m38468constructorimpl(f);
        ActiveLabelTextColor = colorSchemeKeyTokens2;
        ActivePressedIconColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens2;
        float f2 = (float) 24.0d;
        IconSize = C1232Dp.m38468constructorimpl(f2);
        InactiveFocusIconColor = colorSchemeKeyTokens2;
        InactiveFocusLabelTextColor = colorSchemeKeyTokens2;
        InactiveHoverIconColor = colorSchemeKeyTokens2;
        InactiveHoverLabelTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveIconColor = colorSchemeKeyTokens3;
        InactiveLabelTextColor = colorSchemeKeyTokens3;
        InactivePressedIconColor = colorSchemeKeyTokens2;
        InactivePressedLabelTextColor = colorSchemeKeyTokens2;
        MenuFocusIconColor = colorSchemeKeyTokens2;
        MenuHoverIconColor = colorSchemeKeyTokens2;
        MenuIconColor = colorSchemeKeyTokens3;
        MenuIconSize = C1232Dp.m38468constructorimpl(f2);
        MenuPressedIconColor = colorSchemeKeyTokens2;
        NoLabelActiveIndicatorHeight = C1232Dp.m38468constructorimpl(f);
        NoLabelActiveIndicatorShape = shapeKeyTokens;
    }

    private NavigationRailTokens() {
    }

    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return ActiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return ActiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return ActiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return ActiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m35034getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final ShapeKeyTokens getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM  reason: not valid java name */
    public final float m35035getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return ActivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return ActivePressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35036getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m35037getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m35038getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return InactiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return InactiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return InactiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return InactiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return InactivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return InactivePressedLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getMenuFocusIconColor() {
        return MenuFocusIconColor;
    }

    public final ColorSchemeKeyTokens getMenuHoverIconColor() {
        return MenuHoverIconColor;
    }

    public final ColorSchemeKeyTokens getMenuIconColor() {
        return MenuIconColor;
    }

    /* renamed from: getMenuIconSize-D9Ej5fM  reason: not valid java name */
    public final float m35039getMenuIconSizeD9Ej5fM() {
        return MenuIconSize;
    }

    public final ColorSchemeKeyTokens getMenuPressedIconColor() {
        return MenuPressedIconColor;
    }

    /* renamed from: getNoLabelActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m35040getNoLabelActiveIndicatorHeightD9Ej5fM() {
        return NoLabelActiveIndicatorHeight;
    }

    public final ShapeKeyTokens getNoLabelActiveIndicatorShape() {
        return NoLabelActiveIndicatorShape;
    }
}
