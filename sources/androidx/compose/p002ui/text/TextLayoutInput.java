package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.TextLayoutInput */
/* compiled from: TextLayoutResult.kt */
public final class TextLayoutInput {
    public static final int $stable = 8;
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density2, LayoutDirection layoutDirection2, Font.ResourceLoader resourceLoader, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i, z, i2, density2, layoutDirection2, resourceLoader, j);
    }

    /* renamed from: copy-hu-1Yfo$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m37941copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density2, LayoutDirection layoutDirection2, Font.ResourceLoader resourceLoader, long j, int i3, Object obj) {
        AnnotatedString annotatedString2;
        TextStyle textStyle2;
        List list2;
        int i4;
        boolean z2;
        int i5;
        Density density3;
        LayoutDirection layoutDirection3;
        Font.ResourceLoader resourceLoader2;
        long j2;
        TextLayoutInput textLayoutInput2 = textLayoutInput;
        int i6 = i3;
        if ((i6 & 1) != 0) {
            annotatedString2 = textLayoutInput2.text;
        } else {
            annotatedString2 = annotatedString;
        }
        if ((i6 & 2) != 0) {
            textStyle2 = textLayoutInput2.style;
        } else {
            textStyle2 = textStyle;
        }
        if ((i6 & 4) != 0) {
            list2 = textLayoutInput2.placeholders;
        } else {
            list2 = list;
        }
        if ((i6 & 8) != 0) {
            i4 = textLayoutInput2.maxLines;
        } else {
            i4 = i;
        }
        if ((i6 & 16) != 0) {
            z2 = textLayoutInput2.softWrap;
        } else {
            z2 = z;
        }
        if ((i6 & 32) != 0) {
            i5 = textLayoutInput2.overflow;
        } else {
            i5 = i2;
        }
        if ((i6 & 64) != 0) {
            density3 = textLayoutInput2.density;
        } else {
            density3 = density2;
        }
        if ((i6 & 128) != 0) {
            layoutDirection3 = textLayoutInput2.layoutDirection;
        } else {
            layoutDirection3 = layoutDirection2;
        }
        if ((i6 & 256) != 0) {
            resourceLoader2 = textLayoutInput.getResourceLoader();
        } else {
            resourceLoader2 = resourceLoader;
        }
        if ((i6 & 512) != 0) {
            j2 = textLayoutInput2.constraints;
        } else {
            j2 = j;
        }
        return textLayoutInput.m37942copyhu1Yfo(annotatedString2, textStyle2, list2, i4, z2, i5, density3, layoutDirection3, resourceLoader2, j2);
    }

    /* renamed from: copy-hu-1Yfo  reason: not valid java name */
    public final TextLayoutInput m37942copyhu1Yfo(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density2, LayoutDirection layoutDirection2, Font.ResourceLoader resourceLoader, long j) {
        AnnotatedString annotatedString2 = annotatedString;
        C12775o.m28639i(annotatedString2, "text");
        TextStyle textStyle2 = textStyle;
        C12775o.m28639i(textStyle2, "style");
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        C12775o.m28639i(list2, "placeholders");
        Density density3 = density2;
        C12775o.m28639i(density3, "density");
        LayoutDirection layoutDirection3 = layoutDirection2;
        C12775o.m28639i(layoutDirection3, "layoutDirection");
        Font.ResourceLoader resourceLoader2 = resourceLoader;
        C12775o.m28639i(resourceLoader2, "resourceLoader");
        return new TextLayoutInput(annotatedString2, textStyle2, list2, i, z, i2, density3, layoutDirection3, resourceLoader2, this.fontFamilyResolver, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        if (C12775o.m28634d(this.text, textLayoutInput.text) && C12775o.m28634d(this.style, textLayoutInput.style) && C12775o.m28634d(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m38390equalsimpl0(this.overflow, textLayoutInput.overflow) && C12775o.m28634d(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && C12775o.m28634d(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m38405equalsimpl0(this.constraints, textLayoutInput.constraints)) {
            return true;
        }
        return false;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m37943getConstraintsmsEJaDk() {
        return this.constraints;
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

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8  reason: not valid java name */
    public final int m37944getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        if (resourceLoader == null) {
            return DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver);
        }
        return resourceLoader;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + TextOverflow.m38391hashCodeimpl(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m38415hashCodeimpl(this.constraints);
    }

    public String toString() {
        return "TextLayoutInput(text=" + this.text + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + TextOverflow.m38392toStringimpl(this.overflow) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + Constraints.m38417toStringimpl(this.constraints) + ')';
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density2, LayoutDirection layoutDirection2, FontFamily.Resolver resolver, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i, z, i2, density2, layoutDirection2, resolver, j);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density2, LayoutDirection layoutDirection2, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i;
        this.softWrap = z;
        this.overflow = i2;
        this.density = density2;
        this.layoutDirection = layoutDirection2;
        this.fontFamilyResolver = resolver;
        this.constraints = j;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density2, LayoutDirection layoutDirection2, Font.ResourceLoader resourceLoader, long j) {
        this(annotatedString, textStyle, list, i, z, i2, density2, layoutDirection2, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j);
    }

    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density2, LayoutDirection layoutDirection2, FontFamily.Resolver resolver, long j) {
        this(annotatedString, textStyle, list, i, z, i2, density2, layoutDirection2, (Font.ResourceLoader) null, resolver, j);
    }
}
