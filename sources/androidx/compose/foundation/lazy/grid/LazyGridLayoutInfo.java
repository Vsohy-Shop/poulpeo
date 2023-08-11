package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: LazyGridLayoutInfo.kt */
public interface LazyGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    long m33473getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyGridItemInfo> getVisibleItemsInfo();
}
