package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Chip.kt */
final class ChipKt$SelectableChip$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $avatar;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChipKt$SelectableChip$2(SelectableChipColors selectableChipColors, boolean z, boolean z2, int i, int i2, C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, float f, PaddingValues paddingValues) {
        super(2);
        this.$colors = selectableChipColors;
        this.$enabled = z;
        this.$selected = z2;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$label = oVar;
        this.$labelTextStyle = textStyle;
        this.$leadingIcon = oVar2;
        this.$avatar = oVar3;
        this.$trailingIcon = oVar4;
        this.$minHeight = f;
        this.$paddingValues = paddingValues;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577614814, i2, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1385)");
            }
            SelectableChipColors selectableChipColors = this.$colors;
            boolean z = this.$enabled;
            boolean z2 = this.$selected;
            int i3 = this.$$dirty;
            long r3 = selectableChipColors.labelColor$material3_release(z, z2, composer2, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((this.$$dirty1 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH)).getValue().m35681unboximpl();
            SelectableChipColors selectableChipColors2 = this.$colors;
            boolean z3 = this.$enabled;
            boolean z4 = this.$selected;
            int i4 = this.$$dirty;
            long r8 = selectableChipColors2.leadingIconContentColor$material3_release(z3, z4, composer2, ((i4 << 3) & 112) | ((i4 >> 9) & 14) | ((this.$$dirty1 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH)).getValue().m35681unboximpl();
            SelectableChipColors selectableChipColors3 = this.$colors;
            boolean z5 = this.$enabled;
            boolean z6 = this.$selected;
            int i5 = this.$$dirty;
            long r10 = selectableChipColors3.trailingIconContentColor$material3_release(z5, z6, composer2, ((i5 << 3) & 112) | ((i5 >> 9) & 14) | ((this.$$dirty1 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH)).getValue().m35681unboximpl();
            C13088o<Composer, Integer, C11921v> oVar = this.$label;
            TextStyle textStyle = this.$labelTextStyle;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$leadingIcon;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$avatar;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$trailingIcon;
            float f = this.$minHeight;
            PaddingValues paddingValues = this.$paddingValues;
            int i6 = this.$$dirty;
            int i7 = ((i6 >> 12) & 14) | ((i6 >> 12) & 112) | ((i6 >> 9) & 7168) | ((i6 >> 9) & 57344) | ((i6 >> 9) & 458752);
            int i8 = this.$$dirty1;
            ChipKt.m34291ChipContentfe0OD_I(oVar, textStyle, r3, oVar2, oVar3, oVar4, r8, r10, f, paddingValues, composer, ((i8 << 15) & 1879048192) | i7 | ((i8 << 15) & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
