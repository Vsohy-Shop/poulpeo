package androidx.compose.p002ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.OptIn;
import androidx.core.p004os.BuildCompat;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.BoringLayoutFactory */
/* compiled from: BoringLayoutFactory.kt */
public final class BoringLayoutFactory {
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public static /* synthetic */ BoringLayout create$default(BoringLayoutFactory boringLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2, int i3, Object obj) {
        Layout.Alignment alignment2;
        boolean z3;
        boolean z4;
        TextUtils.TruncateAt truncateAt2;
        int i4;
        int i5 = i3;
        if ((i5 & 16) != 0) {
            alignment2 = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment2 = alignment;
        }
        if ((i5 & 32) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i5 & 64) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        if ((i5 & 128) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i5 & 256) != 0) {
            i4 = i;
        } else {
            i4 = i2;
        }
        return boringLayoutFactory.create(charSequence, textPaint, i, metrics, alignment2, z3, z4, truncateAt2, i4);
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        boolean z3;
        CharSequence charSequence2 = charSequence;
        C12775o.m28639i(charSequence, "text");
        TextPaint textPaint2 = textPaint;
        C12775o.m28639i(textPaint, "paint");
        C12775o.m28639i(metrics, "metrics");
        C12775o.m28639i(alignment, "alignment");
        boolean z4 = true;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i2 < 0) {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (BuildCompat.isAtLeastT()) {
                return BoringLayoutFactory33.create(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, z2, truncateAt, i2);
            } else {
                return BoringLayoutFactoryDefault.create(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        C12775o.m28639i(boringLayout, "layout");
        if (BuildCompat.isAtLeastT()) {
            return BoringLayoutFactory33.INSTANCE.isFallbackLineSpacingEnabled(boringLayout);
        }
        return false;
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public final BoringLayout.Metrics measure(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(textPaint, "paint");
        C12775o.m28639i(textDirectionHeuristic, "textDir");
        if (BuildCompat.isAtLeastT()) {
            return BoringLayoutFactory33.isBoring(charSequence, textPaint, textDirectionHeuristic);
        }
        return BoringLayoutFactoryDefault.isBoring(charSequence, textPaint, textDirectionHeuristic);
    }
}
