package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ LayoutNode $this_with;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;
    final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate, LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.this$1 = measurePassDelegate;
        this.$this_with = layoutNode;
    }

    public final void invoke() {
        this.this$0.layoutNode.clearPlaceOrder$ui_release();
        this.this$1.forEachChildAlignmentLinesOwner(C10581.INSTANCE);
        this.$this_with.getInnerCoordinator$ui_release().getMeasureResult$ui_release().placeChildren();
        this.this$0.layoutNode.checkChildrenPlaceOrderForUpdates$ui_release();
        this.this$1.forEachChildAlignmentLinesOwner(C10592.INSTANCE);
    }
}
