package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", mo50610f = "Slider.kt", mo50611l = {1288}, mo50612m = "invokeSuspend")
/* compiled from: Slider.kt */
final class RangeSliderLogic$captureThumb$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ boolean $draggingStart;
    final /* synthetic */ Interaction $interaction;
    int label;
    final /* synthetic */ RangeSliderLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z, Interaction interaction, C12074d<? super RangeSliderLogic$captureThumb$1> dVar) {
        super(2, dVar);
        this.this$0 = rangeSliderLogic;
        this.$draggingStart = z;
        this.$interaction = interaction;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new RangeSliderLogic$captureThumb$1(this.this$0, this.$draggingStart, this.$interaction, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            MutableInteractionSource activeInteraction = this.this$0.activeInteraction(this.$draggingStart);
            Interaction interaction = this.$interaction;
            this.label = 1;
            if (activeInteraction.emit(interaction, this) == c) {
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
        return ((RangeSliderLogic$captureThumb$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
