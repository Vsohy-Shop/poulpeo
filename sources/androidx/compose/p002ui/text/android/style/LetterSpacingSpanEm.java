package androidx.compose.p002ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.LetterSpacingSpanEm */
/* compiled from: LetterSpacingSpanEm.kt */
public final class LetterSpacingSpanEm extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final float letterSpacing;

    public LetterSpacingSpanEm(float f) {
        this.letterSpacing = f;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public void updateDrawState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.letterSpacing);
    }
}
