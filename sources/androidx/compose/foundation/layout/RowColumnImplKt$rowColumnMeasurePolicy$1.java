package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13091r;

/* compiled from: RowColumnImpl.kt */
public final class RowColumnImplKt$rowColumnMeasurePolicy$1 implements MeasurePolicy {
    final /* synthetic */ C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> $arrangement;
    final /* synthetic */ float $arrangementSpacing;
    final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ SizeMode $crossAxisSize;
    final /* synthetic */ LayoutOrientation $orientation;

    RowColumnImplKt$rowColumnMeasurePolicy$1(LayoutOrientation layoutOrientation, C13091r<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], C11921v> rVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment) {
        this.$orientation = layoutOrientation;
        this.$arrangement = rVar;
        this.$arrangementSpacing = f;
        this.$crossAxisSize = sizeMode;
        this.$crossAxisAlignment = crossAxisAlignment;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return ((Number) RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return ((Number) RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33308measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(list, "measurables");
        RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.$orientation, this.$arrangement, this.$arrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, list, new Placeable[list.size()], (DefaultConstructorMarker) null);
        RowColumnMeasureHelperResult r13 = rowColumnMeasurementHelper.m33310measureWithoutPlacing_EkL_Y(measureScope, j, 0, list.size());
        if (this.$orientation == LayoutOrientation.Horizontal) {
            i2 = r13.getMainAxisSize();
            i = r13.getCrossAxisSize();
        } else {
            i2 = r13.getCrossAxisSize();
            i = r13.getMainAxisSize();
        }
        return MeasureScope.layout$default(measureScope, i2, i, (Map) null, new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1(rowColumnMeasurementHelper, r13, measureScope), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return ((Number) RowColumnImplKt.MinIntrinsicHeightMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return ((Number) RowColumnImplKt.MinIntrinsicWidthMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }
}
