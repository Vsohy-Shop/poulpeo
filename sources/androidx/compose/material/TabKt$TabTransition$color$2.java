package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: Tab.kt */
final class TabKt$TabTransition$color$2 extends C12777p implements C13089p<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>> {
    public static final TabKt$TabTransition$color$2 INSTANCE = new TabKt$TabTransition$color$2();

    TabKt$TabTransition$color$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<Boolean>) (Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer, int i) {
        TweenSpec tweenSpec;
        C12775o.m28639i(segment, "$this$animateColor");
        composer.startReplaceableGroup(-2120892502);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2120892502, i, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:270)");
        }
        if (segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
            tweenSpec = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
        } else {
            tweenSpec = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, (Object) null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tweenSpec;
    }
}
