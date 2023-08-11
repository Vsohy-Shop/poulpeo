package androidx.compose.foundation.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyListScopeImpl.kt */
final class LazyListScopeImpl$item$1 extends C12777p implements Function1<Integer, Object> {
    final /* synthetic */ Object $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListScopeImpl$item$1(Object obj) {
        super(1);
        this.$key = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$key;
    }
}
