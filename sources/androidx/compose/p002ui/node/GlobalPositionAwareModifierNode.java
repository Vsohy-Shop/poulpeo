package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.layout.LayoutCoordinates;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.GlobalPositionAwareModifierNode */
/* compiled from: GlobalPositionAwareModifierNode.kt */
public interface GlobalPositionAwareModifierNode extends DelegatableNode {
    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
