package androidx.compose.p002ui.node;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.LayoutNodeKt */
/* compiled from: LayoutNode.kt */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;

    public static final void add(LayoutNode layoutNode, LayoutNode layoutNode2) {
        C12775o.m28639i(layoutNode, "<this>");
        C12775o.m28639i(layoutNode2, "child");
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), layoutNode2);
    }

    public static final Owner requireOwner(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "<this>");
        Owner owner$ui_release = layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
