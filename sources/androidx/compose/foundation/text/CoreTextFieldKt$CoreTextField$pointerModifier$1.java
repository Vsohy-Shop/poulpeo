package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.text.input.OffsetMapping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$pointerModifier$1 extends C12777p implements Function1<Offset, C11921v> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$pointerModifier$1(TextFieldState textFieldState, FocusRequester focusRequester, boolean z, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
        super(1);
        this.$state = textFieldState;
        this.$focusRequester = focusRequester;
        this.$readOnly = z;
        this.$manager = textFieldSelectionManager;
        this.$offsetMapping = offsetMapping;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m33647invokek4lQ0M(((Offset) obj).m35432unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final void m33647invokek4lQ0M(long j) {
        boolean z = true;
        CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
        if (!this.$state.getHasFocus()) {
            return;
        }
        if (this.$state.getHandleState() != HandleState.Selection) {
            TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
            if (layoutResult != null) {
                TextFieldState textFieldState = this.$state;
                long j2 = j;
                TextFieldDelegate.Companion.m33718setCursorOffsetULxng0E$foundation_release(j2, layoutResult, textFieldState.getProcessor(), this.$offsetMapping, textFieldState.getOnValueChange());
                if (textFieldState.getTextDelegate().getText().length() <= 0) {
                    z = false;
                }
                if (z) {
                    textFieldState.setHandleState(HandleState.Cursor);
                    return;
                }
                return;
            }
            return;
        }
        this.$manager.m33843deselect_kEHs6E$foundation_release(Offset.m35411boximpl(j));
    }
}
