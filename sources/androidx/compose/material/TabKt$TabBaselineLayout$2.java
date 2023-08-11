package androidx.compose.material;

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
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,434:1\n223#2,2:435\n223#2,2:437\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2\n*L\n318#1:435,2\n326#1:437,2\n*E\n"})
/* compiled from: Tab.kt */
final class TabKt$TabBaselineLayout$2 implements MeasurePolicy {
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;

    TabKt$TabBaselineLayout$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2) {
        this.$text = oVar;
        this.$icon = oVar2;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34160measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        int i;
        float f;
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
        int i2 = 0;
        if (placeable != null) {
            i = placeable.getWidth();
        } else {
            i = 0;
        }
        if (placeable2 != null) {
            i2 = placeable2.getWidth();
        }
        int max = Math.max(i, i2);
        if (placeable == null || placeable2 == null) {
            f = TabKt.SmallTabHeight;
        } else {
            f = TabKt.LargeTabHeight;
        }
        int r11 = measureScope2.m38443roundToPx0680j_4(f);
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
        return MeasureScope.layout$default(measureScope, max, r11, (Map) null, new TabKt$TabBaselineLayout$2$measure$1(placeable, placeable2, measureScope, max, r11, num, num2), 4, (Object) null);
    }
}
