package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* compiled from: LazyStaggeredGridScope.kt */
public final class LazyStaggeredGridScopeImpl implements LazyStaggeredGridScope {
    private final MutableIntervalList<LazyStaggeredGridIntervalContent> intervals = new MutableIntervalList<>();

    public final MutableIntervalList<LazyStaggeredGridIntervalContent> getIntervals() {
        return this.intervals;
    }

    public void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, C13089p<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        LazyStaggeredGridScopeImpl$item$1$1 lazyStaggeredGridScopeImpl$item$1$1;
        LazyStaggeredGridScopeImpl$item$3$1 lazyStaggeredGridScopeImpl$item$3$1;
        C12775o.m28639i(pVar, "content");
        if (obj != null) {
            lazyStaggeredGridScopeImpl$item$1$1 = new LazyStaggeredGridScopeImpl$item$1$1(obj);
        } else {
            lazyStaggeredGridScopeImpl$item$1$1 = null;
        }
        LazyStaggeredGridScopeImpl$item$2 lazyStaggeredGridScopeImpl$item$2 = new LazyStaggeredGridScopeImpl$item$2(obj2);
        if (staggeredGridItemSpan != null) {
            lazyStaggeredGridScopeImpl$item$3$1 = new LazyStaggeredGridScopeImpl$item$3$1(staggeredGridItemSpan);
        } else {
            lazyStaggeredGridScopeImpl$item$3$1 = null;
        }
        items(1, lazyStaggeredGridScopeImpl$item$1$1, lazyStaggeredGridScopeImpl$item$2, lazyStaggeredGridScopeImpl$item$3$1, ComposableLambdaKt.composableLambdaInstance(1700162468, true, new LazyStaggeredGridScopeImpl$item$4(pVar)));
    }

    public void items(int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function1<? super Integer, StaggeredGridItemSpan> function13, C13090q<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        this.intervals.addInterval(i, new LazyStaggeredGridIntervalContent(function1, function12, function13, qVar));
    }
}
