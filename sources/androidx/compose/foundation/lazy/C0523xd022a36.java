package androidx.compose.foundation.lazy;

import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n166#2:329\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2 */
/* compiled from: Comparisons.kt */
public final class C0523xd022a36<T> implements Comparator {
    final /* synthetic */ LazyListItemPlacementAnimator this$0;

    public C0523xd022a36(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.this$0 = lazyListItemPlacementAnimator;
    }

    public final int compare(T t, T t2) {
        return C12019b.m26106c((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t2).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t).getKey()));
    }
}
