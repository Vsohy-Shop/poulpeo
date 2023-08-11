package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n1182#2:217\n1161#2,2:218\n523#3:220\n523#3:221\n523#3:222\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n98#1:217\n98#1:218,2\n150#1:220\n152#1:221\n169#1:222\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: IntervalList.kt */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i) {
        boolean z = false;
        if (i >= 0 && i < getSize()) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + getSize());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i) {
        int startIndex = interval.getStartIndex();
        if (i >= interval.getStartIndex() + interval.getSize() || startIndex > i) {
            return false;
        }
        return true;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i) {
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval != null && contains(interval, i)) {
            return interval;
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
        IntervalList.Interval<? extends T> interval2 = (IntervalList.Interval) mutableVector.getContent()[IntervalListKt.binarySearch(mutableVector, i)];
        this.lastInterval = interval2;
        return interval2;
    }

    public final void addInterval(int i, T t) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
        } else if (i != 0) {
            IntervalList.Interval interval = new IntervalList.Interval(getSize(), i, t);
            this.size = getSize() + i;
            this.intervals.add(interval);
        }
    }

    public void forEach(int i, int i2, Function1<? super IntervalList.Interval<? extends T>, C11921v> function1) {
        boolean z;
        C12775o.m28639i(function1, "block");
        checkIndexBounds(i);
        checkIndexBounds(i2);
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int access$binarySearch = IntervalListKt.binarySearch(this.intervals, i);
            int startIndex = ((IntervalList.Interval) this.intervals.getContent()[access$binarySearch]).getStartIndex();
            while (startIndex <= i2) {
                IntervalList.Interval interval = (IntervalList.Interval) this.intervals.getContent()[access$binarySearch];
                function1.invoke(interval);
                startIndex += interval.getSize();
                access$binarySearch++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
    }

    public IntervalList.Interval<T> get(int i) {
        checkIndexBounds(i);
        return getIntervalForIndex(i);
    }

    public int getSize() {
        return this.size;
    }
}
