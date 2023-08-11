package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: BottomNavigation.kt */
final class BottomNavigationKt$BottomNavigationItem$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedContentColor;
    final /* synthetic */ RowScope $this_BottomNavigationItem;
    final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomNavigationKt$BottomNavigationItem$3(RowScope rowScope, boolean z, C13074a<C11921v> aVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, boolean z2, C13088o<? super Composer, ? super Integer, C11921v> oVar2, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, int i, int i2, int i3) {
        super(2);
        this.$this_BottomNavigationItem = rowScope;
        this.$selected = z;
        this.$onClick = aVar;
        this.$icon = oVar;
        this.$modifier = modifier;
        this.$enabled = z2;
        this.$label = oVar2;
        this.$alwaysShowLabel = z3;
        this.$interactionSource = mutableInteractionSource;
        this.$selectedContentColor = j;
        this.$unselectedContentColor = j2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        RowScope rowScope = this.$this_BottomNavigationItem;
        boolean z = this.$selected;
        C13074a<C11921v> aVar = this.$onClick;
        C13088o<Composer, Integer, C11921v> oVar = this.$icon;
        Modifier modifier = this.$modifier;
        boolean z2 = this.$enabled;
        C13088o<Composer, Integer, C11921v> oVar2 = this.$label;
        boolean z3 = this.$alwaysShowLabel;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        long j = this.$selectedContentColor;
        long j2 = this.$unselectedContentColor;
        RowScope rowScope2 = rowScope;
        BottomNavigationKt.m33896BottomNavigationItemjY6E1Zs(rowScope2, z, aVar, oVar, modifier, z2, oVar2, z3, mutableInteractionSource, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
