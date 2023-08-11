package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RectKt;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectionManager.kt */
public final class SelectionManagerKt {

    /* compiled from: SelectionManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.Handle[] r0 = androidx.compose.foundation.text.Handle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.Cursor     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManagerKt.WhenMappings.<clinit>():void");
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c  reason: not valid java name */
    public static final long m33821calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j) {
        int i;
        C12775o.m28639i(selectionManager, "manager");
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        if (draggingHandle == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        }
        if (i == -1) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m524xeba096cb(selectionManager, j, selection.getStart(), true);
        }
        if (i == 2) {
            return m524xeba096cb(selectionManager, j, selection.getEnd(), false);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter */
    private static final long m524xeba096cb(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo, boolean z) {
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (!z) {
            offset--;
        }
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        Offset r6 = selectionManager.m33807getCurrentDragPosition_m7T9E();
        C12775o.m28636f(r6);
        float r62 = Offset.m35422getXimpl(layoutCoordinates.m37342localPositionOfR5De75A(containerLayoutCoordinates, r6.m35432unboximpl()));
        long r3 = anchorSelectable$foundation_release.m33769getRangeOfLineContainingjx7JFs(offset);
        Rect boundingBox = anchorSelectable$foundation_release.getBoundingBox(TextRange.m37973getMinimpl(r3));
        Rect boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(C13537l.m30877d(TextRange.m37972getMaximpl(r3) - 1, TextRange.m37973getMinimpl(r3)));
        float l = C13537l.m30885l(r62, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
        if (Math.abs(r62 - l) > ((float) (IntSize.m38628getWidthimpl(j) / 2))) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.m37342localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(l, Offset.m35423getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m35452getCenterF1C5BW0())));
    }

    /* renamed from: containsInclusive-Uv8p0NA  reason: not valid java name */
    public static final boolean m33822containsInclusiveUv8p0NA(Rect rect, long j) {
        boolean z;
        boolean z2;
        C12775o.m28639i(rect, "$this$containsInclusive");
        float left = rect.getLeft();
        float right = rect.getRight();
        float r2 = Offset.m35422getXimpl(j);
        if (left > r2 || r2 > right) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float r6 = Offset.m35423getYimpl(j);
            if (top > r6 || r6 > bottom) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static final AnnotatedString getCurrentSelectedText(Selectable selectable, Selection selection) {
        C12775o.m28639i(selectable, "selectable");
        C12775o.m28639i(selection, "selection");
        AnnotatedString text = selectable.getText();
        if (selectable.getSelectableId() != selection.getStart().getSelectableId() && selectable.getSelectableId() != selection.getEnd().getSelectableId()) {
            return text;
        }
        if (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
            if (selection.getHandlesCrossed()) {
                return text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
            }
            return text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
        } else if (selectable.getSelectableId() == selection.getStart().getSelectableId()) {
            if (selection.getHandlesCrossed()) {
                return text.subSequence(0, selection.getStart().getOffset());
            }
            return text.subSequence(selection.getStart().getOffset(), text.length());
        } else if (selection.getHandlesCrossed()) {
            return text.subSequence(selection.getEnd().getOffset(), text.length());
        } else {
            return text.subSequence(0, selection.getEnd().getOffset());
        }
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection merge;
        if (selection == null || (merge = selection.merge(selection2)) == null) {
            return selection2;
        }
        return merge;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "<this>");
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m35460Rect0a9Yr6o(layoutCoordinates.m37346windowToLocalMKHz9U(boundsInWindow.m35457getTopLeftF1C5BW0()), layoutCoordinates.m37346windowToLocalMKHz9U(boundsInWindow.m35451getBottomRightF1C5BW0()));
    }
}
