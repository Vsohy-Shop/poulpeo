package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier$transitionSpec$1 extends C12777p implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlideModifier$transitionSpec$1(SlideModifier slideModifier) {
        super(1);
        this.this$0 = slideModifier;
    }

    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
        FiniteAnimationSpec<IntOffset> animationSpec;
        FiniteAnimationSpec<IntOffset> animationSpec2;
        C12775o.m28639i(segment, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Slide value = this.this$0.getSlideIn().getValue();
            if (value == null || (animationSpec2 = value.getAnimationSpec()) == null) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
            return animationSpec2;
        } else if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
        } else {
            Slide value2 = this.this$0.getSlideOut().getValue();
            if (value2 == null || (animationSpec = value2.getAnimationSpec()) == null) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
            return animationSpec;
        }
    }
}
