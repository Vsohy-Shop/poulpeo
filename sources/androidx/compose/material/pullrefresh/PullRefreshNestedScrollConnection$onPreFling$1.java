package androidx.compose.material.pullrefresh;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", mo50610f = "PullRefresh.kt", mo50611l = {117}, mo50612m = "onPreFling-QWom1Mo")
/* compiled from: PullRefresh.kt */
final class PullRefreshNestedScrollConnection$onPreFling$1 extends C12737d {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullRefreshNestedScrollConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, C12074d<? super PullRefreshNestedScrollConnection$onPreFling$1> dVar) {
        super(dVar);
        this.this$0 = pullRefreshNestedScrollConnection;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m34221onPreFlingQWom1Mo(0, this);
    }
}
