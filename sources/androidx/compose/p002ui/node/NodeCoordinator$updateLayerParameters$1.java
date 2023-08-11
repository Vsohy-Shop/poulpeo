package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1 */
/* compiled from: NodeCoordinator.kt */
final class NodeCoordinator$updateLayerParameters$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Function1<GraphicsLayerScope, C11921v> $layerBlock;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NodeCoordinator$updateLayerParameters$1(Function1<? super GraphicsLayerScope, C11921v> function1) {
        super(0);
        this.$layerBlock = function1;
    }

    public final void invoke() {
        this.$layerBlock.invoke(NodeCoordinator.graphicsLayerScope);
    }
}
