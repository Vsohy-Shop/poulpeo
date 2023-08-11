package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Slider.kt */
final class SliderKt$TempRangeSliderTrack$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbWidth;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$TempRangeSliderTrack$3(Modifier modifier, SliderColors sliderColors, boolean z, float f, float f2, float[] fArr, float f3, float f4, int i) {
        super(2);
        this.$modifier = modifier;
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$positionFractionStart = f;
        this.$positionFractionEnd = f2;
        this.$tickFractions = fArr;
        this.$thumbWidth = f3;
        this.$trackStrokeWidth = f4;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.m34562TempRangeSliderTrackau3_HiA(this.$modifier, this.$colors, this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$thumbWidth, this.$trackStrokeWidth, composer, this.$$changed | 1);
    }
}
