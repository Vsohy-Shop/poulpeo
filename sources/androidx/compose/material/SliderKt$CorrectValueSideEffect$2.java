package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$CorrectValueSideEffect$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Float, Float> $scaleToOffset;
    final /* synthetic */ C13522b<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ C13522b<Float> $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$CorrectValueSideEffect$2(Function1<? super Float, Float> function1, C13522b<Float> bVar, C13522b<Float> bVar2, MutableState<Float> mutableState, float f, int i) {
        super(2);
        this.$scaleToOffset = function1;
        this.$valueRange = bVar;
        this.$trackRange = bVar2;
        this.$valueState = mutableState;
        this.$value = f;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.CorrectValueSideEffect(this.$scaleToOffset, this.$valueRange, this.$trackRange, this.$valueState, this.$value, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
