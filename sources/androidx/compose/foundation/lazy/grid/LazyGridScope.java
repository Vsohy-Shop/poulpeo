package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13090q;

@LazyGridScopeMarker
/* compiled from: LazyGridDsl.kt */
public interface LazyGridScope {
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, Function1 function1, Object obj2, C13089p pVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                obj2 = null;
            }
            lazyGridScope.item(obj, function1, obj2, pVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i, Function1 function1, C13088o oVar, Function1 function12, C13090q qVar, int i2, Object obj) {
        Function1 function13;
        C13088o oVar2;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function13 = null;
            } else {
                function13 = function1;
            }
            if ((i2 & 4) != 0) {
                oVar2 = null;
            } else {
                oVar2 = oVar;
            }
            if ((i2 & 8) != 0) {
                function12 = LazyGridScope$items$1.INSTANCE;
            }
            lazyGridScope.items(i, function13, oVar2, function12, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    void item(Object obj, Function1<? super LazyGridItemSpanScope, GridItemSpan> function1, Object obj2, C13089p<? super LazyGridItemScope, ? super Composer, ? super Integer, C11921v> pVar);

    void items(int i, Function1<? super Integer, ? extends Object> function1, C13088o<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> oVar, Function1<? super Integer, ? extends Object> function12, C13090q<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar);
}
