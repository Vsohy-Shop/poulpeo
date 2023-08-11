package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.CardElevation$animateElevation$1$1", mo50610f = "Card.kt", mo50611l = {619}, mo50612m = "invokeSuspend")
/* compiled from: Card.kt */
final class CardElevation$animateElevation$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, C12074d<? super CardElevation$animateElevation$1$1> dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new CardElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            C10962f<Interaction> interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            C08441 r1 = new C10967g<Interaction>() {
                public final Object emit(Interaction interaction, C12074d<? super C11921v> dVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        snapshotStateList.remove((Object) ((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        snapshotStateList.remove((Object) ((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        snapshotStateList.remove((Object) ((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        snapshotStateList.remove((Object) ((PressInteraction.Cancel) interaction).getPress());
                    } else if (interaction instanceof DragInteraction.Start) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        snapshotStateList.remove((Object) ((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        snapshotStateList.remove((Object) ((DragInteraction.Cancel) interaction).getStart());
                    }
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (interactions.collect(r1, this) == c) {
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
        return ((CardElevation$animateElevation$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
