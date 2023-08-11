package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 */
/* compiled from: LazyGridAnimateScrollScope.kt */
final class C0532x964d917a extends C12777p implements Function1<Integer, Integer> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ List<LazyGridItemInfo> $visibleItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0532x964d917a(boolean z, List<? extends LazyGridItemInfo> list) {
        super(1);
        this.$isVertical = z;
        this.$visibleItems = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(this.$isVertical ? this.$visibleItems.get(i).getRow() : this.$visibleItems.get(i).getColumn());
    }
}
