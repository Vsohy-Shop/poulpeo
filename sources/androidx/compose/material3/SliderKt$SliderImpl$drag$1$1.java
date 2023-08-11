package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13089p;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", mo50610f = "Slider.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$drag$1$1 extends C12746l implements C13089p<C13995l0, Float, C12074d<? super C11921v>, Object> {
    final /* synthetic */ State<C13074a<C11921v>> $gestureEndAction;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$SliderImpl$drag$1$1(State<? extends C13074a<C11921v>> state, C12074d<? super SliderKt$SliderImpl$drag$1$1> dVar) {
        super(3, dVar);
        this.$gestureEndAction = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C13995l0) obj, ((Number) obj2).floatValue(), (C12074d<? super C11921v>) (C12074d) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            this.$gestureEndAction.getValue().invoke();
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, float f, C12074d<? super C11921v> dVar) {
        return new SliderKt$SliderImpl$drag$1$1(this.$gestureEndAction, dVar).invokeSuspend(C11921v.f18618a);
    }
}
