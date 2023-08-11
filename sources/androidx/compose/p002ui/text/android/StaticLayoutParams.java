package androidx.compose.p002ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.android.StaticLayoutParams */
/* compiled from: StaticLayoutFactory.kt */
final class StaticLayoutParams {
    private final Layout.Alignment alignment;
    private final int breakStrategy;
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int end;
    private final int hyphenationFrequency;
    private final boolean includePadding;
    private final int justificationMode;
    private final int[] leftIndents;
    private final int lineBreakStyle;
    private final int lineBreakWordStyle;
    private final float lineSpacingExtra;
    private final float lineSpacingMultiplier;
    private final int maxLines;
    private final TextPaint paint;
    private final int[] rightIndents;
    private final int start;
    private final CharSequence text;
    private final TextDirectionHeuristic textDir;
    private final boolean useFallbackLineSpacing;
    private final int width;

    public StaticLayoutParams(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment2, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        int i11 = i;
        int i12 = i2;
        TextPaint textPaint2 = textPaint;
        int i13 = i3;
        TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
        Layout.Alignment alignment3 = alignment2;
        int i14 = i4;
        int i15 = i5;
        float f3 = f;
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(textPaint2, "paint");
        C12775o.m28639i(textDirectionHeuristic2, "textDir");
        C12775o.m28639i(alignment3, "alignment");
        this.text = charSequence;
        this.start = i11;
        this.end = i12;
        this.paint = textPaint2;
        this.width = i13;
        this.textDir = textDirectionHeuristic2;
        this.alignment = alignment3;
        this.maxLines = i14;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i15;
        this.lineSpacingMultiplier = f3;
        this.lineSpacingExtra = f2;
        this.justificationMode = i6;
        this.includePadding = z;
        this.useFallbackLineSpacing = z2;
        this.breakStrategy = i7;
        this.lineBreakStyle = i8;
        this.lineBreakWordStyle = i9;
        this.hyphenationFrequency = i10;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        boolean z3 = true;
        if (i11 >= 0 && i11 <= i12) {
            if (i12 >= 0 && i12 <= charSequence.length()) {
                if (i14 >= 0) {
                    if (i13 >= 0) {
                        if (i15 >= 0) {
                            if (!(f3 < 0.0f ? false : z3)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final TextPaint getPaint() {
        return this.paint;
    }

    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    public final int getStart() {
        return this.start;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StaticLayoutParams(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment2, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i11 & 2) != 0 ? 0 : i, i2, textPaint, i3, textDirectionHeuristic, alignment2, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2);
    }
}
