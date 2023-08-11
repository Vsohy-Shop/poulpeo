package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.runtime.CompositionContext;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1 */
/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutState$setCompositionContext$1 extends C12777p implements C13088o<LayoutNode, CompositionContext, C11921v> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutState$setCompositionContext$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (CompositionContext) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
        C12775o.m28639i(layoutNode, "$this$null");
        C12775o.m28639i(compositionContext, "it");
        this.this$0.getState().setCompositionContext(compositionContext);
    }
}
