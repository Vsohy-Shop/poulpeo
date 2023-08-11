package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AppBar.kt */
final class AppBarKt$TopAppBarLayout$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $actionIconContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $actions;
    final /* synthetic */ float $heightPx;
    final /* synthetic */ boolean $hideTitleSemantics;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $navigationIcon;
    final /* synthetic */ long $navigationIconContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ float $titleAlpha;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TopAppBarLayout$3(Modifier modifier, float f, long j, long j2, long j3, C13088o<? super Composer, ? super Integer, C11921v> oVar, TextStyle textStyle, float f2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$heightPx = f;
        this.$navigationIconContentColor = j;
        this.$titleContentColor = j2;
        this.$actionIconContentColor = j3;
        this.$title = oVar;
        this.$titleTextStyle = textStyle;
        this.$titleAlpha = f2;
        this.$titleVerticalArrangement = vertical;
        this.$titleHorizontalArrangement = horizontal;
        this.$titleBottomPadding = i;
        this.$hideTitleSemantics = z;
        this.$navigationIcon = oVar2;
        this.$actions = oVar3;
        this.$$changed = i2;
        this.$$changed1 = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        Modifier modifier = this.$modifier;
        Modifier modifier2 = modifier;
        AppBarKt.m34251TopAppBarLayoutkXwM9vE(modifier2, this.$heightPx, this.$navigationIconContentColor, this.$titleContentColor, this.$actionIconContentColor, this.$title, this.$titleTextStyle, this.$titleAlpha, this.$titleVerticalArrangement, this.$titleHorizontalArrangement, this.$titleBottomPadding, this.$hideTitleSemantics, this.$navigationIcon, this.$actions, composer2, this.$$changed | 1, this.$$changed1);
    }
}
