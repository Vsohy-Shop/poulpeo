package androidx.compose.material3;

import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;

/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$2 implements MeasurePolicy {
    final /* synthetic */ float $positionFraction;
    final /* synthetic */ MutableState<Float> $thumbWidth;
    final /* synthetic */ MutableState<Integer> $totalWidth;

    SliderKt$SliderImpl$2(MutableState<Float> mutableState, MutableState<Integer> mutableState2, float f) {
        this.$thumbWidth = mutableState;
        this.$totalWidth = mutableState2;
        this.$positionFraction = f;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34567measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        boolean z;
        boolean z2;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Placeable r2 = measurable.m37365measureBRTryo0(j);
                int r13 = Constraints.m38412getMaxWidthimpl(j) - r2.getWidth();
                for (Measurable measurable2 : iterable) {
                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        Placeable r11 = measurable2.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, r13, 0, 0, 8, (Object) null));
                        int width = r11.getWidth() + r2.getWidth();
                        int max = Math.max(r11.getHeight(), r2.getHeight());
                        this.$thumbWidth.setValue(Float.valueOf((float) r2.getWidth()));
                        this.$totalWidth.setValue(Integer.valueOf(width));
                        return MeasureScope.layout$default(measureScope, width, max, (Map) null, new SliderKt$SliderImpl$2$measure$1(r11, r2.getWidth() / 2, (max - r11.getHeight()) / 2, r2, C13265c.m30134c(((float) r11.getWidth()) * this.$positionFraction), (max - r2.getHeight()) / 2), 4, (Object) null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j2 = j;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
