package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1\n*L\n1#1,434:1\n*E\n"})
/* compiled from: LazyStaggeredGridDsl.kt */
final class LazyStaggeredGridDslKt$itemsIndexed$9$1 extends C12777p implements Function1<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ C13088o<Integer, T, StaggeredGridItemSpan> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$9$1(C13088o<? super Integer, ? super T, StaggeredGridItemSpan> oVar, T[] tArr) {
        super(1);
        this.$span = oVar;
        this.$items = tArr;
    }

    public final StaggeredGridItemSpan invoke(int i) {
        return this.$span.invoke(Integer.valueOf(i), this.$items[i]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
