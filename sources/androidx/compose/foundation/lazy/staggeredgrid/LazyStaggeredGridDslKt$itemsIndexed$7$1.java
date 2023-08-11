package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1\n*L\n1#1,434:1\n*E\n"})
/* compiled from: LazyStaggeredGridDsl.kt */
final class LazyStaggeredGridDslKt$itemsIndexed$7$1 extends C12777p implements Function1<Integer, Object> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ C13088o<Integer, T, Object> $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$7$1(C13088o<? super Integer, ? super T, ? extends Object> oVar, T[] tArr) {
        super(1);
        this.$key = oVar;
        this.$items = tArr;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
