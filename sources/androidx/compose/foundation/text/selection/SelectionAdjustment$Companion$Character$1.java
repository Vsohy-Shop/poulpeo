package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectionAdjustment.kt */
public final class SelectionAdjustment$Companion$Character$1 implements SelectionAdjustment {
    SelectionAdjustment$Companion$Character$1() {
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    public long m33775adjustZXO7KMw(TextLayoutResult textLayoutResult, long j, int i, boolean z, TextRange textRange) {
        boolean z2;
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        if (!TextRange.m37969getCollapsedimpl(j)) {
            return j;
        }
        if (textRange != null) {
            z2 = TextRange.m37974getReversedimpl(textRange.m37979unboximpl());
        } else {
            z2 = false;
        }
        return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m37975getStartimpl(j), C13755w.m31565Q(textLayoutResult.getLayoutInput().getText()), z, z2);
    }
}
