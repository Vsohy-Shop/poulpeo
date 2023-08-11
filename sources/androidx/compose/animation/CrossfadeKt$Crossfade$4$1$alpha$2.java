package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: Crossfade.kt */
final class CrossfadeKt$Crossfade$4$1$alpha$2 extends C12777p implements C13089p<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>> {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$4$1$alpha$2(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        super(3);
        this.$animationSpec = finiteAnimationSpec;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<T> segment, Composer composer, int i) {
        C12775o.m28639i(segment, "$this$animateFloat");
        composer.startReplaceableGroup(438406499);
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
        composer.endReplaceableGroup();
        return finiteAnimationSpec;
    }
}
