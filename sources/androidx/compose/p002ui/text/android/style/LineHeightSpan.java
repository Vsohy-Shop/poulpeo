package androidx.compose.p002ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.LineHeightSpan */
/* compiled from: LineHeightSpan.kt */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 0;
    private final float lineHeight;

    public LineHeightSpan(float f) {
        this.lineHeight = f;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(fontMetricsInt, "fontMetricsInt");
        int lineHeight2 = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        if (lineHeight2 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.lineHeight));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) lineHeight2))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}
