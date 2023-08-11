package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$NavigationDrawerItem$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $badge;
    final /* synthetic */ NavigationDrawerItemColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$NavigationDrawerItem$3(C13088o<? super Composer, ? super Integer, C11921v> oVar, boolean z, C13074a<C11921v> aVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        super(2);
        this.$label = oVar;
        this.$selected = z;
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$icon = oVar2;
        this.$badge = oVar3;
        this.$shape = shape;
        this.$colors = navigationDrawerItemColors;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        NavigationDrawerKt.NavigationDrawerItem(this.$label, this.$selected, this.$onClick, this.$modifier, this.$icon, this.$badge, this.$shape, this.$colors, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
