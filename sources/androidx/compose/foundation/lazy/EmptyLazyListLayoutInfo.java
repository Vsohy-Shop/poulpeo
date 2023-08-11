package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;

/* compiled from: LazyListState.kt */
final class EmptyLazyListLayoutInfo implements LazyListLayoutInfo {
    public static final EmptyLazyListLayoutInfo INSTANCE = new EmptyLazyListLayoutInfo();
    private static final int afterContentPadding = 0;
    private static final int beforeContentPadding = 0;
    private static final int mainAxisItemSpacing = 0;
    private static final Orientation orientation = Orientation.Vertical;
    private static final boolean reverseLayout = false;
    private static final int totalItemsCount = 0;
    private static final int viewportEndOffset = 0;
    private static final long viewportSize = IntSize.Companion.m38633getZeroYbymL2g();
    private static final int viewportStartOffset = 0;
    private static final List<LazyListItemInfo> visibleItemsInfo = C12726w.m28524k();

    private EmptyLazyListLayoutInfo() {
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

    public boolean getReverseLayout() {
        return reverseLayout;
    }

    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    public int getViewportEndOffset() {
        return viewportEndOffset;
    }

    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    public long m33402getViewportSizeYbymL2g() {
        return viewportSize;
    }

    public int getViewportStartOffset() {
        return viewportStartOffset;
    }

    public List<LazyListItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
