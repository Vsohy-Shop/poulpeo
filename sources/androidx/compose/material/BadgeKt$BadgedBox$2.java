package androidx.compose.material;

import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11915r;

@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n223#2,2:188\n223#2,2:190\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n*L\n79#1:188,2\n85#1:190,2\n*E\n"})
/* compiled from: Badge.kt */
final class BadgeKt$BadgedBox$2 implements MeasurePolicy {
    public static final BadgeKt$BadgedBox$2 INSTANCE = new BadgeKt$BadgedBox$2();

    BadgeKt$BadgedBox$2() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m33892measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable), "badge")) {
                Placeable r2 = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                for (Measurable measurable2 : iterable) {
                    if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                        Placeable r1 = measurable2.m37365measureBRTryo0(j);
                        int i = r1.get(AlignmentLineKt.getFirstBaseline());
                        int i2 = r1.get(AlignmentLineKt.getLastBaseline());
                        return measureScope.layout(r1.getWidth(), r1.getHeight(), C12716r0.m28419j(C11915r.m25707a(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(i)), C11915r.m25707a(AlignmentLineKt.getLastBaseline(), Integer.valueOf(i2))), new BadgeKt$BadgedBox$2$measure$1(r2, measureScope, r1));
                    }
                    long j2 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j3 = j;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
