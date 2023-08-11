package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: Intrinsic.kt */
interface IntrinsicSizeModifier extends LayoutModifier {
    /* renamed from: calculateContentConstraints-l58MMJ0  reason: not valid java name */
    long m33245calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j);

    boolean getEnforceIncoming() {
        return true;
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    MeasureResult m33246measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        long r0 = m33245calculateContentConstraintsl58MMJ0(measureScope, measurable, j);
        if (getEnforceIncoming()) {
            r0 = ConstraintsKt.m38424constrainN9IONVI(j, r0);
        }
        Placeable r9 = measurable.m37365measureBRTryo0(r0);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new IntrinsicSizeModifier$measure$1(r9), 4, (Object) null);
    }

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }
}
