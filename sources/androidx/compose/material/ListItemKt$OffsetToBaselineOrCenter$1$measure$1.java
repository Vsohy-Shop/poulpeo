package androidx.compose.material;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ListItem.kt */
final class ListItemKt$OffsetToBaselineOrCenter$1$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;

    /* renamed from: $y */
    final /* synthetic */ int f245$y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListItemKt$OffsetToBaselineOrCenter$1$measure$1(Placeable placeable, int i) {
        super(1);
        this.$placeable = placeable;
        this.f245$y = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeable, 0, this.f245$y, 0.0f, 4, (Object) null);
    }
}
