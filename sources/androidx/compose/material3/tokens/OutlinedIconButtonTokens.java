package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: OutlinedIconButtonTokens.kt */
public final class OutlinedIconButtonTokens {
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;
    private static final float ContainerSize = C1232Dp.m38468constructorimpl((float) 40.0d);
    private static final ColorSchemeKeyTokens DisabledColor;
    public static final float DisabledOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledSelectedContainerColor;
    public static final float DisabledSelectedContainerOpacity = 0.12f;
    private static final ColorSchemeKeyTokens DisabledUnselectedOutlineColor;
    public static final float DisabledUnselectedOutlineOpacity = 0.12f;
    public static final OutlinedIconButtonTokens INSTANCE = new OutlinedIconButtonTokens();
    private static final ColorSchemeKeyTokens SelectedColor;
    private static final ColorSchemeKeyTokens SelectedContainerColor = ColorSchemeKeyTokens.InverseSurface;
    private static final ColorSchemeKeyTokens SelectedFocusColor;
    private static final ColorSchemeKeyTokens SelectedHoverColor;
    private static final ColorSchemeKeyTokens SelectedPressedColor;
    private static final float Size = C1232Dp.m38468constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens UnselectedColor;
    private static final ColorSchemeKeyTokens UnselectedFocusColor;
    private static final ColorSchemeKeyTokens UnselectedHoverColor;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
    private static final float UnselectedOutlineWidth = C1232Dp.m38468constructorimpl((float) 1.0d);
    private static final ColorSchemeKeyTokens UnselectedPressedColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledColor = colorSchemeKeyTokens;
        DisabledSelectedContainerColor = colorSchemeKeyTokens;
        DisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.InverseOnSurface;
        SelectedFocusColor = colorSchemeKeyTokens2;
        SelectedHoverColor = colorSchemeKeyTokens2;
        SelectedColor = colorSchemeKeyTokens2;
        SelectedPressedColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedFocusColor = colorSchemeKeyTokens3;
        UnselectedHoverColor = colorSchemeKeyTokens3;
        UnselectedColor = colorSchemeKeyTokens3;
        UnselectedPressedColor = colorSchemeKeyTokens;
    }

    private OutlinedIconButtonTokens() {
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerSize-D9Ej5fM  reason: not valid java name */
    public final float m35062getContainerSizeD9Ej5fM() {
        return ContainerSize;
    }

    public final ColorSchemeKeyTokens getDisabledColor() {
        return DisabledColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return DisabledSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return DisabledUnselectedOutlineColor;
    }

    public final ColorSchemeKeyTokens getSelectedColor() {
        return SelectedColor;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusColor() {
        return SelectedFocusColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverColor() {
        return SelectedHoverColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedColor() {
        return SelectedPressedColor;
    }

    /* renamed from: getSize-D9Ej5fM  reason: not valid java name */
    public final float m35063getSizeD9Ej5fM() {
        return Size;
    }

    public final ColorSchemeKeyTokens getUnselectedColor() {
        return UnselectedColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusColor() {
        return UnselectedFocusColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverColor() {
        return UnselectedHoverColor;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m35064getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedColor() {
        return UnselectedPressedColor;
    }
}
