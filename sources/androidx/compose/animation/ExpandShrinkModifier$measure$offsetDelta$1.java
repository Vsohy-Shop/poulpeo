package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$measure$offsetDelta$1 extends C12777p implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {
    public static final ExpandShrinkModifier$measure$offsetDelta$1 INSTANCE = new ExpandShrinkModifier$measure$offsetDelta$1();

    ExpandShrinkModifier$measure$offsetDelta$1() {
        super(1);
    }

    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
        C12775o.m28639i(segment, "$this$animate");
        return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
    }
}
