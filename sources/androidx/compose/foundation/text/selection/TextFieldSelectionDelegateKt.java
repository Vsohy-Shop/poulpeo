package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSelectionDelegate.kt */
public final class TextFieldSelectionDelegateKt {
    /* renamed from: getTextFieldSelection-bb3KNj8  reason: not valid java name */
    public static final long m33836getTextFieldSelectionbb3KNj8(TextLayoutResult textLayoutResult, int i, int i2, TextRange textRange, boolean z, SelectionAdjustment selectionAdjustment) {
        C12775o.m28639i(selectionAdjustment, "adjustment");
        if (textLayoutResult == null) {
            return TextRangeKt.TextRange(0, 0);
        }
        long TextRange = TextRangeKt.TextRange(i, i2);
        if (textRange != null || !C12775o.m28634d(selectionAdjustment, SelectionAdjustment.Companion.getCharacter())) {
            return selectionAdjustment.m33772adjustZXO7KMw(textLayoutResult, TextRange, -1, z, textRange);
        }
        return TextRange;
    }
}
