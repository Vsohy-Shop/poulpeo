package androidx.compose.p002ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.BrushKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ShaderBrush;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.MultiParagraph;
import androidx.compose.p002ui.text.ParagraphInfo;
import androidx.compose.p002ui.text.style.TextDecoration;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidMultiParagraphDraw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n33#2,6:98\n33#2,6:104\n33#2,6:110\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n*L\n55#1:98,6\n62#1:104,6\n93#1:110,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidMultiParagraphDrawKt */
/* compiled from: AndroidMultiParagraphDraw.kt */
public final class AndroidMultiParagraphDrawKt {
    /* renamed from: drawMultiParagraph-7AXcY_I  reason: not valid java name */
    public static final void m38202drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Canvas canvas2 = canvas;
        Brush brush2 = brush;
        C12775o.m28639i(multiParagraph, "$this$drawMultiParagraph");
        C12775o.m28639i(canvas2, "canvas");
        C12775o.m28639i(brush2, "brush");
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text_release().size() <= 1) {
            m38204drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else if (brush2 instanceof SolidColor) {
            m38204drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else if (brush2 instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i2);
                f3 += paragraphInfo.getParagraph().getHeight();
                f2 = Math.max(f2, paragraphInfo.getParagraph().getWidth());
            }
            Shader r10 = ((ShaderBrush) brush2).m36010createShaderuvyYCjk(SizeKt.Size(f2, f3));
            Matrix matrix = new Matrix();
            r10.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = multiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i3);
                paragraphInfo2.getParagraph().m37872painthn5TExg(canvas, BrushKt.ShaderBrush(r10), f, shadow, textDecoration, drawStyle, i);
                canvas2.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                r10.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawMultiParagraph-7AXcY_I$default  reason: not valid java name */
    public static /* synthetic */ void m38203drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i2 & 16) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i2 & 32) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i2 & 64) != 0) {
            i3 = BlendMode.Companion.m35604getSrcOver0nO6VwU();
        } else {
            i3 = i;
        }
        m38202drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f2, shadow2, textDecoration2, drawStyle2, i3);
    }

    /* renamed from: drawParagraphs-7AXcY_I  reason: not valid java name */
    private static final void m38204drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i2);
            paragraphInfo.getParagraph().m37872painthn5TExg(canvas, brush, f, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
