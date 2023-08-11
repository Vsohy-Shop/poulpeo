package androidx.compose.material;

import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,429:1\n1549#2:430\n1620#2,3:431\n1789#2,3:434\n69#3,6:437\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1\n*L\n355#1:430\n355#1:431,3\n357#1:434,3\n362#1:437,6\n*E\n"})
/* compiled from: ListItem.kt */
final class ListItemKt$BaselinesOffsetColumn$1 implements MeasurePolicy {
    final /* synthetic */ List<C1232Dp> $offsets;

    ListItemKt$BaselinesOffsetColumn$1(List<C1232Dp> list) {
        this.$offsets = list;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34039measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "measurables");
        long r12 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, (Object) null);
        Iterable<Measurable> iterable = list;
        ArrayList<Placeable> arrayList = new ArrayList<>(C12728x.m28544v(iterable, 10));
        for (Measurable r1 : iterable) {
            arrayList.add(r1.m37365measureBRTryo0(r12));
        }
        int i2 = 0;
        for (Placeable width : arrayList) {
            i2 = Math.max(i2, width.getWidth());
        }
        int size = arrayList.size();
        Integer[] numArr = new Integer[size];
        for (int i3 = 0; i3 < size; i3++) {
            numArr[i3] = 0;
        }
        List<C1232Dp> list2 = this.$offsets;
        int size2 = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable = (Placeable) arrayList.get(i5);
            if (i5 > 0) {
                int i6 = i5 - 1;
                i = ((Placeable) arrayList.get(i6)).getHeight() - ((Placeable) arrayList.get(i6)).get(AlignmentLineKt.getLastBaseline());
            } else {
                i = 0;
            }
            int max = Math.max(0, (measureScope.m38443roundToPx0680j_4(list2.get(i5).m38482unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - i);
            numArr[i5] = Integer.valueOf(max + i4);
            i4 += max + placeable.getHeight();
        }
        return MeasureScope.layout$default(measureScope, i2, i4, (Map) null, new ListItemKt$BaselinesOffsetColumn$1$measure$2(arrayList, numArr), 4, (Object) null);
    }
}
