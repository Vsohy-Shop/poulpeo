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

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", mo50610f = "TransformableState.kt", mo50611l = {158}, mo50612m = "invokeSuspend")
/* compiled from: TransformableState.kt */
final class TransformableStateKt$animateRotateBy$2 extends C12746l implements C13088o<TransformScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $degrees;
    final /* synthetic */ C12757e0 $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateRotateBy$2(C12757e0 e0Var, float f, AnimationSpec<Float> animationSpec, C12074d<? super TransformableStateKt$animateRotateBy$2> dVar) {
        super(2, dVar);
        this.$previous = e0Var;
        this.$degrees = f;
        this.$animationSpec = animationSpec;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new TransformableStateKt$animateRotateBy$2(this.$previous, this.$degrees, this.$animationSpec, dVar);
        transformableStateKt$animateRotateBy$2.L$0 = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    public final Object invoke(TransformScope transformScope, C12074d<? super C11921v> dVar) {
        return ((TransformableStateKt$animateRotateBy$2) create(transformScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f20408b, 0.0f, 0, 0, false, 30, (Object) null);
            Float b = C12735b.m28559b(this.$degrees);
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final C12757e0 e0Var = this.$previous;
            C04391 r6 = new Function1<AnimationScope<Float, AnimationVector1D>, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
                    return C11921v.f18618a;
                }

                public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    C12775o.m28639i(animationScope, "$this$animateTo");
                    TransformScope.m33151transformByd4ec7I$default(transformScope, 0.0f, 0, animationScope.getValue().floatValue() - e0Var.f20408b, 3, (Object) null);
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
