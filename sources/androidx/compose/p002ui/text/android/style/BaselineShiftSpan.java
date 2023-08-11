package androidx.compose.p002ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.BaselineShiftSpan */
/* compiled from: BaselineShiftSpan.kt */
public class BaselineShiftSpan extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final float multiplier;

    public BaselineShiftSpan(float f) {
        this.multiplier = f;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public void updateDrawState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.multiplier)));
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.multiplier)));
    }
}
