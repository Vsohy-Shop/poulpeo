package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: Slider.kt */
final class SliderKt$Slider$3$1 extends C12777p implements C13089p<SliderPositions, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$3$1(SliderColors sliderColors, boolean z, int i) {
        super(3);
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SliderPositions) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SliderPositions sliderPositions, Composer composer, int i) {
        C12775o.m28639i(sliderPositions, "sliderPositions");
        if ((i & 14) == 0) {
            i |= composer.changed((Object) sliderPositions) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1022381539, i, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
            }
            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
            SliderColors sliderColors = this.$colors;
            boolean z = this.$enabled;
            int i2 = this.$$dirty;
            sliderDefaults.Track(sliderPositions, (Modifier) null, sliderColors, z, composer, (i & 14) | 24576 | ((i2 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i2 & 7168), 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
