package androidx.compose.material3;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2 implements MeasurePolicy {
    final /* synthetic */ DrawerState $drawerState;

    NavigationDrawerKt$DismissibleNavigationDrawer$2$2(DrawerState drawerState) {
        this.$drawerState = drawerState;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34519measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "measurables");
        Placeable r0 = ((Measurable) list.get(0)).m37365measureBRTryo0(j);
        Placeable r10 = ((Measurable) list.get(1)).m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r10.getWidth(), r10.getHeight(), (Map) null, new NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(r10, r0, this.$drawerState), 4, (Object) null);
    }
}
