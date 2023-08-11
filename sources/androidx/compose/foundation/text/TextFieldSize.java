package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSize.kt */
final class TextFieldSize {
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection layoutDirection;
    private long minSize = m33729computeMinSizeYbymL2g();
    private TextStyle resolvedStyle;
    private Object typeface;

    public TextFieldSize(LayoutDirection layoutDirection2, Density density2, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        C12775o.m28639i(density2, "density");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        C12775o.m28639i(textStyle, "resolvedStyle");
        C12775o.m28639i(obj, "typeface");
        this.layoutDirection = layoutDirection2;
        this.density = density2;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    /* renamed from: computeMinSize-YbymL2g  reason: not valid java name */
    private final long m33729computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, this.fontFamilyResolver, (String) null, 0, 24, (Object) null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getMinSize-YbymL2g  reason: not valid java name */
    public final long m33730getMinSizeYbymL2g() {
        return this.minSize;
    }

    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    public final Object getTypeface() {
        return this.typeface;
    }

    public final void setDensity(Density density2) {
        C12775o.m28639i(density2, "<set-?>");
        this.density = density2;
    }

    public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
        C12775o.m28639i(resolver, "<set-?>");
        this.fontFamilyResolver = resolver;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection2) {
        C12775o.m28639i(layoutDirection2, "<set-?>");
        this.layoutDirection = layoutDirection2;
    }

    public final void setResolvedStyle(TextStyle textStyle) {
        C12775o.m28639i(textStyle, "<set-?>");
        this.resolvedStyle = textStyle;
    }

    public final void setTypeface(Object obj) {
        C12775o.m28639i(obj, "<set-?>");
        this.typeface = obj;
    }

    public final void update(LayoutDirection layoutDirection2, Density density2, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        C12775o.m28639i(density2, "density");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        C12775o.m28639i(textStyle, "resolvedStyle");
        C12775o.m28639i(obj, "typeface");
        if (layoutDirection2 != this.layoutDirection || !C12775o.m28634d(density2, this.density) || !C12775o.m28634d(resolver, this.fontFamilyResolver) || !C12775o.m28634d(textStyle, this.resolvedStyle) || !C12775o.m28634d(obj, this.typeface)) {
            this.layoutDirection = layoutDirection2;
            this.density = density2;
            this.fontFamilyResolver = resolver;
            this.resolvedStyle = textStyle;
            this.typeface = obj;
            this.minSize = m33729computeMinSizeYbymL2g();
        }
    }
}
