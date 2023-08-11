package androidx.compose.p002ui.text.platform.style;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p002ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.style.DrawStyleSpan */
/* compiled from: DrawStyleSpan.android.kt */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    private final DrawStyle drawStyle;

    public DrawStyleSpan(DrawStyle drawStyle2) {
        C12775o.m28639i(drawStyle2, "drawStyle");
        this.drawStyle = drawStyle2;
    }

    /* renamed from: toAndroidCap-BeK7IIE  reason: not valid java name */
    private final Paint.Cap m38232toAndroidCapBeK7IIE(int i) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m36050equalsimpl0(i, companion.m36054getButtKaPHkGw())) {
            return Paint.Cap.BUTT;
        }
        if (StrokeCap.m36050equalsimpl0(i, companion.m36055getRoundKaPHkGw())) {
            return Paint.Cap.ROUND;
        }
        if (StrokeCap.m36050equalsimpl0(i, companion.m36056getSquareKaPHkGw())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ  reason: not valid java name */
    private final Paint.Join m38233toAndroidJoinWw9F2mQ(int i) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m36060equalsimpl0(i, companion.m36065getMiterLxFBmk8())) {
            return Paint.Join.MITER;
        }
        if (StrokeJoin.m36060equalsimpl0(i, companion.m36066getRoundLxFBmk8())) {
            return Paint.Join.ROUND;
        }
        if (StrokeJoin.m36060equalsimpl0(i, companion.m36064getBevelLxFBmk8())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public void updateDrawState(TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            DrawStyle drawStyle2 = this.drawStyle;
            if (C12775o.m28634d(drawStyle2, Fill.INSTANCE)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (drawStyle2 instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(m38233toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m36355getJoinLxFBmk8()));
                textPaint.setStrokeCap(m38232toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m36354getCapKaPHkGw()));
                androidx.compose.p002ui.graphics.PathEffect pathEffect2 = ((Stroke) this.drawStyle).getPathEffect();
                if (pathEffect2 != null) {
                    pathEffect = AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect2);
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
