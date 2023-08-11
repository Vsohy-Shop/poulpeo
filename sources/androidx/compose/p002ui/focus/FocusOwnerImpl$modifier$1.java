package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1 */
/* compiled from: FocusOwnerImpl.kt */
public final class FocusOwnerImpl$modifier$1 extends ModifierNodeElement<FocusTargetModifierNode> {
    final /* synthetic */ FocusOwnerImpl this$0;

    FocusOwnerImpl$modifier$1(FocusOwnerImpl focusOwnerImpl) {
        this.this$0 = focusOwnerImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.this$0.getRootFocusNode$ui_release().hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("RootFocusTarget");
    }

    public FocusTargetModifierNode update(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "node");
        return focusTargetModifierNode;
    }

    public FocusTargetModifierNode create() {
        return this.this$0.getRootFocusNode$ui_release();
    }
}
