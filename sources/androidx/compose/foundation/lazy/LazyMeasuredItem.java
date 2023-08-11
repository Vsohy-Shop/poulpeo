package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,193:1\n33#2,6:194\n33#2,6:200\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n*L\n72#1:194,6\n93#1:200,6\n*E\n"})
/* compiled from: LazyMeasuredItem.kt */
public final class LazyMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private final List<Placeable> placeables;
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    @ExperimentalFoundationApi
    public /* synthetic */ LazyMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection2, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, horizontal, vertical, layoutDirection2, z2, i2, i3, lazyListItemPlacementAnimator, i4, j, obj);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final LazyListPositionedItem position(int i, int i2, int i3) {
        int i4;
        long j;
        int i5;
        ArrayList arrayList = new ArrayList();
        if (this.isVertical) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        List<Placeable> list = this.placeables;
        int size2 = list.size();
        int i6 = i;
        for (int i7 = 0; i7 < size2; i7++) {
            Placeable placeable = list.get(i7);
            if (this.isVertical) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal != null) {
                    j = IntOffsetKt.IntOffset(horizontal.align(placeable.getWidth(), i2, this.layoutDirection), i6);
                    int i8 = i3;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                int i9 = i2;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical != null) {
                    j = IntOffsetKt.IntOffset(i6, vertical.align(placeable.getHeight(), i3));
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            if (this.isVertical) {
                i5 = placeable.getHeight();
            } else {
                i5 = placeable.getWidth();
            }
            i6 += i5;
            arrayList.add(new LazyListPlaceableWrapper(j, placeable, (DefaultConstructorMarker) null));
        }
        return new LazyListPositionedItem(i, this.index, this.key, this.size, -this.beforeContentPadding, i4 + this.afterContentPadding, this.isVertical, arrayList, this.placementAnimator, this.visualOffset, this.reverseLayout, i4, (DefaultConstructorMarker) null);
    }

    private LazyMeasuredItem(int i, List<? extends Placeable> list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection2, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj) {
        this.index = i;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection2;
        this.reverseLayout = z2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        int size2 = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            i5 += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            i6 = Math.max(i6, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = i5;
        this.sizeWithSpacings = C13537l.m30877d(i5 + this.spacing, 0);
        this.crossAxisSize = i6;
    }
}
