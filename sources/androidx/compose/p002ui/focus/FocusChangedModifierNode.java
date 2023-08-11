package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.focus.FocusChangedModifierNode */
/* compiled from: FocusChangedModifier.kt */
final class FocusChangedModifierNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private Function1<? super FocusState, C11921v> onFocusChanged;

    public FocusChangedModifierNode(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "onFocusChanged");
        this.onFocusChanged = function1;
    }

    public final Function1<FocusState, C11921v> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    public void onFocusEvent(FocusState focusState2) {
        C12775o.m28639i(focusState2, "focusState");
        if (!C12775o.m28634d(this.focusState, focusState2)) {
            this.focusState = focusState2;
            this.onFocusChanged.invoke(focusState2);
        }
    }

    public final void setOnFocusChanged(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.onFocusChanged = function1;
    }
}
