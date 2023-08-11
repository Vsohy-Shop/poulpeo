package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1 */
/* compiled from: SubcomposeLayout.kt */
public final class LayoutNodeSubcompositionsState$createMeasurePolicy$1 extends LayoutNode.NoIntrinsicsMeasurePolicy {
    final /* synthetic */ C13088o<SubcomposeMeasureScope, Constraints, MeasureResult> $block;
    final /* synthetic */ LayoutNodeSubcompositionsState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeSubcompositionsState$createMeasurePolicy$1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> oVar, String str) {
        super(str);
        this.this$0 = layoutNodeSubcompositionsState;
        this.$block = oVar;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m37351measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(list, "measurables");
        this.this$0.scope.setLayoutDirection(measureScope.getLayoutDirection());
        this.this$0.scope.setDensity(measureScope.getDensity());
        this.this$0.scope.setFontScale(measureScope.getFontScale());
        this.this$0.currentIndex = 0;
        return new LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1(this.$block.invoke(this.this$0.scope, Constraints.m38400boximpl(j)), this.this$0, this.this$0.currentIndex);
    }
}
