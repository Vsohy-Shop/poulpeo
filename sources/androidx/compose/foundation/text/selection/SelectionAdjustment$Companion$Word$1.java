package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectionAdjustment.kt */
public final class SelectionAdjustment$Companion$Word$1 implements SelectionAdjustment {
    SelectionAdjustment$Companion$Word$1() {
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    public long m33780adjustZXO7KMw(TextLayoutResult textLayoutResult, long j, int i, boolean z, TextRange textRange) {
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        return SelectionAdjustment.Companion.$$INSTANCE.m33774adjustByBoundaryDvylE(textLayoutResult, j, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
    }
}
