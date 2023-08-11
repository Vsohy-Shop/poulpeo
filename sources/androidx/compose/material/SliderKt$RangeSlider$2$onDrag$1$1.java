package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$RangeSlider$2$onDrag$1$1 extends C12777p implements C13088o<Boolean, Float, C11921v> {
    final /* synthetic */ C12757e0 $maxPx;
    final /* synthetic */ C12757e0 $minPx;
    final /* synthetic */ State<Function1<C13522b<Float>, C11921v>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ C13522b<Float> $value;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2$onDrag$1$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, C13522b<Float> bVar, C12757e0 e0Var, C12757e0 e0Var2, State<? extends Function1<? super C13522b<Float>, C11921v>> state, C13522b<Float> bVar2) {
        super(2);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$value = bVar;
        this.$minPx = e0Var;
        this.$maxPx = e0Var2;
        this.$onValueChangeState = state;
        this.$valueRange = bVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(boolean z, float f) {
        C13522b bVar;
        if (z) {
            MutableState<Float> mutableState = this.$rawOffsetStart;
            mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f));
            this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, this.$value.getEndInclusive().floatValue())));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            bVar = C13536k.m30875b(C13537l.m30885l(this.$rawOffsetStart.getValue().floatValue(), this.$minPx.f20408b, floatValue), floatValue);
        } else {
            MutableState<Float> mutableState2 = this.$rawOffsetEnd;
            mutableState2.setValue(Float.valueOf(mutableState2.getValue().floatValue() + f));
            this.$rawOffsetStart.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, this.$value.getStart().floatValue())));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            bVar = C13536k.m30875b(floatValue2, C13537l.m30885l(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, this.$maxPx.f20408b));
        }
        this.$onValueChangeState.getValue().invoke(SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, bVar));
    }
}
