package androidx.compose.foundation.lazy.grid;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,435:1\n33#2,6:436\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3\n*L\n287#1:436,6\n*E\n"})
/* compiled from: LazyGridMeasure.kt */
final class LazyGridMeasureKt$measureLazyGrid$3 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ List<LazyGridPositionedItem> $positionedItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridMeasureKt$measureLazyGrid$3(List<LazyGridPositionedItem> list) {
        super(1);
        this.$positionedItems = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$invoke");
        List<LazyGridPositionedItem> list = this.$positionedItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).place(placementScope);
        }
    }
}
