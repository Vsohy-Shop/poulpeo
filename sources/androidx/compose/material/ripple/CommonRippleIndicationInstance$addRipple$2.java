package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", mo50610f = "CommonRipple.kt", mo50611l = {87}, mo50612m = "invokeSuspend")
/* compiled from: CommonRipple.kt */
final class CommonRippleIndicationInstance$addRipple$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ PressInteraction.Press $interaction;
    final /* synthetic */ RippleAnimation $rippleAnimation;
    int label;
    final /* synthetic */ CommonRippleIndicationInstance this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, C12074d<? super CommonRippleIndicationInstance$addRipple$2> dVar) {
        super(2, dVar);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = commonRippleIndicationInstance;
        this.$interaction = press;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.$rippleAnimation, this.this$0, this.$interaction, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            RippleAnimation rippleAnimation = this.$rippleAnimation;
            this.label = 1;
            if (rippleAnimation.animate(this) == c) {
                return c;
            }
        } else if (i == 1) {
            try {
                C11910n.m25701b(obj);
            } catch (Throwable th) {
                this.this$0.ripples.remove(this.$interaction);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.ripples.remove(this.$interaction);
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
