package androidx.compose.p002ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.LayoutCompatKt */
/* compiled from: LayoutCompat.kt */
public final class LayoutCompatKt {
    @InternalPlatformTextApi
    public static final int getLineForOffset(Layout layout, @IntRange(from = 0) int i, boolean z) {
        C12775o.m28639i(layout, "<this>");
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i && lineEnd != i) {
            return lineForOffset;
        }
        if (lineStart == i) {
            if (z) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        } else if (z) {
            return lineForOffset;
        } else {
            return lineForOffset + 1;
        }
    }
}
