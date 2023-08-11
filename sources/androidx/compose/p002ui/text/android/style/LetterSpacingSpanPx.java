package androidx.compose.p002ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.C0127Px;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.LetterSpacingSpanPx */
/* compiled from: LetterSpacingSpanPx.kt */
public final class LetterSpacingSpanPx extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final float letterSpacing;

    public LetterSpacingSpanPx(@C0127Px float f) {
        this.letterSpacing = f;
    }

    private final void updatePaint(TextPaint textPaint) {
        boolean z;
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            textPaint.setLetterSpacing(this.letterSpacing / textSize);
        }
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public void updateDrawState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        updatePaint(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        updatePaint(textPaint);
    }
}
