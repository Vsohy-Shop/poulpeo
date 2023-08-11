package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: ListTokens.kt */
public final class ListTokens {
    public static final ListTokens INSTANCE = new ListTokens();
    private static final ColorSchemeKeyTokens ListItemContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ListItemContainerElevation;
    private static final float ListItemContainerHeight;
    private static final ShapeKeyTokens ListItemContainerShape;
    private static final ColorSchemeKeyTokens ListItemDisabledLabelTextColor;
    public static final float ListItemDisabledLabelTextOpacity = 0.3f;
    private static final ColorSchemeKeyTokens ListItemDisabledLeadingIconColor;
    public static final float ListItemDisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens ListItemDisabledTrailingIconColor;
    public static final float ListItemDisabledTrailingIconOpacity = 0.38f;
    private static final float ListItemDraggedContainerElevation;
    private static final ColorSchemeKeyTokens ListItemDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemLabelTextColor;
    private static final TypographyKeyTokens ListItemLabelTextFont = TypographyKeyTokens.BodyLarge;
    private static final float ListItemLargeLeadingVideoHeight = C1232Dp.m38468constructorimpl((float) 69.0d);
    private static final ColorSchemeKeyTokens ListItemLeadingAvatarColor = ColorSchemeKeyTokens.PrimaryContainer;
    private static final ColorSchemeKeyTokens ListItemLeadingAvatarLabelColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    private static final TypographyKeyTokens ListItemLeadingAvatarLabelFont = TypographyKeyTokens.TitleMedium;
    private static final ShapeKeyTokens ListItemLeadingAvatarShape = ShapeKeyTokens.CornerFull;
    private static final float ListItemLeadingAvatarSize = C1232Dp.m38468constructorimpl((float) 40.0d);
    private static final ColorSchemeKeyTokens ListItemLeadingIconColor;
    private static final float ListItemLeadingIconSize = C1232Dp.m38468constructorimpl((float) 18.0d);
    private static final float ListItemLeadingImageHeight;
    private static final ShapeKeyTokens ListItemLeadingImageShape;
    private static final float ListItemLeadingImageWidth;
    private static final ShapeKeyTokens ListItemLeadingVideoShape;
    private static final float ListItemLeadingVideoWidth = C1232Dp.m38468constructorimpl((float) 100.0d);
    private static final ColorSchemeKeyTokens ListItemOverlineColor;
    private static final TypographyKeyTokens ListItemOverlineFont;
    private static final ColorSchemeKeyTokens ListItemPressedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemSelectedTrailingIconColor = ColorSchemeKeyTokens.Primary;
    private static final float ListItemSmallLeadingVideoHeight;
    private static final ColorSchemeKeyTokens ListItemSupportingTextColor;
    private static final TypographyKeyTokens ListItemSupportingTextFont = TypographyKeyTokens.BodyMedium;
    private static final ColorSchemeKeyTokens ListItemTrailingIconColor;
    private static final float ListItemTrailingIconSize = C1232Dp.m38468constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens ListItemTrailingSupportingTextColor;
    private static final TypographyKeyTokens ListItemTrailingSupportingTextFont;
    private static final ColorSchemeKeyTokens ListItemUnselectedTrailingIconColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ListItemContainerElevation = elevationTokens.m34877getLevel0D9Ej5fM();
        float f = (float) 56.0d;
        ListItemContainerHeight = C1232Dp.m38468constructorimpl(f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ListItemContainerShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ListItemDisabledLabelTextColor = colorSchemeKeyTokens;
        ListItemDisabledLeadingIconColor = colorSchemeKeyTokens;
        ListItemDisabledTrailingIconColor = colorSchemeKeyTokens;
        ListItemDraggedContainerElevation = elevationTokens.m34881getLevel4D9Ej5fM();
        ListItemDraggedLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ListItemDraggedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemDraggedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemFocusLabelTextColor = colorSchemeKeyTokens;
        ListItemFocusLeadingIconColor = colorSchemeKeyTokens2;
        ListItemFocusTrailingIconColor = colorSchemeKeyTokens2;
        ListItemHoverLabelTextColor = colorSchemeKeyTokens;
        ListItemHoverLeadingIconColor = colorSchemeKeyTokens2;
        ListItemHoverTrailingIconColor = colorSchemeKeyTokens2;
        ListItemLabelTextColor = colorSchemeKeyTokens;
        ListItemLeadingIconColor = colorSchemeKeyTokens2;
        ListItemLeadingImageHeight = C1232Dp.m38468constructorimpl(f);
        ListItemLeadingImageShape = shapeKeyTokens;
        ListItemLeadingImageWidth = C1232Dp.m38468constructorimpl(f);
        ListItemLeadingVideoShape = shapeKeyTokens;
        ListItemOverlineColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelSmall;
        ListItemOverlineFont = typographyKeyTokens;
        ListItemPressedLabelTextColor = colorSchemeKeyTokens;
        ListItemPressedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemPressedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemSmallLeadingVideoHeight = C1232Dp.m38468constructorimpl(f);
        ListItemSupportingTextColor = colorSchemeKeyTokens2;
        ListItemTrailingIconColor = colorSchemeKeyTokens2;
        ListItemTrailingSupportingTextColor = colorSchemeKeyTokens2;
        ListItemTrailingSupportingTextFont = typographyKeyTokens;
        ListItemUnselectedTrailingIconColor = colorSchemeKeyTokens;
    }

    private ListTokens() {
    }

    public final ColorSchemeKeyTokens getListItemContainerColor() {
        return ListItemContainerColor;
    }

