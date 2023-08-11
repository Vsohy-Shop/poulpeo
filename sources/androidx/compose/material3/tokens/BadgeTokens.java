package androidx.compose.material3.tokens;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: BadgeTokens.kt */
public final class BadgeTokens {
    private static final ColorSchemeKeyTokens Color;
    public static final BadgeTokens INSTANCE = new BadgeTokens();
    private static final ColorSchemeKeyTokens LargeColor;
    private static final ColorSchemeKeyTokens LargeLabelTextColor = ColorSchemeKeyTokens.OnError;
    private static final TypographyKeyTokens LargeLabelTextFont = TypographyKeyTokens.LabelSmall;
    private static final ShapeKeyTokens LargeShape;
    private static final float LargeSize = C1232Dp.m38468constructorimpl((float) 16.0d);
    private static final ShapeKeyTokens Shape;
    private static final float Size = C1232Dp.m38468constructorimpl((float) 6.0d);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Error;
        Color = colorSchemeKeyTokens;
        LargeColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        LargeShape = shapeKeyTokens;
        Shape = shapeKeyTokens;
    }

    private BadgeTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    public final ColorSchemeKeyTokens getLargeColor() {
        return LargeColor;
    }

    public final ColorSchemeKeyTokens getLargeLabelTextColor() {
        return LargeLabelTextColor;
    }

    public final TypographyKeyTokens getLargeLabelTextFont() {
        return LargeLabelTextFont;
    }

    public final ShapeKeyTokens getLargeShape() {
        return LargeShape;
    }

    /* renamed from: getLargeSize-D9Ej5fM  reason: not valid java name */
    public final float m34776getLargeSizeD9Ej5fM() {
        return LargeSize;
    }

    public final ShapeKeyTokens getShape() {
        return Shape;
    }

    /* renamed from: getSize-D9Ej5fM  reason: not valid java name */
    public final float m34777getSizeD9Ej5fM() {
        return Size;
    }
}
