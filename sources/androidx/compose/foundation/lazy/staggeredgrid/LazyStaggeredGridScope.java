package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

@ExperimentalFoundationApi
@LazyStaggeredGridScopeMarker
/* compiled from: LazyStaggeredGridDsl.kt */
public interface LazyStaggeredGridScope {
    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, C13089p pVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            if ((i & 4) != 0) {
                staggeredGridItemSpan = null;
            }
            lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, pVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i, Function1 function1, Function1 function12, Function1 function13, C13090q qVar, int i2, Object obj) {
        Function1 function14;
        Function1 function15;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function14 = null;
            } else {
                function14 = function1;
            }
            if ((i2 & 4) != 0) {
                function12 = LazyStaggeredGridScope$items$1.INSTANCE;
            }
            Function1 function16 = function12;
            if ((i2 & 8) != 0) {
                function15 = null;
            } else {
                function15 = function13;
            }
            lazyStaggeredGridScope.items(i, function14, function16, function15, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    @ExperimentalFoundationApi
    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, C13089p<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, C11921v> pVar);

    void items(int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function1<? super Integer, StaggeredGridItemSpan> function13, C13090q<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar);
}
