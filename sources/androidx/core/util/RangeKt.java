package androidx.core.util;

import android.util.Range;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;
import p436tf.C13523c;

/* compiled from: Range.kt */
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        C12775o.m28639i(range, "<this>");
        C12775o.m28639i(range2, "other");
        Range<T> intersect = range.intersect(range2);
        C12775o.m28638h(intersect, "intersect(other)");
        return intersect;
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        C12775o.m28639i(range, "<this>");
        C12775o.m28639i(t, "value");
        Range<T> extend = range.extend(t);
        C12775o.m28638h(extend, "extend(value)");
        return extend;
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(t2, "that");
        return new Range<>(t, t2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> C13523c<T> toClosedRange(Range<T> range) {
        C12775o.m28639i(range, "<this>");
        return new RangeKt$toClosedRange$1(range);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(C13523c<T> cVar) {
        C12775o.m28639i(cVar, "<this>");
        return new Range<>(cVar.getStart(), cVar.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        C12775o.m28639i(range, "<this>");
        C12775o.m28639i(range2, "other");
        Range<T> extend = range.extend(range2);
        C12775o.m28638h(extend, "extend(other)");
        return extend;
    }
}
