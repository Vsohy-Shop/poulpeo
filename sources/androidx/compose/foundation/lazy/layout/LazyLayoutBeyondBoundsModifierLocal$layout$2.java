package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo;
import androidx.compose.p002ui.layout.BeyondBoundsLayout;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
public final class LazyLayoutBeyondBoundsModifierLocal$layout$2 implements BeyondBoundsLayout.BeyondBoundsScope {
    final /* synthetic */ int $direction;
    final /* synthetic */ Ref$ObjectRef<LazyListBeyondBoundsInfo.Interval> $interval;
    final /* synthetic */ LazyLayoutBeyondBoundsModifierLocal this$0;

    LazyLayoutBeyondBoundsModifierLocal$layout$2(LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal, Ref$ObjectRef<LazyListBeyondBoundsInfo.Interval> ref$ObjectRef, int i) {
        this.this$0 = lazyLayoutBeyondBoundsModifierLocal;
        this.$interval = ref$ObjectRef;
        this.$direction = i;
    }

    public boolean getHasMoreContent() {
        return this.this$0.m33513hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) this.$interval.f20403b, this.$direction);
    }
}
