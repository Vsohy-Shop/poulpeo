package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;

/* compiled from: Intrinsic.kt */
final class RequiredMaxIntrinsicWidthModifier implements IntrinsicSizeModifier {
    public static final RequiredMaxIntrinsicWidthModifier INSTANCE = new RequiredMaxIntrinsicWidthModifier();
    private static final boolean enforceIncoming = false;

    private RequiredMaxIntrinsicWidthModifier() {
    }

    /* renamed from: calculateContentConstraints-l58MMJ0  reason: not valid java name */
    public long m33304calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$calculateContentConstraints");
        C12775o.m28639i(measurable, "measurable");
        return Constraints.Companion.m38422fixedWidthOenEA2s(measurable.maxIntrinsicWidth(Constraints.m38411getMaxHeightimpl(j)));
    }

    public boolean getEnforceIncoming() {
        return enforceIncoming;
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }
}
