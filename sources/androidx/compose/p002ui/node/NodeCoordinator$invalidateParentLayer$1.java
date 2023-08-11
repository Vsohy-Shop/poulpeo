package androidx.compose.p002ui.node;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1 */
/* compiled from: NodeCoordinator.kt */
final class NodeCoordinator$invalidateParentLayer$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NodeCoordinator$invalidateParentLayer$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.this$0 = nodeCoordinator;
    }

    public final void invoke() {
        NodeCoordinator wrappedBy$ui_release = this.this$0.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            wrappedBy$ui_release.invalidateLayer();
        }
    }
}
