package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AppBar.kt */
final class AppBarKt$MediumTopAppBar$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $actions;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$MediumTopAppBar$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2) {
        super(2);
        this.$title = oVar;
        this.$modifier = modifier;
        this.$navigationIcon = oVar2;
        this.$actions = pVar;
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AppBarKt.MediumTopAppBar(this.$title, this.$modifier, this.$navigationIcon, this.$actions, this.$windowInsets, this.$colors, this.$scrollBehavior, composer, this.$$changed | 1, this.$$default);
    }
}
