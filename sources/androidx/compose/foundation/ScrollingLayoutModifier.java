package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: Scroll.kt */
final class ScrollingLayoutModifier implements LayoutModifier {
    private final boolean isReversed;
    private final boolean isVertical;
    private final ScrollState scrollerState;

    public ScrollingLayoutModifier(ScrollState scrollState, boolean z, boolean z2) {
        C12775o.m28639i(scrollState, "scrollerState");
        this.scrollerState = scrollState;
        this.isReversed = z;
        this.isVertical = z2;
    }

    public static /* synthetic */ ScrollingLayoutModifier copy$default(ScrollingLayoutModifier scrollingLayoutModifier, ScrollState scrollState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            scrollState = scrollingLayoutModifier.scrollerState;
        }
        if ((i & 2) != 0) {
            z = scrollingLayoutModifier.isReversed;
        }
        if ((i & 4) != 0) {
            z2 = scrollingLayoutModifier.isVertical;
        }
        return scrollingLayoutModifier.copy(scrollState, z, z2);
    }

    public final ScrollState component1() {
        return this.scrollerState;
    }

    public final boolean component2() {
        return this.isReversed;
    }

    public final boolean component3() {
        return this.isVertical;
    }

    public final ScrollingLayoutModifier copy(ScrollState scrollState, boolean z, boolean z2) {
        C12775o.m28639i(scrollState, "scrollerState");
        return new ScrollingLayoutModifier(scrollState, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) obj;
        if (C12775o.m28634d(this.scrollerState, scrollingLayoutModifier.scrollerState) && this.isReversed == scrollingLayoutModifier.isReversed && this.isVertical == scrollingLayoutModifier.isVertical) {
            return true;
        }
        return false;
    }

    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    public int hashCode() {
        int hashCode = this.scrollerState.hashCode() * 31;
        boolean z = this.isReversed;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isVertical;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (this.isVertical) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (this.isVertical) {
            return intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33033measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Orientation orientation;
        int i;
        int i2;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        if (this.isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m32977checkScrollableContainerConstraintsK40F9xA(j, orientation);
        int i3 = Integer.MAX_VALUE;
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        } else {
            i = Constraints.m38411getMaxHeightimpl(j);
        }
        if (this.isVertical) {
            i3 = Constraints.m38412getMaxWidthimpl(j);
        }
        Placeable r12 = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, i3, 0, i, 5, (Object) null));
        int i4 = C13537l.m30882i(r12.getWidth(), Constraints.m38412getMaxWidthimpl(j));
        int i5 = C13537l.m30882i(r12.getHeight(), Constraints.m38411getMaxHeightimpl(j));
        int height = r12.getHeight() - i5;
        int width = r12.getWidth() - i4;
        if (!this.isVertical) {
            height = width;
        }
        this.scrollerState.setMaxValue$foundation_release(height);
        ScrollState scrollState = this.scrollerState;
        if (this.isVertical) {
            i2 = i5;
        } else {
            i2 = i4;
        }
        scrollState.setViewportSize$foundation_release(i2);
        return MeasureScope.layout$default(measureScope, i4, i5, (Map) null, new ScrollingLayoutModifier$measure$1(this, height, r12), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (this.isVertical) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (this.isVertical) {
            return intrinsicMeasurable.minIntrinsicWidth(Integer.MAX_VALUE);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.scrollerState + ", isReversed=" + this.isReversed + ", isVertical=" + this.isVertical + ')';
    }
}
