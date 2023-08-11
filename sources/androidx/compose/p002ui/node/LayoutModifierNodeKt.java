package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,302:1\n69#2:303\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n*L\n137#1:303\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutModifierNodeKt */
/* compiled from: LayoutModifierNode.kt */
public final class LayoutModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        C12775o.m28639i(layoutModifierNode, "<this>");
        DelegatableNodeKt.m37467requireCoordinator64DMado(layoutModifierNode, NodeKind.m37625constructorimpl(2)).invalidateLayer();
    }

    @ExperimentalComposeUiApi
    public static final void invalidateLayout(LayoutModifierNode layoutModifierNode) {
        C12775o.m28639i(layoutModifierNode, "<this>");
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, (Object) null);
    }

    @ExperimentalComposeUiApi
    public static final void invalidateMeasurements(LayoutModifierNode layoutModifierNode) {
        C12775o.m28639i(layoutModifierNode, "<this>");
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    @ExperimentalComposeUiApi
    public static final void requestRemeasure(LayoutModifierNode layoutModifierNode) {
        C12775o.m28639i(layoutModifierNode, "<this>");
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, (Object) null);
    }
}
