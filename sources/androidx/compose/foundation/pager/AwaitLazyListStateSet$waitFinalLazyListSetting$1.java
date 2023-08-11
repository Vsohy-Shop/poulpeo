package androidx.compose.foundation.pager;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.pager.AwaitLazyListStateSet", mo50610f = "PagerState.kt", mo50611l = {418}, mo50612m = "waitFinalLazyListSetting")
/* compiled from: PagerState.kt */
final class AwaitLazyListStateSet$waitFinalLazyListSetting$1 extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AwaitLazyListStateSet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AwaitLazyListStateSet$waitFinalLazyListSetting$1(AwaitLazyListStateSet awaitLazyListStateSet, C12074d<? super AwaitLazyListStateSet$waitFinalLazyListSetting$1> dVar) {
        super(dVar);
        this.this$0 = awaitLazyListStateSet;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitFinalLazyListSetting(this);
    }
}
