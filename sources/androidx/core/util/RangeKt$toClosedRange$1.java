package androidx.core.util;

import android.util.Range;
import p436tf.C13523c;

/* compiled from: Range.kt */
public final class RangeKt$toClosedRange$1 implements C13523c<T> {
    final /* synthetic */ Range<T> $this_toClosedRange;

    RangeKt$toClosedRange$1(Range<T> range) {
        this.$this_toClosedRange = range;
    }

    public boolean contains(T t) {
        return C13523c.C13524a.m30837a(this, t);
    }

    public T getEndInclusive() {
        return this.$this_toClosedRange.getUpper();
    }

    public T getStart() {
        return this.$this_toClosedRange.getLower();
    }

    public boolean isEmpty() {
        return C13523c.C13524a.m30838b(this);
    }
}
