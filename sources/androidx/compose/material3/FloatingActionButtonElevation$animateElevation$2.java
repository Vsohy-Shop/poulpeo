package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
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

@C12739f(mo50609c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2", mo50610f = "FloatingActionButton.kt", mo50611l = {553}, mo50612m = "invokeSuspend")
/* compiled from: FloatingActionButton.kt */
final class FloatingActionButtonElevation$animateElevation$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Animatable<C1232Dp, AnimationVector1D> $animatable;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ FloatingActionButtonElevation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevation$animateElevation$2(Animatable<C1232Dp, AnimationVector1D> animatable, FloatingActionButtonElevation floatingActionButtonElevation, float f, Interaction interaction, C12074d<? super FloatingActionButtonElevation$animateElevation$2> dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.this$0 = floatingActionButtonElevation;
        this.$target = f;
        this.$interaction = interaction;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new FloatingActionButtonElevation$animateElevation$2(this.$animatable, this.this$0, this.$target, this.$interaction, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            float r7 = this.$animatable.getTargetValue().m38482unboximpl();
            Interaction interaction = null;
            if (C1232Dp.m38473equalsimpl0(r7, this.this$0.pressedElevation)) {
                interaction = new PressInteraction.Press(Offset.Companion.m35438getZeroF1C5BW0(), (DefaultConstructorMarker) null);
            } else if (C1232Dp.m38473equalsimpl0(r7, this.this$0.hoveredElevation)) {
                interaction = new HoverInteraction.Enter();
            } else if (C1232Dp.m38473equalsimpl0(r7, this.this$0.focusedElevation)) {
                interaction = new FocusInteraction.Focus();
            }
            Animatable<C1232Dp, AnimationVector1D> animatable = this.$animatable;
            float f = this.$target;
            Interaction interaction2 = this.$interaction;
            this.label = 1;
            if (ElevationKt.m34409animateElevationrAjV9yQ(animatable, f, interaction, interaction2, this) == c) {
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
        return ((FloatingActionButtonElevation$animateElevation$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
