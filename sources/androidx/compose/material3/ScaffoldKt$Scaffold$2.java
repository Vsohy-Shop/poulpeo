package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$Scaffold$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $bottomBar;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$Scaffold$2(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, int i, long j, long j2, WindowInsets windowInsets, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$topBar = oVar;
        this.$bottomBar = oVar2;
        this.$snackbarHost = oVar3;
        this.$floatingActionButton = oVar4;
        this.$floatingActionButtonPosition = i;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$contentWindowInsets = windowInsets;
        this.$content = pVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        ScaffoldKt.m34555ScaffoldTvnljyQ(this.$modifier, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$containerColor, this.$contentColor, this.$contentWindowInsets, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
