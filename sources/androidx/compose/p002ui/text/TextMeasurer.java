package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@ExperimentalTextApi
/* renamed from: androidx.compose.ui.text.TextMeasurer */
/* compiled from: TextMeasurer.kt */
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int cacheSize;
    private final Density fallbackDensity;
    private final FontFamily.Resolver fallbackFontFamilyResolver;
    private final LayoutDirection fallbackLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    /* renamed from: androidx.compose.ui.text.TextMeasurer$Companion */
    /* compiled from: TextMeasurer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            boolean z;
            int i;
            int i2;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int r0 = Constraints.m38414getMinWidthimpl(textLayoutInput.m37943getConstraintsmsEJaDk());
            boolean z2 = false;
            if (textLayoutInput.getSoftWrap() || TextOverflow.m38390equalsimpl0(textLayoutInput.m37944getOverflowgIe3tQ8(), TextOverflow.Companion.m38398getEllipsisgIe3tQ8())) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !Constraints.m38408getHasBoundedWidthimpl(textLayoutInput.m37943getConstraintsmsEJaDk())) {
                i = Integer.MAX_VALUE;
            } else {
                i = Constraints.m38412getMaxWidthimpl(textLayoutInput.m37943getConstraintsmsEJaDk());
            }
            if (!textLayoutInput.getSoftWrap() && TextOverflow.m38390equalsimpl0(textLayoutInput.m37944getOverflowgIe3tQ8(), TextOverflow.Companion.m38398getEllipsisgIe3tQ8())) {
                z2 = true;
            }
            if (z2) {
                i2 = 1;
            } else {
                i2 = textLayoutInput.getMaxLines();
            }
            if (r0 != i) {
                i = C13537l.m30886m(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), r0, i);
            }
            MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, i, 0, Constraints.m38411getMaxHeightimpl(textLayoutInput.m37943getConstraintsmsEJaDk()), 5, (Object) null), i2, TextOverflow.m38390equalsimpl0(textLayoutInput.m37944getOverflowgIe3tQ8(), TextOverflow.Companion.m38398getEllipsisgIe3tQ8()), (DefaultConstructorMarker) null);
            return new TextLayoutResult(textLayoutInput, multiParagraph, ConstraintsKt.m38423constrain4WqzIAM(textLayoutInput.m37943getConstraintsmsEJaDk(), IntSizeKt.IntSize((int) ((float) Math.ceil((double) multiParagraph.getWidth())), (int) ((float) Math.ceil((double) multiParagraph.getHeight())))), (DefaultConstructorMarker) null);
        }
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i) {
        C12775o.m28639i(resolver, "fallbackFontFamilyResolver");
        C12775o.m28639i(density, "fallbackDensity");
        C12775o.m28639i(layoutDirection, "fallbackLayoutDirection");
        this.fallbackFontFamilyResolver = resolver;
        this.fallbackDensity = density;
        this.fallbackLayoutDirection = layoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new TextLayoutCache(i) : null;
    }

    /* renamed from: measure-wNUYSr0$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m37950measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        TextStyle textStyle2;
        int i4;
        boolean z3;
        int i5;
        long j2;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z4;
        TextMeasurer textMeasurer2 = textMeasurer;
        int i6 = i3;
        if ((i6 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i6 & 4) != 0) {
            i4 = TextOverflow.Companion.m38397getClipgIe3tQ8();
        } else {
            i4 = i;
        }
        if ((i6 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i6 & 16) != 0) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        if ((i6 & 32) != 0) {
            j2 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, (Object) null);
        } else {
            j2 = j;
        }
        if ((i6 & 64) != 0) {
            layoutDirection2 = textMeasurer2.fallbackLayoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i6 & 128) != 0) {
            density2 = textMeasurer2.fallbackDensity;
        } else {
            density2 = density;
        }
        if ((i6 & 256) != 0) {
            resolver2 = textMeasurer2.fallbackFontFamilyResolver;
        } else {
            resolver2 = resolver;
        }
        if ((i6 & 512) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return textMeasurer.m37952measurewNUYSr0(str, textStyle2, i4, z3, i5, j2, layoutDirection2, density2, resolver2, z4);
    }

    /* renamed from: measure-xDpz5zY$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m37951measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        TextStyle textStyle2;
        int i4;
        boolean z3;
        int i5;
        List list2;
        long j2;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z4;
        TextMeasurer textMeasurer2 = textMeasurer;
        int i6 = i3;
        if ((i6 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i6 & 4) != 0) {
            i4 = TextOverflow.Companion.m38397getClipgIe3tQ8();
        } else {
            i4 = i;
        }
        if ((i6 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i6 & 16) != 0) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        if ((i6 & 32) != 0) {
            list2 = C12726w.m28524k();
        } else {
            list2 = list;
        }
        if ((i6 & 64) != 0) {
            j2 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, (Object) null);
        } else {
            j2 = j;
        }
        if ((i6 & 128) != 0) {
            layoutDirection2 = textMeasurer2.fallbackLayoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i6 & 256) != 0) {
            density2 = textMeasurer2.fallbackDensity;
        } else {
            density2 = density;
        }
        if ((i6 & 512) != 0) {
            resolver2 = textMeasurer2.fallbackFontFamilyResolver;
        } else {
            resolver2 = resolver;
        }
        if ((i6 & 1024) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return textMeasurer.m37953measurexDpz5zY(annotatedString, textStyle2, i4, z3, i5, list2, j2, layoutDirection2, density2, resolver2, z4);
    }

    @Stable
    /* renamed from: measure-wNUYSr0  reason: not valid java name */
    public final TextLayoutResult m37952measurewNUYSr0(String str, TextStyle textStyle, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        String str2 = str;
        C12775o.m28639i(str2, "text");
        C12775o.m28639i(textStyle, "style");
        LayoutDirection layoutDirection2 = layoutDirection;
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        Density density2 = density;
        C12775o.m28639i(density2, "density");
        FontFamily.Resolver resolver2 = resolver;
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        return m37951measurexDpz5zY$default(this, new AnnotatedString(str2, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i, z, i2, (List) null, j, layoutDirection2, density2, resolver2, z2, 32, (Object) null);
    }

    @Stable
    /* renamed from: measure-xDpz5zY  reason: not valid java name */
    public final TextLayoutResult m37953measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        TextLayoutResult textLayoutResult;
        TextLayoutCache textLayoutCache2;
        AnnotatedString annotatedString2 = annotatedString;
        C12775o.m28639i(annotatedString2, "text");
        TextStyle textStyle2 = textStyle;
        C12775o.m28639i(textStyle2, "style");
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        C12775o.m28639i(list2, "placeholders");
        LayoutDirection layoutDirection2 = layoutDirection;
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        Density density2 = density;
        C12775o.m28639i(density2, "density");
        FontFamily.Resolver resolver2 = resolver;
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString2, textStyle2, (List) list2, i2, z, i, density2, layoutDirection2, resolver2, j, (DefaultConstructorMarker) null);
        if (z2 || (textLayoutCache2 = this.textLayoutCache) == null) {
            textLayoutResult = null;
        } else {
            textLayoutResult = textLayoutCache2.get(textLayoutInput);
        }
        if (textLayoutResult != null) {
            return textLayoutResult.m37946copyO0kMr_c(textLayoutInput, ConstraintsKt.m38423constrain4WqzIAM(j, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult access$layout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache3 = this.textLayoutCache;
        if (textLayoutCache3 != null) {
            textLayoutCache3.put(textLayoutInput, access$layout);
        }
        return access$layout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? TextMeasurerKt.DefaultCacheSize : i);
    }
}
