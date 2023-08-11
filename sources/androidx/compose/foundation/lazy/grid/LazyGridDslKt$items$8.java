package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8\n*L\n1#1,493:1\n*E\n"})
/* compiled from: LazyGridDsl.kt */
public final class LazyGridDslKt$items$8 extends C12777p implements C13088o<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ C13088o<LazyGridItemSpanScope, T, GridItemSpan> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$8(C13088o<? super LazyGridItemSpanScope, ? super T, GridItemSpan> oVar, T[] tArr) {
        super(2);
        this.$span = oVar;
        this.$items = tArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m33432boximpl(m33456invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m33456invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        C12775o.m28639i(lazyGridItemSpanScope, "$this$null");
        return this.$span.invoke(lazyGridItemSpanScope, this.$items[i]).m33439unboximpl();
    }
}
