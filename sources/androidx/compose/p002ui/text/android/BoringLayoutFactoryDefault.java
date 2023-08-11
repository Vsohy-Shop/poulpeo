package androidx.compose.p002ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.BoringLayoutFactoryDefault */
/* compiled from: BoringLayoutFactory.kt */
final class BoringLayoutFactoryDefault {
    public static final BoringLayoutFactoryDefault INSTANCE = new BoringLayoutFactoryDefault();

    private BoringLayoutFactoryDefault() {
    }

    @DoNotInline
    public static final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(textPaint, "paint");
        C12775o.m28639i(alignment, "alignment");
        BoringLayout.Metrics metrics2 = metrics;
        C12775o.m28639i(metrics2, "metrics");
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics2, z, truncateAt, i2);
    }

    public static /* synthetic */ BoringLayout create$default(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, Object obj) {
        TextUtils.TruncateAt truncateAt2;
        int i4;
        int i5 = i3;
        if ((i5 & 256) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i5 & 512) != 0) {
            i4 = i;
        } else {
            i4 = i2;
        }
        return create(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt2, i4);
    }

    @DoNotInline
    public static final BoringLayout.Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(textPaint, "paint");
        C12775o.m28639i(textDirectionHeuristic, "textDir");
        if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
        }
        return null;
    }
}
