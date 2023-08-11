package androidx.compose.foundation.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyListState.kt */
final class LazyListState$scrollableState$1 extends C12777p implements Function1<Float, Float> {
    final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListState$scrollableState$1(LazyListState lazyListState) {
        super(1);
        this.this$0 = lazyListState;
    }

    public final Float invoke(float f) {
        return Float.valueOf(-this.this$0.onScroll$foundation_release(-f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
