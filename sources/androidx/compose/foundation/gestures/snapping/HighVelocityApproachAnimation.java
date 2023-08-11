package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: SnapFlingBehavior.kt */
final class HighVelocityApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    public HighVelocityApproachAnimation(DecayAnimationSpec<Float> decayAnimationSpec2) {
        C12775o.m28639i(decayAnimationSpec2, "decayAnimationSpec");
        this.decayAnimationSpec = decayAnimationSpec2;
    }

    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, C12074d dVar) {
        return approachAnimation(scrollScope, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), (Function1<? super Float, C11921v>) function1, (C12074d<? super AnimationResult<Float, AnimationVector1D>>) dVar);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f, float f2, Function1<? super Float, C11921v> function1, C12074d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        Object access$animateDecay = SnapFlingBehaviorKt.animateDecay(scrollScope, f, AnimationStateKt.AnimationState$default(0.0f, f2, 0, 0, false, 28, (Object) null), this.decayAnimationSpec, function1, dVar);
        return access$animateDecay == C12150d.m26492c() ? access$animateDecay : (AnimationResult) access$animateDecay;
    }
}
