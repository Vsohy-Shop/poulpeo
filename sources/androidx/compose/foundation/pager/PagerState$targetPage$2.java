package androidx.compose.foundation.pager;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PagerState.kt */
final class PagerState$targetPage$2 extends C12777p implements C13074a<Integer> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    public final Integer invoke() {
        int i;
        if (!this.this$0.isScrollInProgress()) {
            i = this.this$0.getCurrentPage();
        } else if (this.this$0.getAnimationTargetPage() != -1) {
            i = this.this$0.getAnimationTargetPage();
        } else {
            if (!(this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f)) {
                i = C13265c.m30134c(this.this$0.getSnapRemainingScrollOffset$foundation_release() / ((float) this.this$0.getPageAvailableSpace())) + this.this$0.getCurrentPage();
            } else if (Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction())) {
                i = this.this$0.getCurrentPage() + ((int) Math.signum(this.this$0.getCurrentPageOffsetFraction()));
            } else {
                i = this.this$0.getCurrentPage();
            }
        }
        return Integer.valueOf(this.this$0.coerceInPageRange(i));
    }
}
