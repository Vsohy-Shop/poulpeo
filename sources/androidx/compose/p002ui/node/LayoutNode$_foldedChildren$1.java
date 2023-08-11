package androidx.compose.p002ui.node;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.LayoutNode$_foldedChildren$1 */
/* compiled from: LayoutNode.kt */
final class LayoutNode$_foldedChildren$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ LayoutNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNode$_foldedChildren$1(LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNode;
    }

    public final void invoke() {
        this.this$0.getLayoutDelegate$ui_release().markChildrenDirty();
    }
}
