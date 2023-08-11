package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.DrawTransform;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDrawStyleKt;
import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,405:1\n261#2,11:406\n261#2,11:417\n261#2,8:428\n269#2,3:439\n261#2,11:442\n652#3:436\n658#3:437\n646#3:438\n159#4:453\n159#4:454\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n171#1:406,11\n237#1:417,11\n281#1:428,8\n281#1:439,3\n344#1:442,11\n288#1:436\n301#1:437\n301#1:438\n382#1:453\n394#1:454\n*E\n"})
/* renamed from: androidx.compose.ui.text.TextPainterKt */
/* compiled from: TextPainter.kt */
public final class TextPainterKt {
    private static final int DefaultTextBlendMode = BlendMode.Companion.m35604getSrcOver0nO6VwU();

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m38390equalsimpl0(textLayoutResult.getLayoutInput().m37944getOverflowgIe3tQ8(), TextOverflow.Companion.m38399getVisiblegIe3tQ8())) {
            DrawTransform.m36325clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, (float) IntSize.m38628getWidthimpl(textLayoutResult.m37948getSizeYbymL2g()), (float) IntSize.m38627getHeightimpl(textLayoutResult.m37948getSizeYbymL2g()), 0, 16, (Object) null);
        }
    }

    @ExperimentalTextApi
    /* renamed from: drawText-JFhB2K4  reason: not valid java name */
    public static final void m37954drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j2, int i3) {
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope2, "$this$drawText");
        C12775o.m28639i(textMeasurer, "textMeasurer");
        C12775o.m28639i(annotatedString, "text");
        C12775o.m28639i(textStyle, "style");
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        C12775o.m28639i(list2, "placeholders");
        TextMeasurer textMeasurer2 = textMeasurer;
        AnnotatedString annotatedString2 = annotatedString;
        TextStyle textStyle2 = textStyle;
        int i4 = i;
        boolean z2 = z;
        int i5 = i2;
        TextLayoutResult r0 = TextMeasurer.m37951measurexDpz5zY$default(textMeasurer2, annotatedString2, textStyle2, i4, z2, i5, list2, m37962textLayoutConstraintsv_w8tDc(drawScope2, j2, j), drawScope.getLayoutDirection(), drawScope, (FontFamily.Resolver) null, false, 1536, (Object) null);
        DrawContext drawContext = drawScope.getDrawContext();
        long r2 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        clip(transform, r0);
        MultiParagraph.m37857paintLG529CI$default(r0.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0, (Shadow) null, (TextDecoration) null, (DrawStyle) null, i3, 30, (Object) null);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r2);
    }

    /* renamed from: drawText-JFhB2K4$default  reason: not valid java name */
    public static /* synthetic */ void m37955drawTextJFhB2K4$default(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List list, long j2, int i3, int i4, Object obj) {
        long j3;
        TextStyle textStyle2;
        int i5;
        boolean z2;
        int i6;
        List list2;
        long j4;
        int i7;
        int i8 = i4;
        if ((i8 & 4) != 0) {
            j3 = Offset.Companion.m35438getZeroF1C5BW0();
        } else {
            j3 = j;
        }
        if ((i8 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i8 & 16) != 0) {
            i5 = TextOverflow.Companion.m38397getClipgIe3tQ8();
        } else {
            i5 = i;
        }
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 128) != 0) {
            list2 = C12726w.m28524k();
        } else {
            list2 = list;
        }
        if ((i8 & 256) != 0) {
            j4 = Size.Companion.m35499getUnspecifiedNHjbRc();
        } else {
            j4 = j2;
        }
        if ((i8 & 512) != 0) {
            i7 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i3;
        }
        m37954drawTextJFhB2K4(drawScope, textMeasurer, annotatedString, j3, textStyle2, i5, z2, i6, list2, j4, i7);
    }

    @ExperimentalTextApi
    /* renamed from: drawText-LVfH_YU  reason: not valid java name */
    public static final void m37956drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        float f2;
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope, "$this$drawText");
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        Brush brush2 = brush;
        C12775o.m28639i(brush, "brush");
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long r10 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        clip(transform, textLayoutResult);
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        if (!Float.isNaN(f)) {
            f2 = f;
        } else {
            f2 = textLayoutResult.getLayoutInput().getStyle().getAlpha();
        }
        multiParagraph.m37864painthn5TExg(canvas, brush, f2, shadow2, textDecoration2, drawStyle2, i);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r10);
    }

    /* renamed from: drawText-LVfH_YU$default  reason: not valid java name */
    public static /* synthetic */ void m37957drawTextLVfH_YU$default(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j2;
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i3;
        int i4 = i2;
        if ((i4 & 4) != 0) {
            j2 = Offset.Companion.m35438getZeroF1C5BW0();
        } else {
            j2 = j;
        }
        if ((i4 & 8) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i4 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i4 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i4 & 64) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i4 & 128) != 0) {
            i3 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        m37956drawTextLVfH_YU(drawScope, textLayoutResult, brush, j2, f2, shadow2, textDecoration2, drawStyle2, i3);
    }

    @ExperimentalTextApi
    /* renamed from: drawText-TPWCCtM  reason: not valid java name */
    public static final void m37958drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3) {
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope2, "$this$drawText");
        C12775o.m28639i(textMeasurer, "textMeasurer");
        String str2 = str;
        C12775o.m28639i(str2, "text");
        C12775o.m28639i(textStyle, "style");
        TextLayoutResult r0 = TextMeasurer.m37951measurexDpz5zY$default(textMeasurer, new AnnotatedString(str2, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i, z, i2, (List) null, m37962textLayoutConstraintsv_w8tDc(drawScope2, j2, j), drawScope.getLayoutDirection(), drawScope, (FontFamily.Resolver) null, false, 1568, (Object) null);
        DrawContext drawContext = drawScope.getDrawContext();
        long r2 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        clip(transform, r0);
        MultiParagraph.m37857paintLG529CI$default(r0.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0, (Shadow) null, (TextDecoration) null, (DrawStyle) null, i3, 30, (Object) null);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r2);
    }

    /* renamed from: drawText-TPWCCtM$default  reason: not valid java name */
    public static /* synthetic */ void m37959drawTextTPWCCtM$default(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3, int i4, Object obj) {
        long j3;
        TextStyle textStyle2;
        int i5;
        boolean z2;
        int i6;
        long j4;
        int i7;
        int i8 = i4;
        if ((i8 & 4) != 0) {
            j3 = Offset.Companion.m35438getZeroF1C5BW0();
        } else {
            j3 = j;
        }
        if ((i8 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i8 & 16) != 0) {
            i5 = TextOverflow.Companion.m38397getClipgIe3tQ8();
        } else {
            i5 = i;
        }
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 128) != 0) {
            j4 = Size.Companion.m35499getUnspecifiedNHjbRc();
        } else {
            j4 = j2;
        }
        if ((i8 & 256) != 0) {
            i7 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i3;
        }
        m37958drawTextTPWCCtM(drawScope, textMeasurer, str, j3, textStyle2, i5, z2, i6, j4, i7);
    }

    @ExperimentalTextApi
    /* renamed from: drawText-d8-rzKo  reason: not valid java name */
    public static final void m37960drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        long j3;
        boolean z;
        float f2;
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope, "$this$drawText");
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long r6 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2));
        clip(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        boolean z2 = true;
        if (brush != null) {
            if (j == Color.Companion.m35707getUnspecified0d7_KjU()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (!Float.isNaN(f)) {
                    f2 = f;
                } else {
                    f2 = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                }
                multiParagraph.m37864painthn5TExg(canvas, brush, f2, shadow2, textDecoration2, drawStyle2, i);
                drawContext.getCanvas().restore();
                drawContext.m36218setSizeuvyYCjk(r6);
            }
        }
        MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        if (j == Color.Companion.m35707getUnspecified0d7_KjU()) {
            z2 = false;
        }
        if (z2) {
            j3 = j;
        } else {
            j3 = textLayoutResult.getLayoutInput().getStyle().m37995getColor0d7_KjU();
        }
        multiParagraph2.m37862paintLG529CI(canvas2, TextDrawStyleKt.m38366modulateDxMtmZc(j3, f), shadow2, textDecoration2, drawStyle2, i);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r6);
    }

    /* renamed from: drawText-d8-rzKo$default  reason: not valid java name */
    public static /* synthetic */ void m37961drawTextd8rzKo$default(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i3;
        int i4 = i2;
        if ((i4 & 2) != 0) {
            j3 = Color.Companion.m35707getUnspecified0d7_KjU();
        } else {
            j3 = j;
        }
        if ((i4 & 4) != 0) {
            j4 = Offset.Companion.m35438getZeroF1C5BW0();
        } else {
            j4 = j2;
        }
        if ((i4 & 8) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        DrawStyle drawStyle2 = null;
        if ((i4 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i4 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i4 & 64) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i4 & 128) != 0) {
            i3 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        m37960drawTextd8rzKo(drawScope, textLayoutResult, j3, j4, f2, shadow2, textDecoration2, drawStyle2, i3);
    }

    public static final int getDefaultTextBlendMode() {
        return DefaultTextBlendMode;
    }

    /* renamed from: textLayoutConstraints-v_w8tDc  reason: not valid java name */
    private static final long m37962textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j, long j2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3;
        Size.Companion companion = Size.Companion;
        boolean z4 = true;
        int i4 = 0;
        if (j == companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z || Float.isNaN(Size.m35491getWidthimpl(j))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i = C13265c.m30134c((float) Math.ceil((double) (Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()) - Offset.m35422getXimpl(j2))));
            i2 = 0;
        } else {
            i2 = C13265c.m30134c((float) Math.ceil((double) Size.m35491getWidthimpl(j)));
            i = i2;
        }
        if (j == companion.m35499getUnspecifiedNHjbRc()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !Float.isNaN(Size.m35488getHeightimpl(j))) {
            z4 = false;
        }
        if (z4) {
            i3 = C13265c.m30134c((float) Math.ceil((double) (Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc()) - Offset.m35423getYimpl(j2))));
        } else {
            i4 = C13265c.m30134c((float) Math.ceil((double) Size.m35488getHeightimpl(j)));
            i3 = i4;
        }
        return ConstraintsKt.Constraints(i2, i, i4, i3);
    }
}
