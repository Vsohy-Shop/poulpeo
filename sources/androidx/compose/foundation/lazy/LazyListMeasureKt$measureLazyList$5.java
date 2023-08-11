package androidx.compose.foundation.lazy;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,515:1\n33#2,6:516\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n*L\n320#1:516,6\n*E\n"})
/* compiled from: LazyListMeasure.kt */
final class LazyListMeasureKt$measureLazyList$5 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ LazyListPositionedItem $headerItem;
    final /* synthetic */ List<LazyListPositionedItem> $positionedItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListMeasureKt$measureLazyList$5(List<LazyListPositionedItem> list, LazyListPositionedItem lazyListPositionedItem) {
        super(1);
        this.$positionedItems = list;
        this.$headerItem = lazyListPositionedItem;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$invoke");
        List<LazyListPositionedItem> list = this.$positionedItems;
        LazyListPositionedItem lazyListPositionedItem = this.$headerItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyListPositionedItem lazyListPositionedItem2 = list.get(i);
            if (lazyListPositionedItem2 != lazyListPositionedItem) {
                lazyListPositionedItem2.place(placementScope);
            }
        }
        LazyListPositionedItem lazyListPositionedItem3 = this.$headerItem;
        if (lazyListPositionedItem3 != null) {
            lazyListPositionedItem3.place(placementScope);
        }
    }
}
