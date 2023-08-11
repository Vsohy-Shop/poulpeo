package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.Canvas;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.NodeCoordinator$invoke$1 */
/* compiled from: NodeCoordinator.kt */
final class NodeCoordinator$invoke$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Canvas $canvas;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NodeCoordinator$invoke$1(NodeCoordinator nodeCoordinator, Canvas canvas) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$canvas = canvas;
    }

    public final void invoke() {
        this.this$0.drawContainedDrawModifiers(this.$canvas);
    }
}
