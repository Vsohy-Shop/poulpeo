package androidx.compose.p002ui.node;

/* renamed from: androidx.compose.ui.node.NodeCoordinatorKt */
/* compiled from: NodeCoordinator.kt */
public final class NodeCoordinatorKt {
    /* access modifiers changed from: private */
    /* renamed from: nextUncheckedUntil-hw7D004  reason: not valid java name */
    public static final <T> T m37623nextUncheckedUntilhw7D004(DelegatableNode delegatableNode, int i, int i2) {
        T child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
            if ((kindSet$ui_release & i2) != 0) {
                return null;
            }
            if ((kindSet$ui_release & i) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
