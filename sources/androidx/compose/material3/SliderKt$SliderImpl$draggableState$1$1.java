package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$draggableState$1$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ State<Function1<Float, C11921v>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ MutableState<Float> $rawOffset;
    final /* synthetic */ MutableState<Float> $thumbWidth;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ MutableState<Integer> $totalWidth;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$SliderImpl$draggableState$1$1(MutableState<Integer> mutableState, MutableState<Float> mutableState2, MutableState<Float> mutableState3, MutableState<Float> mutableState4, float[] fArr, State<? extends Function1<? super Float, C11921v>> state, C13522b<Float> bVar) {
        super(1);
        this.$totalWidth = mutableState;
        this.$thumbWidth = mutableState2;
        this.$rawOffset = mutableState3;
        this.$pressOffset = mutableState4;
        this.$tickFractions = fArr;
        this.$onValueChangeState = state;
        this.$valueRange = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        float f2 = (float) 2;
        float max = Math.max(this.$totalWidth.getValue().floatValue() - (this.$thumbWidth.getValue().floatValue() / f2), 0.0f);
        float min = Math.min(this.$thumbWidth.getValue().floatValue() / f2, max);
        MutableState<Float> mutableState = this.$rawOffset;
        mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f + this.$pressOffset.getValue().floatValue()));
        this.$pressOffset.setValue(Float.valueOf(0.0f));
        this.$onValueChangeState.getValue().invoke(Float.valueOf(SliderKt.SliderImpl$scaleToUserValue(this.$valueRange, min, max, SliderKt.snapValueToTick(this.$rawOffset.getValue().floatValue(), this.$tickFractions, min, max))));
    }
}
