package androidx.compose.foundation.text;

import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.MultiParagraph;
import androidx.compose.p002ui.text.MultiParagraphIntrinsics;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.TextLayoutInput;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextPainter;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.TextStyleKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Stable
@InternalFoundationTextApi
/* compiled from: TextDelegate.kt */
public final class TextDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    /* compiled from: TextDelegate.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            C12775o.m28639i(canvas, "canvas");
            C12775o.m28639i(textLayoutResult, "textLayoutResult");
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density2, FontFamily.Resolver resolver, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i, i2, z, i3, density2, resolver, list);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: layout-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m33706layoutNN6EwU$default(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
        if ((i & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m33709layoutNN6EwU(j, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA  reason: not valid java name */
    private final MultiParagraph m33707layoutTextK40F9xA(long j, LayoutDirection layoutDirection) {
        boolean z;
        int i;
        layoutIntrinsics(layoutDirection);
        int r13 = Constraints.m38414getMinWidthimpl(j);
        boolean z2 = false;
        int i2 = 1;
        if (this.softWrap || TextOverflow.m38390equalsimpl0(this.overflow, TextOverflow.Companion.m38398getEllipsisgIe3tQ8())) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !Constraints.m38408getHasBoundedWidthimpl(j)) {
            i = Integer.MAX_VALUE;
        } else {
            i = Constraints.m38412getMaxWidthimpl(j);
        }
        if (!this.softWrap && TextOverflow.m38390equalsimpl0(this.overflow, TextOverflow.Companion.m38398getEllipsisgIe3tQ8())) {
            z2 = true;
        }
        if (!z2) {
            i2 = this.maxLines;
        }
        int i3 = i2;
        if (r13 != i) {
            i = C13537l.m30886m(getMaxIntrinsicWidth(), r13, i);
        }
        return new MultiParagraph(getNonNullIntrinsics(), ConstraintsKt.Constraints$default(0, i, 0, Constraints.m38411getMaxHeightimpl(j), 5, (Object) null), i3, TextOverflow.m38390equalsimpl0(this.overflow, TextOverflow.Companion.m38398getEllipsisgIe3tQ8()), (DefaultConstructorMarker) null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8  reason: not valid java name */
    public final int m33708getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
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

    /* renamed from: layout-NN6Ew-U  reason: not valid java name */
    public final TextLayoutResult m33709layoutNN6EwU(long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        long j2 = j;
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (textLayoutResult2 != null) {
            if (TextLayoutHelperKt.m33736canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j)) {
                TextLayoutInput textLayoutInput = r1;
                TextLayoutInput textLayoutInput2 = new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, (List) textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m37944getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j, (DefaultConstructorMarker) null);
                return textLayoutResult.m37946copyO0kMr_c(textLayoutInput, ConstraintsKt.m38423constrain4WqzIAM(j2, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()))));
            }
        }
        MultiParagraph r0 = m33707layoutTextK40F9xA(j, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, (List) this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j, (DefaultConstructorMarker) null), r0, ConstraintsKt.m38423constrain4WqzIAM(j2, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(r0.getWidth()), TextDelegateKt.ceilToIntPx(r0.getHeight()))), (DefaultConstructorMarker) null);
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density2, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i;
        this.minLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = density2;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        boolean z2 = true;
        if (i > 0) {
            if (i2 > 0) {
                if (!(i2 > i ? false : z2)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextDelegate(androidx.compose.p002ui.text.AnnotatedString r14, androidx.compose.p002ui.text.TextStyle r15, int r16, int r17, boolean r18, int r19, androidx.compose.p002ui.unit.Density r20, androidx.compose.p002ui.text.font.FontFamily.Resolver r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000b
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto L_0x000d
        L_0x000b:
            r5 = r16
        L_0x000d:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L_0x0014
            r6 = r2
            goto L_0x0016
        L_0x0014:
            r6 = r17
        L_0x0016:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001c
            r7 = r2
            goto L_0x001e
        L_0x001c:
            r7 = r18
        L_0x001e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002a
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.p002ui.text.style.TextOverflow.Companion
            int r1 = r1.m38397getClipgIe3tQ8()
            r8 = r1
            goto L_0x002c
        L_0x002a:
            r8 = r19
        L_0x002c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = kotlin.collections.C12726w.m28524k()
            r11 = r0
            goto L_0x0038
        L_0x0036:
            r11 = r22
        L_0x0038:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextDelegate.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, int, int, boolean, int, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
