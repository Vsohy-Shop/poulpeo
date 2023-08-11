package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;

/* compiled from: MultiWidgetSelectionDelegate.kt */
public final class MultiWidgetSelectionDelegateKt {
    /* access modifiers changed from: private */
    /* renamed from: getAssembledSelectionInfo-vJH6DeI  reason: not valid java name */
    public static final Selection m33763getAssembledSelectionInfovJH6DeI(long j, boolean z, long j2, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m37975getStartimpl(j)), TextRange.m37975getStartimpl(j), j2), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m37970getEndimpl(j) - 1, 0)), TextRange.m37970getEndimpl(j), j2), z);
    }

    /* renamed from: getOffsetForPosition-0AR0LA0  reason: not valid java name */
    public static final int m33764getOffsetForPosition0AR0LA0(TextLayoutResult textLayoutResult, Rect rect, long j) {
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        C12775o.m28639i(rect, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (rect.m35448containsk4lQ0M(j)) {
            return C13537l.m30886m(textLayoutResult.m37947getOffsetForPositionk4lQ0M(j), 0, length);
        }
        if (SelectionMode.Vertical.m33827compare3MmeM6k$foundation_release(j, rect) < 0) {
            return 0;
        }
        return length;
    }

    /* renamed from: getTextSelectionInfo-yM0VcXU  reason: not valid java name */
    public static final C11906l<Selection, Boolean> m33765getTextSelectionInfoyM0VcXU(TextLayoutResult textLayoutResult, long j, long j2, Offset offset, long j3, SelectionAdjustment selectionAdjustment, Selection selection, boolean z) {
        int i;
        TextRange textRange;
        boolean z2;
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        Selection selection2 = selection;
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        C12775o.m28639i(selectionAdjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, (float) IntSize.m38628getWidthimpl(textLayoutResult.m37948getSizeYbymL2g()), (float) IntSize.m38627getHeightimpl(textLayoutResult.m37948getSizeYbymL2g()));
        if (!SelectionMode.Vertical.m33828isSelected2x9bVx0$foundation_release(rect, j, j2)) {
            return new C11906l<>(null, Boolean.FALSE);
        }
        int r9 = m33764getOffsetForPosition0AR0LA0(textLayoutResult, rect, j);
        int r10 = m33764getOffsetForPosition0AR0LA0(textLayoutResult, rect, j2);
        if (offset != null) {
            i = m33764getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.m35432unboximpl());
        } else {
            i = -1;
        }
        int i2 = i;
        long TextRange = TextRangeKt.TextRange(r9, r10);
        if (selection2 != null) {
            textRange = TextRange.m37963boximpl(selection.m33771toTextRanged9O1mEE());
        } else {
            textRange = null;
        }
        long r0 = selectionAdjustment.m33772adjustZXO7KMw(textLayoutResult, TextRange, i2, z, textRange);
        Selection r02 = m33763getAssembledSelectionInfovJH6DeI(r0, TextRange.m37974getReversedimpl(r0), j3, textLayoutResult);
        boolean z3 = true;
        boolean z4 = !C12775o.m28634d(r02, selection2);
        if (!z ? r10 == i2 : r9 == i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && !z4) {
            z3 = false;
        }
        return new C11906l<>(r02, Boolean.valueOf(z3));
    }

    /* renamed from: getTextSelectionInfo-yM0VcXU$default  reason: not valid java name */
    public static /* synthetic */ C11906l m33766getTextSelectionInfoyM0VcXU$default(TextLayoutResult textLayoutResult, long j, long j2, Offset offset, long j3, SelectionAdjustment selectionAdjustment, Selection selection, boolean z, int i, Object obj) {
        Selection selection2;
        boolean z2;
        int i2 = i;
        if ((i2 & 64) != 0) {
            selection2 = null;
        } else {
            selection2 = selection;
        }
        if ((i2 & 128) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return m33765getTextSelectionInfoyM0VcXU(textLayoutResult, j, j2, offset, j3, selectionAdjustment, selection2, z2);
    }
}
