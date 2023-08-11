package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n878#2:1098\n880#2:1100\n879#2:1101\n878#2:1103\n880#2:1105\n879#2:1106\n878#2:1108\n55#3:1099\n62#3:1102\n55#3:1104\n62#3:1107\n55#3:1109\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n993#1:1098\n993#1:1100\n993#1:1101\n994#1:1103\n994#1:1105\n994#1:1106\n994#1:1108\n993#1:1099\n993#1:1102\n994#1:1104\n994#1:1107\n994#1:1109\n*E\n"})
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridMeasureProvider {
    private final int crossAxisSpacing;
    private final boolean isVertical;
    private final LazyLayoutItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final MeasuredItemFactory measuredItemFactory;
    private final int[] resolvedSlotSums;

    public LazyStaggeredGridMeasureProvider(boolean z, LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int[] iArr, int i, MeasuredItemFactory measuredItemFactory2) {
        C12775o.m28639i(lazyLayoutItemProvider, "itemProvider");
        C12775o.m28639i(lazyLayoutMeasureScope, "measureScope");
        C12775o.m28639i(iArr, "resolvedSlotSums");
        C12775o.m28639i(measuredItemFactory2, "measuredItemFactory");
        this.isVertical = z;
        this.itemProvider = lazyLayoutItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.resolvedSlotSums = iArr;
        this.crossAxisSpacing = i;
        this.measuredItemFactory = measuredItemFactory2;
    }

    /* renamed from: childConstraints-JhjzzOo  reason: not valid java name */
    private final long m33562childConstraintsJhjzzOo(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 0;
        } else {
            i3 = this.resolvedSlotSums[i - 1];
        }
        int i4 = (this.resolvedSlotSums[(i + i2) - 1] - i3) + (this.crossAxisSpacing * (i2 - 1));
        if (this.isVertical) {
            return Constraints.Companion.m38422fixedWidthOenEA2s(i4);
        }
        return Constraints.Companion.m38421fixedHeightOenEA2s(i4);
    }

    /* renamed from: getAndMeasure-jy6DScQ  reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m33563getAndMeasurejy6DScQ(int i, long j) {
        int i2 = (int) (j >> 32);
        int i3 = ((int) (j & 4294967295L)) - i2;
        return this.measuredItemFactory.createItem(i, i2, i3, this.itemProvider.getKey(i), this.measureScope.m33517measure0kLqBqw(i, m33562childConstraintsJhjzzOo(i2, i3)));
    }
}
