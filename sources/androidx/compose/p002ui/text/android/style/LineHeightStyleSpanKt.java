package androidx.compose.p002ui.text.android.style;

import android.graphics.Paint;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.style.LineHeightStyleSpanKt */
/* compiled from: LineHeightStyleSpan.kt */
public final class LineHeightStyleSpanKt {
    public static final int lineHeight(Paint.FontMetricsInt fontMetricsInt) {
        C12775o.m28639i(fontMetricsInt, "<this>");
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
