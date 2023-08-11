package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyStaggeredGridScope.kt */
final class LazyStaggeredGridScopeImpl$item$3$1 extends C12777p implements Function1<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ StaggeredGridItemSpan $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridScopeImpl$item$3$1(StaggeredGridItemSpan staggeredGridItemSpan) {
        super(1);
        this.$span = staggeredGridItemSpan;
    }

    public final StaggeredGridItemSpan invoke(int i) {
        return this.$span;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
