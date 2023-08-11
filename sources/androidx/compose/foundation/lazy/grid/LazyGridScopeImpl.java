package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nLazyGridScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* compiled from: LazyGridScopeImpl.kt */
public final class LazyGridScopeImpl implements LazyGridScope {
    private final C13088o<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = LazyGridScopeImpl$DefaultSpan$1.INSTANCE;
    private boolean hasCustomSpans;
    private final MutableIntervalList<LazyGridIntervalContent> intervals = new MutableIntervalList<>();

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    public final MutableIntervalList<LazyGridIntervalContent> getIntervals$foundation_release() {
        return this.intervals;
    }

    public void item(Object obj, Function1<? super LazyGridItemSpanScope, GridItemSpan> function1, Object obj2, C13089p<? super LazyGridItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        LazyGridScopeImpl$item$1$1 lazyGridScopeImpl$item$1$1;
        C13088o oVar;
        C12775o.m28639i(pVar, "content");
        MutableIntervalList<LazyGridIntervalContent> mutableIntervalList = this.intervals;
        if (obj != null) {
            lazyGridScopeImpl$item$1$1 = new LazyGridScopeImpl$item$1$1(obj);
        } else {
            lazyGridScopeImpl$item$1$1 = null;
        }
        if (function1 != null) {
            oVar = new LazyGridScopeImpl$item$2$1(function1);
        } else {
            oVar = this.DefaultSpan;
        }
        mutableIntervalList.addInterval(1, new LazyGridIntervalContent(lazyGridScopeImpl$item$1$1, oVar, new LazyGridScopeImpl$item$3(obj2), ComposableLambdaKt.composableLambdaInstance(-1504808184, true, new LazyGridScopeImpl$item$4(pVar))));
        if (function1 != null) {
            this.hasCustomSpans = true;
        }
    }

    public void items(int i, Function1<? super Integer, ? extends Object> function1, C13088o<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> oVar, Function1<? super Integer, ? extends Object> function12, C13090q<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
        C13088o oVar2;
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        MutableIntervalList<LazyGridIntervalContent> mutableIntervalList = this.intervals;
        if (oVar == null) {
            oVar2 = this.DefaultSpan;
        } else {
            oVar2 = oVar;
        }
        mutableIntervalList.addInterval(i, new LazyGridIntervalContent(function1, oVar2, function12, qVar));
        if (oVar != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z) {
        this.hasCustomSpans = z;
    }
}
