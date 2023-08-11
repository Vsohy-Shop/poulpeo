package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3\n*L\n1#1,493:1\n*E\n"})
/* compiled from: LazyGridDsl.kt */
public final class LazyGridDslKt$itemsIndexed$3 extends C12777p implements C13088o<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ C13089p<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$3(C13089p<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> pVar, List<? extends T> list) {
        super(2);
        this.$span = pVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m33432boximpl(m33457invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m33457invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        C12775o.m28639i(lazyGridItemSpanScope, "$this$null");
        return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.$items.get(i)).m33439unboximpl();
    }
}
