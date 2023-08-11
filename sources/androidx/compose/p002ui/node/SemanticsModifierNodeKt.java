package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.semantics.SemanticsActions;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsConfigurationKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,73:1\n73#2:74\n73#2:76\n73#2:77\n308#3:75\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n48#1:74\n68#1:76\n71#1:77\n48#1:75\n*E\n"})
/* renamed from: androidx.compose.ui.node.SemanticsModifierNodeKt */
/* compiled from: SemanticsModifierNode.kt */
public final class SemanticsModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final SemanticsConfiguration collapsedSemanticsConfiguration(SemanticsModifierNode semanticsModifierNode) {
        C12775o.m28639i(semanticsModifierNode, "<this>");
        Modifier.Node localChild = DelegatableNodeKt.localChild(semanticsModifierNode, NodeKind.m37625constructorimpl(8));
        if (!(localChild instanceof SemanticsModifierNode)) {
            localChild = null;
        }
        SemanticsModifierNode semanticsModifierNode2 = (SemanticsModifierNode) localChild;
        if (semanticsModifierNode2 == null || semanticsModifierNode.getSemanticsConfiguration().isClearingSemantics()) {
            return semanticsModifierNode.getSemanticsConfiguration();
        }
        SemanticsConfiguration copy = semanticsModifierNode.getSemanticsConfiguration().copy();
        copy.collapsePeer$ui_release(collapsedSemanticsConfiguration(semanticsModifierNode2));
        return copy;
    }

    public static final boolean getUseMinimumTouchTarget(SemanticsModifierNode semanticsModifierNode) {
        C12775o.m28639i(semanticsModifierNode, "<this>");
        if (SemanticsConfigurationKt.getOrNull(semanticsModifierNode.getSemanticsConfiguration(), SemanticsActions.INSTANCE.getOnClick()) != null) {
            return true;
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        C12775o.m28639i(semanticsModifierNode, "<this>");
        DelegatableNodeKt.requireOwner(semanticsModifierNode).onSemanticsChange();
    }

    public static final Rect touchBoundsInRoot(SemanticsModifierNode semanticsModifierNode) {
        C12775o.m28639i(semanticsModifierNode, "<this>");
        if (!semanticsModifierNode.getNode().isAttached()) {
            return Rect.Companion.getZero();
        }
        if (!getUseMinimumTouchTarget(semanticsModifierNode)) {
            return LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m37467requireCoordinator64DMado(semanticsModifierNode, NodeKind.m37625constructorimpl(8)));
        }
        return DelegatableNodeKt.m37467requireCoordinator64DMado(semanticsModifierNode, NodeKind.m37625constructorimpl(8)).touchBoundsInRoot();
    }

    public static /* synthetic */ void getUseMinimumTouchTarget$annotations(SemanticsModifierNode semanticsModifierNode) {
    }
}
