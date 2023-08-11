package androidx.compose.p002ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory */
/* compiled from: StaticLayoutFactory.kt */
public final class StaticLayoutFactory {
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        int i12 = i11;
        return staticLayoutFactory.create(charSequence, (i12 & 2) != 0 ? 0 : i, (i12 & 4) != 0 ? charSequence.length() : i2, textPaint, i3, (i12 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic, (i12 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : alignment, (i12 & 128) != 0 ? Integer.MAX_VALUE : i4, (i12 & 256) != 0 ? null : truncateAt, (i12 & 512) != 0 ? i3 : i5, (i12 & 1024) != 0 ? 1.0f : f, (i12 & 2048) != 0 ? 0.0f : f2, (i12 & 4096) != 0 ? 0 : i6, (i12 & 8192) != 0 ? false : z, (i12 & 16384) != 0 ? true : z2, (32768 & i12) != 0 ? 0 : i7, (65536 & i12) != 0 ? 0 : i8, (131072 & i12) != 0 ? 0 : i9, (262144 & i12) != 0 ? 0 : i10, (524288 & i12) != 0 ? null : iArr, (i12 & 1048576) != 0 ? null : iArr2);
    }

    public final StaticLayout create(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, @IntRange(from = 0) int i4, TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i5, @FloatRange(from = 0.0d) float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        CharSequence charSequence2 = charSequence;
        C12775o.m28639i(charSequence2, "text");
        C12775o.m28639i(textPaint, "paint");
        C12775o.m28639i(textDirectionHeuristic, "textDir");
        C12775o.m28639i(alignment, "alignment");
        StaticLayoutParams staticLayoutParams = r0;
        StaticLayoutFactoryImpl staticLayoutFactoryImpl = delegate;
        StaticLayoutParams staticLayoutParams2 = new StaticLayoutParams(charSequence2, i, i2, textPaint, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2);
        return staticLayoutFactoryImpl.create(staticLayoutParams);
    }

    public final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z) {
        C12775o.m28639i(staticLayout, "layout");
        return delegate.isFallbackLineSpacingEnabled(staticLayout, z);
    }
}
