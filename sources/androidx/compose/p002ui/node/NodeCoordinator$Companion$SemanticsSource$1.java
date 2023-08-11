package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n73#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1263#1:1355\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1 */
/* compiled from: NodeCoordinator.kt */
public final class NodeCoordinator$Companion$SemanticsSource$1 implements NodeCoordinator.HitTestSource<SemanticsModifierNode> {
    NodeCoordinator$Companion$SemanticsSource$1() {
    }

    /* renamed from: childHitTest-YqVAtuI  reason: not valid java name */
    public void m37618childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult<SemanticsModifierNode> hitTestResult, boolean z, boolean z2) {
        C12775o.m28639i(layoutNode, "layoutNode");
        C12775o.m28639i(hitTestResult, "hitTestResult");
        layoutNode.m37502hitTestSemanticsM_7yMNQ$ui_release(j, hitTestResult, z, z2);
    }

    /* renamed from: entityType-OLwlOKw  reason: not valid java name */
    public int m37619entityTypeOLwlOKw() {
        return NodeKind.m37625constructorimpl(8);
    }

    public boolean interceptOutOfBoundsChildEvents(SemanticsModifierNode semanticsModifierNode) {
        C12775o.m28639i(semanticsModifierNode, "node");
        return false;
    }

    public boolean shouldHitTestChildren(LayoutNode layoutNode) {
        SemanticsConfiguration collapsedSemanticsConfiguration;
        C12775o.m28639i(layoutNode, "parentLayoutNode");
        SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
        boolean z = false;
        if (!(outerSemantics == null || (collapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) == null || !collapsedSemanticsConfiguration.isClearingSemantics())) {
            z = true;
        }
        return !z;
    }
}
