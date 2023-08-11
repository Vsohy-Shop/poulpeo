package androidx.compose.foundation.pager;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PagerState.kt */
final class PagerStateKt$rememberPagerState$1$1 extends C12777p implements C13074a<PagerState> {
    final /* synthetic */ int $initialPage;
    final /* synthetic */ float $initialPageOffsetFraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerStateKt$rememberPagerState$1$1(int i, float f) {
        super(0);
        this.$initialPage = i;
        this.$initialPageOffsetFraction = f;
    }

    public final PagerState invoke() {
        return new PagerState(this.$initialPage, this.$initialPageOffsetFraction);
    }
}
