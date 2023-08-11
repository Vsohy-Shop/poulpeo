package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: CheckboxTokens.kt */
public final class CheckboxTokens {
    private static final float ContainerHeight;
    private static final RoundedCornerShape ContainerShape;
    private static final float ContainerWidth;
    public static final CheckboxTokens INSTANCE = new CheckboxTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final ColorSchemeKeyTokens SelectedDisabledContainerColor;
    public static final float SelectedDisabledContainerOpacity = 0.38f;
    private static final float SelectedDisabledContainerOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedDisabledIconColor = ColorSchemeKeyTokens.Surface;
    private static final ColorSchemeKeyTokens SelectedErrorContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorFocusContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorFocusIconColor;
    private static final float SelectedErrorFocusOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedErrorHoverContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorHoverIconColor;
    private static final float SelectedErrorHoverOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedErrorIconColor;
    private static final ColorSchemeKeyTokens SelectedErrorPressedContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorPressedIconColor;
    private static final float SelectedErrorPressedOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedFocusContainerColor;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;
    private static final float SelectedFocusOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedHoverContainerColor;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;
    private static final float SelectedHoverOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final float SelectedOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedPressedContainerColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final float SelectedPressedOutlineWidth;
    private static final ShapeKeyTokens StateLayerShape = ShapeKeyTokens.CornerFull;
    private static final float StateLayerSize = C1232Dp.m38468constructorimpl((float) 40.0d);
    public static final float UnselectedDisabledContainerOpacity = 0.38f;
    private static final ColorSchemeKeyTokens UnselectedDisabledOutlineColor;
    private static final float UnselectedDisabledOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorFocusOutlineColor;
    private static final float UnselectedErrorFocusOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorHoverOutlineColor;
    private static final float UnselectedErrorHoverOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedErrorPressedOutlineColor;
    private static final float UnselectedErrorPressedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;
    private static final float UnselectedFocusOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedHoverOutlineColor;
    private static final float UnselectedHoverOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float UnselectedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedPressedOutlineColor;
    private static final float UnselectedPressedOutlineWidth;

