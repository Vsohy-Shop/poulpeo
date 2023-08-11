package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectionAdjustment.kt */
public final class SelectionAdjustment$Companion$CharacterWithWordAccelerate$1 implements SelectionAdjustment {
    SelectionAdjustment$Companion$CharacterWithWordAccelerate$1() {
    }

    private final boolean isAtWordBoundary(TextLayoutResult textLayoutResult, int i) {
        long r0 = textLayoutResult.m37949getWordBoundaryjx7JFs(i);
        if (i == TextRange.m37975getStartimpl(r0) || i == TextRange.m37970getEndimpl(r0)) {
            return true;
        }
        return false;
    }

    private final boolean isExpanding(int i, int i2, boolean z, boolean z2) {
        if (i2 == -1) {
            return true;
        }
        if (i == i2) {
            return false;
        }
        if (z ^ z2) {
            if (i < i2) {
                return true;
            }
        } else if (i > i2) {
            return true;
        }
        return false;
    }

    private final int snapToWordBoundary(TextLayoutResult textLayoutResult, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int i5;
        long r0 = textLayoutResult.m37949getWordBoundaryjx7JFs(i);
        if (textLayoutResult.getLineForOffset(TextRange.m37975getStartimpl(r0)) == i2) {
            i4 = TextRange.m37975getStartimpl(r0);
        } else {
            i4 = textLayoutResult.getLineStart(i2);
        }
        if (textLayoutResult.getLineForOffset(TextRange.m37970getEndimpl(r0)) == i2) {
            i5 = TextRange.m37970getEndimpl(r0);
        } else {
            i5 = TextLayoutResult.getLineEnd$default(textLayoutResult, i2, false, 2, (Object) null);
        }
        if (i4 == i3) {
            return i5;
        }
        if (i5 == i3) {
            return i4;
        }
        int i6 = (i4 + i5) / 2;
        if (z ^ z2) {
            if (i <= i6) {
                return i4;
            }
        } else if (i < i6) {
            return i4;
        }
        return i5;
    }

    private final int updateSelectionBoundary(TextLayoutResult textLayoutResult, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (i == i2) {
            return i3;
        }
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        if (lineForOffset != textLayoutResult.getLineForOffset(i3)) {
            return snapToWordBoundary(textLayoutResult, i, lineForOffset, i4, z, z2);
        }
        if (isExpanding(i, i2, z, z2) && isAtWordBoundary(textLayoutResult, i3)) {
            return snapToWordBoundary(textLayoutResult, i, lineForOffset, i4, z, z2);
        }
        return i;
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    public long m33776adjustZXO7KMw(TextLayoutResult textLayoutResult, long j, int i, boolean z, TextRange textRange) {
        int i2;
        int i3;
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        if (textRange == null) {
            return SelectionAdjustment.Companion.$$INSTANCE.getWord().m33772adjustZXO7KMw(textLayoutResult, j, i, z, textRange);
        }
        if (TextRange.m37969getCollapsedimpl(j)) {
            return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m37975getStartimpl(j), C13755w.m31565Q(textLayoutResult.getLayoutInput().getText()), z, TextRange.m37974getReversedimpl(textRange.m37979unboximpl()));
        }
        if (z) {
            i3 = updateSelectionBoundary(textLayoutResult, TextRange.m37975getStartimpl(j), i, TextRange.m37975getStartimpl(textRange.m37979unboximpl()), TextRange.m37970getEndimpl(j), true, TextRange.m37974getReversedimpl(j));
            i2 = TextRange.m37970getEndimpl(j);
        } else {
            int r13 = TextRange.m37975getStartimpl(j);
            i2 = updateSelectionBoundary(textLayoutResult, TextRange.m37970getEndimpl(j), i, TextRange.m37970getEndimpl(textRange.m37979unboximpl()), TextRange.m37975getStartimpl(j), false, TextRange.m37974getReversedimpl(j));
            i3 = r13;
        }
        return TextRangeKt.TextRange(i3, i2);
    }
}
