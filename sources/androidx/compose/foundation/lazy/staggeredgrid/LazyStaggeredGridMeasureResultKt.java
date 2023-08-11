package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.C12775o;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
public final class LazyStaggeredGridMeasureResultKt {
    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i) {
        C12775o.m28639i(lazyStaggeredGridLayoutInfo, "<this>");
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) C12686e0.m28221Z(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        boolean z = false;
        if (i <= ((LazyStaggeredGridItemInfo) C12686e0.m28231j0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() && index <= i) {
            z = true;
        }
        if (!z) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) C12686e0.m28224c0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), C12726w.m28522i(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(i), 3, (Object) null));
    }
}
