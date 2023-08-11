package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.platform.TextToolbar;
import androidx.compose.p002ui.platform.TextToolbarStatus;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager$handleDragObserver$1 implements TextDragObserver {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ TextFieldSelectionManager this$0;

    TextFieldSelectionManager$handleDragObserver$1(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        this.this$0 = textFieldSelectionManager;
        this.$isStartHandle = z;
    }

    /* renamed from: onDown-k-4lQ0M  reason: not valid java name */
    public void m33850onDownk4lQ0M(long j) {
        Handle handle;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        if (this.$isStartHandle) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        textFieldSelectionManager.setDraggingHandle(handle);
        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
        textFieldSelectionManager2.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(SelectionHandlesKt.m33786getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager2.m33846getHandlePositiontuRUvjQ$foundation_release(this.$isStartHandle))));
    }

    /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
    public void m33851onDragk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int i;
        int i2;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.dragTotalDistance = Offset.m35427plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j);
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (!(state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null)) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
            boolean z = this.$isStartHandle;
            textFieldSelectionManager2.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(Offset.m35427plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
            if (z) {
                Offset r9 = textFieldSelectionManager2.m33844getCurrentDragPosition_m7T9E();
                C12775o.m28636f(r9);
                i = value.m37947getOffsetForPositionk4lQ0M(r9.m35432unboximpl());
            } else {
                i = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m37975getStartimpl(textFieldSelectionManager2.getValue$foundation_release().m38194getSelectiond9O1mEE()));
            }
            int i3 = i;
            if (z) {
                i2 = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m37970getEndimpl(textFieldSelectionManager2.getValue$foundation_release().m38194getSelectiond9O1mEE()));
            } else {
                Offset r92 = textFieldSelectionManager2.m33844getCurrentDragPosition_m7T9E();
                C12775o.m28636f(r92);
                i2 = value.m37947getOffsetForPositionk4lQ0M(r92.m35432unboximpl());
            }
            textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i3, i2, z, SelectionAdjustment.Companion.getCharacter());
        }
        TextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
        if (state$foundation_release2 != null) {
            state$foundation_release2.setShowFloatingToolbar(false);
        }
    }

    /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
    public void m33852onStartk4lQ0M(long j) {
        Handle handle;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m33786getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m33846getHandlePositiontuRUvjQ$foundation_release(this.$isStartHandle));
        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
        textFieldSelectionManager2.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(textFieldSelectionManager2.dragBeginPosition));
        this.this$0.dragTotalDistance = Offset.Companion.m35438getZeroF1C5BW0();
        TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
        if (this.$isStartHandle) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        textFieldSelectionManager3.setDraggingHandle(handle);
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release != null) {
            state$foundation_release.setShowFloatingToolbar(false);
        }
    }

    public void onStop() {
        TextToolbarStatus textToolbarStatus = null;
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33841setCurrentDragPosition_kEHs6E((Offset) null);
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release != null) {
            state$foundation_release.setShowFloatingToolbar(true);
        }
        TextToolbar textToolbar = this.this$0.getTextToolbar();
        if (textToolbar != null) {
            textToolbarStatus = textToolbar.getStatus();
        }
        if (textToolbarStatus == TextToolbarStatus.Hidden) {
            this.this$0.showSelectionToolbar$foundation_release();
        }
    }

    public void onUp() {
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33841setCurrentDragPosition_kEHs6E((Offset) null);
    }

    public void onCancel() {
    }
}
