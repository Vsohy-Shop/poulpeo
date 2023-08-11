package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.text.input.OffsetMapping;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager$cursorDragObserver$1 implements TextDragObserver {
    final /* synthetic */ TextFieldSelectionManager this$0;

    TextFieldSelectionManager$cursorDragObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.this$0 = textFieldSelectionManager;
    }

    /* renamed from: onDown-k-4lQ0M  reason: not valid java name */
    public void m33847onDownk4lQ0M(long j) {
        this.this$0.setDraggingHandle(Handle.Cursor);
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(SelectionHandlesKt.m33786getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m33846getHandlePositiontuRUvjQ$foundation_release(true))));
    }

    /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
    public void m33848onDragk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.dragTotalDistance = Offset.m35427plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j);
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
            textFieldSelectionManager2.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(Offset.m35427plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
            OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
            Offset r1 = textFieldSelectionManager2.m33844getCurrentDragPosition_m7T9E();
            C12775o.m28636f(r1);
            int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(value.m37947getOffsetForPositionk4lQ0M(r1.m35432unboximpl()));
            long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
            if (!TextRange.m37968equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m38194getSelectiond9O1mEE())) {
                HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.m36401performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m36410getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m33839createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange));
            }
        }
    }

    /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
    public void m33849onStartk4lQ0M(long j) {
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m33786getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m33846getHandlePositiontuRUvjQ$foundation_release(true));
        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
        textFieldSelectionManager2.m33841setCurrentDragPosition_kEHs6E(Offset.m35411boximpl(textFieldSelectionManager2.dragBeginPosition));
        this.this$0.dragTotalDistance = Offset.Companion.m35438getZeroF1C5BW0();
        this.this$0.setDraggingHandle(Handle.Cursor);
    }

    public void onStop() {
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33841setCurrentDragPosition_kEHs6E((Offset) null);
    }

    public void onUp() {
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m33841setCurrentDragPosition_kEHs6E((Offset) null);
    }

    public void onCancel() {
    }
}
