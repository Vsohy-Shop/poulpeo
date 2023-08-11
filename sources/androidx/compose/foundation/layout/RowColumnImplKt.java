package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,769:1\n32#2,6:770\n32#2,6:776\n32#2,6:782\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n532#1:770,6\n556#1:776,6\n582#1:782,6\n*E\n"})
/* compiled from: RowColumnImpl.kt */
public final class RowColumnImplKt {
    /* access modifiers changed from: private */
    public static final C13089p<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* access modifiers changed from: private */
    public static final C13089p<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* access modifiers changed from: private */
    public static final C13089p<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* access modifiers changed from: private */
    public static final C13089p<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData getRowColumnParentData(IntrinsicMeasurable intrinsicMeasurable) {
        C12775o.m28639i(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, C13088o<? super IntrinsicMeasurable, ? super Integer, Integer> oVar, C13088o<? super IntrinsicMeasurable, ? super Integer, Integer> oVar2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2 = true;
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i5 = 0;
        float f = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i6);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int min2 = Math.min(oVar.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i - min);
                min += min2;
                i5 = Math.max(i5, oVar2.invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f != 0.0f) {
            z2 = false;
        }
        if (z2) {
            i3 = 0;
        } else if (i == Integer.MAX_VALUE) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = C13265c.m30134c(((float) Math.max(i - min, 0)) / f);
        }
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i7);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                if (i3 != Integer.MAX_VALUE) {
                    i4 = C13265c.m30134c(((float) i3) * weight2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                i5 = Math.max(i5, oVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i4)).intValue());
            }
        }
        return i5;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, C13088o<? super IntrinsicMeasurable, ? super Integer, Integer> oVar, int i, int i2) {
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f = 0.0f;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                return C13265c.m30134c(((float) i4) * f) + i5 + ((list.size() - 1) * i2);
            }
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int intValue = oVar.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue();
            if (weight != 0.0f) {
                z = false;
            }
            if (z) {
                i5 += intValue;
            } else if (weight > 0.0f) {
                f += weight;
                i4 = Math.max(i4, C13265c.m30134c(((float) intValue) / weight));
            }
            i3++;
        }
    }

    /* access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, C13088o<? super IntrinsicMeasurable, ? super Integer, Integer> oVar, C13088o<? super IntrinsicMeasurable, ? super Integer, Integer> oVar2, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return intrinsicMainAxisSize(list, oVar, i, i2);
        }
        return intrinsicCrossAxisSize(list, oVar2, oVar, i, i2);
    }

    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    /* renamed from: rowColumnMeasurePolicy-TDGSqEk  reason: not valid java name */
    public static final MeasurePolicy m33307rowColumnMeasurePolicyTDGSqEk(LayoutOrientation layoutOrientation, C13091r<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], C11921v> rVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment) {
        C12775o.m28639i(layoutOrientation, "orientation");
        C12775o.m28639i(rVar, "arrangement");
        C12775o.m28639i(sizeMode, "crossAxisSize");
        C12775o.m28639i(crossAxisAlignment, "crossAxisAlignment");
        return new RowColumnImplKt$rowColumnMeasurePolicy$1(layoutOrientation, rVar, f, sizeMode, crossAxisAlignment);
    }
}
