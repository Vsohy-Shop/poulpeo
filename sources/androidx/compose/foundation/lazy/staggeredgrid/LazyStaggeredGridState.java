package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p002ui.layout.Remeasurement;
import androidx.compose.p002ui.layout.RemeasurementModifier;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,477:1\n76#2:478\n76#2:479\n76#2:480\n102#2,2:481\n76#2:483\n102#2,2:484\n1855#3,2:486\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n101#1:478\n115#1:479\n152#1:480\n152#1:481,2\n154#1:483\n154#1:484,2\n408#1:486,2\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: LazyStaggeredGridState.kt */
public final class LazyStaggeredGridState implements ScrollableState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(LazyStaggeredGridState$Companion$Saver$1.INSTANCE, LazyStaggeredGridState$Companion$Saver$2.INSTANCE);
    private final LazyStaggeredGridAnimateScrollScope animateScrollScope;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private Density density;
    private final State firstVisibleItemIndex$delegate;
    private final State firstVisibleItemScrollOffset$delegate;
    private boolean isVertical;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private int[] laneWidthsPrefixSum;
    private final MutableState<LazyStaggeredGridLayoutInfo> layoutInfoState;
    private int measurePassCount;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    /* access modifiers changed from: private */
    public Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private LazyStaggeredGridSpanProvider spanProvider;

    /* compiled from: LazyStaggeredGridState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, C12074d dVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i, i2, dVar);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != -1) {
            boolean z = true;
            if (!visibleItemsInfo.isEmpty()) {
                int index = ((LazyStaggeredGridItemInfo) C12686e0.m28221Z(visibleItemsInfo)).getIndex();
                int index2 = ((LazyStaggeredGridItemInfo) C12686e0.m28231j0(visibleItemsInfo)).getIndex();
                int i = this.prefetchBaseIndex;
                if (index > i || i > index2) {
                    z = false;
                }
                if (!z) {
                    this.prefetchBaseIndex = -1;
                    for (LazyLayoutPrefetchState.PrefetchHandle cancel : this.currentItemPrefetchHandles.values()) {
                        cancel.cancel();
                    }
                    this.currentItemPrefetchHandles.clear();
                }
            }
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!set.contains(next.getKey())) {
                ((LazyLayoutPrefetchState.PrefetchHandle) next.getValue()).cancel();
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public final int[] fillNearestIndices(int i, int i2) {
        boolean z;
        int[] iArr = new int[i2];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
        int i3 = 0;
        if (lazyStaggeredGridSpanProvider == null || !lazyStaggeredGridSpanProvider.isFullSpan(i)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C12708o.m28354u(iArr, i, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i + i2);
        int lane = this.laneInfo.getLane(i);
        if (lane != -1) {
            i3 = Math.min(lane, i2);
        }
        int i4 = i3;
        int i5 = i4 - 1;
        int i6 = i;
        while (true) {
            if (-1 >= i5) {
                break;
            }
            i6 = this.laneInfo.findPreviousItemIndex(i6, i5);
            iArr[i5] = i6;
            if (i6 == -1) {
                C12708o.m28354u(iArr, -1, 0, i5, 2, (Object) null);
                break;
            }
            i5--;
        }
        iArr[i4] = i;
        for (int i7 = i4 + 1; i7 < i2; i7++) {
            i = this.laneInfo.findNextItemIndex(i, i7);
            iArr[i7] = i;
        }
        return iArr;
    }

    private final void notifyPrefetch(float f) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        long j;
        int findPreviousItemIndex;
        LazyStaggeredGridLayoutInfo value = this.layoutInfoState.getValue();
        if (!value.getVisibleItemsInfo().isEmpty()) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = ((LazyStaggeredGridItemInfo) C12686e0.m28231j0(value.getVisibleItemsInfo())).getIndex();
            } else {
                i = ((LazyStaggeredGridItemInfo) C12686e0.m28221Z(value.getVisibleItemsInfo())).getIndex();
            }
            if (i != this.prefetchBaseIndex) {
                this.prefetchBaseIndex = i;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int length = this.laneWidthsPrefixSum.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (z) {
                        findPreviousItemIndex = this.laneInfo.findNextItemIndex(i, i5);
                    } else {
                        findPreviousItemIndex = this.laneInfo.findPreviousItemIndex(i, i5);
                    }
                    if (i < 0 || i >= value.getTotalItemsCount()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 || linkedHashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(i));
                    if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(i))) {
                        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
                        if (lazyStaggeredGridSpanProvider == null || !lazyStaggeredGridSpanProvider.isFullSpan(i)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            i2 = 0;
                        } else {
                            i2 = i5;
                        }
                        if (z3) {
                            i3 = getLaneCount$foundation_release();
                        } else {
                            i3 = 1;
                        }
                        int[] iArr = this.laneWidthsPrefixSum;
                        int i6 = iArr[(i3 + i2) - 1];
                        if (i2 == 0) {
                            i4 = 0;
                        } else {
                            i4 = iArr[i2 - 1];
                        }
                        int i7 = i6 - i4;
                        if (this.isVertical) {
                            j = Constraints.Companion.m38422fixedWidthOenEA2s(i7);
                        } else {
                            j = Constraints.Companion.m38421fixedHeightOenEA2s(i7);
                        }
                        this.currentItemPrefetchHandles.put(Integer.valueOf(i), this.prefetchState.m33539schedulePrefetch0kLqBqw(i, j));
                    }
                }
                clearLeftoverPrefetchHandles(linkedHashSet);
            }
        }
    }

    /* access modifiers changed from: private */
    public final float onScroll(float f) {
        boolean z;
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.scrollToBeConsumed + f;
            this.scrollToBeConsumed = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.scrollToBeConsumed;
                Remeasurement remeasurement2 = this.remeasurement;
                if (remeasurement2 != null) {
                    remeasurement2.forceRemeasure();
                }
                if (this.prefetchingEnabled) {
                    notifyPrefetch(f3 - this.scrollToBeConsumed);
                }
            }
            if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
                return f;
            }
            float f4 = f - this.scrollToBeConsumed;
            this.scrollToBeConsumed = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, C12074d dVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i, i2, dVar);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    public final Object animateScrollToItem(int i, int i2, C12074d<? super C11921v> dVar) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i, i2, dVar);
        if (animateScrollToItem == C12150d.m26492c()) {
            return animateScrollToItem;
        }
        return C11921v.f18618a;
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        C12775o.m28639i(lazyStaggeredGridMeasureResult, "result");
        this.scrollToBeConsumed -= lazyStaggeredGridMeasureResult.getConsumedScroll();
        setCanScrollBackward(lazyStaggeredGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyStaggeredGridMeasureResult.getCanScrollForward());
        this.layoutInfoState.setValue(lazyStaggeredGridMeasureResult);
        cancelPrefetchIfVisibleItemsChanged(lazyStaggeredGridMeasureResult);
        this.scrollPosition.updateFromMeasureResult(lazyStaggeredGridMeasureResult);
        this.measurePassCount++;
    }

    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return ((Number) this.firstVisibleItemIndex$delegate.getValue()).intValue();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return ((Number) this.firstVisibleItemScrollOffset$delegate.getValue()).intValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final int getLaneCount$foundation_release() {
        return this.laneWidthsPrefixSum.length;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.laneInfo;
    }

    public final int[] getLaneWidthsPrefixSum$foundation_release() {
        return this.laneWidthsPrefixSum;
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.measurePassCount;
    }

    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.mutableInteractionSource;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider$foundation_release() {
        return this.spanProvider;
    }

    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final boolean isVertical$foundation_release() {
        return this.isVertical;
    }

    public Object scroll(MutatePriority mutatePriority, C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, oVar, dVar);
        if (scroll == C12150d.m26492c()) {
            return scroll;
        }
        return C11921v.f18618a;
    }

    public final Object scrollToItem(int i, int i2, C12074d<? super C11921v> dVar) {
        Object scroll$default = ScrollableState.scroll$default(this, (MutatePriority) null, new LazyStaggeredGridState$scrollToItem$2(this, i, i2, (C12074d<? super LazyStaggeredGridState$scrollToItem$2>) null), dVar, 1, (Object) null);
        if (scroll$default == C12150d.m26492c()) {
            return scroll$default;
        }
        return C11921v.f18618a;
    }

    public final void setDensity$foundation_release(Density density2) {
        C12775o.m28639i(density2, "<set-?>");
        this.density = density2;
    }

    public final void setLaneWidthsPrefixSum$foundation_release(int[] iArr) {
        C12775o.m28639i(iArr, "<set-?>");
        this.laneWidthsPrefixSum = iArr;
    }

    public final void setMeasurePassCount$foundation_release(int i) {
        this.measurePassCount = i;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final void setSpanProvider$foundation_release(LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical = z;
    }

    public final void snapToItemInternal$foundation_release(ScrollScope scrollScope, int i, int i2) {
        int i3;
        C12775o.m28639i(scrollScope, "<this>");
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i);
        if (findVisibleItem != null) {
            boolean z = this.isVertical;
            long r0 = findVisibleItem.m33548getOffsetnOccac();
            if (z) {
                i3 = IntOffset.m38587getYimpl(r0);
            } else {
                i3 = IntOffset.m38586getXimpl(r0);
            }
            scrollScope.scrollBy((float) (i3 + i2));
            return;
        }
        this.scrollPosition.requestPosition(i, i2);
        Remeasurement remeasurement2 = this.remeasurement;
        if (remeasurement2 != null) {
            remeasurement2.forceRemeasure();
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider lazyLayoutItemProvider) {
        C12775o.m28639i(lazyLayoutItemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider);
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.firstVisibleItemIndex$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new LazyStaggeredGridState$firstVisibleItemIndex$2(this));
        this.firstVisibleItemScrollOffset$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new LazyStaggeredGridState$firstVisibleItemScrollOffset$2(this));
        this.scrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyStaggeredGridLayoutInfo.INSTANCE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.animateScrollScope = new LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new LazyStaggeredGridState$remeasurementModifier$1(this);
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState();
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyStaggeredGridState$scrollableState$1(this));
        this.laneWidthsPrefixSum = new int[0];
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyStaggeredGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyStaggeredGridState(int i, int i2) {
        this(new int[]{i}, new int[]{i2});
    }
}
