package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyStaggeredGridSpan.kt */
public final class LazyStaggeredGridSpanProvider {
    private final IntervalList<LazyStaggeredGridIntervalContent> intervals;

    public LazyStaggeredGridSpanProvider(IntervalList<LazyStaggeredGridIntervalContent> intervalList) {
        C12775o.m28639i(intervalList, "intervals");
        this.intervals = intervalList;
    }

    public final IntervalList<LazyStaggeredGridIntervalContent> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int i) {
        boolean z;
        if (i < 0 || i >= this.intervals.getSize()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        IntervalList.Interval<LazyStaggeredGridIntervalContent> interval = this.intervals.get(i);
        Function1<Integer, StaggeredGridItemSpan> span = interval.getValue().getSpan();
        int startIndex = i - interval.getStartIndex();
        if (span == null || span.invoke(Integer.valueOf(startIndex)) != StaggeredGridItemSpan.Companion.getFullLine()) {
            return false;
        }
        return true;
    }
}
