package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: LazyGridScopeImpl.kt */
final class LazyGridScopeImpl$item$2$1 extends C12777p implements C13088o<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ Function1<LazyGridItemSpanScope, GridItemSpan> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridScopeImpl$item$2$1(Function1<? super LazyGridItemSpanScope, GridItemSpan> function1) {
        super(2);
        this.$span = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m33432boximpl(m33482invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m33482invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        C12775o.m28639i(lazyGridItemSpanScope, "$this$null");
        return this.$span.invoke(lazyGridItemSpanScope).m33439unboximpl();
    }
}
