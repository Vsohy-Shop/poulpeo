package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyMeasuredItemProvider.kt */
public final class LazyMeasuredItemProvider {
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final MeasuredItemFactory measuredItemFactory;

    @ExperimentalFoundationApi
    public LazyMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, MeasuredItemFactory measuredItemFactory2) {
        C12775o.m28639i(lazyGridItemProvider, "itemProvider");
        C12775o.m28639i(lazyLayoutMeasureScope, "measureScope");
        C12775o.m28639i(measuredItemFactory2, "measuredItemFactory");
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i;
        this.measuredItemFactory = measuredItemFactory2;
    }

    /* renamed from: getAndMeasure-ednRnyU$default  reason: not valid java name */
    public static /* synthetic */ LazyGridMeasuredItem m33489getAndMeasureednRnyU$default(LazyMeasuredItemProvider lazyMeasuredItemProvider, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = lazyMeasuredItemProvider.defaultMainAxisSpacing;
        }
        return lazyMeasuredItemProvider.m33490getAndMeasureednRnyU(i, i2, j);
    }

    /* renamed from: getAndMeasure-ednRnyU  reason: not valid java name */
    public final LazyGridMeasuredItem m33490getAndMeasureednRnyU(int i, int i2, long j) {
        int r10;
        Object key = this.itemProvider.getKey(i);
        List<Placeable> r6 = this.measureScope.m33517measure0kLqBqw(i, j);
        if (Constraints.m38410getHasFixedWidthimpl(j)) {
            r10 = Constraints.m38414getMinWidthimpl(j);
        } else if (Constraints.m38409getHasFixedHeightimpl(j)) {
            r10 = Constraints.m38413getMinHeightimpl(j);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return this.measuredItemFactory.m33507createItemPU_OBEw(i, key, r10, i2, r6);
    }

    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.itemProvider.getKeyToIndexMap();
    }
}
