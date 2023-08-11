package androidx.compose.foundation.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$7\n*L\n1#1,423:1\n*E\n"})
/* compiled from: LazyDsl.kt */
public final class LazyDslKt$items$7 extends C12777p implements Function1<Integer, Object> {
    final /* synthetic */ Function1<T, Object> $contentType;
    final /* synthetic */ T[] $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$items$7(Function1<? super T, ? extends Object> function1, T[] tArr) {
        super(1);
        this.$contentType = function1;
        this.$items = tArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items[i]);
    }
}
