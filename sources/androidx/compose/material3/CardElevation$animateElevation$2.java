package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.CardElevation$animateElevation$2", mo50610f = "Card.kt", mo50611l = {681, 688}, mo50612m = "invokeSuspend")
/* compiled from: Card.kt */
final class CardElevation$animateElevation$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Animatable<C1232Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ CardElevation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$2(boolean z, Animatable<C1232Dp, AnimationVector1D> animatable, CardElevation cardElevation, float f, Interaction interaction, C12074d<? super CardElevation$animateElevation$2> dVar) {
        super(2, dVar);
        this.$enabled = z;
        this.$animatable = animatable;
        this.this$0 = cardElevation;
        this.$target = f;
        this.$interaction = interaction;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new CardElevation$animateElevation$2(this.$enabled, this.$animatable, this.this$0, this.$target, this.$interaction, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (this.$enabled) {
                float r7 = this.$animatable.getTargetValue().m38482unboximpl();
                Interaction interaction = null;
                if (C1232Dp.m38473equalsimpl0(r7, this.this$0.pressedElevation)) {
                    interaction = new PressInteraction.Press(Offset.Companion.m35438getZeroF1C5BW0(), (DefaultConstructorMarker) null);
                } else if (C1232Dp.m38473equalsimpl0(r7, this.this$0.hoveredElevation)) {
                    interaction = new HoverInteraction.Enter();
                } else if (C1232Dp.m38473equalsimpl0(r7, this.this$0.focusedElevation)) {
                    interaction = new FocusInteraction.Focus();
                } else if (C1232Dp.m38473equalsimpl0(r7, this.this$0.draggedElevation)) {
                    interaction = new DragInteraction.Start();
                }
                Animatable<C1232Dp, AnimationVector1D> animatable = this.$animatable;
                float f = this.$target;
                Interaction interaction2 = this.$interaction;
                this.label = 1;
                if (ElevationKt.m34409animateElevationrAjV9yQ(animatable, f, interaction, interaction2, this) == c) {
                    return c;
                }
            } else {
                Animatable<C1232Dp, AnimationVector1D> animatable2 = this.$animatable;
                C1232Dp r1 = C1232Dp.m38466boximpl(this.$target);
                this.label = 2;
                if (animatable2.snapTo(r1, this) == c) {
                    return c;
                }
            }
        } else if (i == 1 || i == 2) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((CardElevation$animateElevation$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
