package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyGridSpanLayoutProvider.kt */
final class LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 extends C12777p implements Function1<LazyGridSpanLayoutProvider.Bucket, Integer> {
    final /* synthetic */ int $itemIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(int i) {
        super(1);
        this.$itemIndex = i;
    }

    public final Integer invoke(LazyGridSpanLayoutProvider.Bucket bucket) {
        C12775o.m28639i(bucket, "it");
        return Integer.valueOf(bucket.getFirstItemIndex() - this.$itemIndex);
    }
}
