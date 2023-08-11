package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1 */
/* compiled from: NodeCoordinator.kt */
final class NodeCoordinator$Companion$onCommitAffectingLayer$1 extends C12777p implements Function1<NodeCoordinator, C11921v> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayer$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayer$1();

    NodeCoordinator$Companion$onCommitAffectingLayer$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NodeCoordinator) obj);
        return C11921v.f18618a;
    }

    public final void invoke(NodeCoordinator nodeCoordinator) {
        C12775o.m28639i(nodeCoordinator, "coordinator");
        OwnedLayer layer = nodeCoordinator.getLayer();
        if (layer != null) {
            layer.invalidate();
        }
    }
}
