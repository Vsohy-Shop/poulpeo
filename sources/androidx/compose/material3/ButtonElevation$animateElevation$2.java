package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.ButtonElevation$animateElevation$2", mo50610f = "Button.kt", mo50611l = {855}, mo50612m = "invokeSuspend")
/* compiled from: Button.kt */
final class ButtonElevation$animateElevation$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Animatable<C1232Dp, AnimationVector1D> $animatable;
    final /* synthetic */ float $target;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ButtonElevation$animateElevation$2(Animatable<C1232Dp, AnimationVector1D> animatable, float f, C12074d<? super ButtonElevation$animateElevation$2> dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.$target = f;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new ButtonElevation$animateElevation$2(this.$animatable, this.$target, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Animatable<C1232Dp, AnimationVector1D> animatable = this.$animatable;
            C1232Dp r1 = C1232Dp.m38466boximpl(this.$target);
            this.label = 1;
            if (animatable.snapTo(r1, this) == c) {
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
        return ((ButtonElevation$animateElevation$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
