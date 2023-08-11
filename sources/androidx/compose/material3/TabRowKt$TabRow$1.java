package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: TabRow.kt */
final class TabRowKt$TabRow$1 extends C12777p implements C13089p<List<? extends TabPosition>, Composer, Integer, C11921v> {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabRowKt$TabRow$1(int i) {
        super(3);
        this.$selectedTabIndex = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((List<TabPosition>) (List) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(List<TabPosition> list, Composer composer, int i) {
        C12775o.m28639i(list, "tabPositions");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2052073983, i, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
        }
        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
        tabRowDefaults.m34636Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, list.get(this.$selectedTabIndex)), 0.0f, 0, composer, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
