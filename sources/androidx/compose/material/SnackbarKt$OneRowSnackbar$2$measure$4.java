package androidx.compose.material;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Snackbar.kt */
final class SnackbarKt$OneRowSnackbar$2$measure$4 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ int $buttonPlaceX;
    final /* synthetic */ int $buttonPlaceY;
    final /* synthetic */ Placeable $buttonPlaceable;
    final /* synthetic */ int $textPlaceY;
    final /* synthetic */ Placeable $textPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$OneRowSnackbar$2$measure$4(Placeable placeable, int i, Placeable placeable2, int i2, int i3) {
        super(1);
        this.$textPlaceable = placeable;
        this.$textPlaceY = i;
        this.$buttonPlaceable = placeable2;
        this.$buttonPlaceX = i2;
        this.$buttonPlaceY = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$textPlaceable, 0, this.$textPlaceY, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$buttonPlaceable, this.$buttonPlaceX, this.$buttonPlaceY, 0.0f, 4, (Object) null);
    }
}
