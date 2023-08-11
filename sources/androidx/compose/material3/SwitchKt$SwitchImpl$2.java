package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Switch.kt */
final class SwitchKt$SwitchImpl$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SwitchColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;
    final /* synthetic */ BoxScope $this_SwitchImpl;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $thumbContent;
    final /* synthetic */ Shape $thumbShape;
    final /* synthetic */ State<Float> $thumbValue;
    final /* synthetic */ float $uncheckedThumbDiameter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwitchKt$SwitchImpl$2(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, C13088o<? super Composer, ? super Integer, C11921v> oVar, InteractionSource interactionSource, Shape shape, float f, float f2, float f3, int i, int i2) {
        super(2);
        this.$this_SwitchImpl = boxScope;
        this.$checked = z;
        this.$enabled = z2;
        this.$colors = switchColors;
        this.$thumbValue = state;
        this.$thumbContent = oVar;
        this.$interactionSource = interactionSource;
        this.$thumbShape = shape;
        this.$uncheckedThumbDiameter = f;
        this.$minBound = f2;
        this.$maxBound = f3;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SwitchKt.m34620SwitchImpl0DmnUew(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$thumbContent, this.$interactionSource, this.$thumbShape, this.$uncheckedThumbDiameter, this.$minBound, this.$maxBound, composer, this.$$changed | 1, this.$$changed1);
    }
}
