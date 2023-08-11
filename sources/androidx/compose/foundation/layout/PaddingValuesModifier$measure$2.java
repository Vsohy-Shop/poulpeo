package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Padding.kt */
final class PaddingValuesModifier$measure$2 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ PaddingValuesModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PaddingValuesModifier$measure$2(Placeable placeable, MeasureScope measureScope, PaddingValuesModifier paddingValuesModifier) {
        super(1);
        this.$placeable = placeable;
        this.$this_measure = measureScope;
        this.this$0 = paddingValuesModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, this.$this_measure.m38443roundToPx0680j_4(this.this$0.getPaddingValues().m33279calculateLeftPaddingu2uoSUM(this.$this_measure.getLayoutDirection())), this.$this_measure.m38443roundToPx0680j_4(this.this$0.getPaddingValues().m33281calculateTopPaddingD9Ej5fM()), 0.0f, 4, (Object) null);
    }
}
