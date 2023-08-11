package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: LazyStaggeredGridState.kt */
final class LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1 extends C12777p implements C13074a<LazyStaggeredGridState> {
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1(int i, int i2) {
        super(0);
        this.$initialFirstVisibleItemIndex = i;
        this.$initialFirstVisibleItemScrollOffset = i2;
    }

    public final LazyStaggeredGridState invoke() {
        return new LazyStaggeredGridState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
