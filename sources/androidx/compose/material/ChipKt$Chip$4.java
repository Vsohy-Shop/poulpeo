package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Chip.kt */
final class ChipKt$Chip$4 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChipKt$Chip$4(C13074a<C11921v> aVar, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$border = borderStroke;
        this.$colors = chipColors;
        this.$leadingIcon = oVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        ChipKt.Chip(this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$shape, this.$border, this.$colors, this.$leadingIcon, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
