package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9\n*L\n1#1,493:1\n*E\n"})
/* compiled from: LazyGridDsl.kt */
public final class LazyGridDslKt$itemsIndexed$9 extends C12777p implements Function1<Integer, Object> {
    final /* synthetic */ C13088o<Integer, T, Object> $contentType;
    final /* synthetic */ T[] $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$9(C13088o<? super Integer, ? super T, ? extends Object> oVar, T[] tArr) {
        super(1);
        this.$contentType = oVar;
        this.$items = tArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
    }
}
