package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,287:1\n49#2,6:288\n49#2,6:294\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n*L\n135#1:288,6\n155#1:294,6\n*E\n"})
/* compiled from: Box.kt */
final class BoxKt$boxMeasurePolicy$1 implements MeasurePolicy {
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ boolean $propagateMinConstraints;

    BoxKt$boxMeasurePolicy$1(boolean z, Alignment alignment) {
        this.$propagateMinConstraints = z;
        this.$alignment = alignment;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m33220measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        Placeable placeable;
        int i4;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope, "$this$MeasurePolicy");
        C12775o.m28639i(list2, "measurables");
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m38414getMinWidthimpl(j), Constraints.m38413getMinHeightimpl(j), (Map) null, BoxKt$boxMeasurePolicy$1$measure$1.INSTANCE, 4, (Object) null);
        }
        if (this.$propagateMinConstraints) {
            j2 = j;
        } else {
            j2 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
        }
        if (list.size() == 1) {
            Measurable measurable = (Measurable) list2.get(0);
            if (!BoxKt.getMatchesParentSize(measurable)) {
                Placeable r1 = measurable.m37365measureBRTryo0(j2);
                int max = Math.max(Constraints.m38414getMinWidthimpl(j), r1.getWidth());
                i3 = Math.max(Constraints.m38413getMinHeightimpl(j), r1.getHeight());
                placeable = r1;
                i4 = max;
            } else {
                i4 = Constraints.m38414getMinWidthimpl(j);
                int r2 = Constraints.m38413getMinHeightimpl(j);
                placeable = measurable.m37365measureBRTryo0(Constraints.Companion.m38420fixedJhjzzOo(Constraints.m38414getMinWidthimpl(j), Constraints.m38413getMinHeightimpl(j)));
                i3 = r2;
            }
            return MeasureScope.layout$default(measureScope, i4, i3, (Map) null, new BoxKt$boxMeasurePolicy$1$measure$2(placeable, measurable, measureScope, i4, i3, this.$alignment), 4, (Object) null);
        }
        Placeable[] placeableArr = new Placeable[list.size()];
        C12760f0 f0Var = new C12760f0();
        f0Var.f20416b = Constraints.m38414getMinWidthimpl(j);
        C12760f0 f0Var2 = new C12760f0();
        f0Var2.f20416b = Constraints.m38413getMinHeightimpl(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            Measurable measurable2 = (Measurable) list2.get(i5);
            if (!BoxKt.getMatchesParentSize(measurable2)) {
                Placeable r13 = measurable2.m37365measureBRTryo0(j2);
                placeableArr[i5] = r13;
                f0Var.f20416b = Math.max(f0Var.f20416b, r13.getWidth());
                f0Var2.f20416b = Math.max(f0Var2.f20416b, r13.getHeight());
            } else {
                z = true;
            }
        }
        if (z) {
            int i6 = f0Var.f20416b;
            if (i6 != Integer.MAX_VALUE) {
                i = i6;
            } else {
                i = 0;
            }
            int i7 = f0Var2.f20416b;
            if (i7 != Integer.MAX_VALUE) {
                i2 = i7;
            } else {
                i2 = 0;
            }
            long Constraints = ConstraintsKt.Constraints(i, i6, i2, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Measurable measurable3 = (Measurable) list2.get(i8);
                if (BoxKt.getMatchesParentSize(measurable3)) {
                    placeableArr[i8] = measurable3.m37365measureBRTryo0(Constraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, f0Var.f20416b, f0Var2.f20416b, (Map) null, new BoxKt$boxMeasurePolicy$1$measure$5(placeableArr, list, measureScope, f0Var, f0Var2, this.$alignment), 4, (Object) null);
    }
}
