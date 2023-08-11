package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$getAnimatedOffset$1", mo50610f = "LazyGridItemPlacementAnimator.kt", mo50611l = {281}, mo50612m = "invokeSuspend")
/* compiled from: LazyGridItemPlacementAnimator.kt */
final class LazyGridItemPlacementAnimator$getAnimatedOffset$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ PlaceableInfo $item;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridItemPlacementAnimator$getAnimatedOffset$1(PlaceableInfo placeableInfo, C12074d<? super LazyGridItemPlacementAnimator$getAnimatedOffset$1> dVar) {
        super(2, dVar);
        this.$item = placeableInfo;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new LazyGridItemPlacementAnimator$getAnimatedOffset$1(this.$item, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Animatable<IntOffset, AnimationVector2D> animatedOffset = this.$item.getAnimatedOffset();
            IntOffset r1 = IntOffset.m38577boximpl(this.$item.m33509getTargetOffsetnOccac());
            this.label = 1;
            if (animatedOffset.snapTo(r1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$item.setInProgress(false);
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((LazyGridItemPlacementAnimator$getAnimatedOffset$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
