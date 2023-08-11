package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.Measurable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1 extends C12777p implements Function1<LayoutNode, Measurable> {
    public static final LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1 INSTANCE = new LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1();

    LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1() {
        super(1);
    }

    public final Measurable invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "it");
        return layoutNode.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release();
    }
}
