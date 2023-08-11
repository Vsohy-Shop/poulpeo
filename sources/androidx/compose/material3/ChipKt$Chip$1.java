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
final class ChipKt$Chip$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChipKt$Chip$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, long j, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, ChipColors chipColors, boolean z, int i, float f, PaddingValues paddingValues, int i2) {
        super(2);
        this.$label = oVar;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j;
        this.$leadingIcon = oVar2;
        this.$trailingIcon = oVar3;
        this.$colors = chipColors;
        this.$enabled = z;
        this.$$dirty = i;
        this.$minHeight = f;
        this.$paddingValues = paddingValues;
        this.$$dirty1 = i2;
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
                ComposerKt.traceEventStart(-1985962652, i2, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1335)");
            }
            C13088o<Composer, Integer, C11921v> oVar = this.$label;
            TextStyle textStyle = this.$labelTextStyle;
            long j = this.$labelColor;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$leadingIcon;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$trailingIcon;
            ChipColors chipColors = this.$colors;
            boolean z = this.$enabled;
            int i3 = this.$$dirty;
            long r8 = chipColors.leadingIconContentColor$material3_release(z, composer2, ((i3 >> 24) & 112) | ((i3 >> 6) & 14)).getValue().m35681unboximpl();
            ChipColors chipColors2 = this.$colors;
            boolean z2 = this.$enabled;
            int i4 = this.$$dirty;
            long r10 = chipColors2.trailingIconContentColor$material3_release(z2, composer2, ((i4 >> 24) & 112) | ((i4 >> 6) & 14)).getValue().m35681unboximpl();
            float f = this.$minHeight;
            PaddingValues paddingValues = this.$paddingValues;
            int i5 = this.$$dirty;
            int i6 = ((i5 >> 9) & 14) | 24576 | ((i5 >> 9) & 112) | ((i5 >> 9) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i5 >> 9) & 7168) | (458752 & (i5 >> 6));
            int i7 = this.$$dirty1;
            ChipKt.m34291ChipContentfe0OD_I(oVar, textStyle, j, oVar2, (C13088o<? super Composer, ? super Integer, C11921v>) null, oVar3, r8, r10, f, paddingValues, composer, i6 | ((i7 << 18) & 234881024) | ((i7 << 18) & 1879048192));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
