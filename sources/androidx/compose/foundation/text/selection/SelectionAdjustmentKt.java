package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.p002ui.text.TextRangeKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectionAdjustment.kt */
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(String str, int i, int i2, boolean z, boolean z2) {
        C12775o.m28639i(str, "text");
        if (i2 == 0) {
            return TextRangeKt.TextRange(i, i);
        }
        if (i == 0) {
            if (z) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(str, 0), 0);
            }
            return TextRangeKt.TextRange(0, StringHelpers_androidKt.findFollowingBreak(str, 0));
        } else if (i == i2) {
            if (z) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(str, i2), i2);
            }
            return TextRangeKt.TextRange(i2, StringHelpers_androidKt.findPrecedingBreak(str, i2));
        } else if (z) {
            if (!z2) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(str, i), i);
            }
            return TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(str, i), i);
        } else if (!z2) {
            return TextRangeKt.TextRange(i, StringHelpers_androidKt.findFollowingBreak(str, i));
        } else {
            return TextRangeKt.TextRange(i, StringHelpers_androidKt.findPrecedingBreak(str, i));
        }
    }
}
