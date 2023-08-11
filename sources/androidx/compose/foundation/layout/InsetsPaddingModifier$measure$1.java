package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: WindowInsetsPadding.kt */
final class InsetsPaddingModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ int $left;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $top;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InsetsPaddingModifier$measure$1(Placeable placeable, int i, int i2) {
        super(1);
        this.$placeable = placeable;
        this.$left = i;
        this.$top = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, this.$left, this.$top, 0.0f, 4, (Object) null);
    }
}
