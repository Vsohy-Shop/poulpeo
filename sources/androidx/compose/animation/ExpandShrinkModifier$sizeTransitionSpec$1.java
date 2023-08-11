package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$sizeTransitionSpec$1 extends C12777p implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> {
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandShrinkModifier$sizeTransitionSpec$1(ExpandShrinkModifier expandShrinkModifier) {
        super(1);
        this.this$0 = expandShrinkModifier;
    }

    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
        C12775o.m28639i(segment, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        FiniteAnimationSpec<IntSize> finiteAnimationSpec = null;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            ChangeSize value = this.this$0.getExpand().getValue();
            if (value != null) {
                finiteAnimationSpec = value.getAnimationSpec();
            }
        } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            ChangeSize value2 = this.this$0.getShrink().getValue();
            if (value2 != null) {
                finiteAnimationSpec = value2.getAnimationSpec();
            }
        } else {
            finiteAnimationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
        }
        return finiteAnimationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : finiteAnimationSpec;
    }
}
