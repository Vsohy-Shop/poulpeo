package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.SemanticsOwner */
/* compiled from: SemanticsOwner.kt */
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final LayoutNode rootNode;

    public SemanticsOwner(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "rootNode");
        this.rootNode = layoutNode;
    }

    public final SemanticsNode getRootSemanticsNode() {
        SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(this.rootNode);
        C12775o.m28636f(outerSemantics);
        return new SemanticsNode(outerSemantics, true, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(this.rootNode);
        C12775o.m28636f(outerSemantics);
        return new SemanticsNode(outerSemantics, false, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }
}
