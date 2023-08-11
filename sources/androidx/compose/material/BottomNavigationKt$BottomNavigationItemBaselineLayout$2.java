package androidx.compose.material;

import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigationItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n223#2,2:401\n223#2,2:403\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigationItemBaselineLayout$2\n*L\n273#1:401,2\n276#1:403,2\n*E\n"})
/* compiled from: BottomNavigation.kt */
final class BottomNavigationKt$BottomNavigationItemBaselineLayout$2 implements MeasurePolicy {
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;

    BottomNavigationKt$BottomNavigationItemBaselineLayout$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, float f) {
        this.$label = oVar;
        this.$iconPositionAnimationProgress = f;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m33903measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        long j2 = j;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable r12 = measurable.m37365measureBRTryo0(j2);
                if (this.$label != null) {
                    for (Measurable measurable2 : iterable) {
                        if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable2), "label")) {
                            placeable = measurable2.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                placeable = null;
                if (this.$label == null) {
                    return BottomNavigationKt.m33901placeIcon3p2s80s(measureScope, r12, j2);
                }
                C12775o.m28636f(placeable);
                return BottomNavigationKt.m33902placeLabelAndIconDIyivk0(measureScope, placeable, r12, j, this.$iconPositionAnimationProgress);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
