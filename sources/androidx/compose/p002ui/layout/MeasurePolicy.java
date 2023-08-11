package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,163:1\n151#2,3:164\n33#2,4:167\n154#2,2:171\n38#2:173\n156#2:174\n151#2,3:175\n33#2,4:178\n154#2,2:182\n38#2:184\n156#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n151#2,3:197\n33#2,4:200\n154#2,2:204\n38#2:206\n156#2:207\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:164,3\n102#1:167,4\n102#1:171,2\n102#1:173\n102#1:174\n120#1:175,3\n120#1:178,4\n120#1:182,2\n120#1:184\n120#1:185\n137#1:186,3\n137#1:189,4\n137#1:193,2\n137#1:195\n137#1:196\n154#1:197,3\n154#1:200,4\n154#1:204,2\n154#1:206\n154#1:207\n*E\n"})
@Stable
/* renamed from: androidx.compose.ui.layout.MeasurePolicy */
/* compiled from: MeasurePolicy.kt */
public interface MeasurePolicy {

    /* renamed from: androidx.compose.ui.layout.MeasurePolicy$DefaultImpls */
    /* compiled from: MeasurePolicy.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(list, "measurables");
            return MeasurePolicy.super.maxIntrinsicHeight(intrinsicMeasureScope, list, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(list, "measurables");
            return MeasurePolicy.super.maxIntrinsicWidth(intrinsicMeasureScope, list, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(list, "measurables");
            return MeasurePolicy.super.minIntrinsicHeight(intrinsicMeasureScope, list, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(list, "measurables");
            return MeasurePolicy.super.minIntrinsicWidth(intrinsicMeasureScope, list, i);
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return m37366measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null)).getHeight();
    }

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return m37366measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null)).getWidth();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    MeasureResult m37366measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return m37366measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null)).getHeight();
    }

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return m37366measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null)).getWidth();
    }
}
