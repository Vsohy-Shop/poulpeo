package androidx.compose.p002ui.text.android;

import android.text.Layout;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.TextAlignmentAdapter */
/* compiled from: TextLayout.kt */
public final class TextAlignmentAdapter {
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;
    public static final TextAlignmentAdapter INSTANCE = new TextAlignmentAdapter();

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (C12775o.m28634d(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (C12775o.m28634d(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    private TextAlignmentAdapter() {
    }

    public final Layout.Alignment get(int i) {
        if (i == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i == 3) {
            return ALIGN_LEFT_FRAMEWORK;
        }
        if (i != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return ALIGN_RIGHT_FRAMEWORK;
    }
}
