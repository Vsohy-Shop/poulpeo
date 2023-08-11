package androidx.compose.material3;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: TouchTarget.kt */
final class MinimumTouchTargetModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MinimumTouchTargetModifier$measure$1(int i, Placeable placeable, int i2) {
        super(1);
        this.$width = i;
        this.$placeable = placeable;
        this.$height = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.place$default(placementScope2, this.$placeable, C13265c.m30134c(((float) (this.$width - this.$placeable.getWidth())) / 2.0f), C13265c.m30134c(((float) (this.$height - this.$placeable.getHeight())) / 2.0f), 0.0f, 4, (Object) null);
    }
}
