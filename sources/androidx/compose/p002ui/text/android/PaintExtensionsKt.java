package androidx.compose.p002ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.PaintExtensionsKt */
/* compiled from: PaintExtensions.kt */
public final class PaintExtensionsKt {
    private static final void extendWith(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void fillStringBounds(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            Paint29.getTextBounds(paint, charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }

    public static final Rect getCharSequenceBounds(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        C12775o.m28639i(textPaint, "<this>");
        C12775o.m28639i(charSequence, "text");
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
            if (SpannedExtensionsKt.hasSpan(spanned, cls, i, i2)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    C12775o.m28638h(metricAffectingSpanArr, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    fillStringBounds(textPaint2, charSequence, i, nextSpanTransition, rect2);
                    extendWith(rect, rect2);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, charSequence, i, i2);
    }

    @VisibleForTesting
    public static final Rect getStringBounds(Paint paint, CharSequence charSequence, int i, int i2) {
        C12775o.m28639i(paint, "<this>");
        C12775o.m28639i(charSequence, "text");
        Rect rect = new Rect();
        fillStringBounds(paint, charSequence, i, i2, rect);
        return rect;
    }
}
