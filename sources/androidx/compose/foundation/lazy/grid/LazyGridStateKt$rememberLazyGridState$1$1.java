package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: LazyGridState.kt */
final class LazyGridStateKt$rememberLazyGridState$1$1 extends C12777p implements C13074a<LazyGridState> {
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridStateKt$rememberLazyGridState$1$1(int i, int i2) {
        super(0);
        this.$initialFirstVisibleItemIndex = i;
        this.$initialFirstVisibleItemScrollOffset = i2;
    }

    public final LazyGridState invoke() {
        return new LazyGridState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
