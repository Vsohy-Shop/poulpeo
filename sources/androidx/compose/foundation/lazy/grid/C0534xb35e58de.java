package androidx.compose.foundation.lazy.grid;

import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n198#2:329\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2 */
/* compiled from: Comparisons.kt */
public final class C0534xb35e58de<T> implements Comparator {
    final /* synthetic */ LazyGridItemPlacementAnimator this$0;

    public C0534xb35e58de(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.this$0 = lazyGridItemPlacementAnimator;
    }

    public final int compare(T t, T t2) {
        return C12019b.m26106c((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t2).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t).getKey()));
    }
}
