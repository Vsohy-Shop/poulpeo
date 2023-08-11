package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.TextRangeKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: StringHelpers.kt */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i) {
        C12775o.m28639i(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (charSequence.charAt(i2) == 10) {
                return i2;
            }
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i) {
        C12775o.m28639i(charSequence, "<this>");
        for (int i2 = i - 1; i2 > 0; i2--) {
            if (charSequence.charAt(i2 - 1) == 10) {
                return i2;
            }
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i) {
        C12775o.m28639i(charSequence, "<this>");
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i), findParagraphEnd(charSequence, i));
    }
}
