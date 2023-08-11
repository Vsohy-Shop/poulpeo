package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 */
/* compiled from: LazyGrid.kt */
final class C0545xaa796ba implements MeasuredLineFactory {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ List<Integer> $resolvedSlotSizesSums;
    final /* synthetic */ int $spaceBetweenSlots;
    final /* synthetic */ LazyLayoutMeasureScope $this_null;

    C0545xaa796ba(boolean z, List<Integer> list, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        this.$isVertical = z;
        this.$resolvedSlotSizesSums = list;
        this.$this_null = lazyLayoutMeasureScope;
        this.$spaceBetweenSlots = i;
    }

    /* renamed from: createLine-H9FfpSk  reason: not valid java name */
    public final LazyGridMeasuredLine m33472createLineH9FfpSk(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i2) {
        C12775o.m28639i(lazyGridMeasuredItemArr, "items");
        C12775o.m28639i(list, "spans");
        return new LazyGridMeasuredLine(i, lazyGridMeasuredItemArr, list, this.$isVertical, this.$resolvedSlotSizesSums.size(), this.$this_null.getLayoutDirection(), i2, this.$spaceBetweenSlots, (DefaultConstructorMarker) null);
    }
}
