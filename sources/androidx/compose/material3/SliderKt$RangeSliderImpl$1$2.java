package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: Slider.kt */
final class SliderKt$RangeSliderImpl$1$2 extends C12777p implements C13089p<BoxScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ String $startContentDescription;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ Modifier $startThumbSemantics;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSliderImpl$1$2(String str, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, int i) {
        super(3);
        this.$startContentDescription = str;
        this.$startInteractionSource = mutableInteractionSource;
        this.$startThumbSemantics = modifier;
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxScope boxScope, Composer composer, int i) {
        C12775o.m28639i(boxScope, "$this$TempRangeSliderThumb");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1592025586, i, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:552)");
            }
            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            String str = this.$startContentDescription;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed((Object) str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$RangeSliderImpl$1$2$1$1(str);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier then = FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), true, this.$startInteractionSource).then(this.$startThumbSemantics);
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            SliderColors sliderColors = this.$colors;
            boolean z = this.$enabled;
            int i2 = this.$$dirty;
            sliderDefaults.m34559Thumb9LiSoMs(mutableInteractionSource, then, sliderColors, z, 0, composer, ((i2 >> 18) & 14) | ProfileVerifier.CompilationStatus.f1069xf2722a21 | ((i2 >> 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i2 << 9) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
