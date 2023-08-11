package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: NavigationBar.kt */
final class NavigationBarKt$NavigationBarItem$3$indicator$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ NavigationBarItemColors $colors;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationBarKt$NavigationBarItem$3$indicator$1(NavigationBarItemColors navigationBarItemColors, State<Float> state) {
        super(2);
        this.$colors = navigationBarItemColors;
        this.$animationProgress$delegate = state;
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
                ComposerKt.traceEventStart(-474426875, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
            }
            BoxKt.Box(BackgroundKt.m32956backgroundbw27NRU(LayoutIdKt.layoutId(Modifier.Companion, "indicator"), Color.m35670copywmQWz5c$default(this.$colors.m34494getIndicatorColor0d7_KjU$material3_release(), NavigationBarKt.m34499NavigationBarItem$lambda9$lambda6(this.$animationProgress$delegate), 0.0f, 0.0f, 0.0f, 14, (Object) null), ShapesKt.toShape(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer, 6)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