    /* renamed from: getListItemContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35008getListItemContainerElevationD9Ej5fM() {
        return ListItemContainerElevation;
    }

    /* renamed from: getListItemContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m35009getListItemContainerHeightD9Ej5fM() {
        return ListItemContainerHeight;
    }

    public final ShapeKeyTokens getListItemContainerShape() {
        return ListItemContainerShape;
    }

    public final ColorSchemeKeyTokens getListItemDisabledLabelTextColor() {
        return ListItemDisabledLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemDisabledLeadingIconColor() {
        return ListItemDisabledLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemDisabledTrailingIconColor() {
        return ListItemDisabledTrailingIconColor;
    }

    /* renamed from: getListItemDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m35010getListItemDraggedContainerElevationD9Ej5fM() {
        return ListItemDraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getListItemDraggedLabelTextColor() {
        return ListItemDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemDraggedLeadingIconColor() {
        return ListItemDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemDraggedTrailingIconColor() {
        return ListItemDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusLabelTextColor() {
        return ListItemFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusLeadingIconColor() {
        return ListItemFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusTrailingIconColor() {
        return ListItemFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverLabelTextColor() {
        return ListItemHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverLeadingIconColor() {
        return ListItemHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverTrailingIconColor() {
        return ListItemHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemLabelTextColor() {
        return ListItemLabelTextColor;
    }

    public final TypographyKeyTokens getListItemLabelTextFont() {
        return ListItemLabelTextFont;
    }

    /* renamed from: getListItemLargeLeadingVideoHeight-D9Ej5fM  reason: not valid java name */
    public final float m35011getListItemLargeLeadingVideoHeightD9Ej5fM() {
        return ListItemLargeLeadingVideoHeight;
    }

    public final ColorSchemeKeyTokens getListItemLeadingAvatarColor() {
        return ListItemLeadingAvatarColor;
    }

    public final ColorSchemeKeyTokens getListItemLeadingAvatarLabelColor() {
        return ListItemLeadingAvatarLabelColor;
    }

    public final TypographyKeyTokens getListItemLeadingAvatarLabelFont() {
        return ListItemLeadingAvatarLabelFont;
    }

    public final ShapeKeyTokens getListItemLeadingAvatarShape() {
        return ListItemLeadingAvatarShape;
    }

    /* renamed from: getListItemLeadingAvatarSize-D9Ej5fM  reason: not valid java name */
    public final float m35012getListItemLeadingAvatarSizeD9Ej5fM() {
        return ListItemLeadingAvatarSize;
    }

    public final ColorSchemeKeyTokens getListItemLeadingIconColor() {
        return ListItemLeadingIconColor;
    }

    /* renamed from: getListItemLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m35013getListItemLeadingIconSizeD9Ej5fM() {
        return ListItemLeadingIconSize;
    }

    /* renamed from: getListItemLeadingImageHeight-D9Ej5fM  reason: not valid java name */
    public final float m35014getListItemLeadingImageHeightD9Ej5fM() {
        return ListItemLeadingImageHeight;
    }

    public final ShapeKeyTokens getListItemLeadingImageShape() {
        return ListItemLeadingImageShape;
    }

    /* renamed from: getListItemLeadingImageWidth-D9Ej5fM  reason: not valid java name */
    public final float m35015getListItemLeadingImageWidthD9Ej5fM() {
        return ListItemLeadingImageWidth;
    }

    public final ShapeKeyTokens getListItemLeadingVideoShape() {
        return ListItemLeadingVideoShape;
    }

    /* renamed from: getListItemLeadingVideoWidth-D9Ej5fM  reason: not valid java name */
    public final float m35016getListItemLeadingVideoWidthD9Ej5fM() {
        return ListItemLeadingVideoWidth;
    }

    public final ColorSchemeKeyTokens getListItemOverlineColor() {
        return ListItemOverlineColor;
    }

    public final TypographyKeyTokens getListItemOverlineFont() {
        return ListItemOverlineFont;
    }

    public final ColorSchemeKeyTokens getListItemPressedLabelTextColor() {
        return ListItemPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemPressedLeadingIconColor() {
        return ListItemPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemPressedTrailingIconColor() {
        return ListItemPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedTrailingIconColor() {
        return ListItemSelectedTrailingIconColor;
    }

    /* renamed from: getListItemSmallLeadingVideoHeight-D9Ej5fM  reason: not valid java name */
    public final float m35017getListItemSmallLeadingVideoHeightD9Ej5fM() {
        return ListItemSmallLeadingVideoHeight;
    }

    public final ColorSchemeKeyTokens getListItemSupportingTextColor() {
        return ListItemSupportingTextColor;
    }

    public final TypographyKeyTokens getListItemSupportingTextFont() {
        return ListItemSupportingTextFont;
    }

    public final ColorSchemeKeyTokens getListItemTrailingIconColor() {
        return ListItemTrailingIconColor;
    }

    /* renamed from: getListItemTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m35018getListItemTrailingIconSizeD9Ej5fM() {
        return ListItemTrailingIconSize;
    }

    public final ColorSchemeKeyTokens getListItemTrailingSupportingTextColor() {
        return ListItemTrailingSupportingTextColor;
    }

    public final TypographyKeyTokens getListItemTrailingSupportingTextFont() {
        return ListItemTrailingSupportingTextFont;
    }

    public final ColorSchemeKeyTokens getListItemUnselectedTrailingIconColor() {
        return ListItemUnselectedTrailingIconColor;
    }
}
