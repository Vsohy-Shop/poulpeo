package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Float, C11921v> $onValueChange;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ C13089p<SliderPositions, Composer, Integer, C11921v> $thumb;
    final /* synthetic */ C13089p<SliderPositions, Composer, Integer, C11921v> $track;
    final /* synthetic */ float $value;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$SliderImpl$3(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Function1<? super Float, C11921v> function1, C13074a<C11921v> aVar, int i, float f, C13522b<Float> bVar, C13089p<? super SliderPositions, ? super Composer, ? super Integer, C11921v> pVar, C13089p<? super SliderPositions, ? super Composer, ? super Integer, C11921v> pVar2, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$onValueChange = function1;
        this.$onValueChangeFinished = aVar;
        this.$steps = i;
        this.$value = f;
        this.$valueRange = bVar;
        this.$thumb = pVar;
        this.$track = pVar2;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.SliderImpl(this.$modifier, this.$enabled, this.$interactionSource, this.$onValueChange, this.$onValueChangeFinished, this.$steps, this.$value, this.$valueRange, this.$thumb, this.$track, composer, this.$$changed | 1);
    }
}
