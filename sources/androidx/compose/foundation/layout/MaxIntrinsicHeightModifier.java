package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;

/* compiled from: Intrinsic.kt */
final class MaxIntrinsicHeightModifier implements IntrinsicSizeModifier {
    public static final MaxIntrinsicHeightModifier INSTANCE = new MaxIntrinsicHeightModifier();

    private MaxIntrinsicHeightModifier() {
    }

    /* renamed from: calculateContentConstraints-l58MMJ0  reason: not valid java name */
    public long m33248calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$calculateContentConstraints");
        C12775o.m28639i(measurable, "measurable");
        return Constraints.Companion.m38421fixedHeightOenEA2s(measurable.maxIntrinsicHeight(Constraints.m38412getMaxWidthimpl(j)));
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }
}
