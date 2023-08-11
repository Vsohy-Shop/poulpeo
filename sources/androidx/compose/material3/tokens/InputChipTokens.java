package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: InputChipTokens.kt */
public final class InputChipTokens {
    private static final ShapeKeyTokens AvatarShape = ShapeKeyTokens.CornerFull;
    private static final float AvatarSize = C1232Dp.m38468constructorimpl((float) 24.0d);
    private static final float ContainerElevation;
    private static final float ContainerHeight = C1232Dp.m38468constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;
    public static final float DisabledAvatarOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    public static final float DisabledLabelTextOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledSelectedContainerColor;
    public static final float DisabledSelectedContainerOpacity = 0.12f;
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor;
    public static final float DisabledTrailingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedOutlineColor;
    public static final float DisabledUnselectedOutlineOpacity = 0.12f;
    private static final float DraggedContainerElevation;
    public static final InputChipTokens INSTANCE = new InputChipTokens();
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelLarge;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens SelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedLeadingIconColor;
    private static final float SelectedOutlineWidth = C1232Dp.m38468constructorimpl((float) 0.0d);
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens SelectedTrailingIconColor;
    private static final float TrailingIconSize;
    private static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
    private static final float UnselectedOutlineWidth = C1232Dp.m38468constructorimpl((float) 1.0d);
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens UnselectedTrailingIconColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledSelectedContainerColor = colorSchemeKeyTokens;
        DisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        DraggedContainerElevation = elevationTokens.m34881getLevel4D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSecondaryContainer;
        SelectedDraggedLabelTextColor = colorSchemeKeyTokens2;
        SelectedFocusLabelTextColor = colorSchemeKeyTokens2;
        SelectedHoverLabelTextColor = colorSchemeKeyTokens2;
        SelectedLabelTextColor = colorSchemeKeyTokens2;
        SelectedPressedLabelTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedDraggedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedHoverLabelTextColor = colorSchemeKeyTokens3;
        UnselectedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens3;
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        float f = (float) 18.0d;
        LeadingIconSize = C1232Dp.m38468constructorimpl(f);
        SelectedDraggedLeadingIconColor = colorSchemeKeyTokens2;
        SelectedFocusLeadingIconColor = colorSchemeKeyTokens2;
        SelectedHoverLeadingIconColor = colorSchemeKeyTokens2;
        SelectedLeadingIconColor = colorSchemeKeyTokens2;
        SelectedPressedLeadingIconColor = colorSchemeKeyTokens2;
        UnselectedDraggedLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedFocusLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedHoverLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedLeadingIconColor = colorSchemeKeyTokens3;
        DisabledTrailingIconColor = colorSchemeKeyTokens;
        SelectedDraggedTrailingIconColor = colorSchemeKeyTokens2;
        SelectedFocusTrailingIconColor = colorSchemeKeyTokens2;
        SelectedHoverTrailingIconColor = colorSchemeKeyTokens2;
        SelectedPressedTrailingIconColor = colorSchemeKeyTokens2;
        SelectedTrailingIconColor = colorSchemeKeyTokens2;
        TrailingIconSize = C1232Dp.m38468constructorimpl(f);
        UnselectedDraggedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedFocusTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedHoverTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedTrailingIconColor = colorSchemeKeyTokens3;
    }

    private InputChipTokens() {
    }

    public final ShapeKeyTokens getAvatarShape() {
        return AvatarShape;
    }

    /* renamed from: getAvatarSize-D9Ej5fM  reason: not valid java name */
    public final float m34998getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34999getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m35000getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return DisabledSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return DisabledUnselectedOutlineColor;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35001getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m35002getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedLabelTextColor() {
        return SelectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedLeadingIconColor() {
        return SelectedDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedTrailingIconColor() {
        return SelectedDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusLabelTextColor() {
        return SelectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusLeadingIconColor() {
        return SelectedFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusTrailingIconColor() {
        return SelectedFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverLabelTextColor() {
        return SelectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverLeadingIconColor() {
        return SelectedHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverTrailingIconColor() {
        return SelectedHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedLabelTextColor() {
        return SelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedLeadingIconColor() {
        return SelectedLeadingIconColor;
    }

    /* renamed from: getSelectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m35003getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLeadingIconColor() {
        return SelectedPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedTrailingIconColor() {
        return SelectedPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedTrailingIconColor() {
        return SelectedTrailingIconColor;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m35004getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return UnselectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLeadingIconColor() {
        return UnselectedDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedTrailingIconColor() {
        return UnselectedDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return UnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLeadingIconColor() {
        return UnselectedFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusTrailingIconColor() {
        return UnselectedFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return UnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLeadingIconColor() {
        return UnselectedHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverTrailingIconColor() {
        return UnselectedHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return UnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLeadingIconColor() {
        return UnselectedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m35005getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLeadingIconColor() {
        return UnselectedPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedTrailingIconColor() {
        return UnselectedPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedTrailingIconColor() {
        return UnselectedTrailingIconColor;
    }
}
