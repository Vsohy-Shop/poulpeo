package androidx.compose.foundation.lazy;

import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n132#2:329\n*E\n"})
/* compiled from: Comparisons.kt */
public final class LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1<T> implements Comparator {
    final /* synthetic */ Map $previousKeyToIndexMap$inlined;

    public LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1(Map map) {
        this.$previousKeyToIndexMap$inlined = map;
    }

    public final int compare(T t, T t2) {
        return C12019b.m26106c((Integer) this.$previousKeyToIndexMap$inlined.get(((LazyListPositionedItem) t).getKey()), (Integer) this.$previousKeyToIndexMap$inlined.get(((LazyListPositionedItem) t2).getKey()));
    }
}
