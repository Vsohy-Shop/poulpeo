package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.text.style.TextDecoration;
import java.util.List;

/* renamed from: androidx.compose.ui.text.Paragraph */
/* compiled from: Paragraph.android.kt */
public interface Paragraph {
    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return paragraph.getLineEnd(i, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
    }

    /* renamed from: paint-LG529CI$default  reason: not valid java name */
    static /* synthetic */ void m37865paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = Color.Companion.m35707getUnspecified0d7_KjU();
            } else {
                j2 = j;
            }
            DrawStyle drawStyle2 = null;
            if ((i2 & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i2 & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            if ((i2 & 16) == 0) {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                i3 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            paragraph.m37870paintLG529CI(canvas, j2, shadow2, textDecoration2, drawStyle2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    /* renamed from: paint-RPmYEkk$default  reason: not valid java name */
    static /* synthetic */ void m37866paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Color.Companion.m35707getUnspecified0d7_KjU();
            }
            long j2 = j;
            if ((i & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            paragraph.m37871paintRPmYEkk(canvas, j2, shadow2, textDecoration2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    /* renamed from: paint-hn5TExg$default  reason: not valid java name */
    static /* synthetic */ void m37867painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i3;
        if (obj == null) {
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
                i3 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            paragraph.m37872painthn5TExg(canvas, brush, f2, shadow2, textDecoration2, drawStyle2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }

    ResolvedTextDirection getBidiRunDirection(int i);

    Rect getBoundingBox(int i);

    Rect getCursorRect(int i);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i, boolean z);

    float getLastBaseline();

    float getLineBottom(int i);

    int getLineCount();

    int getLineEnd(int i, boolean z);

    int getLineForOffset(int i);

    int getLineForVerticalPosition(float f);

    float getLineHeight(int i);

    float getLineLeft(int i);

    float getLineRight(int i);

    int getLineStart(int i);

    float getLineTop(int i);

    float getLineWidth(int i);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    int m37868getOffsetForPositionk4lQ0M(long j);

    ResolvedTextDirection getParagraphDirection(int i);

    Path getPathForRange(int i, int i2);

    List<Rect> getPlaceholderRects();

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    long m37869getWordBoundaryjx7JFs(int i);

    boolean isLineEllipsized(int i);

    @ExperimentalTextApi
    /* renamed from: paint-LG529CI  reason: not valid java name */
    void m37870paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i);

    /* renamed from: paint-RPmYEkk  reason: not valid java name */
    void m37871paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration);

    @ExperimentalTextApi
    /* renamed from: paint-hn5TExg  reason: not valid java name */
    void m37872painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i);
}
