package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
final class LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1 extends C12777p implements Function1<LazyStaggeredGridItemInfo, Integer> {
    final /* synthetic */ int $itemIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(int i) {
        super(1);
        this.$itemIndex = i;
    }

    public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
        C12775o.m28639i(lazyStaggeredGridItemInfo, "it");
        return Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - this.$itemIndex);
    }
}
