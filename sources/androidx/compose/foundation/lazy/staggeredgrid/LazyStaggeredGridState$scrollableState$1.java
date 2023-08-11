package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyStaggeredGridState.kt */
final class LazyStaggeredGridState$scrollableState$1 extends C12777p implements Function1<Float, Float> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$scrollableState$1(LazyStaggeredGridState lazyStaggeredGridState) {
        super(1);
        this.this$0 = lazyStaggeredGridState;
    }

    public final Float invoke(float f) {
        return Float.valueOf(-this.this$0.onScroll(-f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
