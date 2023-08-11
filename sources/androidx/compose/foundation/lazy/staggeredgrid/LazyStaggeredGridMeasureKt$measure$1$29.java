package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1097:1\n33#2,6:1098\n33#2,6:1104\n33#2,6:1110\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n*L\n781#1:1098,6\n785#1:1104,6\n789#1:1110,6\n*E\n"})
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridMeasureKt$measure$1$29 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ List<LazyStaggeredGridPositionedItem> $extraItemsAfter;
    final /* synthetic */ List<LazyStaggeredGridPositionedItem> $extraItemsBefore;
    final /* synthetic */ List<LazyStaggeredGridPositionedItem> $positionedItems;
    final /* synthetic */ LazyStaggeredGridMeasureContext $this_measure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridMeasureKt$measure$1$29(List<LazyStaggeredGridPositionedItem> list, List<LazyStaggeredGridPositionedItem> list2, List<LazyStaggeredGridPositionedItem> list3, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        super(1);
        this.$extraItemsBefore = list;
        this.$positionedItems = list2;
        this.$extraItemsAfter = list3;
        this.$this_measure = lazyStaggeredGridMeasureContext;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        List<LazyStaggeredGridPositionedItem> list = this.$extraItemsBefore;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.$this_measure;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).place(placementScope, lazyStaggeredGridMeasureContext);
        }
        List<LazyStaggeredGridPositionedItem> list2 = this.$positionedItems;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = this.$this_measure;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            list2.get(i2).place(placementScope, lazyStaggeredGridMeasureContext2);
        }
        List<LazyStaggeredGridPositionedItem> list3 = this.$extraItemsAfter;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = this.$this_measure;
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            list3.get(i3).place(placementScope, lazyStaggeredGridMeasureContext3);
        }
    }
}
