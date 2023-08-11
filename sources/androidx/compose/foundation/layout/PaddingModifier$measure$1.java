package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Padding.kt */
final class PaddingModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ PaddingModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PaddingModifier$measure$1(PaddingModifier paddingModifier, Placeable placeable, MeasureScope measureScope) {
        super(1);
        this.this$0 = paddingModifier;
        this.$placeable = placeable;
        this.$this_measure = measureScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        if (this.this$0.getRtlAware()) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeable, this.$this_measure.m38443roundToPx0680j_4(this.this$0.m33275getStartD9Ej5fM()), this.$this_measure.m38443roundToPx0680j_4(this.this$0.m33276getTopD9Ej5fM()), 0.0f, 4, (Object) null);
            return;
        }
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, this.$this_measure.m38443roundToPx0680j_4(this.this$0.m33275getStartD9Ej5fM()), this.$this_measure.m38443roundToPx0680j_4(this.this$0.m33276getTopD9Ej5fM()), 0.0f, 4, (Object) null);
    }
}
