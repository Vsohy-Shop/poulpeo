package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AppBar.kt */
final class AppBarKt$TwoRowsTopAppBar$4 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $actions;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $navigationIcon;
    final /* synthetic */ float $pinnedHeight;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ float $titleBottomPadding;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$4(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, float f, C13088o<? super Composer, ? super Integer, C11921v> oVar2, TextStyle textStyle2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, float f2, float f3, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$title = oVar;
        this.$titleTextStyle = textStyle;
        this.$titleBottomPadding = f;
        this.$smallTitle = oVar2;
        this.$smallTitleTextStyle = textStyle2;
        this.$navigationIcon = oVar3;
        this.$actions = pVar;
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$maxHeight = f2;
        this.$pinnedHeight = f3;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Modifier modifier = this.$modifier;
        Modifier modifier2 = modifier;
        AppBarKt.m34252TwoRowsTopAppBartjU4iQQ(modifier2, this.$title, this.$titleTextStyle, this.$titleBottomPadding, this.$smallTitle, this.$smallTitleTextStyle, this.$navigationIcon, this.$actions, this.$windowInsets, this.$colors, this.$maxHeight, this.$pinnedHeight, this.$scrollBehavior, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
