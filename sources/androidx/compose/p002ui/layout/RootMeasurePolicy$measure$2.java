package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy$measure$2 */
/* compiled from: RootMeasurePolicy.kt */
final class RootMeasurePolicy$measure$2 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RootMeasurePolicy$measure$2(Placeable placeable) {
        super(1);
        this.$placeable = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, this.$placeable, 0, 0, 0.0f, (Function1) null, 12, (Object) null);
    }
}
