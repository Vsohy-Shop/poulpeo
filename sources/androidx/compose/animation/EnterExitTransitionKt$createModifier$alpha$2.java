package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$createModifier$alpha$2 extends C12777p implements C13089p<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createModifier$alpha$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(3);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<EnterExitState>) (Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer, int i) {
        FiniteAnimationSpec<Float> finiteAnimationSpec;
        C12775o.m28639i(segment, "$this$animateFloat");
        composer.startReplaceableGroup(-57153604);
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Fade fade = this.$enter.getData$animation_release().getFade();
            if (fade == null || (finiteAnimationSpec = fade.getAnimationSpec()) == null) {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            }
        } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            Fade fade2 = this.$exit.getData$animation_release().getFade();
            if (fade2 == null || (finiteAnimationSpec = fade2.getAnimationSpec()) == null) {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            }
        } else {
            finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
        }
        composer.endReplaceableGroup();
        return finiteAnimationSpec;
    }
}
