package androidx.compose.foundation.lazy.grid;

import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n226#2:329\n*E\n"})
/* compiled from: Comparisons.kt */
public final class LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2<T> implements Comparator {
    final /* synthetic */ LazyGridItemPlacementAnimator this$0;

    public LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.this$0 = lazyGridItemPlacementAnimator;
    }

    public final int compare(T t, T t2) {
        return C12019b.m26106c((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t2).getKey()));
    }
}
