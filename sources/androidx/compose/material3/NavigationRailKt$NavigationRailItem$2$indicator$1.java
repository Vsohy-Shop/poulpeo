package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: NavigationRail.kt */
final class NavigationRailKt$NavigationRailItem$2$indicator$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ NavigationRailItemColors $colors;
    final /* synthetic */ Shape $indicatorShape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationRailKt$NavigationRailItem$2$indicator$1(NavigationRailItemColors navigationRailItemColors, int i, Shape shape, State<Float> state) {
        super(2);
        this.$colors = navigationRailItemColors;
        this.$$dirty = i;
        this.$indicatorShape = shape;
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
                ComposerKt.traceEventStart(-1862011490, i, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
            }
            BoxKt.Box(BackgroundKt.m32956backgroundbw27NRU(LayoutIdKt.layoutId(Modifier.Companion, "indicator"), Color.m35670copywmQWz5c$default(this.$colors.getIndicatorColor(composer, (this.$$dirty >> 21) & 14), NavigationRailKt.m34524NavigationRailItem$lambda5$lambda2(this.$animationProgress$delegate), 0.0f, 0.0f, 0.0f, 14, (Object) null), this.$indicatorShape), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
