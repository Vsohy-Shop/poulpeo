package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1 */
/* compiled from: LayoutNode.kt */
public final class LayoutNode$Companion$ErrorMeasurePolicy$1 extends LayoutNode.NoIntrinsicsMeasurePolicy {
    LayoutNode$Companion$ErrorMeasurePolicy$1() {
        super("Undefined intrinsics block and it is required");
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public Void m37507measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(list, "measurables");
        throw new IllegalStateException("Undefined measure and it is required".toString());
    }
}
