package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.C12775o;

/* compiled from: CoreText.kt */
public final class TextController$update$mouseSelectionObserver$1 implements MouseSelectionObserver {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;
    private long lastPosition = Offset.Companion.m35438getZeroF1C5BW0();
    final /* synthetic */ TextController this$0;

    TextController$update$mouseSelectionObserver$1(TextController textController, SelectionRegistrar selectionRegistrar) {
        this.this$0 = textController;
        this.$selectionRegistrar = selectionRegistrar;
    }

    public final long getLastPosition() {
        return this.lastPosition;
    }

    /* renamed from: onDrag-3MmeM6k  reason: not valid java name */
    public boolean m33702onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
        C12775o.m28639i(selectionAdjustment, "adjustment");
        LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
        if (layoutCoordinates != null) {
            SelectionRegistrar selectionRegistrar = this.$selectionRegistrar;
            TextController textController = this.this$0;
            if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar, textController.getState().getSelectableId())) {
                return false;
            }
            if (selectionRegistrar.m33831notifySelectionUpdate5iVPX68(layoutCoordinates, j, this.lastPosition, false, selectionAdjustment)) {
                this.lastPosition = j;
            }
        }
        return true;
    }

    /* renamed from: onExtend-k-4lQ0M  reason: not valid java name */
    public boolean m33703onExtendk4lQ0M(long j) {
        LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = this.$selectionRegistrar;
        TextController textController = this.this$0;
        if (!layoutCoordinates.isAttached()) {
            return false;
        }
        if (selectionRegistrar.m33831notifySelectionUpdate5iVPX68(layoutCoordinates, j, this.lastPosition, false, SelectionAdjustment.Companion.getNone())) {
            this.lastPosition = j;
        }
        return SelectionRegistrarKt.hasSelection(selectionRegistrar, textController.getState().getSelectableId());
    }

    /* renamed from: onExtendDrag-k-4lQ0M  reason: not valid java name */
    public boolean m33704onExtendDragk4lQ0M(long j) {
        LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return true;
        }
        SelectionRegistrar selectionRegistrar = this.$selectionRegistrar;
        TextController textController = this.this$0;
        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar, textController.getState().getSelectableId())) {
            return false;
        }
        if (!selectionRegistrar.m33831notifySelectionUpdate5iVPX68(layoutCoordinates, j, this.lastPosition, false, SelectionAdjustment.Companion.getNone())) {
            return true;
        }
        this.lastPosition = j;
        return true;
    }

    /* renamed from: onStart-3MmeM6k  reason: not valid java name */
    public boolean m33705onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
        C12775o.m28639i(selectionAdjustment, "adjustment");
        LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = this.$selectionRegistrar;
        TextController textController = this.this$0;
        if (!layoutCoordinates.isAttached()) {
            return false;
        }
        selectionRegistrar.m33832notifySelectionUpdateStartd4ec7I(layoutCoordinates, j, selectionAdjustment);
        this.lastPosition = j;
        return SelectionRegistrarKt.hasSelection(selectionRegistrar, textController.getState().getSelectableId());
    }

    public final void setLastPosition(long j) {
        this.lastPosition = j;
    }
}
