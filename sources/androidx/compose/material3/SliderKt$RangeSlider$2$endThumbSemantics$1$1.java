package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$RangeSlider$2$endThumbSemantics$1$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ float $coercedStart;
    final /* synthetic */ State<Function1<C13522b<Float>, C11921v>> $onValueChangeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2$endThumbSemantics$1$1(State<? extends Function1<? super C13522b<Float>, C11921v>> state, float f) {
        super(1);
        this.$onValueChangeState = state;
        this.$coercedStart = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        this.$onValueChangeState.getValue().invoke(C13536k.m30875b(this.$coercedStart, f));
    }
}
