package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 */
/* compiled from: LazyGrid.kt */
final class C0544x6964719 implements MeasuredItemFactory {
    final /* synthetic */ int $afterContentPadding;
    final /* synthetic */ int $beforeContentPadding;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyGridItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyLayoutMeasureScope $this_null;
    final /* synthetic */ long $visualItemOffset;

    C0544x6964719(LazyLayoutMeasureScope lazyLayoutMeasureScope, boolean z, boolean z2, int i, int i2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.$this_null = lazyLayoutMeasureScope;
        this.$isVertical = z;
        this.$reverseLayout = z2;
        this.$beforeContentPadding = i;
        this.$afterContentPadding = i2;
        this.$placementAnimator = lazyGridItemPlacementAnimator;
        this.$visualItemOffset = j;
    }

    /* renamed from: createItem-PU_OBEw  reason: not valid java name */
    public final LazyGridMeasuredItem m33471createItemPU_OBEw(int i, Object obj, int i2, int i3, List<? extends Placeable> list) {
        Object obj2 = obj;
        C12775o.m28639i(obj2, "key");
        List<? extends Placeable> list2 = list;
        C12775o.m28639i(list2, "placeables");
        return new LazyGridMeasuredItem(i, obj2, this.$isVertical, i2, i3, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, list2, this.$placementAnimator, this.$visualItemOffset, (DefaultConstructorMarker) null);
    }
}
