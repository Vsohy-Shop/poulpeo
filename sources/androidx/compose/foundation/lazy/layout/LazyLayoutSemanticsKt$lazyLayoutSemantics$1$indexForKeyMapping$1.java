package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyLayoutSemantics.kt */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 extends C12777p implements Function1<Object, Integer> {
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(LazyLayoutItemProvider lazyLayoutItemProvider) {
        super(1);
        this.$itemProvider = lazyLayoutItemProvider;
    }

    public final Integer invoke(Object obj) {
        C12775o.m28639i(obj, "needle");
        int itemCount = this.$itemProvider.getItemCount();
        int i = 0;
        while (true) {
            if (i >= itemCount) {
                i = -1;
                break;
            } else if (C12775o.m28634d(this.$itemProvider.getKey(i), obj)) {
                break;
            } else {
                i++;
            }
        }
        return Integer.valueOf(i);
    }
}
