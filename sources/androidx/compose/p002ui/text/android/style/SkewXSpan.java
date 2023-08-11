package androidx.compose.p002ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.SkewXSpan */
/* compiled from: SkewXSpan.kt */
public class SkewXSpan extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final float skewX;

    public SkewXSpan(float f) {
        this.skewX = f;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public void updateDrawState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.setTextSkewX(this.skewX + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.setTextSkewX(this.skewX + textPaint.getTextSkewX());
    }
}
