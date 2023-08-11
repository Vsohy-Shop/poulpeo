package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p002ui.platform.TextToolbar;
import androidx.compose.p002ui.platform.TextToolbarStatus;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager$touchSelectionObserver$1 implements TextDragObserver {
    final /* synthetic */ TextFieldSelectionManager this$0;

    TextFieldSelectionManager$touchSelectionObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.this$0 = textFieldSelectionManager;
    }

    /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
    public void m33858onDragk4lQ0M(long j) {
        boolean z;
        TextLayoutResultProxy layoutResult;
        int i;
        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            textFieldSelectionManager.dragTotalDistance = Offset.m35427plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j);
            TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
            if (!(state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null)) {
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(Offset.m35427plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                Integer access$getDragBeginOffsetInText$p = textFieldSelectionManager2.dragBeginOffsetInText;
                if (access$getDragBeginOffsetInText$p != null) {
                    i = access$getDragBeginOffsetInText$p.intValue();
                } else {
                    i = layoutResult.m33740getOffsetForPosition3MmeM6k(textFieldSelectionManager2.dragBeginPosition, false);
                }
                int i2 = i;
                Offset r10 = textFieldSelectionManager2.m33844getCurrentDragPosition_m7T9E();
                C12775o.m28636f(r10);
                textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i2, layoutResult.m33740getOffsetForPosition3MmeM6k(r10.m35432unboximpl(), false), false, SelectionAdjustment.Companion.getWord());
            }
            TextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
            if (state$foundation_release2 != null) {
                state$foundation_release2.setShowFloatingToolbar(false);
            }
        }
    }

    /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
    public void m33859onStartk4lQ0M(long j) {
        boolean z;
        TextLayoutResultProxy layoutResult;
        TextFieldState state$foundation_release;
        TextLayoutResultProxy layoutResult2;
        TextLayoutResultProxy layoutResult3;
        if (this.this$0.getDraggingHandle() == null) {
            this.this$0.setDraggingHandle(Handle.SelectionEnd);
            this.this$0.hideSelectionToolbar$foundation_release();
            TextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
            boolean z2 = true;
            if (state$foundation_release2 == null || (layoutResult3 = state$foundation_release2.getLayoutResult()) == null || !layoutResult3.m33741isPositionOnTextk4lQ0M(j)) {
                z = false;
            } else {
                z = true;
            }
            if (z || (state$foundation_release = this.this$0.getState$foundation_release()) == null || (layoutResult2 = state$foundation_release.getLayoutResult()) == null) {
                if (this.this$0.getValue$foundation_release().getText().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    this.this$0.enterSelectionMode$foundation_release();
                    TextFieldState state$foundation_release3 = this.this$0.getState$foundation_release();
                    if (!(state$foundation_release3 == null || (layoutResult = state$foundation_release3.getLayoutResult()) == null)) {
                        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                        int r1 = TextLayoutResultProxy.m33738getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, (Object) null);
                        textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), r1, r1, false, SelectionAdjustment.Companion.getWord());
                        textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(r1);
                    }
                    this.this$0.dragBeginPosition = j;
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    textFieldSelectionManager2.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(textFieldSelectionManager2.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.Companion.m35438getZeroF1C5BW0();
                    return;
                }
                return;
            }
            TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
            int transformedToOriginal = textFieldSelectionManager3.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult2, layoutResult2.getLineForVerticalPosition(Offset.m35423getYimpl(j)), false, 2, (Object) null));
            HapticFeedback hapticFeedBack = textFieldSelectionManager3.getHapticFeedBack();
            if (hapticFeedBack != null) {
                hapticFeedBack.m36401performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m36410getTextHandleMove5zf0vsI());
            }
            TextFieldValue r9 = textFieldSelectionManager3.m33839createTextFieldValueFDrldGo(textFieldSelectionManager3.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
            textFieldSelectionManager3.enterSelectionMode$foundation_release();
            textFieldSelectionManager3.getOnValueChange$foundation_release().invoke(r9);
        }
    }

    public void onStop() {
        TextToolbarStatus textToolbarStatus;
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33841setCurrentDragPosition_kEHs6E((Offset) null);
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release != null) {
            state$foundation_release.setShowFloatingToolbar(true);
        }
        TextToolbar textToolbar = this.this$0.getTextToolbar();
        if (textToolbar != null) {
            textToolbarStatus = textToolbar.getStatus();
        } else {
            textToolbarStatus = null;
        }
        if (textToolbarStatus == TextToolbarStatus.Hidden) {
            this.this$0.showSelectionToolbar$foundation_release();
        }
        this.this$0.dragBeginOffsetInText = null;
    }

    public void onCancel() {
    }

    public void onUp() {
    }

    /* renamed from: onDown-k-4lQ0M  reason: not valid java name */
    public void m33857onDownk4lQ0M(long j) {
    }
}
