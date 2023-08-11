package androidx.compose.p002ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(33)
/* renamed from: androidx.compose.ui.text.android.BoringLayoutFactory33 */
/* compiled from: BoringLayoutFactory.kt */
final class BoringLayoutFactory33 {
    public static final BoringLayoutFactory33 INSTANCE = new BoringLayoutFactory33();

    private BoringLayoutFactory33() {
    }

    @DoNotInline
    public static final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(textPaint, "paint");
        C12775o.m28639i(alignment, "alignment");
        BoringLayout.Metrics metrics2 = metrics;
        C12775o.m28639i(metrics2, "metrics");
        BoringLayout create = BoringLayoutConstructor33.create(charSequence, textPaint, i, alignment, f, f2, metrics2, z, truncateAt, i2, z2);
        C12775o.m28638h(create, "create(\n            text…backLineSpacing\n        )");
        return create;
    }

    public static /* synthetic */ BoringLayout create$default(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2, int i3, Object obj) {
        TextUtils.TruncateAt truncateAt2;
        int i4;
        int i5 = i3;
        if ((i5 & 512) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i5 & 1024) != 0) {
            i4 = i;
        } else {
            i4 = i2;
        }
        return create(charSequence, textPaint, i, alignment, f, f2, metrics, z, z2, truncateAt2, i4);
    }

    @DoNotInline
    public static final BoringLayout.Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(textPaint, "paint");
        C12775o.m28639i(textDirectionHeuristic, "textDir");
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, (BoringLayout.Metrics) null);
    }

    public final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        C12775o.m28639i(boringLayout, "layout");
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
