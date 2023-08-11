package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: FilledIconButtonTokens.kt */
public final class FilledIconButtonTokens {
    private static final ColorSchemeKeyTokens Color;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;
    private static final float ContainerSize = C1232Dp.m38468constructorimpl((float) 40.0d);
    private static final ColorSchemeKeyTokens DisabledColor;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    public static final float DisabledContainerOpacity = 0.12f;
    public static final float DisabledOpacity = 0.38f;
    private static final ColorSchemeKeyTokens FocusColor;
    private static final ColorSchemeKeyTokens HoverColor;
    public static final FilledIconButtonTokens INSTANCE = new FilledIconButtonTokens();
    private static final ColorSchemeKeyTokens PressedColor;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final float Size = C1232Dp.m38468constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens ToggleSelectedColor;
    private static final ColorSchemeKeyTokens ToggleSelectedFocusColor;
    private static final ColorSchemeKeyTokens ToggleSelectedHoverColor;
    private static final ColorSchemeKeyTokens ToggleSelectedPressedColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedFocusColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedHoverColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedPressedColor;
    private static final ColorSchemeKeyTokens UnselectedContainerColor = ColorSchemeKeyTokens.SurfaceVariant;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledContainerColor = colorSchemeKeyTokens2;
        DisabledColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        FocusColor = colorSchemeKeyTokens3;
        HoverColor = colorSchemeKeyTokens3;
        Color = colorSchemeKeyTokens3;
        PressedColor = colorSchemeKeyTokens3;
        SelectedContainerColor = colorSchemeKeyTokens;
        ToggleSelectedFocusColor = colorSchemeKeyTokens3;
        ToggleSelectedHoverColor = colorSchemeKeyTokens3;
        ToggleSelectedColor = colorSchemeKeyTokens3;
        ToggleSelectedPressedColor = colorSchemeKeyTokens3;
        ToggleUnselectedFocusColor = colorSchemeKeyTokens;
        ToggleUnselectedHoverColor = colorSchemeKeyTokens;
        ToggleUnselectedColor = colorSchemeKeyTokens;
        ToggleUnselectedPressedColor = colorSchemeKeyTokens;
    }

    private FilledIconButtonTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerSize-D9Ej5fM  reason: not valid java name */
    public final float m34961getContainerSizeD9Ej5fM() {
        return ContainerSize;
    }

    public final ColorSchemeKeyTokens getDisabledColor() {
        return DisabledColor;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    public final ColorSchemeKeyTokens getFocusColor() {
        return FocusColor;
    }

    public final ColorSchemeKeyTokens getHoverColor() {
        return HoverColor;
    }

    public final ColorSchemeKeyTokens getPressedColor() {
        return PressedColor;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    /* renamed from: getSize-D9Ej5fM  reason: not valid java name */
    public final float m34962getSizeD9Ej5fM() {
        return Size;
    }

    public final ColorSchemeKeyTokens getToggleSelectedColor() {
        return ToggleSelectedColor;
    }

    public final ColorSchemeKeyTokens getToggleSelectedFocusColor() {
        return ToggleSelectedFocusColor;
    }

    public final ColorSchemeKeyTokens getToggleSelectedHoverColor() {
        return ToggleSelectedHoverColor;
    }

    public final ColorSchemeKeyTokens getToggleSelectedPressedColor() {
        return ToggleSelectedPressedColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedColor() {
        return ToggleUnselectedColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedFocusColor() {
        return ToggleUnselectedFocusColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedHoverColor() {
        return ToggleUnselectedHoverColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedPressedColor() {
        return ToggleUnselectedPressedColor;
    }

    public final ColorSchemeKeyTokens getUnselectedContainerColor() {
        return UnselectedContainerColor;
    }
}
