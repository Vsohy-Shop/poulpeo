package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.node.DelegatableNode;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.focus.FocusPropertiesModifierNode */
/* compiled from: FocusPropertiesModifierNode.kt */
public interface FocusPropertiesModifierNode extends DelegatableNode {
    void modifyFocusProperties(FocusProperties focusProperties);
}
