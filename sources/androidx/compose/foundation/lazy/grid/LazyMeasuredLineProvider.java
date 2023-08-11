package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
/* compiled from: LazyMeasuredLineProvider.kt */
public final class LazyMeasuredLineProvider {
    private final int crossAxisSpacing;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyMeasuredItemProvider measuredItemProvider;
    private final MeasuredLineFactory measuredLineFactory;
    private final List<Integer> slotSizesSums;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyMeasuredLineProvider(boolean z, List<Integer> list, int i, int i2, int i3, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, MeasuredLineFactory measuredLineFactory2) {
        C12775o.m28639i(list, "slotSizesSums");
        C12775o.m28639i(lazyMeasuredItemProvider, "measuredItemProvider");
        C12775o.m28639i(lazyGridSpanLayoutProvider, "spanLayoutProvider");
        C12775o.m28639i(measuredLineFactory2, "measuredLineFactory");
        this.isVertical = z;
        this.slotSizesSums = list;
        this.crossAxisSpacing = i;
        this.gridItemsCount = i2;
        this.spaceBetweenLines = i3;
        this.measuredItemProvider = lazyMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
        this.measuredLineFactory = measuredLineFactory2;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release  reason: not valid java name */
    public final long m33491childConstraintsJhjzzOo$foundation_release(int i, int i2) {
        int i3;
        int intValue = this.slotSizesSums.get((i + i2) - 1).intValue();
        if (i == 0) {
            i3 = 0;
        } else {
            i3 = this.slotSizesSums.get(i - 1).intValue();
        }
        int d = C13537l.m30877d((intValue - i3) + (this.crossAxisSpacing * (i2 - 1)), 0);
        if (this.isVertical) {
            return Constraints.Companion.m38422fixedWidthOenEA2s(d);
        }
        return Constraints.Companion.m38421fixedHeightOenEA2s(d);
    }

    /* renamed from: getAndMeasure-bKFJvoY  reason: not valid java name */
    public final LazyGridMeasuredLine m33492getAndMeasurebKFJvoY(int i) {
        int i2;
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i);
        int size = lineConfiguration.getSpans().size();
        if (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) {
            i2 = 0;
        } else {
            i2 = this.spaceBetweenLines;
        }
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int r6 = GridItemSpan.m33436getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i4).m33439unboximpl());
            LazyGridMeasuredItem r7 = this.measuredItemProvider.m33490getAndMeasureednRnyU(ItemIndex.m33442constructorimpl(lineConfiguration.getFirstItemIndex() + i4), i2, m33491childConstraintsJhjzzOo$foundation_release(i3, r6));
            i3 += r6;
            C11921v vVar = C11921v.f18618a;
            lazyGridMeasuredItemArr[i4] = r7;
        }
        return this.measuredLineFactory.m33508createLineH9FfpSk(i, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i2);
    }

    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.measuredItemProvider.getKeyToIndexMap();
    }

    /* renamed from: itemConstraints-HZ0wssc  reason: not valid java name */
    public final long m33493itemConstraintsHZ0wssc(int i) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return m33491childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(i, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }
}
