package androidx.compose.material3;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: NavigationBar.kt */
final class NavigationBarKt$placeIcon$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ int $iconY;
    final /* synthetic */ Placeable $indicatorPlaceable;
    final /* synthetic */ Placeable $indicatorRipplePlaceable;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ int $rippleY;
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationBarKt$placeIcon$1(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6) {
        super(1);
        this.$indicatorPlaceable = placeable;
        this.$iconPlaceable = placeable2;
        this.$iconX = i;
        this.$iconY = i2;
        this.$indicatorRipplePlaceable = placeable3;
        this.$rippleX = i3;
        this.$rippleY = i4;
        this.$width = i5;
        this.$height = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable placeable = this.$indicatorPlaceable;
        if (placeable != null) {
            int i = this.$width;
            int i2 = this.$height;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, (i2 - placeable.getHeight()) / 2, 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$iconPlaceable, this.$iconX, this.$iconY, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$indicatorRipplePlaceable, this.$rippleX, this.$rippleY, 0.0f, 4, (Object) null);
    }
}
