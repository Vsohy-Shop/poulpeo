package androidx.compose.material3;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: TextField.kt */
final class TextFieldMeasurePolicy$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $containerPlaceable;
    final /* synthetic */ int $effectiveLabelBaseline;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $lastBaseline;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $supportingPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $topPadding;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ int $totalHeight;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldMeasurePolicy$measure$1(Placeable placeable, int i, int i2, int i3, int i4, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, TextFieldMeasurePolicy textFieldMeasurePolicy, int i5, int i6, MeasureScope measureScope) {
        super(1);
        this.$labelPlaceable = placeable;
        this.$topPaddingValue = i;
        this.$lastBaseline = i2;
        this.$width = i3;
        this.$totalHeight = i4;
        this.$textFieldPlaceable = placeable2;
        this.$placeholderPlaceable = placeable3;
        this.$leadingPlaceable = placeable4;
        this.$trailingPlaceable = placeable5;
        this.$containerPlaceable = placeable6;
        this.$supportingPlaceable = placeable7;
        this.this$0 = textFieldMeasurePolicy;
        this.$effectiveLabelBaseline = i5;
        this.$topPadding = i6;
        this.$this_measure = measureScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        if (this.$labelPlaceable != null) {
            int d = C13537l.m30877d(this.$topPaddingValue - this.$lastBaseline, 0);
            Placeable.PlacementScope placementScope2 = placementScope;
            TextFieldKt.placeWithLabel(placementScope2, this.$width, this.$totalHeight, this.$textFieldPlaceable, this.$labelPlaceable, this.$placeholderPlaceable, this.$leadingPlaceable, this.$trailingPlaceable, this.$containerPlaceable, this.$supportingPlaceable, this.this$0.singleLine, d, this.$topPadding + this.$effectiveLabelBaseline, this.this$0.animationProgress, this.$this_measure.getDensity());
            return;
        }
        TextFieldKt.placeWithoutLabel(placementScope, this.$width, this.$totalHeight, this.$textFieldPlaceable, this.$placeholderPlaceable, this.$leadingPlaceable, this.$trailingPlaceable, this.$containerPlaceable, this.$supportingPlaceable, this.this$0.singleLine, this.$this_measure.getDensity(), this.this$0.paddingValues);
    }
}
