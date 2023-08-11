package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$Scaffold$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $bottomBar;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$Scaffold$1(int i, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, WindowInsets windowInsets, C13088o<? super Composer, ? super Integer, C11921v> oVar4, int i2) {
        super(2);
        this.$floatingActionButtonPosition = i;
        this.$topBar = oVar;
        this.$content = pVar;
        this.$snackbarHost = oVar2;
        this.$floatingActionButton = oVar3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = oVar4;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1979205334, i, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
            }
            int i2 = this.$floatingActionButtonPosition;
            C13088o<Composer, Integer, C11921v> oVar = this.$topBar;
            C13089p<PaddingValues, Composer, Integer, C11921v> pVar = this.$content;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$snackbarHost;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$floatingActionButton;
            WindowInsets windowInsets = this.$contentWindowInsets;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$bottomBar;
            int i3 = this.$$dirty;
            ScaffoldKt.m34556ScaffoldLayoutFMILGgc(i2, oVar, pVar, oVar2, oVar3, windowInsets, oVar4, composer, ((i3 >> 15) & 14) | (i3 & 112) | ((i3 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | ((i3 >> 9) & 458752) | ((i3 << 12) & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
