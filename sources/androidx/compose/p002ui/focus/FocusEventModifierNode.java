package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.node.DelegatableNode;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.focus.FocusEventModifierNode */
/* compiled from: FocusEventModifierNode.kt */
public interface FocusEventModifierNode extends DelegatableNode {
    void onFocusEvent(FocusState focusState);
}
