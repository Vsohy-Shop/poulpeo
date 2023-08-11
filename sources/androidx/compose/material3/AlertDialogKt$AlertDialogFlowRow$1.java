package androidx.compose.material3;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogFlowRow$1 implements MeasurePolicy {
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ float $mainAxisSpacing;

    AlertDialogKt$AlertDialogFlowRow$1(float f, float f2) {
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
    }

    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, C12760f0 f0Var, MeasureScope measureScope, float f, long j, Placeable placeable) {
        if (list.isEmpty() || f0Var.f20416b + measureScope.m38443roundToPx0680j_4(f) + placeable.getWidth() <= Constraints.m38412getMaxWidthimpl(j)) {
            return true;
        }
        return false;
    }

    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, C12760f0 f0Var, MeasureScope measureScope, float f, List<Placeable> list2, List<Integer> list3, C12760f0 f0Var2, List<Integer> list4, C12760f0 f0Var3, C12760f0 f0Var4) {
        Collection collection = list;
        if (!collection.isEmpty()) {
            f0Var.f20416b += measureScope.m38443roundToPx0680j_4(f);
        }
        collection.add(C12686e0.m28205B0(list2));
        list3.add(Integer.valueOf(f0Var2.f20416b));
        list4.add(Integer.valueOf(f0Var.f20416b));
        f0Var.f20416b += f0Var2.f20416b;
        f0Var3.f20416b = Math.max(f0Var3.f20416b, f0Var4.f20416b);
        list2.clear();
        f0Var4.f20416b = 0;
        f0Var2.f20416b = 0;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34245measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12760f0 f0Var;
        ArrayList arrayList;
        C12760f0 f0Var2;
        MeasureScope measureScope2 = measureScope;
        C12775o.m28639i(measureScope2, "$this$Layout");
        C12775o.m28639i(list, "measurables");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C12760f0 f0Var3 = new C12760f0();
        C12760f0 f0Var4 = new C12760f0();
        ArrayList arrayList5 = new ArrayList();
        C12760f0 f0Var5 = new C12760f0();
        C12760f0 f0Var6 = new C12760f0();
        for (Measurable r1 : list) {
            long j2 = j;
            Placeable r23 = r1.m37365measureBRTryo0(j2);
            C12760f0 f0Var7 = f0Var6;
            if (!measure_3p2s80s$canAddToCurrentSequence(arrayList5, f0Var5, measureScope, this.$mainAxisSpacing, j2, r23)) {
                f0Var2 = f0Var5;
                arrayList = arrayList5;
                f0Var = f0Var4;
                measure_3p2s80s$startNewSequence(arrayList2, f0Var4, measureScope, this.$crossAxisSpacing, arrayList5, arrayList3, f0Var7, arrayList4, f0Var3, f0Var2);
            } else {
                f0Var2 = f0Var5;
                arrayList = arrayList5;
                f0Var = f0Var4;
            }
            C12760f0 f0Var8 = f0Var2;
            if (!arrayList.isEmpty()) {
                f0Var8.f20416b += measureScope2.m38443roundToPx0680j_4(this.$mainAxisSpacing);
            }
            Placeable placeable = r23;
            ArrayList arrayList6 = arrayList;
            arrayList6.add(placeable);
            f0Var8.f20416b += placeable.getWidth();
            f0Var6 = f0Var7;
            f0Var6.f20416b = Math.max(f0Var6.f20416b, placeable.getHeight());
            arrayList5 = arrayList6;
            f0Var5 = f0Var8;
            f0Var4 = f0Var;
        }
        ArrayList arrayList7 = arrayList5;
        C12760f0 f0Var9 = f0Var4;
        C12760f0 f0Var10 = f0Var5;
        if (!arrayList7.isEmpty()) {
            measure_3p2s80s$startNewSequence(arrayList2, f0Var9, measureScope, this.$crossAxisSpacing, arrayList7, arrayList3, f0Var6, arrayList4, f0Var3, f0Var10);
        }
        int max = Math.max(f0Var3.f20416b, Constraints.m38414getMinWidthimpl(j));
        return MeasureScope.layout$default(measureScope, max, Math.max(f0Var9.f20416b, Constraints.m38413getMinHeightimpl(j)), (Map) null, new AlertDialogKt$AlertDialogFlowRow$1$measure$1(arrayList2, measureScope, this.$mainAxisSpacing, max, arrayList4), 4, (Object) null);
    }
}
