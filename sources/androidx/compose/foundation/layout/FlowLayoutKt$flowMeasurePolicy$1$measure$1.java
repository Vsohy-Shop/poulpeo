package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,724:1\n476#2,11:725\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$1\n*L\n265#1:725,11\n*E\n"})
/* compiled from: FlowLayout.kt */
final class FlowLayoutKt$flowMeasurePolicy$1$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ FlowResult $flowResult;
    final /* synthetic */ RowColumnMeasurementHelper $measureHelper;
    final /* synthetic */ int[] $outPosition;
    final /* synthetic */ MeasureScope $this_measure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowLayoutKt$flowMeasurePolicy$1$measure$1(FlowResult flowResult, RowColumnMeasurementHelper rowColumnMeasurementHelper, int[] iArr, MeasureScope measureScope) {
        super(1);
        this.$flowResult = flowResult;
        this.$measureHelper = rowColumnMeasurementHelper;
        this.$outPosition = iArr;
        this.$this_measure = measureScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        MutableVector<RowColumnMeasureHelperResult> items = this.$flowResult.getItems();
        RowColumnMeasurementHelper rowColumnMeasurementHelper = this.$measureHelper;
        int[] iArr = this.$outPosition;
        MeasureScope measureScope = this.$this_measure;
        int size = items.getSize();
        if (size > 0) {
            Object[] content = items.getContent();
            int i = 0;
            do {
                rowColumnMeasurementHelper.placeHelper(placementScope, (RowColumnMeasureHelperResult) content[i], iArr[i], measureScope.getLayoutDirection());
                i++;
            } while (i < size);
        }
    }
}
