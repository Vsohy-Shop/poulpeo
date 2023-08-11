package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LazyMeasuredItemProvider.kt */
public final class LazyMeasuredItemProvider {
    private final long childConstraints;
    private final LazyListItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final MeasuredItemFactory measuredItemFactory;

    @ExperimentalFoundationApi
    public /* synthetic */ LazyMeasuredItemProvider(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, MeasuredItemFactory measuredItemFactory2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, lazyListItemProvider, lazyLayoutMeasureScope, measuredItemFactory2);
    }

    /* renamed from: getAndMeasure-ZjPyQlc  reason: not valid java name */
    public final LazyMeasuredItem m33425getAndMeasureZjPyQlc(int i) {
        return this.measuredItemFactory.m33427createItemHK0c1C0(i, this.itemProvider.getKey(i), this.measureScope.m33517measure0kLqBqw(i, this.childConstraints));
    }

    /* renamed from: getChildConstraints-msEJaDk  reason: not valid java name */
    public final long m33426getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.itemProvider.getKeyToIndexMap();
    }

    private LazyMeasuredItemProvider(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, MeasuredItemFactory measuredItemFactory2) {
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.measuredItemFactory = measuredItemFactory2;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z ? Constraints.m38412getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, !z ? Constraints.m38411getMaxHeightimpl(j) : Integer.MAX_VALUE, 5, (Object) null);
    }
}
