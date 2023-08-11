package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AppBar.kt */
final class AppBarKt$TopAppBarLayout$1$3$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ float $titleAlpha;
    final /* synthetic */ long $titleContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TopAppBarLayout$1$3$1(long j, float f, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$titleContentColor = j;
        this.$titleAlpha = f;
        this.$title = oVar;
        this.$$dirty = i;
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
                ComposerKt.traceEventStart(824316656, i, -1, "androidx.compose.material3.TopAppBarLayout.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:1270)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(Color.m35670copywmQWz5c$default(this.$titleContentColor, this.$titleAlpha, 0.0f, 0.0f, 0.0f, 14, (Object) null)))}, (C13088o<? super Composer, ? super Integer, C11921v>) this.$title, composer, ((this.$$dirty >> 12) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
