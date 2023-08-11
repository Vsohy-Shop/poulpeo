package androidx.compose.foundation.lazy.grid;

import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,196:1\n33#2,6:197\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n66#1:197,6\n*E\n"})
/* compiled from: LazyGridMeasuredItem.kt */
public final class LazyGridMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final List<Placeable> placeables;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection2, int i4, int i5, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection2, i4, i5, list, lazyGridItemPlacementAnimator, j);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: getIndex-VZbfaAc  reason: not valid java name */
    public final int m33476getIndexVZbfaAc() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    public final LazyGridPositionedItem position(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        long j;
        long j2;
        int i10 = i;
        boolean z = this.isVertical;
        if (z) {
            i7 = i4;
        } else {
            i7 = i3;
        }
        if (z) {
            i8 = i3;
        } else {
            i8 = i4;
        }
        if (!z || this.layoutDirection != LayoutDirection.Rtl) {
            i9 = i2;
        } else {
            i9 = (i8 - i2) - this.crossAxisSize;
        }
        if (z) {
            j = IntOffsetKt.IntOffset(i9, i10);
        } else {
            j = IntOffsetKt.IntOffset(i10, i9);
        }
        long j3 = j;
        int i11 = this.index;
        Object obj = this.key;
        if (this.isVertical) {
            j2 = IntSizeKt.IntSize(this.crossAxisSize, this.mainAxisSize);
        } else {
            j2 = IntSizeKt.IntSize(this.mainAxisSize, this.crossAxisSize);
        }
        return new LazyGridPositionedItem(j3, i11, obj, i5, i6, j2, -this.beforeContentPadding, i7 + this.afterContentPadding, this.isVertical, this.placeables, this.placementAnimator, this.visualOffset, i7, this.reverseLayout, (DefaultConstructorMarker) null);
    }

    private LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection2, int i4, int i5, List<? extends Placeable> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.mainAxisSpacing = i3;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection2;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j;
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            i6 = Math.max(i6, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i6;
        this.mainAxisSizeWithSpacings = C13537l.m30877d(i6 + this.mainAxisSpacing, 0);
    }
}
