package androidx.compose.material3;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $contentPlaceable;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ Placeable $sheetPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(Placeable placeable, Placeable placeable2, DrawerState drawerState) {
        super(1);
        this.$contentPlaceable = placeable;
        this.$sheetPlaceable = placeable2;
        this.$drawerState = drawerState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$contentPlaceable, this.$sheetPlaceable.getWidth() + C13265c.m30134c(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$sheetPlaceable, C13265c.m30134c(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, (Object) null);
    }
}
