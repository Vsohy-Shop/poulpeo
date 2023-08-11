package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,94:1\n1#2:95\n69#3,6:96\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:96,6\n*E\n"})
/* compiled from: LazyListHeaders.kt */
public final class LazyListHeadersKt {
    public static final LazyListPositionedItem findOrComposeLazyListHeader(List<LazyListPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, List<Integer> list2, int i, int i2, int i3) {
        int i4;
        int i5;
        List<LazyListPositionedItem> list3 = list;
        LazyMeasuredItemProvider lazyMeasuredItemProvider2 = lazyMeasuredItemProvider;
        List<Integer> list4 = list2;
        int i6 = i;
        C12775o.m28639i(list, "composedVisibleItems");
        C12775o.m28639i(lazyMeasuredItemProvider2, "itemProvider");
        C12775o.m28639i(list4, "headerIndexes");
        int index = ((LazyListPositionedItem) C12686e0.m28221Z(list)).getIndex();
        int size = list2.size();
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        while (i9 < size && list4.get(i9).intValue() <= index) {
            i7 = list4.get(i9).intValue();
            i9++;
            if (i9 < 0 || i9 > C12726w.m28526m(list2)) {
                i5 = -1;
            } else {
                i5 = list4.get(i9);
            }
            i8 = i5.intValue();
        }
        int size2 = list.size();
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < size2; i13++) {
            LazyListPositionedItem lazyListPositionedItem = list.get(i13);
            if (lazyListPositionedItem.getIndex() == i7) {
                i10 = lazyListPositionedItem.getOffset();
                i12 = i13;
            } else if (lazyListPositionedItem.getIndex() == i8) {
                i11 = lazyListPositionedItem.getOffset();
            }
        }
        if (i7 == -1) {
            return null;
        }
        LazyMeasuredItem r1 = lazyMeasuredItemProvider2.m33425getAndMeasureZjPyQlc(DataIndex.m33391constructorimpl(i7));
        if (i10 != Integer.MIN_VALUE) {
            i4 = Math.max(-i6, i10);
        } else {
            i4 = -i6;
        }
        if (i11 != Integer.MIN_VALUE) {
            i4 = Math.min(i4, i11 - r1.getSize());
        }
        LazyListPositionedItem position = r1.position(i4, i2, i3);
        if (i12 != -1) {
            list.set(i12, position);
        } else {
            list.add(0, position);
        }
        return position;
    }
}
