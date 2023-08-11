package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.Owner;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,471:1\n81#2:472\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n*L\n193#1:472\n*E\n"})
/* renamed from: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2 */
/* compiled from: BackwardsCompatNode.kt */
public final class BackwardsCompatNode$initializeModifier$2 implements Owner.OnLayoutCompletedListener {
    final /* synthetic */ BackwardsCompatNode this$0;

    BackwardsCompatNode$initializeModifier$2(BackwardsCompatNode backwardsCompatNode) {
        this.this$0 = backwardsCompatNode;
    }

    public void onLayoutComplete() {
        if (this.this$0.lastOnPlacedCoordinates == null) {
            BackwardsCompatNode backwardsCompatNode = this.this$0;
            backwardsCompatNode.onPlaced(DelegatableNodeKt.m37467requireCoordinator64DMado(backwardsCompatNode, NodeKind.m37625constructorimpl(128)));
        }
    }
}
