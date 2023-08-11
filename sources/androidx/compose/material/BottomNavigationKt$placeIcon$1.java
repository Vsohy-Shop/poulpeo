package androidx.compose.material;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: BottomNavigation.kt */
final class BottomNavigationKt$placeIcon$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomNavigationKt$placeIcon$1(Placeable placeable, int i) {
        super(1);
        this.$iconPlaceable = placeable;
        this.$iconY = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$iconPlaceable, 0, this.$iconY, 0.0f, 4, (Object) null);
    }
}
