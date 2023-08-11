package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.text.TextLayoutResult;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextSelectionDelegate.kt */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        int i2;
        C12775o.m28639i(textLayoutResult, "<this>");
        boolean z3 = false;
        if ((!z || z2) && (z || !z2)) {
            i2 = Math.max(i - 1, 0);
        } else {
            i2 = i;
        }
        if (textLayoutResult.getBidiRunDirection(i2) == textLayoutResult.getParagraphDirection(i)) {
            z3 = true;
        }
        return textLayoutResult.getHorizontalPosition(i, z3);
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        return OffsetKt.Offset(getHorizontalPosition(textLayoutResult, i, z, z2), textLayoutResult.getLineBottom(textLayoutResult.getLineForOffset(i)));
    }
}
