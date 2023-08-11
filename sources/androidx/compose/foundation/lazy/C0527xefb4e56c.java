package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$1 */
/* compiled from: LazyListItemProvider.kt */
final class C0527xefb4e56c extends C12777p implements C13074a<Integer> {
    final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0527xefb4e56c(LazyListState lazyListState) {
        super(0);
        this.$state = lazyListState;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.$state.getFirstVisibleItemIndex());
    }
}
