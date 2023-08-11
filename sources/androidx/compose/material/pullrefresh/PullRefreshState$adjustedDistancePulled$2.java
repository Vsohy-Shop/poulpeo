package androidx.compose.material.pullrefresh;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PullRefreshState.kt */
final class PullRefreshState$adjustedDistancePulled$2 extends C12777p implements C13074a<Float> {
    final /* synthetic */ PullRefreshState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshState$adjustedDistancePulled$2(PullRefreshState pullRefreshState) {
        super(0);
        this.this$0 = pullRefreshState;
    }

    public final Float invoke() {
        return Float.valueOf(this.this$0.getDistancePulled() * 0.5f);
    }
}
