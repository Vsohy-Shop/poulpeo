package androidx.compose.p002ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.TypefaceSpan */
/* compiled from: TypefaceSpan.kt */
public final class TypefaceSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final Typeface typeface;

    public TypefaceSpan(Typeface typeface2) {
        C12775o.m28639i(typeface2, "typeface");
        this.typeface = typeface2;
    }

    private final void updateTypeface(Paint paint) {
        paint.setTypeface(this.typeface);
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "ds");
        updateTypeface(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "paint");
        updateTypeface(textPaint);
    }
}
