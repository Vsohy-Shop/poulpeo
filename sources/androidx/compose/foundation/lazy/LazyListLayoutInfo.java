package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;

/* compiled from: LazyListLayoutInfo.kt */
public interface LazyListLayoutInfo {

    /* compiled from: LazyListLayoutInfo.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static int getAfterContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getAfterContentPadding();
        }

        @Deprecated
        public static int getBeforeContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getBeforeContentPadding();
        }

        @Deprecated
        public static int getMainAxisItemSpacing(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getMainAxisItemSpacing();
        }

        @Deprecated
        public static Orientation getOrientation(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getOrientation();
        }

        @Deprecated
        public static boolean getReverseLayout(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getReverseLayout();
        }

        @Deprecated
        /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
        public static long m33412getViewportSizeYbymL2g(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.m33411getViewportSizeYbymL2g();
        }
    }

    int getAfterContentPadding() {
        return 0;
    }

    int getBeforeContentPadding() {
        return 0;
    }

    int getMainAxisItemSpacing() {
        return 0;
    }

    Orientation getOrientation() {
        return Orientation.Vertical;
    }

    boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    long m33411getViewportSizeYbymL2g() {
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    int getViewportStartOffset();

    List<LazyListItemInfo> getVisibleItemsInfo();
}
