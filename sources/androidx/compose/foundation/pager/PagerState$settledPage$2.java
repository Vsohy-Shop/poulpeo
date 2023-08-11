package androidx.compose.foundation.pager;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PagerState.kt */
final class PagerState$settledPage$2 extends C12777p implements C13074a<Integer> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerState$settledPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    public final Integer invoke() {
        int i;
        if (this.this$0.getPageCount$foundation_release() == 0) {
            i = 0;
        } else {
            PagerState pagerState = this.this$0;
            i = pagerState.coerceInPageRange(pagerState.getSettledPageState());
        }
        return Integer.valueOf(i);
    }
}
