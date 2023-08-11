package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Surface.kt */
final class SurfaceKt$Surface$8 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ long $color;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurfaceKt$Surface$8(boolean z, C13074a<C11921v> aVar, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, int i2, int i3) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$enabled = z2;
        this.$shape = shape;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = borderStroke;
        this.$elevation = f;
        this.$interactionSource = mutableInteractionSource;
        this.$content = oVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        boolean z = this.$selected;
        C13074a<C11921v> aVar = this.$onClick;
        Modifier modifier = this.$modifier;
        boolean z2 = this.$enabled;
        Shape shape = this.$shape;
        long j = this.$color;
        long j2 = this.$contentColor;
        BorderStroke borderStroke = this.$border;
        float f = this.$elevation;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        C13088o<Composer, Integer, C11921v> oVar = this.$content;
        boolean z3 = z;
        SurfaceKt.m34130SurfaceNy5ogXk(z3, aVar, modifier, z2, shape, j, j2, borderStroke, f, mutableInteractionSource, (C13088o<? super Composer, ? super Integer, C11921v>) oVar, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
