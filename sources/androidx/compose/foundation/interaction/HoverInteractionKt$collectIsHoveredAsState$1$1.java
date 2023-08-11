package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", mo50610f = "HoverInteraction.kt", mo50611l = {69}, mo50612m = "invokeSuspend")
/* compiled from: HoverInteraction.kt */
final class HoverInteractionKt$collectIsHoveredAsState$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MutableState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HoverInteractionKt$collectIsHoveredAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, C12074d<? super HoverInteractionKt$collectIsHoveredAsState$1$1> dVar) {
        super(2, dVar);
        this.$this_collectIsHoveredAsState = interactionSource;
        this.$isHovered = mutableState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new HoverInteractionKt$collectIsHoveredAsState$1$1(this.$this_collectIsHoveredAsState, this.$isHovered, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final ArrayList arrayList = new ArrayList();
            C10962f<Interaction> interactions = this.$this_collectIsHoveredAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isHovered;
            C04451 r3 = new C10967g<Interaction>() {
                public final Object emit(Interaction interaction, C12074d<? super C11921v> dVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    }
                    mutableState.setValue(C12735b.m28558a(!arrayList.isEmpty()));
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
        return ((HoverInteractionKt$collectIsHoveredAsState$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
