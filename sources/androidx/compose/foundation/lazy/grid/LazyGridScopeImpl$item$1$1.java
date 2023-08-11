package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyGridScopeImpl.kt */
final class LazyGridScopeImpl$item$1$1 extends C12777p implements Function1<Integer, Object> {
    final /* synthetic */ Object $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridScopeImpl$item$1$1(Object obj) {
        super(1);
        this.$key = obj;
    }

    public final Object invoke(int i) {
        return this.$key;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
