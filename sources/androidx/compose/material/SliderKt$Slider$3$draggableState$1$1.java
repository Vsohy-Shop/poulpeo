package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$Slider$3$draggableState$1$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ C12757e0 $maxPx;
    final /* synthetic */ C12757e0 $minPx;
    final /* synthetic */ State<Function1<Float, C11921v>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ MutableState<Float> $rawOffset;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$3$draggableState$1$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, C12757e0 e0Var, C12757e0 e0Var2, State<? extends Function1<? super Float, C11921v>> state, C13522b<Float> bVar) {
        super(1);
        this.$rawOffset = mutableState;
        this.$pressOffset = mutableState2;
        this.$minPx = e0Var;
        this.$maxPx = e0Var2;
        this.$onValueChangeState = state;
        this.$valueRange = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        MutableState<Float> mutableState = this.$rawOffset;
        mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f + this.$pressOffset.getValue().floatValue()));
        this.$pressOffset.setValue(Float.valueOf(0.0f));
        this.$onValueChangeState.getValue().invoke(Float.valueOf(SliderKt$Slider$3.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, C13537l.m30885l(this.$rawOffset.getValue().floatValue(), this.$minPx.f20408b, this.$maxPx.f20408b))));
    }
}
