package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$1 */
/* compiled from: LazyStaggeredGridItemProvider.kt */
final class C0569x4e564b57 extends C12777p implements C13074a<Integer> {
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0569x4e564b57(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.$state = lazyStaggeredGridState;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.$state.getFirstVisibleItemIndex());
    }
}
