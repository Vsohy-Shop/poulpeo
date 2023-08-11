package androidx.compose.foundation.lazy;

import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n177#2:329\n*E\n"})
/* compiled from: Comparisons.kt */
public final class LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2<T> implements Comparator {
    final /* synthetic */ LazyListItemPlacementAnimator this$0;

    public LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.this$0 = lazyListItemPlacementAnimator;
    }

    public final int compare(T t, T t2) {
        return C12019b.m26106c((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t2).getKey()));
    }
}
