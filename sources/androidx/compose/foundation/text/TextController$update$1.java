package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;

/* compiled from: CoreText.kt */
public final class TextController$update$1 implements TextDragObserver {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;
    private long dragTotalDistance;
    private long lastPosition;
    final /* synthetic */ TextController this$0;

    TextController$update$1(TextController textController, SelectionRegistrar selectionRegistrar) {
        this.this$0 = textController;
        this.$selectionRegistrar = selectionRegistrar;
        Offset.Companion companion = Offset.Companion;
        this.lastPosition = companion.m35438getZeroF1C5BW0();
        this.dragTotalDistance = companion.m35438getZeroF1C5BW0();
    }

    public final long getDragTotalDistance() {
        return this.dragTotalDistance;
    }

    public final long getLastPosition() {
        return this.lastPosition;
    }

    public void onCancel() {
        if (SelectionRegistrarKt.hasSelection(this.$selectionRegistrar, this.this$0.getState().getSelectableId())) {
            this.$selectionRegistrar.notifySelectionUpdateEnd();
        }
    }

    /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
    public void m33700onDragk4lQ0M(long j) {
        LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
        if (layoutCoordinates != null) {
            SelectionRegistrar selectionRegistrar = this.$selectionRegistrar;
            TextController textController = this.this$0;
            if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar, textController.getState().getSelectableId())) {
                long r10 = Offset.m35427plusMKHz9U(this.dragTotalDistance, j);
                this.dragTotalDistance = r10;
                long r102 = Offset.m35427plusMKHz9U(this.lastPosition, r10);
                if (!textController.m33697outOfBoundary0a9Yr6o(this.lastPosition, r102)) {
                    if (selectionRegistrar.m33831notifySelectionUpdate5iVPX68(layoutCoordinates, r102, this.lastPosition, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                        this.lastPosition = r102;
                        this.dragTotalDistance = Offset.Companion.m35438getZeroF1C5BW0();
                    }
                }
            }
        }
    }

    /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
    public void m33701onStartk4lQ0M(long j) {
        LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
        if (layoutCoordinates != null) {
            TextController textController = this.this$0;
            SelectionRegistrar selectionRegistrar = this.$selectionRegistrar;
            if (layoutCoordinates.isAttached()) {
                if (textController.m33697outOfBoundary0a9Yr6o(j, j)) {
                    selectionRegistrar.notifySelectionUpdateSelectAll(textController.getState().getSelectableId());
                } else {
                    selectionRegistrar.m33832notifySelectionUpdateStartd4ec7I(layoutCoordinates, j, SelectionAdjustment.Companion.getWord());
                }
                this.lastPosition = j;
            } else {
                return;
            }
        }
        if (SelectionRegistrarKt.hasSelection(this.$selectionRegistrar, this.this$0.getState().getSelectableId())) {
            this.dragTotalDistance = Offset.Companion.m35438getZeroF1C5BW0();
        }
    }

    public void onStop() {
        if (SelectionRegistrarKt.hasSelection(this.$selectionRegistrar, this.this$0.getState().getSelectableId())) {
            this.$selectionRegistrar.notifySelectionUpdateEnd();
        }
    }

    public final void setDragTotalDistance(long j) {
        this.dragTotalDistance = j;
    }

    public final void setLastPosition(long j) {
        this.lastPosition = j;
    }

    public void onUp() {
    }

    /* renamed from: onDown-k-4lQ0M  reason: not valid java name */
    public void m33699onDownk4lQ0M(long j) {
    }
}
