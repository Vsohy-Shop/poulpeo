package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.text.AnnotatedString;
import p336ef.C11906l;

/* compiled from: Selectable.kt */
public interface Selectable {
    /* renamed from: updateSelection-qCDeeow$default  reason: not valid java name */
    static /* synthetic */ C11906l m33767updateSelectionqCDeeow$default(Selectable selectable, long j, long j2, Offset offset, boolean z, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, int i, Object obj) {
        boolean z2;
        Selection selection2;
        if (obj == null) {
            if ((i & 8) != 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            if ((i & 64) != 0) {
                selection2 = null;
            } else {
                selection2 = selection;
            }
            return selectable.m33770updateSelectionqCDeeow(j, j2, offset, z2, layoutCoordinates, selectionAdjustment, selection2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }

    Rect getBoundingBox(int i);

    /* renamed from: getHandlePosition-dBAh8RU  reason: not valid java name */
    long m33768getHandlePositiondBAh8RU(Selection selection, boolean z);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    /* renamed from: getRangeOfLineContaining--jx7JFs  reason: not valid java name */
    long m33769getRangeOfLineContainingjx7JFs(int i);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();

    /* renamed from: updateSelection-qCDeeow  reason: not valid java name */
    C11906l<Selection, Boolean> m33770updateSelectionqCDeeow(long j, long j2, Offset offset, boolean z, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection);
}
