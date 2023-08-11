package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;

/* compiled from: AppBar.kt */
final class AppBarKt$TopAppBarLayout$2 implements MeasurePolicy {
    final /* synthetic */ float $heightPx;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    AppBarKt$TopAppBarLayout$2(float f, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i) {
        this.$heightPx = f;
        this.$titleHorizontalArrangement = horizontal;
        this.$titleVerticalArrangement = vertical;
        this.$titleBottomPadding = i;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34256measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                Placeable r2 = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 14, (Object) null));
                for (Measurable measurable2 : iterable) {
                    if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                        Placeable r10 = measurable2.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 14, (Object) null));
                        if (Constraints.m38412getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                            i = Constraints.m38412getMaxWidthimpl(j);
                        } else {
                            i = C13537l.m30877d((Constraints.m38412getMaxWidthimpl(j) - r2.getWidth()) - r10.getWidth(), 0);
                        }
                        int i3 = i;
                        for (Measurable measurable3 : iterable) {
                            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                Placeable r1 = measurable3.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, i3, 0, 0, 12, (Object) null));
                                if (r1.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE) {
                                    i2 = r1.get(AlignmentLineKt.getLastBaseline());
                                } else {
                                    i2 = 0;
                                }
                                int c = C13265c.m30134c(this.$heightPx);
                                return MeasureScope.layout$default(measureScope, Constraints.m38412getMaxWidthimpl(j), c, (Map) null, new AppBarKt$TopAppBarLayout$2$measure$1(r2, c, r1, this.$titleHorizontalArrangement, j, r10, measureScope, this.$titleVerticalArrangement, this.$titleBottomPadding, i2), 4, (Object) null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
