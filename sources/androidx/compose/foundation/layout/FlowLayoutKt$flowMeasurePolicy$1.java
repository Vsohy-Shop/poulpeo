package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,724:1\n523#2:725\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1\n*L\n244#1:725\n*E\n"})
/* compiled from: FlowLayout.kt */
public final class FlowLayoutKt$flowMeasurePolicy$1 implements MeasurePolicy {
    final /* synthetic */ float $arrangementSpacing;
    final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ C13090q<Integer, int[], MeasureScope, int[], C11921v> $crossAxisArrangement;
    final /* synthetic */ SizeMode $crossAxisSize;
    final /* synthetic */ C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> $mainAxisArrangement;
    final /* synthetic */ int $maxItemsInMainAxis;
    final /* synthetic */ LayoutOrientation $orientation;
    private final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
    private final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;
    private final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;
    private final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

    FlowLayoutKt$flowMeasurePolicy$1(LayoutOrientation layoutOrientation, C13091r<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], C11921v> rVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, int i, C13090q<? super Integer, ? super int[], ? super MeasureScope, ? super int[], C11921v> qVar) {
        C13089p<IntrinsicMeasurable, Integer, Integer, Integer> pVar;
        C13089p<IntrinsicMeasurable, Integer, Integer, Integer> pVar2;
        C13089p<IntrinsicMeasurable, Integer, Integer, Integer> pVar3;
        C13089p<IntrinsicMeasurable, Integer, Integer, Integer> pVar4;
        this.$orientation = layoutOrientation;
        this.$mainAxisArrangement = rVar;
        this.$arrangementSpacing = f;
        this.$crossAxisSize = sizeMode;
        this.$crossAxisAlignment = crossAxisAlignment;
        this.$maxItemsInMainAxis = i;
        this.$crossAxisArrangement = qVar;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            pVar = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            pVar = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.maxMainAxisIntrinsicItemSize = pVar;
        if (layoutOrientation == layoutOrientation2) {
            pVar2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            pVar2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.maxCrossAxisIntrinsicItemSize = pVar2;
        if (layoutOrientation == layoutOrientation2) {
            pVar3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            pVar3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.minCrossAxisIntrinsicItemSize = pVar3;
        if (layoutOrientation == layoutOrientation2) {
            pVar4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            pVar4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.minMainAxisIntrinsicItemSize = pVar4;
    }

    public final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
        return this.maxCrossAxisIntrinsicItemSize;
    }

    public final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
        return this.maxMainAxisIntrinsicItemSize;
    }

    public final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
        return this.minCrossAxisIntrinsicItemSize;
    }

    public final C13089p<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
        return this.minMainAxisIntrinsicItemSize;
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        C12775o.m28639i(list, "measurables");
        return FlowLayoutKt.intrinsicCrossAxisSize(list, (C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minMainAxisIntrinsicItemSize, (C13089p<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minCrossAxisIntrinsicItemSize, i, i2, this.$maxItemsInMainAxis);
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
        }
        return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        C12775o.m28639i(list, "measurables");
        return FlowLayoutKt.maxIntrinsicMainAxisSize(list, this.maxMainAxisIntrinsicItemSize, i, i2, this.$maxItemsInMainAxis);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33239measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(list, "measurables");
        RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.$orientation, this.$mainAxisArrangement, this.$arrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, list, new Placeable[list.size()], (DefaultConstructorMarker) null);
        FlowResult breakDownItems = FlowLayoutKt.breakDownItems(measureScope, rowColumnMeasurementHelper, this.$orientation, new OrientationIndependentConstraints(j, this.$orientation, (DefaultConstructorMarker) null), this.$maxItemsInMainAxis);
        int crossAxisTotalSize = breakDownItems.getCrossAxisTotalSize();
        MutableVector<RowColumnMeasureHelperResult> items = breakDownItems.getItems();
        int size = items.getSize();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((RowColumnMeasureHelperResult) items.getContent()[i3]).getCrossAxisSize();
        }
        int[] iArr2 = new int[size];
        this.$crossAxisArrangement.invoke(Integer.valueOf(crossAxisTotalSize), iArr, measureScope, iArr2);
        if (this.$orientation == LayoutOrientation.Horizontal) {
            i2 = breakDownItems.getMainAxisTotalSize();
            i = breakDownItems.getCrossAxisTotalSize();
        } else {
            i2 = breakDownItems.getCrossAxisTotalSize();
            i = breakDownItems.getMainAxisTotalSize();
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m38426constrainWidthK40F9xA(j, i2), ConstraintsKt.m38425constrainHeightK40F9xA(j, i), (Map) null, new FlowLayoutKt$flowMeasurePolicy$1$measure$1(breakDownItems, rowColumnMeasurementHelper, iArr2, measureScope), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
        }
        return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
    }

    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        C12775o.m28639i(list, "measurables");
        return FlowLayoutKt.minIntrinsicMainAxisSize(list, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i, i2, this.$maxItemsInMainAxis);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m38443roundToPx0680j_4(this.$arrangementSpacing));
    }
}
