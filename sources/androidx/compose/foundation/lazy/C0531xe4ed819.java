package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 */
/* compiled from: LazyList.kt */
final class C0531xe4ed819 implements MeasuredItemFactory {
    final /* synthetic */ int $afterContentPadding;
    final /* synthetic */ int $beforeContentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ int $itemsCount;
    final /* synthetic */ LazyListItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ int $spaceBetweenItems;
    final /* synthetic */ LazyLayoutMeasureScope $this_null;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ long $visualItemOffset;

    C0531xe4ed819(int i, int i2, LazyLayoutMeasureScope lazyLayoutMeasureScope, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z2, int i3, int i4, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
        this.$itemsCount = i;
        this.$spaceBetweenItems = i2;
        this.$this_null = lazyLayoutMeasureScope;
        this.$isVertical = z;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$reverseLayout = z2;
        this.$beforeContentPadding = i3;
        this.$afterContentPadding = i4;
        this.$placementAnimator = lazyListItemPlacementAnimator;
        this.$visualItemOffset = j;
    }

    /* renamed from: createItem-HK0c1C0  reason: not valid java name */
    public final LazyMeasuredItem m33409createItemHK0c1C0(int i, Object obj, List<? extends Placeable> list) {
        int i2;
        C12775o.m28639i(obj, "key");
        C12775o.m28639i(list, "placeables");
        if (i == this.$itemsCount - 1) {
            i2 = 0;
        } else {
            i2 = this.$spaceBetweenItems;
        }
        int i3 = i2;
        return new LazyMeasuredItem(i, list, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, this.$placementAnimator, i3, this.$visualItemOffset, obj, (DefaultConstructorMarker) null);
    }
}
