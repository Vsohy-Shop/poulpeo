package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1 */
/* compiled from: OwnerSnapshotObserver.kt */
final class C1061x82674389 extends C12777p implements Function1<LayoutNode, C11921v> {
    public static final C1061x82674389 INSTANCE = new C1061x82674389();

    C1061x82674389() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        if (layoutNode.isValidOwnerScope()) {
            LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, (Object) null);
        }
    }
}