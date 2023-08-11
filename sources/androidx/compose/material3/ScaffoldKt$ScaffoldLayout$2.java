package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$ScaffoldLayout$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $bottomBar;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $snackbar;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$ScaffoldLayout$2(int i, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, WindowInsets windowInsets, C13088o<? super Composer, ? super Integer, C11921v> oVar4, int i2) {
        super(2);
        this.$fabPosition = i;
        this.$topBar = oVar;
        this.$content = pVar;
        this.$snackbar = oVar2;
        this.$fab = oVar3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = oVar4;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        ScaffoldKt.m34556ScaffoldLayoutFMILGgc(this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$contentWindowInsets, this.$bottomBar, composer, this.$$changed | 1);
    }
}
