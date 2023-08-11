package androidx.compose.p002ui.input.rotary;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.node.DelegatableNode;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierNode */
/* compiled from: RotaryInputModifierNode.kt */
public interface RotaryInputModifierNode extends DelegatableNode {
    boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);

    boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);
}
