package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import java.util.List;

/* compiled from: PagerState.kt */
public final class PagerStateKt$EmptyLayoutInfo$1 implements LazyListLayoutInfo {
    private final int mainAxisItemSpacing;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyListItemInfo> visibleItemsInfo = C12726w.m28524k();

    PagerStateKt$EmptyLayoutInfo$1() {
    }

    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    public List<LazyListItemInfo> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }
}
