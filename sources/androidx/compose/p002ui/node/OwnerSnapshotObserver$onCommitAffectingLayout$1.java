package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1 */
/* compiled from: OwnerSnapshotObserver.kt */
final class OwnerSnapshotObserver$onCommitAffectingLayout$1 extends C12777p implements Function1<LayoutNode, C11921v> {
    public static final OwnerSnapshotObserver$onCommitAffectingLayout$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingLayout$1();

    OwnerSnapshotObserver$onCommitAffectingLayout$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        if (layoutNode.isValidOwnerScope()) {
            LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, (Object) null);
        }
    }
}
