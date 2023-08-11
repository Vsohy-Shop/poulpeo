package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Transition.kt */
final class Transition$totalDurationNanos$2 extends C12777p implements C13074a<Long> {
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.this$0 = transition;
    }

    public final Long invoke() {
        long j = 0;
        for (Transition.TransitionAnimationState durationNanos$animation_core_release : this.this$0._animations) {
            j = Math.max(j, durationNanos$animation_core_release.getDurationNanos$animation_core_release());
        }
        for (Transition totalDurationNanos : this.this$0._transitions) {
            j = Math.max(j, totalDurationNanos.getTotalDurationNanos());
        }
        return Long.valueOf(j);
    }
}
