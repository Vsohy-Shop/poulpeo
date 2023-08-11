package androidx.compose.material.pullrefresh;

import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: PullRefreshState.kt */
final class PullRefreshStateKt$rememberPullRefreshState$3 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ C12757e0 $refreshingOffsetPx;
    final /* synthetic */ PullRefreshState $state;
    final /* synthetic */ C12757e0 $thresholdPx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshStateKt$rememberPullRefreshState$3(PullRefreshState pullRefreshState, boolean z, C12757e0 e0Var, C12757e0 e0Var2) {
        super(0);
        this.$state = pullRefreshState;
        this.$refreshing = z;
        this.$thresholdPx = e0Var;
        this.$refreshingOffsetPx = e0Var2;
    }

    public final void invoke() {
        this.$state.setRefreshing$material_release(this.$refreshing);
        this.$state.setThreshold$material_release(this.$thresholdPx.f20408b);
        this.$state.setRefreshingOffset$material_release(this.$refreshingOffsetPx.f20408b);
    }
}
