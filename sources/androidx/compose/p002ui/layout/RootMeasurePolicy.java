package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n151#2,3:68\n33#2,4:71\n154#2,2:75\n38#2:77\n156#2:78\n33#2,6:79\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n47#1:68,3\n47#1:71,4\n47#1:75,2\n47#1:77\n47#1:78\n52#1:79,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy */
/* compiled from: RootMeasurePolicy.kt */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m37415measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(list, "measurables");
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m38414getMinWidthimpl(j), Constraints.m38413getMinHeightimpl(j), (Map) null, RootMeasurePolicy$measure$1.INSTANCE, 4, (Object) null);
        }
        if (list.size() == 1) {
            Placeable r13 = ((Measurable) list.get(0)).m37365measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m38426constrainWidthK40F9xA(j, r13.getWidth()), ConstraintsKt.m38425constrainHeightK40F9xA(j, r13.getHeight()), (Map) null, new RootMeasurePolicy$measure$2(r13), 4, (Object) null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Measurable) list.get(i)).m37365measureBRTryo0(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable = (Placeable) arrayList.get(i4);
            i2 = Math.max(placeable.getWidth(), i2);
            i3 = Math.max(placeable.getHeight(), i3);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m38426constrainWidthK40F9xA(j, i2), ConstraintsKt.m38425constrainHeightK40F9xA(j, i3), (Map) null, new RootMeasurePolicy$measure$4(arrayList), 4, (Object) null);
    }
}
