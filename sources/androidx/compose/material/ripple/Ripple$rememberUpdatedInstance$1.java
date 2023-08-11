package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", mo50610f = "Ripple.kt", mo50611l = {136}, mo50612m = "invokeSuspend")
/* compiled from: Ripple.kt */
final class Ripple$rememberUpdatedInstance$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Ripple$rememberUpdatedInstance$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, C12074d<? super Ripple$rememberUpdatedInstance$1> dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, dVar);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C13995l0 l0Var = (C13995l0) this.L$0;
            C10962f<Interaction> interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            C08301 r3 = new C10967g<Interaction>() {
                public final Object emit(Interaction interaction, C12074d<? super C11921v> dVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        rippleIndicationInstance.addRipple((PressInteraction.Press) interaction, l0Var);
                    } else if (interaction instanceof PressInteraction.Release) {
                        rippleIndicationInstance.removeRipple(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        rippleIndicationInstance.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                    } else {
                        rippleIndicationInstance.updateStateLayer$material_ripple_release(interaction, l0Var);
                    }
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (interactions.collect(r3, this) == c) {
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
        return ((Ripple$rememberUpdatedInstance$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
