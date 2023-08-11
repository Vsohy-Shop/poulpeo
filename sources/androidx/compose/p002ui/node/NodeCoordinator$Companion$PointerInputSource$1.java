package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.NodeCoordinator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n75#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1242#1:1355\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1 */
/* compiled from: NodeCoordinator.kt */
public final class NodeCoordinator$Companion$PointerInputSource$1 implements NodeCoordinator.HitTestSource<PointerInputModifierNode> {
    NodeCoordinator$Companion$PointerInputSource$1() {
    }

    /* renamed from: childHitTest-YqVAtuI  reason: not valid java name */
    public void m37616childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult<PointerInputModifierNode> hitTestResult, boolean z, boolean z2) {
        C12775o.m28639i(layoutNode, "layoutNode");
        C12775o.m28639i(hitTestResult, "hitTestResult");
        layoutNode.m37501hitTestM_7yMNQ$ui_release(j, hitTestResult, z, z2);
    }

    /* renamed from: entityType-OLwlOKw  reason: not valid java name */
    public int m37617entityTypeOLwlOKw() {
        return NodeKind.m37625constructorimpl(16);
    }

    public boolean shouldHitTestChildren(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "parentLayoutNode");
        return true;
    }

    public boolean interceptOutOfBoundsChildEvents(PointerInputModifierNode pointerInputModifierNode) {
        C12775o.m28639i(pointerInputModifierNode, "node");
        return pointerInputModifierNode.interceptOutOfBoundsChildEvents();
    }
}
