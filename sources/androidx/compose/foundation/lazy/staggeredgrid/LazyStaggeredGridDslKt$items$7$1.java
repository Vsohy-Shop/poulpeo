package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1\n*L\n1#1,434:1\n*E\n"})
/* compiled from: LazyStaggeredGridDsl.kt */
final class LazyStaggeredGridDslKt$items$7$1 extends C12777p implements Function1<Integer, Object> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ Function1<T, Object> $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$items$7$1(Function1<? super T, ? extends Object> function1, T[] tArr) {
        super(1);
        this.$key = function1;
        this.$items = tArr;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items[i]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
