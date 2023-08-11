package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: LazyLayoutItemProvider.kt */
final class DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1 extends C12777p implements Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent>, C11921v> {
    final /* synthetic */ int $first;
    final /* synthetic */ int $last;
    final /* synthetic */ HashMap<Object, Integer> $map;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1(int i, int i2, HashMap<Object, Integer> hashMap) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = hashMap;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IntervalList.Interval<? extends LazyLayoutIntervalContent>) (IntervalList.Interval) obj);
        return C11921v.f18618a;
    }

    public final void invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent> interval) {
        C12775o.m28639i(interval, "it");
        if (((LazyLayoutIntervalContent) interval.getValue()).getKey() != null) {
            Function1<Integer, Object> key = ((LazyLayoutIntervalContent) interval.getValue()).getKey();
            if (key != null) {
                int max = Math.max(this.$first, interval.getStartIndex());
                int min = Math.min(this.$last, (interval.getStartIndex() + interval.getSize()) - 1);
                if (max <= min) {
                    while (true) {
                        this.$map.put(key.invoke(Integer.valueOf(max - interval.getStartIndex())), Integer.valueOf(max));
                        if (max != min) {
                            max++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }
}
