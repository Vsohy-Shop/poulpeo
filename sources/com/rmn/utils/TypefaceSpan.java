package com.rmn.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: TypefaceSpan.kt */
public final class TypefaceSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final Typeface typeface;

    public TypefaceSpan(Typeface typeface2) {
        C12775o.m28639i(typeface2, "typeface");
        this.typeface = typeface2;
    }

    private final void apply(Paint paint) {
        int i;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 != null) {
            i = typeface2.getStyle();
        } else {
            i = 0;
        }
        int i2 = i & (~this.typeface.getStyle());
        if ((i2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "drawState");
        apply(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12775o.m28639i(textPaint, "paint");
        apply(textPaint);
    }
}