    static {
        float f = (float) 18.0d;
        ContainerHeight = C1232Dp.m38468constructorimpl(f);
        float f2 = (float) 2.0d;
        ContainerShape = RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl(f2));
        ContainerWidth = C1232Dp.m38468constructorimpl(f);
        IconSize = C1232Dp.m38468constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        SelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        SelectedDisabledContainerColor = colorSchemeKeyTokens2;
        float f3 = (float) 0.0d;
        SelectedDisabledContainerOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        SelectedErrorContainerColor = colorSchemeKeyTokens3;
        SelectedErrorFocusContainerColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnError;
        SelectedErrorFocusIconColor = colorSchemeKeyTokens4;
        SelectedErrorFocusOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        SelectedErrorHoverContainerColor = colorSchemeKeyTokens3;
        SelectedErrorHoverIconColor = colorSchemeKeyTokens4;
        SelectedErrorHoverOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        SelectedErrorIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedContainerColor = colorSchemeKeyTokens3;
        SelectedErrorPressedIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        SelectedFocusContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnPrimary;
        SelectedFocusIconColor = colorSchemeKeyTokens5;
        SelectedFocusOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        SelectedHoverContainerColor = colorSchemeKeyTokens;
        SelectedHoverIconColor = colorSchemeKeyTokens5;
        SelectedHoverOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        SelectedIconColor = colorSchemeKeyTokens5;
        SelectedOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        SelectedPressedContainerColor = colorSchemeKeyTokens;
        SelectedPressedIconColor = colorSchemeKeyTokens5;
        SelectedPressedOutlineWidth = C1232Dp.m38468constructorimpl(f3);
        UnselectedDisabledOutlineColor = colorSchemeKeyTokens2;
        UnselectedDisabledOutlineWidth = C1232Dp.m38468constructorimpl(f2);
        UnselectedErrorFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorFocusOutlineWidth = C1232Dp.m38468constructorimpl(f2);
        UnselectedErrorHoverOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorHoverOutlineWidth = C1232Dp.m38468constructorimpl(f2);
        UnselectedErrorOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineWidth = C1232Dp.m38468constructorimpl(f2);
        UnselectedFocusOutlineColor = colorSchemeKeyTokens2;
        UnselectedFocusOutlineWidth = C1232Dp.m38468constructorimpl(f2);
        UnselectedHoverOutlineColor = colorSchemeKeyTokens2;
        UnselectedHoverOutlineWidth = C1232Dp.m38468constructorimpl(f2);
        UnselectedOutlineWidth = C1232Dp.m38468constructorimpl(f2);
        UnselectedPressedOutlineColor = colorSchemeKeyTokens2;
        UnselectedPressedOutlineWidth = C1232Dp.m38468constructorimpl(f2);
    }

    private CheckboxTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m34780getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final RoundedCornerShape getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m34781getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34782getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return SelectedDisabledContainerColor;
    }

    /* renamed from: getSelectedDisabledContainerOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34783getSelectedDisabledContainerOutlineWidthD9Ej5fM() {
        return SelectedDisabledContainerOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledIconColor() {
        return SelectedDisabledIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorContainerColor() {
        return SelectedErrorContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusContainerColor() {
        return SelectedErrorFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusIconColor() {
        return SelectedErrorFocusIconColor;
    }

    /* renamed from: getSelectedErrorFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34784getSelectedErrorFocusOutlineWidthD9Ej5fM() {
        return SelectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverContainerColor() {
        return SelectedErrorHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverIconColor() {
        return SelectedErrorHoverIconColor;
    }

    /* renamed from: getSelectedErrorHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34785getSelectedErrorHoverOutlineWidthD9Ej5fM() {
        return SelectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorIconColor() {
        return SelectedErrorIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedContainerColor() {
        return SelectedErrorPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedIconColor() {
        return SelectedErrorPressedIconColor;
    }

    /* renamed from: getSelectedErrorPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34786getSelectedErrorPressedOutlineWidthD9Ej5fM() {
        return SelectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedFocusContainerColor() {
        return SelectedFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    /* renamed from: getSelectedFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34787getSelectedFocusOutlineWidthD9Ej5fM() {
        return SelectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedHoverContainerColor() {
        return SelectedHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    /* renamed from: getSelectedHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34788getSelectedHoverOutlineWidthD9Ej5fM() {
        return SelectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* renamed from: getSelectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34789getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedPressedContainerColor() {
        return SelectedPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    /* renamed from: getSelectedPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34790getSelectedPressedOutlineWidthD9Ej5fM() {
        return SelectedPressedOutlineWidth;
    }

    public final ShapeKeyTokens getStateLayerShape() {
        return StateLayerShape;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM  reason: not valid java name */
    public final float m34791getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return UnselectedDisabledOutlineColor;
    }

    /* renamed from: getUnselectedDisabledOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34792getUnselectedDisabledOutlineWidthD9Ej5fM() {
        return UnselectedDisabledOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorFocusOutlineColor() {
        return UnselectedErrorFocusOutlineColor;
    }

    /* renamed from: getUnselectedErrorFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34793getUnselectedErrorFocusOutlineWidthD9Ej5fM() {
        return UnselectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorHoverOutlineColor() {
        return UnselectedErrorHoverOutlineColor;
    }

    /* renamed from: getUnselectedErrorHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34794getUnselectedErrorHoverOutlineWidthD9Ej5fM() {
        return UnselectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorOutlineColor() {
        return UnselectedErrorOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorPressedOutlineColor() {
        return UnselectedErrorPressedOutlineColor;
    }

    /* renamed from: getUnselectedErrorPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34795getUnselectedErrorPressedOutlineWidthD9Ej5fM() {
        return UnselectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    /* renamed from: getUnselectedFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34796getUnselectedFocusOutlineWidthD9Ej5fM() {
        return UnselectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverOutlineColor() {
        return UnselectedHoverOutlineColor;
    }

    /* renamed from: getUnselectedHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34797getUnselectedHoverOutlineWidthD9Ej5fM() {
        return UnselectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34798getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedOutlineColor() {
        return UnselectedPressedOutlineColor;
    }

    /* renamed from: getUnselectedPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m34799getUnselectedPressedOutlineWidthD9Ej5fM() {
        return UnselectedPressedOutlineWidth;
    }
}
