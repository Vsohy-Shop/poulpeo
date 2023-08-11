package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusEventModifierNodeImpl */
/* compiled from: FocusEventModifier.kt */
final class FocusEventModifierNodeImpl extends Modifier.Node implements FocusEventModifierNode {
    private Function1<? super FocusState, C11921v> onFocusEvent;

    public FocusEventModifierNodeImpl(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "onFocusEvent");
        this.onFocusEvent = function1;
    }

    public final Function1<FocusState, C11921v> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    public void onFocusEvent(FocusState focusState) {
        C12775o.m28639i(focusState, "focusState");
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.onFocusEvent = function1;
    }
}
