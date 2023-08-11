package androidx.compose.material;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Snackbar.kt */
final class SnackbarKt$TextOnlySnackbar$2$measure$4 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ int $containerHeight;
    final /* synthetic */ Placeable $textPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$TextOnlySnackbar$2$measure$4(int i, Placeable placeable) {
        super(1);
        this.$containerHeight = i;
        this.$textPlaceable = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$textPlaceable, 0, (this.$containerHeight - this.$textPlaceable.getHeight()) / 2, 0.0f, 4, (Object) null);
    }
}
