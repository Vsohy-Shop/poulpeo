package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n*L\n1#1,423:1\n*E\n"})
/* compiled from: LazyDsl.kt */
public final class LazyDslKt$itemsIndexed$3 extends C12777p implements Function1<Integer, Object> {
    final /* synthetic */ C13088o<Integer, T, Object> $contentType;
    final /* synthetic */ List<T> $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$3(C13088o<? super Integer, ? super T, ? extends Object> oVar, List<? extends T> list) {
        super(1);
        this.$contentType = oVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(Integer.valueOf(i), this.$items.get(i));
    }
}
