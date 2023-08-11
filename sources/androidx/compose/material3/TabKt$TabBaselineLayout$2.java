package androidx.compose.material3;

import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Tab.kt */
final class TabKt$TabBaselineLayout$2 implements MeasurePolicy {
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;

    TabKt$TabBaselineLayout$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2) {
        this.$text = oVar;
        this.$icon = oVar2;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34632measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        int i;
        int i2;
        float f;
        int i3;
        Integer num;
        Integer num2;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope2, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        if (this.$text != null) {
            for (Measurable measurable : list2) {
                if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable), "text")) {
                    placeable = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        placeable = null;
        if (this.$icon != null) {
            for (Measurable measurable2 : list2) {
                if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                    placeable2 = measurable2.m37365measureBRTryo0(j);
                } else {
                    long j2 = j;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        placeable2 = null;
        int i4 = 0;
        if (placeable != null) {
            i = placeable.getWidth();
        } else {
            i = 0;
        }
        if (placeable2 != null) {
            i2 = placeable2.getWidth();
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2);
        if (placeable == null || placeable2 == null) {
            f = TabKt.SmallTabHeight;
        } else {
            f = TabKt.LargeTabHeight;
        }
        int r5 = measureScope2.m38443roundToPx0680j_4(f);
        if (placeable2 != null) {
            i3 = placeable2.getHeight();
        } else {
            i3 = 0;
        }
        if (placeable != null) {
            i4 = placeable.getHeight();
        }
        int max2 = Math.max(r5, i3 + i4 + measureScope2.m38442roundToPxR2X_6o(TabKt.IconDistanceFromBaseline));
        if (placeable != null) {
            num = Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline()));
        } else {
            num = null;
        }
        if (placeable != null) {
            num2 = Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline()));
        } else {
            num2 = null;
        }
        return MeasureScope.layout$default(measureScope, max, max2, (Map) null, new TabKt$TabBaselineLayout$2$measure$1(placeable, placeable2, measureScope, max, max2, num, num2), 4, (Object) null);
    }
}
