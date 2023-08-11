package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p002ui.unit.IntOffset;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", mo50610f = "LazyGridItemPlacementAnimator.kt", mo50611l = {357}, mo50612m = "invokeSuspend")
/* compiled from: LazyGridItemPlacementAnimator.kt */
final class LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $animationSpec;
    final /* synthetic */ PlaceableInfo $placeableInfo;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(PlaceableInfo placeableInfo, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, C12074d<? super LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1> dVar) {
        super(2, dVar);
        this.$placeableInfo = placeableInfo;
        this.$animationSpec = finiteAnimationSpec;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.$placeableInfo, this.$animationSpec, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        AnimationSpec animationSpec;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (this.$placeableInfo.getAnimatedOffset().isRunning()) {
                FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.$animationSpec;
                if (finiteAnimationSpec instanceof SpringSpec) {
                    animationSpec = (SpringSpec) finiteAnimationSpec;
                } else {
                    animationSpec = LazyGridItemPlacementAnimatorKt.InterruptionSpec;
                }
            } else {
                animationSpec = this.$animationSpec;
            }
            AnimationSpec animationSpec2 = animationSpec;
            Animatable<IntOffset, AnimationVector2D> animatedOffset = this.$placeableInfo.getAnimatedOffset();
            IntOffset r4 = IntOffset.m38577boximpl(this.$placeableInfo.m33509getTargetOffsetnOccac());
            this.label = 1;
            if (Animatable.animateTo$default(animatedOffset, r4, animationSpec2, (Object) null, (Function1) null, this, 12, (Object) null) == c) {
                return c;
            }
        } else if (i == 1) {
            try {
                C11910n.m25701b(obj);
            } catch (CancellationException unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$placeableInfo.setInProgress(false);
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
