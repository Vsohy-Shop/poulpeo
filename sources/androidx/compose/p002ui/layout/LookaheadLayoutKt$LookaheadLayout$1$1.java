package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$1 */
/* compiled from: LookaheadLayout.kt */
final class LookaheadLayoutKt$LookaheadLayout$1$1 extends C12777p implements C13088o<LayoutNode, LookaheadLayoutScopeImpl, C11921v> {
    public static final LookaheadLayoutKt$LookaheadLayout$1$1 INSTANCE = new LookaheadLayoutKt$LookaheadLayout$1$1();

    LookaheadLayoutKt$LookaheadLayout$1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LookaheadLayoutScopeImpl) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode, LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl) {
        C12775o.m28639i(layoutNode, "$this$set");
        C12775o.m28639i(lookaheadLayoutScopeImpl, "scope");
        lookaheadLayoutScopeImpl.setRoot(layoutNode.getInnerCoordinator$ui_release());
    }
}
