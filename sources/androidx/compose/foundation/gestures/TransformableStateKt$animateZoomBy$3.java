package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", mo50610f = "TransformableState.kt", mo50611l = {138}, mo50612m = "invokeSuspend")
/* compiled from: TransformableState.kt */
final class TransformableStateKt$animateZoomBy$3 extends C12746l implements C13088o<TransformScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ C12757e0 $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateZoomBy$3(C12757e0 e0Var, float f, AnimationSpec<Float> animationSpec, C12074d<? super TransformableStateKt$animateZoomBy$3> dVar) {
        super(2, dVar);
        this.$previous = e0Var;
        this.$zoomFactor = f;
        this.$animationSpec = animationSpec;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new TransformableStateKt$animateZoomBy$3(this.$previous, this.$zoomFactor, this.$animationSpec, dVar);
        transformableStateKt$animateZoomBy$3.L$0 = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    public final Object invoke(TransformScope transformScope, C12074d<? super C11921v> dVar) {
        return ((TransformableStateKt$animateZoomBy$3) create(transformScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f20408b, 0.0f, 0, 0, false, 30, (Object) null);
            Float b = C12735b.m28559b(this.$zoomFactor);
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final C12757e0 e0Var = this.$previous;
            C04401 r6 = new Function1<AnimationScope<Float, AnimationVector1D>, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
                    return C11921v.f18618a;
                }

                public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    C12775o.m28639i(animationScope, "$this$animateTo");
                    TransformScope.m33151transformByd4ec7I$default(transformScope, (e0Var.f20408b > 0.0f ? 1 : (e0Var.f20408b == 0.0f ? 0 : -1)) == 0 ? 1.0f : animationScope.getValue().floatValue() / e0Var.f20408b, 0, 0.0f, 6, (Object) null);
                    e0Var.f20408b = animationScope.getValue().floatValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, b, animationSpec, false, r6, this, 4, (Object) null) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
