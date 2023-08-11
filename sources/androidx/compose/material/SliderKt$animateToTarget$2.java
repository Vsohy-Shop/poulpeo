package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
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

@C12739f(mo50609c = "androidx.compose.material.SliderKt$animateToTarget$2", mo50610f = "Slider.kt", mo50611l = {954}, mo50612m = "invokeSuspend")
/* compiled from: Slider.kt */
final class SliderKt$animateToTarget$2 extends C12746l implements C13088o<DragScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$animateToTarget$2(float f, float f2, float f3, C12074d<? super SliderKt$animateToTarget$2> dVar) {
        super(2, dVar);
        this.$current = f;
        this.$target = f2;
        this.$velocity = f3;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, dVar);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    public final Object invoke(DragScope dragScope, C12074d<? super C11921v> dVar) {
        return ((SliderKt$animateToTarget$2) create(dragScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final DragScope dragScope = (DragScope) this.L$0;
            final C12757e0 e0Var = new C12757e0();
            float f = this.$current;
            e0Var.f20408b = f;
            Animatable Animatable$default = AnimatableKt.Animatable$default(f, 0.0f, 2, (Object) null);
            Float b = C12735b.m28559b(this.$target);
            TweenSpec access$getSliderToTickAnimation$p = SliderKt.SliderToTickAnimation;
            Float b2 = C12735b.m28559b(this.$velocity);
            C07761 r11 = new Function1<Animatable<Float, AnimationVector1D>, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Animatable<Float, AnimationVector1D>) (Animatable) obj);
                    return C11921v.f18618a;
                }

                public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                    C12775o.m28639i(animatable, "$this$animateTo");
                    dragScope.dragBy(animatable.getValue().floatValue() - e0Var.f20408b);
                    e0Var.f20408b = animatable.getValue().floatValue();
                }
            };
            this.label = 1;
            if (Animatable$default.animateTo(b, access$getSliderToTickAnimation$p, b2, r11, this) == c) {
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
