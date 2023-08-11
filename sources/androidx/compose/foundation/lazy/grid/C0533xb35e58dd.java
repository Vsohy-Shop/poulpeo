package androidx.compose.foundation.lazy.grid;

import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n128#2:329\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1 */
/* compiled from: Comparisons.kt */
public final class C0533xb35e58dd<T> implements Comparator {
    final /* synthetic */ Map $previousKeyToIndexMap$inlined;

    public C0533xb35e58dd(Map map) {
        this.$previousKeyToIndexMap$inlined = map;
    }

    public final int compare(T t, T t2) {
        return C12019b.m26106c((Integer) this.$previousKeyToIndexMap$inlined.get(((LazyGridPositionedItem) t2).getKey()), (Integer) this.$previousKeyToIndexMap$inlined.get(((LazyGridPositionedItem) t).getKey()));
    }
}
