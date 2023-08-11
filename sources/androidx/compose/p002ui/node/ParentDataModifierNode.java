package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.unit.Density;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.ParentDataModifierNode */
/* compiled from: ParentDataModifierNode.kt */
public interface ParentDataModifierNode extends DelegatableNode {
    Object modifyParentData(Density density, Object obj);
}
