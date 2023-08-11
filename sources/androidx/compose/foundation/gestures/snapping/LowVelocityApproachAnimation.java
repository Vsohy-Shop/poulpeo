package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/LowVelocityApproachAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
/* compiled from: SnapFlingBehavior.kt */
final class LowVelocityApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final Density density;
    private final SnapLayoutInfoProvider layoutInfoProvider;
    private final AnimationSpec<Float> lowVelocityAnimationSpec;

    public LowVelocityApproachAnimation(AnimationSpec<Float> animationSpec, SnapLayoutInfoProvider snapLayoutInfoProvider, Density density2) {
        C12775o.m28639i(animationSpec, "lowVelocityAnimationSpec");
        C12775o.m28639i(snapLayoutInfoProvider, "layoutInfoProvider");
        C12775o.m28639i(density2, "density");
        this.lowVelocityAnimationSpec = animationSpec;
        this.layoutInfoProvider = snapLayoutInfoProvider;
        this.density = density2;
    }

    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, C12074d dVar) {
        return approachAnimation(scrollScope, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), (Function1<? super Float, C11921v>) function1, (C12074d<? super AnimationResult<Float, AnimationVector1D>>) dVar);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f, float f2, Function1<? super Float, C11921v> function1, C12074d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        Object access$animateSnap = SnapFlingBehaviorKt.animateSnap(scrollScope, (Math.abs(f) + this.layoutInfoProvider.calculateSnapStepSize(this.density)) * Math.signum(f2), f, AnimationStateKt.AnimationState$default(0.0f, f2, 0, 0, false, 28, (Object) null), this.lowVelocityAnimationSpec, function1, dVar);
        return access$animateSnap == C12150d.m26492c() ? access$animateSnap : (AnimationResult) access$animateSnap;
    }
}
