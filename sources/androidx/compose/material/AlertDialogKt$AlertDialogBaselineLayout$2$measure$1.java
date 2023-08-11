package androidx.compose.material;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $textPlaceable;
    final /* synthetic */ int $textPositionY;
    final /* synthetic */ Placeable $titlePlaceable;
    final /* synthetic */ int $titlePositionY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(Placeable placeable, int i, Placeable placeable2, int i2) {
        super(1);
        this.$titlePlaceable = placeable;
        this.$titlePositionY = i;
        this.$textPlaceable = placeable2;
        this.$textPositionY = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable placeable = this.$titlePlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, this.$titlePositionY, 0.0f, 4, (Object) null);
        }
        Placeable placeable2 = this.$textPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, 0, this.$textPositionY, 0.0f, 4, (Object) null);
        }
    }
}
