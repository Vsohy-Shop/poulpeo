package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
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
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", mo50610f = "Scrollable.kt", mo50611l = {545}, mo50612m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class DefaultFlingBehavior$performFling$2 extends C12746l implements C13088o<C13995l0, C12074d<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ScrollScope $this_performFling;
    Object L$0;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, C12074d<? super DefaultFlingBehavior$performFling$2> dVar) {
        super(2, dVar);
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        C12757e0 e0Var;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                final C12757e0 e0Var2 = new C12757e0();
                e0Var2.f20408b = this.$initialVelocity;
                final C12757e0 e0Var3 = new C12757e0();
                AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0, 0, false, 28, (Object) null);
                DecayAnimationSpec access$getFlingDecay$p = this.this$0.flingDecay;
                final ScrollScope scrollScope = this.$this_performFling;
                final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                C04011 r5 = new Function1<AnimationScope<Float, AnimationVector1D>, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
                        return C11921v.f18618a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        C12775o.m28639i(animationScope, "$this$animateDecay");
                        float floatValue = animationScope.getValue().floatValue() - e0Var3.f20408b;
                        float scrollBy = scrollScope.scrollBy(floatValue);
                        e0Var3.f20408b = animationScope.getValue().floatValue();
                        e0Var2.f20408b = animationScope.getVelocity().floatValue();
                        if (Math.abs(floatValue - scrollBy) > 0.5f) {
                            animationScope.cancelAnimation();
                        }
                        DefaultFlingBehavior defaultFlingBehavior = defaultFlingBehavior;
                        defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
                    }
                };
                this.L$0 = e0Var2;
                this.label = 1;
                if (SuspendAnimationKt.animateDecay$default(AnimationState$default, access$getFlingDecay$p, false, r5, this, 2, (Object) null) == c) {
                    return c;
                }
                e0Var = e0Var2;
            } else {
                f = this.$initialVelocity;
                return C12735b.m28559b(f);
            }
        } else if (i == 1) {
            e0Var = (C12757e0) this.L$0;
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f = e0Var.f20408b;
        return C12735b.m28559b(f);
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super Float> dVar) {
        return ((DefaultFlingBehavior$performFling$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
