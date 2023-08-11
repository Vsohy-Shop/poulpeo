package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: Menu.kt */
final class MenuKt$DropdownMenuContent$scale$2 extends C12777p implements C13089p<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final MenuKt$DropdownMenuContent$scale$2 INSTANCE = new MenuKt$DropdownMenuContent$scale$2();

    MenuKt$DropdownMenuContent$scale$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<Boolean>) (Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, int i) {
        TweenSpec tweenSpec;
        C12775o.m28639i(segment, "$this$animateFloat");
        composer.startReplaceableGroup(839979861);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(839979861, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:75)");
        }
        if (segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
            tweenSpec = AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, (Object) null);
        } else {
            tweenSpec = AnimationSpecKt.tween$default(1, 74, (Easing) null, 4, (Object) null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tweenSpec;
    }
}
