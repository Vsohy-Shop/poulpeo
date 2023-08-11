package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.DefaultIntrinsicMeasurable */
/* compiled from: Layout.kt */
public final class DefaultIntrinsicMeasurable implements Measurable {
    private final IntrinsicMeasurable measurable;
    private final IntrinsicMinMax minMax;
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        C12775o.m28639i(intrinsicMinMax, "minMax");
        C12775o.m28639i(intrinsicWidthHeight, "widthHeight");
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    public final IntrinsicMinMax getMinMax() {
        return this.minMax;
    }

    public Object getParentData() {
        return this.measurable.getParentData();
    }

    public final IntrinsicWidthHeight getWidthHeight() {
        return this.widthHeight;
    }

    public int maxIntrinsicHeight(int i) {
        return this.measurable.maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        return this.measurable.maxIntrinsicWidth(i);
    }

    /* renamed from: measure-BRTryo0  reason: not valid java name */
    public Placeable m37323measureBRTryo0(long j) {
        int i;
        int i2;
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            if (this.minMax == IntrinsicMinMax.Max) {
                i2 = this.measurable.maxIntrinsicWidth(Constraints.m38411getMaxHeightimpl(j));
            } else {
                i2 = this.measurable.minIntrinsicWidth(Constraints.m38411getMaxHeightimpl(j));
            }
            return new FixedSizeIntrinsicsPlaceable(i2, Constraints.m38411getMaxHeightimpl(j));
        }
        if (this.minMax == IntrinsicMinMax.Max) {
            i = this.measurable.maxIntrinsicHeight(Constraints.m38412getMaxWidthimpl(j));
        } else {
            i = this.measurable.minIntrinsicHeight(Constraints.m38412getMaxWidthimpl(j));
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.m38412getMaxWidthimpl(j), i);
    }

    public int minIntrinsicHeight(int i) {
        return this.measurable.minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(int i) {
        return this.measurable.minIntrinsicWidth(i);
    }
}
