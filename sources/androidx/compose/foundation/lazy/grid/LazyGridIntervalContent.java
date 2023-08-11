package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* compiled from: LazyGridScopeImpl.kt */
public final class LazyGridIntervalContent implements LazyLayoutIntervalContent {
    private final C13090q<LazyGridItemScope, Integer, Composer, Integer, C11921v> item;
    private final Function1<Integer, Object> key;
    private final C13088o<LazyGridItemSpanScope, Integer, GridItemSpan> span;
    private final Function1<Integer, Object> type;

    public LazyGridIntervalContent(Function1<? super Integer, ? extends Object> function1, C13088o<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> oVar, Function1<? super Integer, ? extends Object> function12, C13090q<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(oVar, "span");
        C12775o.m28639i(function12, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(qVar, "item");
        this.key = function1;
        this.span = oVar;
        this.type = function12;
        this.item = qVar;
    }

    public final C13090q<LazyGridItemScope, Integer, Composer, Integer, C11921v> getItem() {
        return this.item;
    }

    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    public final C13088o<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    public Function1<Integer, Object> getType() {
        return this.type;
    }
}
