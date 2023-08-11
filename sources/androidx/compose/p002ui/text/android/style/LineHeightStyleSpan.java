package androidx.compose.p002ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.FloatRange;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.LineHeightStyleSpan */
/* compiled from: LineHeightStyleSpan.kt */
public final class LineHeightStyleSpan implements LineHeightSpan {
    public static final int $stable = 8;
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, @FloatRange(from = 0.0d, mo636to = 1.0d) float f2) {
        boolean z3;
        boolean z4;
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        boolean z5 = true;
        if (0.0f > f2 || f2 > 1.0f) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            if (f2 == -1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z5 = false;
            }
        }
        if (!z5) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        double d;
        int lineHeight2 = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        int ceil = (int) ((float) Math.ceil((double) this.lineHeight));
        int i = ceil - lineHeight2;
        float f = this.topRatio;
        if (f == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = Math.abs((float) fontMetricsInt.ascent) / ((float) LineHeightStyleSpanKt.lineHeight(fontMetricsInt));
        }
        if (i <= 0) {
            d = Math.ceil((double) (((float) i) * f));
        } else {
            d = Math.ceil((double) (((float) i) * (1.0f - f)));
        }
        int i2 = fontMetricsInt.descent;
        int i3 = ((int) ((float) d)) + i2;
        this.descent = i3;
        int i4 = i3 - ceil;
        this.ascent = i4;
        if (this.trimFirstLineTop) {
            i4 = fontMetricsInt.ascent;
        }
        this.firstAscent = i4;
        if (this.trimLastLineBottom) {
            i3 = i2;
        }
        this.lastDescent = i3;
        this.firstAscentDiff = fontMetricsInt.ascent - i4;
        this.lastDescentDiff = i3 - i2;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i, i2, z);
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(fontMetricsInt, "fontMetricsInt");
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) > 0) {
            boolean z2 = true;
            if (i == this.startIndex) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != this.endIndex) {
                z2 = false;
            }
            if (!z || !z2 || !this.trimFirstLineTop || !this.trimLastLineBottom) {
                if (z) {
                    calculateTargetMetrics(fontMetricsInt);
                }
                if (z) {
                    i5 = this.firstAscent;
                } else {
                    i5 = this.ascent;
                }
                fontMetricsInt.ascent = i5;
                if (z2) {
                    i6 = this.lastDescent;
                } else {
                    i6 = this.descent;
                }
                fontMetricsInt.descent = i6;
            }
        }
    }

    public final LineHeightStyleSpan copy$ui_text_release(int i, int i2, boolean z) {
        return new LineHeightStyleSpan(this.lineHeight, i, i2, z, this.trimLastLineBottom, this.topRatio);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
