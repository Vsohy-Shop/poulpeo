package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Box.kt */
final class BoxKt$boxMeasurePolicy$1$measure$2 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ int $boxHeight;
    final /* synthetic */ int $boxWidth;
    final /* synthetic */ Measurable $measurable;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_MeasurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxKt$boxMeasurePolicy$1$measure$2(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i, int i2, Alignment alignment) {
        super(1);
        this.$placeable = placeable;
        this.$measurable = measurable;
        this.$this_MeasurePolicy = measureScope;
        this.$boxWidth = i;
        this.$boxHeight = i2;
        this.$alignment = alignment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        BoxKt.placeInBox(placementScope, this.$placeable, this.$measurable, this.$this_MeasurePolicy.getLayoutDirection(), this.$boxWidth, this.$boxHeight, this.$alignment);
    }
}
