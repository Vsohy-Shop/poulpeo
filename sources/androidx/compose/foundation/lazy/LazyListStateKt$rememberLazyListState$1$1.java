package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: LazyListState.kt */
final class LazyListStateKt$rememberLazyListState$1$1 extends C12777p implements C13074a<LazyListState> {
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListStateKt$rememberLazyListState$1$1(int i, int i2) {
        super(0);
        this.$initialFirstVisibleItemIndex = i;
        this.$initialFirstVisibleItemScrollOffset = i2;
    }

    public final LazyListState invoke() {
        return new LazyListState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
