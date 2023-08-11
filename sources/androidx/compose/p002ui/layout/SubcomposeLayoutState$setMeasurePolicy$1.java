package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1 */
/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutState$setMeasurePolicy$1 extends C12777p implements C13088o<LayoutNode, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, C11921v> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) (C13088o) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> oVar) {
        C12775o.m28639i(layoutNode, "$this$null");
        C12775o.m28639i(oVar, "it");
        layoutNode.setMeasurePolicy(this.this$0.getState().createMeasurePolicy(oVar));
    }
}
