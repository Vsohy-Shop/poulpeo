package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyGridMeasureResult.kt */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final LazyGridMeasuredLine firstVisibleLine;
    private final int firstVisibleLineScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyGridItemInfo> visibleItemsInfo;

    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, List<? extends LazyGridItemInfo> list, int i2, int i3, int i4, boolean z2, Orientation orientation2, int i5, int i6) {
        C12775o.m28639i(measureResult, "measureResult");
        C12775o.m28639i(list, "visibleItemsInfo");
        C12775o.m28639i(orientation2, "orientation");
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.reverseLayout = z2;
        this.orientation = orientation2;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
        this.$$delegate_0 = measureResult;
    }

    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public Orientation getOrientation() {
        return this.orientation;
    }

    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    public long m33475getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    public List<LazyGridItemInfo> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    public int getWidth() {
        return this.$$delegate_0.getWidth();
    }

    public void placeChildren() {
        this.$$delegate_0.placeChildren();
    }
}
