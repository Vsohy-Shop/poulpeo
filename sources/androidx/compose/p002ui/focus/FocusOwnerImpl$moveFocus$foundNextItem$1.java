package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,275:1\n87#2:276\n324#3:277\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n*L\n152#1:276\n152#1:277\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1 */
/* compiled from: FocusOwnerImpl.kt */
final class FocusOwnerImpl$moveFocus$foundNextItem$1 extends C12777p implements Function1<FocusTargetModifierNode, Boolean> {
    final /* synthetic */ FocusTargetModifierNode $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusOwnerImpl$moveFocus$foundNextItem$1(FocusTargetModifierNode focusTargetModifierNode) {
        super(1);
        this.$source = focusTargetModifierNode;
    }

    public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "destination");
        if (C12775o.m28634d(focusTargetModifierNode, this.$source)) {
            return Boolean.FALSE;
        }
        Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m37625constructorimpl(1024));
        if (!(nearestAncestor instanceof FocusTargetModifierNode)) {
            nearestAncestor = null;
        }
        if (((FocusTargetModifierNode) nearestAncestor) != null) {
            return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetModifierNode));
        }
        throw new IllegalStateException("Focus search landed at the root.".toString());
    }
}
