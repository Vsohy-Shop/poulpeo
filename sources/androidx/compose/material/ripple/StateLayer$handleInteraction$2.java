package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", mo50610f = "Ripple.kt", mo50611l = {296}, mo50612m = "invokeSuspend")
/* compiled from: Ripple.kt */
final class StateLayer$handleInteraction$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AnimationSpec<Float> $outgoingAnimationSpec;
    int label;
    final /* synthetic */ StateLayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StateLayer$handleInteraction$2(StateLayer stateLayer, AnimationSpec<Float> animationSpec, C12074d<? super StateLayer$handleInteraction$2> dVar) {
        super(2, dVar);
        this.this$0 = stateLayer;
        this.$outgoingAnimationSpec = animationSpec;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new StateLayer$handleInteraction$2(this.this$0, this.$outgoingAnimationSpec, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Animatable access$getAnimatedAlpha$p = this.this$0.animatedAlpha;
            Float b = C12735b.m28559b(0.0f);
            AnimationSpec<Float> animationSpec = this.$outgoingAnimationSpec;
            this.label = 1;
            if (Animatable.animateTo$default(access$getAnimatedAlpha$p, b, animationSpec, (Object) null, (Function1) null, this, 12, (Object) null) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((StateLayer$handleInteraction$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
