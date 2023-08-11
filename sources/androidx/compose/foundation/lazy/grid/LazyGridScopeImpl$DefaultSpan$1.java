package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: LazyGridScopeImpl.kt */
final class LazyGridScopeImpl$DefaultSpan$1 extends C12777p implements C13088o<LazyGridItemSpanScope, Integer, GridItemSpan> {
    public static final LazyGridScopeImpl$DefaultSpan$1 INSTANCE = new LazyGridScopeImpl$DefaultSpan$1();

    LazyGridScopeImpl$DefaultSpan$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m33432boximpl(m33481invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m33481invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        C12775o.m28639i(lazyGridItemSpanScope, "$this$null");
        return LazyGridSpanKt.GridItemSpan(1);
    }
}
