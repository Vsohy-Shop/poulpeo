package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager$mouseSelectionObserver$1 implements MouseSelectionObserver {
    final /* synthetic */ TextFieldSelectionManager this$0;

    TextFieldSelectionManager$mouseSelectionObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.this$0 = textFieldSelectionManager;
    }

    /* renamed from: onDrag-3MmeM6k  reason: not valid java name */
    public boolean m33853onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
        boolean z;
        TextFieldState state$foundation_release;
        TextLayoutResultProxy layoutResult;
        C12775o.m28639i(selectionAdjustment, "adjustment");
        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (state$foundation_release = this.this$0.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        int r6 = layoutResult.m33740getOffsetForPosition3MmeM6k(j, false);
        TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
        Integer access$getDragBeginOffsetInText$p = textFieldSelectionManager.dragBeginOffsetInText;
        C12775o.m28636f(access$getDragBeginOffsetInText$p);
        textFieldSelectionManager.updateSelection(value$foundation_release, access$getDragBeginOffsetInText$p.intValue(), r6, false, selectionAdjustment);
        return true;
    }

    /* renamed from: onExtend-k-4lQ0M  reason: not valid java name */
    public boolean m33854onExtendk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        textFieldSelectionManager2.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m37975getStartimpl(textFieldSelectionManager.getValue$foundation_release().m38194getSelectiond9O1mEE())), TextLayoutResultProxy.m33738getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, (Object) null), false, SelectionAdjustment.Companion.getNone());
        return true;
    }

    /* renamed from: onExtendDrag-k-4lQ0M  reason: not valid java name */
    public boolean m33855onExtendDragk4lQ0M(long j) {
        boolean z;
        TextFieldState state$foundation_release;
        TextLayoutResultProxy layoutResult;
        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (state$foundation_release = this.this$0.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m37975getStartimpl(textFieldSelectionManager.getValue$foundation_release().m38194getSelectiond9O1mEE())), layoutResult.m33740getOffsetForPosition3MmeM6k(j, false), false, SelectionAdjustment.Companion.getNone());
        return true;
    }

    /* renamed from: onStart-3MmeM6k  reason: not valid java name */
    public boolean m33856onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
        TextLayoutResultProxy layoutResult;
        C12775o.m28639i(selectionAdjustment, "adjustment");
        FocusRequester focusRequester = this.this$0.getFocusRequester();
        if (focusRequester != null) {
            focusRequester.requestFocus();
        }
        this.this$0.dragBeginPosition = j;
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        TextLayoutResultProxy textLayoutResultProxy = layoutResult;
        textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m33738getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j, false, 2, (Object) null));
        int r4 = TextLayoutResultProxy.m33738getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, textFieldSelectionManager.dragBeginPosition, false, 2, (Object) null);
        textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), r4, r4, false, selectionAdjustment);
        return true;
    }
}
