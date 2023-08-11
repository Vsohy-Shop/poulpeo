package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: Spacer.kt */
final class SpacerMeasurePolicy implements MeasurePolicy {
    public static final SpacerMeasurePolicy INSTANCE = new SpacerMeasurePolicy();

    private SpacerMeasurePolicy() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33351measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(list, "measurables");
        int i2 = 0;
        if (Constraints.m38410getHasFixedWidthimpl(j)) {
            i = Constraints.m38412getMaxWidthimpl(j);
        } else {
            i = 0;
        }
        if (Constraints.m38409getHasFixedHeightimpl(j)) {
            i2 = Constraints.m38411getMaxHeightimpl(j);
        }
        return MeasureScope.layout$default(measureScope, i, i2, (Map) null, SpacerMeasurePolicy$measure$1$1.INSTANCE, 4, (Object) null);
    }
}
