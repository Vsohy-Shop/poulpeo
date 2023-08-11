package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RectKt;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextForegroundStyle;
import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.TextPainter */
/* compiled from: TextPainter.kt */
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        boolean z;
        long j;
        float f;
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m38390equalsimpl0(textLayoutResult.getLayoutInput().m37944getOverflowgIe3tQ8(), TextOverflow.Companion.m38399getVisiblegIe3tQ8())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Rect r2 = RectKt.m35462Recttz77jQw(Offset.Companion.m35438getZeroF1C5BW0(), SizeKt.Size((float) IntSize.m38628getWidthimpl(textLayoutResult.m37948getSizeYbymL2g()), (float) IntSize.m38627getHeightimpl(textLayoutResult.m37948getSizeYbymL2g())));
            canvas.save();
            Canvas.m35634clipRectmtrdDE$default(canvas, r2, 0, 2, (Object) null);
        }
        SpanStyle spanStyle$ui_text_release = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        TextDecoration textDecoration = spanStyle$ui_text_release.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle$ui_text_release.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle$ui_text_release.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle$ui_text_release.getBrush();
            if (brush != null) {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    f = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().getAlpha();
                } else {
                    f = 1.0f;
                }
                MultiParagraph.m37859painthn5TExg$default(textLayoutResult.getMultiParagraph(), canvas, brush, f, shadow2, textDecoration2, drawStyle2, 0, 64, (Object) null);
            } else {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    j = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().m38367getColor0d7_KjU();
                } else {
                    j = Color.Companion.m35697getBlack0d7_KjU();
                }
                MultiParagraph.m37857paintLG529CI$default(textLayoutResult.getMultiParagraph(), canvas, j, shadow2, textDecoration2, drawStyle2, 0, 32, (Object) null);
            }
        } finally {
            if (z) {
                canvas.restore();
            }
        }
    }
}
