package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.NodeCoordinator;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n69#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n*L\n615#1:1355\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$hit$1 */
/* compiled from: NodeCoordinator.kt */
final class NodeCoordinator$hit$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ HitTestResult<T> $hitTestResult;
    final /* synthetic */ NodeCoordinator.HitTestSource<T> $hitTestSource;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ boolean $isTouchEvent;
    final /* synthetic */ long $pointerPosition;
    final /* synthetic */ T $this_hit;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NodeCoordinator$hit$1(NodeCoordinator nodeCoordinator, T t, NodeCoordinator.HitTestSource<T> hitTestSource, long j, HitTestResult<T> hitTestResult, boolean z, boolean z2) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_hit = t;
        this.$hitTestSource = hitTestSource;
        this.$pointerPosition = j;
        this.$hitTestResult = hitTestResult;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
    }

    public final void invoke() {
        this.this$0.m37586hit1hIXUjU((DelegatableNode) NodeCoordinatorKt.m37623nextUncheckedUntilhw7D004(this.$this_hit, this.$hitTestSource.m37621entityTypeOLwlOKw(), NodeKind.m37625constructorimpl(2)), this.$hitTestSource, this.$pointerPosition, this.$hitTestResult, this.$isTouchEvent, this.$isInLayer);
    }
}
