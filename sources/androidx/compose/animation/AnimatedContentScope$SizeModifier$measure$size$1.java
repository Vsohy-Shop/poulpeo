package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$SizeModifier$measure$size$1 extends C12777p implements Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> {
    final /* synthetic */ AnimatedContentScope<S> this$0;
    final /* synthetic */ AnimatedContentScope<S>.SizeModifier this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$SizeModifier$measure$size$1(AnimatedContentScope<S> animatedContentScope, AnimatedContentScope<S>.SizeModifier sizeModifier) {
        super(1);
        this.this$0 = animatedContentScope;
        this.this$1 = sizeModifier;
    }

    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
        FiniteAnimationSpec<IntSize> r5;
        C12775o.m28639i(segment, "$this$animate");
        State state = this.this$0.getTargetSizeMap$animation_release().get(segment.getInitialState());
        long r0 = state != null ? ((IntSize) state.getValue()).m38632unboximpl() : IntSize.Companion.m38633getZeroYbymL2g();
        State state2 = this.this$0.getTargetSizeMap$animation_release().get(segment.getTargetState());
        long r2 = state2 != null ? ((IntSize) state2.getValue()).m38632unboximpl() : IntSize.Companion.m38633getZeroYbymL2g();
        SizeTransform value = this.this$1.getSizeTransform().getValue();
        return (value == null || (r5 = value.m32880createAnimationSpecTemP2vQ(r0, r2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null) : r5;
    }
}
