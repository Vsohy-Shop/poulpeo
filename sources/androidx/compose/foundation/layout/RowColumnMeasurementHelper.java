package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* compiled from: RowColumnMeasurementHelper.kt */
public final class RowColumnMeasurementHelper {
    private final C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> arrangement;
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, C13091r rVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment2, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, rVar, f, sizeMode, crossAxisAlignment2, list, placeableArr);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData2, int i, LayoutDirection layoutDirection, int i2) {
        CrossAxisAlignment crossAxisAlignment2;
        if (rowColumnParentData2 == null || (crossAxisAlignment2 = rowColumnParentData2.getCrossAxisAlignment()) == null) {
            crossAxisAlignment2 = this.crossAxisAlignment;
        }
        int crossAxisSize2 = i - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment2.align$foundation_layout_release(crossAxisSize2, layoutDirection, placeable, i2);
    }

    private final int[] mainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(i), iArr, measureScope.getLayoutDirection(), measureScope, iArr2);
        return iArr2;
    }

    public final int crossAxisSize(Placeable placeable) {
        C12775o.m28639i(placeable, "<this>");
        if (this.orientation == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    public final C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> getArrangement() {
        return this.arrangement;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM  reason: not valid java name */
    public final float m33309getArrangementSpacingD9Ej5fM() {
        return this.arrangementSpacing;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(Placeable placeable) {
        C12775o.m28639i(placeable, "<this>");
        if (this.orientation == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }

    /* renamed from: measureWithoutPlacing-_EkL_-Y  reason: not valid java name */
    public final RowColumnMeasureHelperResult m33310measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long j, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num;
        int i9;
        float f;
        float f2;
        boolean z;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        MeasureScope measureScope2 = measureScope;
        int i15 = i2;
        C12775o.m28639i(measureScope2, "measureScope");
        OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, this.orientation, (DefaultConstructorMarker) null);
        int r3 = measureScope2.m38443roundToPx0680j_4(this.arrangementSpacing);
        int i16 = i15 - i;
        float f3 = 0.0f;
        int i17 = i;
        float f4 = 0.0f;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z3 = false;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i17 >= i15) {
                break;
            }
            Measurable measurable = this.measurables.get(i17);
            RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i17];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData2);
            if (weight > 0.0f) {
                f4 += weight;
                i20++;
                i11 = i17;
            } else {
                int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                Placeable placeable = this.placeables[i17];
                if (placeable == null) {
                    if (mainAxisMax == Integer.MAX_VALUE) {
                        i14 = Integer.MAX_VALUE;
                    } else {
                        i14 = mainAxisMax - i21;
                    }
                    int i22 = i14;
                    i12 = mainAxisMax;
                    i13 = i19;
                    i11 = i17;
                    placeable = measurable.m37365measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, i22, 0, 0, 8, (Object) null).m33260toBoxConstraintsOenEA2s(this.orientation));
                } else {
                    i12 = mainAxisMax;
                    i13 = i19;
                    i11 = i17;
                }
                int min = Math.min(r3, (i12 - i21) - mainAxisSize(placeable));
                i21 += mainAxisSize(placeable) + min;
                i19 = Math.max(i13, crossAxisSize(placeable));
                if (z3 || RowColumnImplKt.isRelative(rowColumnParentData2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.placeables[i11] = placeable;
                i18 = min;
            }
            i17 = i11 + 1;
        }
        int i23 = i19;
        if (i20 == 0) {
            i21 -= i18;
            i5 = i23;
            i4 = 0;
        } else {
            int i24 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i24 <= 0 || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) {
                i9 = orientationIndependentConstraints.getMainAxisMin();
            } else {
                i9 = orientationIndependentConstraints.getMainAxisMax();
            }
            int i25 = r3 * (i20 - 1);
            int i26 = (i9 - i21) - i25;
            if (i24 > 0) {
                f = ((float) i26) / f4;
            } else {
                f = 0.0f;
            }
            Iterator it = C13537l.m30893t(i, i2).iterator();
            int i27 = 0;
            while (it.hasNext()) {
                i27 += C13265c.m30134c(RowColumnImplKt.getWeight(this.rowColumnParentData[((C12703l0) it).nextInt()]) * f);
            }
            int i28 = i26 - i27;
            int i29 = i;
            i5 = i23;
            int i30 = 0;
            while (i29 < i15) {
                if (this.placeables[i29] == null) {
                    Measurable measurable2 = this.measurables.get(i29);
                    RowColumnParentData rowColumnParentData3 = this.rowColumnParentData[i29];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData3);
                    if (weight2 > f3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int a = C13265c.m30132a(i28);
                        int i31 = i28 - a;
                        int max = Math.max(0, C13265c.m30134c(weight2 * f) + a);
                        if (!RowColumnImplKt.getFill(rowColumnParentData3) || max == i3) {
                            f2 = f;
                            i10 = 0;
                        } else {
                            f2 = f;
                            i10 = max;
                        }
                        int i32 = i31;
                        Placeable r4 = measurable2.m37365measureBRTryo0(new OrientationIndependentConstraints(i10, max, 0, orientationIndependentConstraints.getCrossAxisMax()).m33260toBoxConstraintsOenEA2s(this.orientation));
                        i30 += mainAxisSize(r4);
                        i5 = Math.max(i5, crossAxisSize(r4));
                        if (z3 || RowColumnImplKt.isRelative(rowColumnParentData3)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.placeables[i29] = r4;
                        i28 = i32;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    f2 = f;
                }
                i29++;
                f = f2;
                i3 = Integer.MAX_VALUE;
                f3 = 0.0f;
            }
            i4 = C13537l.m30882i(i30 + i25, orientationIndependentConstraints.getMainAxisMax() - i21);
        }
        if (z3) {
            int i33 = 0;
            i7 = 0;
            for (int i34 = i; i34 < i15; i34++) {
                Placeable placeable2 = this.placeables[i34];
                C12775o.m28636f(placeable2);
                CrossAxisAlignment crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i34]);
                if (crossAxisAlignment2 != null) {
                    num = crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable2);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i33 = Math.max(i33, intValue);
                    int crossAxisSize2 = crossAxisSize(placeable2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = crossAxisSize(placeable2);
                    }
                    i7 = Math.max(i7, crossAxisSize2 - intValue2);
                }
            }
            i6 = i33;
        } else {
            i7 = 0;
            i6 = 0;
        }
        int max2 = Math.max(i21 + i4, orientationIndependentConstraints.getMainAxisMin());
        if (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) {
            i8 = Math.max(i5, Math.max(orientationIndependentConstraints.getCrossAxisMin(), i7 + i6));
        } else {
            i8 = orientationIndependentConstraints.getCrossAxisMax();
        }
        int[] iArr = new int[i16];
        for (int i35 = 0; i35 < i16; i35++) {
            iArr[i35] = 0;
        }
        int[] iArr2 = new int[i16];
        for (int i36 = 0; i36 < i16; i36++) {
            Placeable placeable3 = this.placeables[i36 + i];
            C12775o.m28636f(placeable3);
            iArr2[i36] = mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(i8, max2, i, i2, i6, mainAxisPositions(max2, iArr2, iArr, measureScope2));
    }

    public final void placeHelper(Placeable.PlacementScope placementScope, RowColumnMeasureHelperResult rowColumnMeasureHelperResult, int i, LayoutDirection layoutDirection) {
        RowColumnParentData rowColumnParentData2;
        C12775o.m28639i(placementScope, "placeableScope");
        C12775o.m28639i(rowColumnMeasureHelperResult, "measureResult");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        int endIndex = rowColumnMeasureHelperResult.getEndIndex();
        for (int startIndex = rowColumnMeasureHelperResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            C12775o.m28636f(placeable);
            int[] mainAxisPositions = rowColumnMeasureHelperResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            if (parentData instanceof RowColumnParentData) {
                rowColumnParentData2 = (RowColumnParentData) parentData;
            } else {
                rowColumnParentData2 = null;
            }
            int crossAxisPosition = getCrossAxisPosition(placeable, rowColumnParentData2, rowColumnMeasureHelperResult.getCrossAxisSize(), layoutDirection, rowColumnMeasureHelperResult.getBeforeCrossAxisAlignmentLine()) + i;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placementScope, placeable, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], crossAxisPosition, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], 0.0f, 4, (Object) null);
            }
        }
    }

    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, C13091r<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], C11921v> rVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment2, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.arrangement = rVar;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment2;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }
}
