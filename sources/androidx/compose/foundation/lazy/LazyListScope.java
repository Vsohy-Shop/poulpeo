package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

@LazyScopeMarker
/* compiled from: LazyDsl.kt */
public interface LazyListScope {

    /* compiled from: LazyDsl.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, C13089p<? super LazyItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
            C12775o.m28639i(pVar, "content");
            LazyListScope.super.item(obj, obj2, pVar);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, C13090q<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
            C12775o.m28639i(function12, "contentType");
            C12775o.m28639i(qVar, "itemContent");
            LazyListScope.super.items(i, function1, function12, qVar);
        }

        @Deprecated
        public static /* synthetic */ void item(LazyListScope lazyListScope, Object obj, C13089p pVar) {
            C12775o.m28639i(pVar, "content");
            LazyListScope.super.item(obj, pVar);
        }

        @Deprecated
        public static /* synthetic */ void items(LazyListScope lazyListScope, int i, Function1 function1, C13090q qVar) {
            C12775o.m28639i(qVar, "itemContent");
            LazyListScope.super.items(i, function1, qVar);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, C13089p pVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.item(obj, obj2, pVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, Function1 function1, Function1 function12, C13090q qVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function1 = null;
            }
            if ((i2 & 4) != 0) {
                function12 = LazyListScope$items$1.INSTANCE;
            }
            lazyListScope.items(i, function1, function12, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, C13089p pVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.stickyHeader(obj, obj2, pVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
    }

    void item(Object obj, Object obj2, C13089p<? super LazyItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        C12775o.m28639i(pVar, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    void items(int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, C13090q<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(function12, "contentType");
        C12775o.m28639i(qVar, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @ExperimentalFoundationApi
    void stickyHeader(Object obj, Object obj2, C13089p<? super LazyItemScope, ? super Composer, ? super Integer, C11921v> pVar);

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, C13089p pVar, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            lazyListScope.item(obj, pVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    /* synthetic */ void item(Object obj, C13089p pVar) {
        C12775o.m28639i(pVar, "content");
        item(obj, (Object) null, pVar);
    }

    /* synthetic */ void items(int i, Function1 function1, C13090q qVar) {
        C12775o.m28639i(qVar, "itemContent");
        items(i, function1, LazyListScope$items$2.INSTANCE, qVar);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, Function1 function1, C13090q qVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function1 = null;
            }
            lazyListScope.items(i, function1, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }
}
