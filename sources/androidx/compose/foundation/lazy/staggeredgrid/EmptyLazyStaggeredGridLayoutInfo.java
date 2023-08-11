package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
public final class EmptyLazyStaggeredGridLayoutInfo implements LazyStaggeredGridLayoutInfo {
    public static final EmptyLazyStaggeredGridLayoutInfo INSTANCE = new EmptyLazyStaggeredGridLayoutInfo();
    private static final int afterContentPadding = 0;
    private static final int beforeContentPadding = 0;
    private static final int mainAxisItemSpacing = 0;
    private static final Orientation orientation = Orientation.Vertical;
    private static final int totalItemsCount = 0;
    private static final int viewportEndOffset = 0;
    private static final long viewportSize = IntSize.Companion.m38633getZeroYbymL2g();
    private static final int viewportStartOffset = 0;
    private static final List<LazyStaggeredGridItemInfo> visibleItemsInfo = C12726w.m28524k();

    private EmptyLazyStaggeredGridLayoutInfo() {
    }

    public int getAfterContentPadding() {
        return afterContentPadding;
    }

    public int getBeforeContentPadding() {
        return beforeContentPadding;
    }

    public int getMainAxisItemSpacing() {
        return mainAxisItemSpacing;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    public int getViewportEndOffset() {
        return viewportEndOffset;
    }

    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    public long m33543getViewportSizeYbymL2g() {
        return viewportSize;
    }

    public int getViewportStartOffset() {
        return viewportStartOffset;
    }

    public List<LazyStaggeredGridItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
