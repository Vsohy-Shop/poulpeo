package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1 */
/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutState$setRoot$1 extends C12777p implements C13088o<LayoutNode, SubcomposeLayoutState, C11921v> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (SubcomposeLayoutState) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        C12775o.m28639i(layoutNode, "$this$null");
        C12775o.m28639i(subcomposeLayoutState, "it");
        SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
        LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
        if (subcompositionsState$ui_release == null) {
            subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, this.this$0.slotReusePolicy);
            layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
        }
        subcomposeLayoutState2._state = subcompositionsState$ui_release;
        this.this$0.getState().makeSureStateIsConsistent();
        this.this$0.getState().setSlotReusePolicy(this.this$0.slotReusePolicy);
    }
}
