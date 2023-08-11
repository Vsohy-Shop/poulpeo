package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1 */
/* compiled from: NodeCoordinator.kt */
final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends C12777p implements Function1<NodeCoordinator, C11921v> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NodeCoordinator) obj);
        return C11921v.f18618a;
    }

    public final void invoke(NodeCoordinator nodeCoordinator) {
        C12775o.m28639i(nodeCoordinator, "coordinator");
        if (nodeCoordinator.isValidOwnerScope()) {
            LayerPositionalProperties access$getLayerPositionalProperties$p = nodeCoordinator.layerPositionalProperties;
            if (access$getLayerPositionalProperties$p == null) {
                nodeCoordinator.updateLayerParameters();
                return;
            }
            NodeCoordinator.tmpLayerPositionalProperties.copyFrom(access$getLayerPositionalProperties$p);
            nodeCoordinator.updateLayerParameters();
            if (!NodeCoordinator.tmpLayerPositionalProperties.hasSameValuesAs(access$getLayerPositionalProperties$p)) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, (Object) null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner$ui_release = layoutNode.getOwner$ui_release();
                if (owner$ui_release != null) {
                    owner$ui_release.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    }
}
