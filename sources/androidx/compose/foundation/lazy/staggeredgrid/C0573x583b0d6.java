package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,471:1\n167#2:472\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1 */
/* compiled from: Collections.kt */
public final class C0573x583b0d6 extends C12777p implements Function1<LazyStaggeredGridLaneInfo.SpannedItem, Integer> {
    final /* synthetic */ Comparable $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0573x583b0d6(Comparable comparable) {
        super(1);
        this.$key = comparable;
    }

    public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
        return Integer.valueOf(C12019b.m26106c(Integer.valueOf(spannedItem.getIndex()), this.$key));
    }
}
