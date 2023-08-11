package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$CorrectValueSideEffect$1$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Function1<Float, Float> $scaleToOffset;
    final /* synthetic */ C13522b<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ C13522b<Float> $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$CorrectValueSideEffect$1$1(C13522b<Float> bVar, Function1<? super Float, Float> function1, float f, MutableState<Float> mutableState, C13522b<Float> bVar2) {
        super(0);
        this.$valueRange = bVar;
        this.$scaleToOffset = function1;
        this.$value = f;
        this.$valueState = mutableState;
        this.$trackRange = bVar2;
    }

    public final void invoke() {
        float floatValue = (this.$valueRange.getEndInclusive().floatValue() - this.$valueRange.getStart().floatValue()) / ((float) 1000);
        float floatValue2 = this.$scaleToOffset.invoke(Float.valueOf(this.$value)).floatValue();
        if (Math.abs(floatValue2 - this.$valueState.getValue().floatValue()) > floatValue && this.$trackRange.contains(this.$valueState.getValue())) {
            this.$valueState.setValue(Float.valueOf(floatValue2));
        }
    }
}
