package androidx.compose.material.pullrefresh;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PullRefreshIndicator.kt */
final class PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(boolean z, PullRefreshState pullRefreshState) {
        super(0);
        this.$refreshing = z;
        this.$state = pullRefreshState;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$refreshing || this.$state.getPosition$material_release() > 0.5f);
    }
}
