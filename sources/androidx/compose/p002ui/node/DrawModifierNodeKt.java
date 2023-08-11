package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nDrawModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,47:1\n67#2:48\n*S KotlinDebug\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n*L\n44#1:48\n*E\n"})
/* renamed from: androidx.compose.ui.node.DrawModifierNodeKt */
/* compiled from: DrawModifierNode.kt */
public final class DrawModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        C12775o.m28639i(drawModifierNode, "<this>");
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m37467requireCoordinator64DMado(drawModifierNode, NodeKind.m37625constructorimpl(1)).invalidateLayer();
        }
    }
}
