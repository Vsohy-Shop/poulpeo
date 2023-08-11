package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

@ExperimentalFoundationApi
/* compiled from: LazyStaggeredGridMeasureResult.kt */
public interface LazyStaggeredGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    Orientation getOrientation();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    long m33551getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyStaggeredGridItemInfo> getVisibleItemsInfo();
}
