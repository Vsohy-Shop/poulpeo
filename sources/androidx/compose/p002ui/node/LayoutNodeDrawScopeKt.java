package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,114:1\n71#2:115\n69#2:116\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n101#1:115\n102#1:116\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeDrawScopeKt */
/* compiled from: LayoutNodeDrawScope.kt */
public final class LayoutNodeDrawScopeKt {
    /* access modifiers changed from: private */
    public static final DrawModifierNode nextDrawNode(DelegatableNode delegatableNode) {
        int r0 = NodeKind.m37625constructorimpl(4);
        int r1 = NodeKind.m37625constructorimpl(2);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & r0) == 0) {
            return null;
        }
        while (child$ui_release != null && (child$ui_release.getKindSet$ui_release() & r1) == 0) {
            if ((child$ui_release.getKindSet$ui_release() & r0) != 0) {
                return (DrawModifierNode) child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
