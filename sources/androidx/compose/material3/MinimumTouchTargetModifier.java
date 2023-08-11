package androidx.compose.material3;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.DpSize;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TouchTarget.kt */
final class MinimumTouchTargetModifier implements LayoutModifier {
    private final long size;

    public /* synthetic */ MinimumTouchTargetModifier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(Object obj) {
        MinimumTouchTargetModifier minimumTouchTargetModifier;
        if (obj instanceof MinimumTouchTargetModifier) {
            minimumTouchTargetModifier = (MinimumTouchTargetModifier) obj;
        } else {
            minimumTouchTargetModifier = null;
        }
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        return DpSize.m38563equalsimpl0(this.size, minimumTouchTargetModifier.size);
    }

    /* renamed from: getSize-MYxV2XQ  reason: not valid java name */
    public final long m34491getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m38568hashCodeimpl(this.size);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m34492measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        int max = Math.max(r9.getWidth(), measureScope.m38443roundToPx0680j_4(DpSize.m38566getWidthD9Ej5fM(this.size)));
        int max2 = Math.max(r9.getHeight(), measureScope.m38443roundToPx0680j_4(DpSize.m38564getHeightD9Ej5fM(this.size)));
        return MeasureScope.layout$default(measureScope, max, max2, (Map) null, new MinimumTouchTargetModifier$measure$1(max, r9, max2), 4, (Object) null);
    }

    private MinimumTouchTargetModifier(long j) {
        this.size = j;
    }
}
