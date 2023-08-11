package androidx.compose.foundation.lazy;

import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n123#2:329\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1 */
/* compiled from: Comparisons.kt */
public final class C0522xd022a35<T> implements Comparator {
    final /* synthetic */ Map $previousKeyToIndexMap$inlined;

    public C0522xd022a35(Map map) {
        this.$previousKeyToIndexMap$inlined = map;
    }

    public final int compare(T t, T t2) {
        return C12019b.m26106c((Integer) this.$previousKeyToIndexMap$inlined.get(((LazyListPositionedItem) t2).getKey()), (Integer) this.$previousKeyToIndexMap$inlined.get(((LazyListPositionedItem) t).getKey()));
    }
}
