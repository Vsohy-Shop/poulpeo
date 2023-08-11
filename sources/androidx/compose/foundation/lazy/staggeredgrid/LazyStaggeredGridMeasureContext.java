package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n217#1:1103\n880#2:1098\n879#2:1099\n878#2:1101\n880#2:1104\n879#2:1105\n878#2:1107\n62#3:1100\n55#3:1102\n62#3:1106\n55#3:1108\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n220#1:1103\n217#1:1098\n217#1:1099\n217#1:1101\n220#1:1104\n220#1:1105\n220#1:1107\n217#1:1100\n217#1:1102\n220#1:1106\n220#1:1108\n*E\n"})
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridMeasureContext {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final int crossAxisSpacing;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;
    private final int[] resolvedSlotSums;
    private final boolean reverseLayout;
    private final LazyStaggeredGridState state;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int[] iArr, long j, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, lazyStaggeredGridItemProvider, iArr, j, z, lazyLayoutMeasureScope, i, j2, i2, i3, z2, i4, i5);
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m33552getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac  reason: not valid java name */
    public final long m33553getContentOffsetnOccac() {
        return this.contentOffset;
    }

    public final int getCrossAxisSpacing() {
        return this.crossAxisSpacing;
    }

    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA  reason: not valid java name */
    public final int m33554getLaneInfoSZVOQXA(long j) {
        int i = (int) (j >> 32);
        boolean z = true;
        if (((int) (4294967295L & j)) - i == 1) {
            z = false;
        }
        if (z) {
            return -2;
        }
        return i;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final int[] getResolvedSlotSums() {
        return this.resolvedSlotSums;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c  reason: not valid java name */
    public final long m33555getSpanRangelOCCd4c(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i, int i2) {
        int i3;
        C12775o.m28639i(lazyStaggeredGridItemProvider, "$this$getSpanRange");
        boolean isFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
        if (isFullSpan) {
            i3 = this.laneCount;
        } else {
            i3 = 1;
        }
        if (isFullSpan) {
            i2 = 0;
        }
        return SpanRange.m33569constructorimpl(i2, i3);
    }

    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i) {
        C12775o.m28639i(lazyStaggeredGridItemProvider, "<this>");
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
    }

    /* renamed from: isFullSpan-SZVOQXA  reason: not valid java name */
    public final boolean m33556isFullSpanSZVOQXA(long j) {
        if (((int) (4294967295L & j)) - ((int) (j >> 32)) != 1) {
            return true;
        }
        return false;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int[] iArr, long j, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, int i5) {
        this.state = lazyStaggeredGridState;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlotSums = iArr;
        this.constraints = j;
        this.isVertical = z;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i;
        this.contentOffset = j2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.reverseLayout = z2;
        this.mainAxisSpacing = i4;
        this.crossAxisSpacing = i5;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, iArr, i5, new LazyStaggeredGridMeasureContext$measuredItemProvider$1(this));
        this.laneInfo = lazyStaggeredGridState.getLaneInfo$foundation_release();
        this.laneCount = iArr.length;
    }
}
