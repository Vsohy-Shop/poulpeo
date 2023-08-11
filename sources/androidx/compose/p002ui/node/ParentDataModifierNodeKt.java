package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.ParentDataModifierNodeKt */
/* compiled from: ParentDataModifierNode.kt */
public final class ParentDataModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateParentData(ParentDataModifierNode parentDataModifierNode) {
        C12775o.m28639i(parentDataModifierNode, "<this>");
        DelegatableNodeKt.requireLayoutNode(parentDataModifierNode).invalidateParentData$ui_release();
    }
}
