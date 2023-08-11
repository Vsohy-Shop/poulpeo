package androidx.compose.p002ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.p002ui.text.android.TextLayoutKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.IndentationFixSpan */
/* compiled from: IndentationFixSpan.kt */
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable = 0;

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (layout != null && paint != null) {
            int lineForOffset = layout.getLineForOffset(i6);
            boolean z2 = true;
            if (lineForOffset == layout.getLineCount() - 1 && TextLayoutKt.isLineEllipsized(layout, lineForOffset)) {
                float ellipsizedLeftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding(layout, lineForOffset, paint) + IndentationFixSpanKt.getEllipsizedRightPadding(layout, lineForOffset, paint);
                if (ellipsizedLeftPadding != 0.0f) {
                    z2 = false;
                }
                if (!z2) {
                    C12775o.m28636f(canvas);
                    canvas.translate(ellipsizedLeftPadding, 0.0f);
                }
            }
        }
    }

    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
