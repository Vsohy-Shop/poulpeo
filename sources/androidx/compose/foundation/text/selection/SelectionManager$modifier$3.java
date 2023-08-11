package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.focus.FocusState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SelectionManager.kt */
final class SelectionManager$modifier$3 extends C12777p implements Function1<FocusState, C11921v> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionManager$modifier$3(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusState) obj);
        return C11921v.f18618a;
    }

    public final void invoke(FocusState focusState) {
        C12775o.m28639i(focusState, "focusState");
        if (!focusState.isFocused() && this.this$0.getHasFocus()) {
            this.this$0.onRelease();
        }
        this.this$0.setHasFocus(focusState.isFocused());
    }
}
