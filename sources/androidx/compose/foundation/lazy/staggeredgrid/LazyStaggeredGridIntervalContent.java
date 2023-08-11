package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13090q;

/* compiled from: LazyStaggeredGridScope.kt */
public final class LazyStaggeredGridIntervalContent implements LazyLayoutIntervalContent {
    private final C13090q<LazyStaggeredGridItemScope, Integer, Composer, Integer, C11921v> item;
    private final Function1<Integer, Object> key;
    private final Function1<Integer, StaggeredGridItemSpan> span;
    private final Function1<Integer, Object> type;

    public LazyStaggeredGridIntervalContent(Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function1<? super Integer, StaggeredGridItemSpan> function13, C13090q<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(function12, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(qVar, "item");
        this.key = function1;
        this.type = function12;
        this.span = function13;
        this.item = qVar;
    }

    public final C13090q<LazyStaggeredGridItemScope, Integer, Composer, Integer, C11921v> getItem() {
        return this.item;
    }

    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    public final Function1<Integer, StaggeredGridItemSpan> getSpan() {
        return this.span;
    }

    public Function1<Integer, Object> getType() {
        return this.type;
    }
}
