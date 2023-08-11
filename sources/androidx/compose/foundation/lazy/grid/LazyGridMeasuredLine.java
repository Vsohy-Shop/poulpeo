package androidx.compose.foundation.lazy.grid;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,97:1\n13579#2,2:98\n11425#2:100\n11536#2,4:101\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n52#1:98,2\n75#1:100\n75#1:101,4\n*E\n"})
/* compiled from: LazyGridMeasuredLine.kt */
public final class LazyGridMeasuredLine {
    private final int crossAxisSpacing;
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final int slotsPerLine;
    private final List<GridItemSpan> spans;

    public /* synthetic */ LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List list, boolean z, int i2, LayoutDirection layoutDirection2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, lazyGridMeasuredItemArr, list, z, i2, layoutDirection2, i3, i4);
    }

    /* renamed from: getIndex-hA7yfN8  reason: not valid java name */
    public final int m33477getIndexhA7yfN8() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        if (this.items.length == 0) {
            return true;
        }
        return false;
    }

    public final List<LazyGridPositionedItem> position(int i, int i2, int i3) {
        int i4;
        int i5;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        ArrayList arrayList = new ArrayList(lazyGridMeasuredItemArr.length);
        int length = lazyGridMeasuredItemArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i6];
            int i10 = i7 + 1;
            int r5 = GridItemSpan.m33436getCurrentLineSpanimpl(this.spans.get(i7).m33439unboximpl());
            if (this.layoutDirection == LayoutDirection.Rtl) {
                i4 = (this.slotsPerLine - i8) - r5;
            } else {
                i4 = i8;
            }
            boolean z = this.isVertical;
            if (z) {
                i5 = this.index;
            } else {
                i5 = i4;
            }
            if (!z) {
                i4 = this.index;
            }
            LazyGridPositionedItem position = lazyGridMeasuredItem.position(i, i9, i2, i3, i5, i4);
            i9 += lazyGridMeasuredItem.getCrossAxisSize() + this.crossAxisSpacing;
            i8 += r5;
            arrayList.add(position);
            i6++;
            i7 = i10;
        }
        return arrayList;
    }

    private LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, boolean z, int i2, LayoutDirection layoutDirection2, int i3, int i4) {
        this.index = i;
        this.items = lazyGridMeasuredItemArr;
        this.spans = list;
        this.isVertical = z;
        this.slotsPerLine = i2;
        this.layoutDirection = layoutDirection2;
        this.mainAxisSpacing = i3;
        this.crossAxisSpacing = i4;
        int i5 = 0;
        for (LazyGridMeasuredItem mainAxisSize2 : lazyGridMeasuredItemArr) {
            i5 = Math.max(i5, mainAxisSize2.getMainAxisSize());
        }
        this.mainAxisSize = i5;
        this.mainAxisSizeWithSpacings = C13537l.m30877d(i5 + this.mainAxisSpacing, 0);
    }
}
