package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectionManager.kt */
public final class SelectionManager$handleDragObserver$1 implements TextDragObserver {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ SelectionManager this$0;

    SelectionManager$handleDragObserver$1(SelectionManager selectionManager, boolean z) {
        this.this$0 = selectionManager;
        this.$isStartHandle = z;
    }

    public void onCancel() {
        this.this$0.showSelectionToolbar$foundation_release();
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33800setCurrentDragPosition_kEHs6E((Offset) null);
    }

    /* renamed from: onDown-k-4lQ0M  reason: not valid java name */
    public void m33816onDownk4lQ0M(long j) {
        Selection.AnchorInfo anchorInfo;
        LayoutCoordinates layoutCoordinates;
        Handle handle;
        Selection selection = this.this$0.getSelection();
        if (selection != null) {
            if (this.$isStartHandle) {
                anchorInfo = selection.getStart();
            } else {
                anchorInfo = selection.getEnd();
            }
            Selectable anchorSelectable$foundation_release = this.this$0.getAnchorSelectable$foundation_release(anchorInfo);
            if (anchorSelectable$foundation_release != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null) {
                long r4 = SelectionHandlesKt.m33786getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.m33768getHandlePositiondBAh8RU(selection, this.$isStartHandle));
                SelectionManager selectionManager = this.this$0;
                selectionManager.m33800setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(selectionManager.requireContainerCoordinates$foundation_release().m37342localPositionOfR5De75A(layoutCoordinates, r4)));
                SelectionManager selectionManager2 = this.this$0;
                if (this.$isStartHandle) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                selectionManager2.setDraggingHandle(handle);
            }
        }
    }

    /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
    public void m33817onDragk4lQ0M(long j) {
        SelectionManager selectionManager = this.this$0;
        selectionManager.m33802setDragTotalDistancek4lQ0M(Offset.m35427plusMKHz9U(selectionManager.m33809getDragTotalDistanceF1C5BW0$foundation_release(), j));
        long r6 = Offset.m35427plusMKHz9U(this.this$0.m33808getDragBeginPositionF1C5BW0$foundation_release(), this.this$0.m33809getDragTotalDistanceF1C5BW0$foundation_release());
        if (this.this$0.m33813updateSelectionRHHTvR4$foundation_release(Offset.m35411boximpl(r6), Offset.m35411boximpl(this.this$0.m33808getDragBeginPositionF1C5BW0$foundation_release()), this.$isStartHandle, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
            this.this$0.m33801setDragBeginPositionk4lQ0M(r6);
            this.this$0.m33802setDragTotalDistancek4lQ0M(Offset.Companion.m35438getZeroF1C5BW0());
        }
    }

    /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
    public void m33818onStartk4lQ0M(long j) {
        long j2;
        this.this$0.hideSelectionToolbar$foundation_release();
        Selection selection = this.this$0.getSelection();
        C12775o.m28636f(selection);
        Selectable selectable = this.this$0.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
        Selectable selectable2 = this.this$0.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
        LayoutCoordinates layoutCoordinates = null;
        if (this.$isStartHandle) {
            if (selectable != null) {
                layoutCoordinates = selectable.getLayoutCoordinates();
            }
            C12775o.m28636f(layoutCoordinates);
        } else {
            if (selectable2 != null) {
                layoutCoordinates = selectable2.getLayoutCoordinates();
            }
            C12775o.m28636f(layoutCoordinates);
        }
        if (this.$isStartHandle) {
            C12775o.m28636f(selectable);
            j2 = selectable.m33768getHandlePositiondBAh8RU(selection, true);
        } else {
            C12775o.m28636f(selectable2);
            j2 = selectable2.m33768getHandlePositiondBAh8RU(selection, false);
        }
        long r4 = SelectionHandlesKt.m33786getAdjustedCoordinatesk4lQ0M(j2);
        SelectionManager selectionManager = this.this$0;
        selectionManager.m33801setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().m37342localPositionOfR5De75A(layoutCoordinates, r4));
        this.this$0.m33802setDragTotalDistancek4lQ0M(Offset.Companion.m35438getZeroF1C5BW0());
    }

    public void onStop() {
        this.this$0.showSelectionToolbar$foundation_release();
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33800setCurrentDragPosition_kEHs6E((Offset) null);
    }

    public void onUp() {
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33800setCurrentDragPosition_kEHs6E((Offset) null);
    }
}
