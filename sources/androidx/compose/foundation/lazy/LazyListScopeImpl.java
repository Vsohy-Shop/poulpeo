package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

/* compiled from: LazyListScopeImpl.kt */
public final class LazyListScopeImpl implements LazyListScope {
    private List<Integer> _headerIndexes;
    private final MutableIntervalList<LazyListIntervalContent> _intervals;
    private final IntervalList<LazyListIntervalContent> intervals;

    public LazyListScopeImpl() {
        MutableIntervalList<LazyListIntervalContent> mutableIntervalList = new MutableIntervalList<>();
        this._intervals = mutableIntervalList;
        this.intervals = mutableIntervalList;
    }

    public final List<Integer> getHeaderIndexes() {
        List<Integer> list = this._headerIndexes;
        if (list == null) {
            return C12726w.m28524k();
        }
        return list;
    }

    public final IntervalList<LazyListIntervalContent> getIntervals() {
        return this.intervals;
    }

    public void item(Object obj, Object obj2, C13089p<? super LazyItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        LazyListScopeImpl$item$1 lazyListScopeImpl$item$1;
        C12775o.m28639i(pVar, "content");
        MutableIntervalList<LazyListIntervalContent> mutableIntervalList = this._intervals;
        if (obj != null) {
            lazyListScopeImpl$item$1 = new LazyListScopeImpl$item$1(obj);
        } else {
            lazyListScopeImpl$item$1 = null;
        }
        mutableIntervalList.addInterval(1, new LazyListIntervalContent(lazyListScopeImpl$item$1, new LazyListScopeImpl$item$2(obj2), ComposableLambdaKt.composableLambdaInstance(-735119482, true, new LazyListScopeImpl$item$3(pVar))));
    }

    public void items(int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, C13090q<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        this._intervals.addInterval(i, new LazyListIntervalContent(function1, function12, qVar));
    }

    @ExperimentalFoundationApi
    public void stickyHeader(Object obj, Object obj2, C13089p<? super LazyItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        C12775o.m28639i(pVar, "content");
        List list = this._headerIndexes;
        if (list == null) {
            list = new ArrayList();
            this._headerIndexes = list;
        }
        list.add(Integer.valueOf(this._intervals.getSize()));
        item(obj, obj2, pVar);
    }
}
