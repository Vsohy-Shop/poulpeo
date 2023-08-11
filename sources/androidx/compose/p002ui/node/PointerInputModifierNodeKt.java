package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPointerInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,94:1\n75#2:95\n*S KotlinDebug\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n*L\n93#1:95\n*E\n"})
/* renamed from: androidx.compose.ui.node.PointerInputModifierNodeKt */
/* compiled from: PointerInputModifierNode.kt */
public final class PointerInputModifierNodeKt {
    public static final LayoutCoordinates getLayoutCoordinates(PointerInputModifierNode pointerInputModifierNode) {
        C12775o.m28639i(pointerInputModifierNode, "<this>");
        return DelegatableNodeKt.m37467requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m37625constructorimpl(16));
    }

    public static final boolean isAttached(PointerInputModifierNode pointerInputModifierNode) {
        C12775o.m28639i(pointerInputModifierNode, "<this>");
        return pointerInputModifierNode.getNode().isAttached();
    }

    public static /* synthetic */ void getLayoutCoordinates$annotations(PointerInputModifierNode pointerInputModifierNode) {
    }

    public static /* synthetic */ void isAttached$annotations(PointerInputModifierNode pointerInputModifierNode) {
    }
}
