package androidx.compose.material;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldMeasurePolicy$measure$2 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $borderPlaceable;
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ OutlinedTextFieldMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldMeasurePolicy$measure$2(int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope) {
        super(1);
        this.$height = i;
        this.$width = i2;
        this.$leadingPlaceable = placeable;
        this.$trailingPlaceable = placeable2;
        this.$textFieldPlaceable = placeable3;
        this.$labelPlaceable = placeable4;
        this.$placeholderPlaceable = placeable5;
        this.$borderPlaceable = placeable6;
        this.this$0 = outlinedTextFieldMeasurePolicy;
        this.$this_measure = measureScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        C12775o.m28639i(placementScope2, "$this$layout");
        OutlinedTextFieldKt.place(placementScope2, this.$height, this.$width, this.$leadingPlaceable, this.$trailingPlaceable, this.$textFieldPlaceable, this.$labelPlaceable, this.$placeholderPlaceable, this.$borderPlaceable, this.this$0.animationProgress, this.this$0.singleLine, this.$this_measure.getDensity(), this.$this_measure.getLayoutDirection(), this.this$0.paddingValues);
    }
}
