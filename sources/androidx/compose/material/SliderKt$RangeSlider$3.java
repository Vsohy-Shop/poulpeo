package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$RangeSlider$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<C13522b<Float>, C11921v> $onValueChange;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ C13522b<Float> $value;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$3(C13522b<Float> bVar, Function1<? super C13522b<Float>, C11921v> function1, Modifier modifier, boolean z, C13522b<Float> bVar2, int i, C13074a<C11921v> aVar, SliderColors sliderColors, int i2, int i3) {
        super(2);
        this.$value = bVar;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$enabled = z;
        this.$valueRange = bVar2;
        this.$steps = i;
        this.$onValueChangeFinished = aVar;
        this.$colors = sliderColors;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.RangeSlider(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$valueRange, this.$steps, this.$onValueChangeFinished, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
