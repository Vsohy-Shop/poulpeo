package androidx.compose.material3;

import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: NavigationBar.kt */
final class NavigationBarKt$NavigationBarItemBaselineLayout$2 implements MeasurePolicy {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;

    NavigationBarKt$NavigationBarItemBaselineLayout$2(float f, C13088o<? super Composer, ? super Integer, C11921v> oVar, boolean z) {
        this.$animationProgress = f;
        this.$label = oVar;
        this.$alwaysShowLabel = z;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34509measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object obj;
        Placeable placeable;
        Placeable placeable2;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope2, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable r3 = measurable.m37365measureBRTryo0(j);
                float f = (float) 2;
                int width = r3.getWidth() + measureScope2.m38443roundToPx0680j_4(C1232Dp.m38468constructorimpl(NavigationBarKt.IndicatorHorizontalPadding * f));
                int c = C13265c.m30134c(((float) width) * this.$animationProgress);
                int height = r3.getHeight() + measureScope2.m38443roundToPx0680j_4(C1232Dp.m38468constructorimpl(NavigationBarKt.IndicatorVerticalPadding * f));
                for (Measurable measurable2 : iterable) {
                    if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        Placeable r4 = measurable2.m37365measureBRTryo0(Constraints.Companion.m38420fixedJhjzzOo(width, height));
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (C12775o.m28634d(LayoutIdKt.getLayoutId((Measurable) obj), "indicator")) {
                                break;
                            }
                        }
                        Measurable measurable3 = (Measurable) obj;
                        if (measurable3 != null) {
                            placeable = measurable3.m37365measureBRTryo0(Constraints.Companion.m38420fixedJhjzzOo(c, height));
                        } else {
                            placeable = null;
                        }
                        if (this.$label != null) {
                            for (Measurable measurable4 : iterable) {
                                if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                    placeable2 = measurable4.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                                } else {
                                    long j2 = j;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable2 = null;
                        if (this.$label == null) {
                            return NavigationBarKt.m34504placeIconX9ElhV4(measureScope, r3, r4, placeable, j);
                        }
                        C12775o.m28636f(placeable2);
                        return NavigationBarKt.m34505placeLabelAndIconzUg2_y0(measureScope, placeable2, r3, r4, placeable, j, this.$alwaysShowLabel, this.$animationProgress);
                    }
                    long j3 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
