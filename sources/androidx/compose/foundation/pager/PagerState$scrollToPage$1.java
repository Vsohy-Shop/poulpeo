package androidx.compose.foundation.pager;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.pager.PagerState", mo50610f = "PagerState.kt", mo50611l = {263, 269}, mo50612m = "scrollToPage")
/* compiled from: PagerState.kt */
final class PagerState$scrollToPage$1 extends C12737d {
    float F$0;
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerState$scrollToPage$1(PagerState pagerState, C12074d<? super PagerState$scrollToPage$1> dVar) {
        super(dVar);
        this.this$0 = pagerState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scrollToPage(0, 0.0f, this);
    }
}
