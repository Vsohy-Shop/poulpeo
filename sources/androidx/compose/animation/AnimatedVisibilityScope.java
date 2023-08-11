package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: AnimatedVisibility.kt */
public interface AnimatedVisibilityScope {
    static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                enterTransition = EnterExitTransitionKt.fadeIn$default((FiniteAnimationSpec) null, 0.0f, 3, (Object) null).plus(EnterExitTransitionKt.expandIn$default((FiniteAnimationSpec) null, (Alignment) null, false, (Function1) null, 15, (Object) null));
            }
            if ((i & 2) != 0) {
                exitTransition = EnterExitTransitionKt.fadeOut$default((FiniteAnimationSpec) null, 0.0f, 3, (Object) null).plus(EnterExitTransitionKt.shrinkOut$default((FiniteAnimationSpec) null, (Alignment) null, false, (Function1) null, 15, (Object) null));
            }
            if ((i & 4) != 0) {
                str = "animateEnterExit";
            }
            return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
    }

    @ExperimentalAnimationApi
    Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(enterTransition, "enter");
        C12775o.m28639i(exitTransition, "exit");
        C12775o.m28639i(str, "label");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0326x599743f2(enterTransition, exitTransition, str);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new AnimatedVisibilityScope$animateEnterExit$2(this, enterTransition, exitTransition, str));
    }

    @ExperimentalAnimationApi
    Transition<EnterExitState> getTransition();

    /* compiled from: AnimatedVisibility.kt */
    public static final class DefaultImpls {
        @ExperimentalAnimationApi
        @Deprecated
        public static Modifier animateEnterExit(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
            C12775o.m28639i(modifier, "receiver");
            C12775o.m28639i(enterTransition, "enter");
            C12775o.m28639i(exitTransition, "exit");
            C12775o.m28639i(str, "label");
            return AnimatedVisibilityScope.super.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }

        @ExperimentalAnimationApi
        public static /* synthetic */ void getTransition$annotations() {
        }
    }
}
