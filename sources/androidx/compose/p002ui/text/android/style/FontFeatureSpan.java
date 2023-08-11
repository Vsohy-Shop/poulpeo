package androidx.compose.p002ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.FontFeatureSpan */
/* compiled from: FontFeatureSpan.kt */
public final class FontFeatureSpan extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final String fontFeatureSettings;

    public FontFeatureSpan(String str) {
        C12775o.m28639i(str, "fontFeatureSettings");
        this.fontFeatureSettings = str;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public void updateDrawState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }
}
