package androidx.compose.animation.core;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$7 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animate$7(AnimationState<T, V> animationState) {
        super(0);
        this.$this_animate = animationState;
    }

    public final void invoke() {
        this.$this_animate.setRunning$animation_core_release(false);
    }
}
