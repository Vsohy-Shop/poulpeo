package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$1 */
/* compiled from: LazyGridItemProvider.kt */
final class C0538xf96bda6c extends C12777p implements C13074a<Integer> {
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0538xf96bda6c(LazyGridState lazyGridState) {
        super(0);
        this.$state = lazyGridState;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.$state.getFirstVisibleItemIndex());
    }
}
