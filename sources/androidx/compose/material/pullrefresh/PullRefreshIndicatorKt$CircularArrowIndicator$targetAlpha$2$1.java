package androidx.compose.material.pullrefresh;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PullRefreshIndicator.kt */
final class PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1 extends C12777p implements C13074a<Float> {
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(PullRefreshState pullRefreshState) {
        super(0);
        this.$state = pullRefreshState;
    }

    public final Float invoke() {
        float f = 1.0f;
        if (this.$state.getProgress() < 1.0f) {
            f = 0.3f;
        }
        return Float.valueOf(f);
    }
}
