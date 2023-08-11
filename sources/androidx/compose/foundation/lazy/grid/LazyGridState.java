package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p002ui.layout.Remeasurement;
import androidx.compose.p002ui.layout.RemeasurementModifier;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,460:1\n1182#2:461\n1161#2,2:462\n76#3:464\n102#3,2:465\n76#3:467\n102#3,2:468\n76#3:470\n102#3,2:471\n76#3:473\n102#3,2:474\n76#3:476\n102#3,2:477\n76#3:479\n102#3,2:480\n76#3:482\n102#3,2:483\n76#3:485\n102#3,2:486\n460#4,11:488\n460#4,11:505\n33#5,6:499\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n191#1:461\n191#1:462,2\n151#1:464\n151#1:465,2\n156#1:467\n156#1:468,2\n161#1:470\n161#1:471,2\n203#1:473\n203#1:474,2\n224#1:476\n224#1:477,2\n226#1:479\n226#1:480,2\n283#1:482\n283#1:483,2\n285#1:485\n285#1:486,2\n354#1:488,11\n381#1:505,11\n359#1:499,6\n*E\n"})
@Stable
/* compiled from: LazyGridState.kt */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(LazyGridState$Companion$Saver$1.INSTANCE, LazyGridState$Companion$Saver$2.INSTANCE);
    private final LazyGridAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private final MutableState density$delegate;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState isVertical$delegate;
    private final MutableState<LazyGridLayoutInfo> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState placementAnimator$delegate;
    private final MutableState prefetchInfoRetriever$delegate;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private final MutableState slotsPerLine$delegate;
    private boolean wasScrollingForward;

    /* compiled from: LazyGridState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }
    }

    public LazyGridState() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i, int i2, C12074d dVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.animateScrollToItem(i, i2, dVar);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyGridLayoutInfo lazyGridLayoutInfo) {
        int i;
        int i2;
        int i3;
        if (this.lineToPrefetch != -1 && (!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (this.wasScrollingForward) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) C12686e0.m28231j0(lazyGridLayoutInfo.getVisibleItemsInfo());
                if (isVertical$foundation_release()) {
                    i3 = lazyGridItemInfo.getRow();
                } else {
                    i3 = lazyGridItemInfo.getColumn();
                }
                i = i3 + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) C12686e0.m28221Z(lazyGridLayoutInfo.getVisibleItemsInfo());
                if (isVertical$foundation_release()) {
                    i2 = lazyGridItemInfo2.getRow();
                } else {
                    i2 = lazyGridItemInfo2.getColumn();
                }
                i = i2 - 1;
            }
            if (this.lineToPrefetch != i) {
                this.lineToPrefetch = -1;
                MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i4 = 0;
                    do {
                        ((LazyLayoutPrefetchState.PrefetchHandle) content[i4]).cancel();
                        i4++;
                    } while (i4 < size);
                }
                this.currentLinePrefetchHandles.clear();
            }
        }
    }

    private final Remeasurement getRemeasurement() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5 A[LOOP:1: B:36:0x00c3->B:37:0x00c5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void notifyPrefetch(float r9) {
        /*
            r8 = this;
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r0 = r8.prefetchState
            boolean r1 = r8.prefetchingEnabled
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r1 = r8.getLayoutInfo()
            java.util.List r2 = r1.getVisibleItemsInfo()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00eb
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r2 = 0
            if (r9 >= 0) goto L_0x0021
            r9 = r3
            goto L_0x0022
        L_0x0021:
            r9 = r2
        L_0x0022:
            if (r9 == 0) goto L_0x004e
            java.util.List r4 = r1.getVisibleItemsInfo()
            java.lang.Object r4 = kotlin.collections.C12686e0.m28231j0(r4)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r4 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r4
            boolean r5 = r8.isVertical$foundation_release()
            if (r5 == 0) goto L_0x0039
            int r4 = r4.getRow()
            goto L_0x003d
        L_0x0039:
            int r4 = r4.getColumn()
        L_0x003d:
            int r4 = r4 + r3
            java.util.List r5 = r1.getVisibleItemsInfo()
            java.lang.Object r5 = kotlin.collections.C12686e0.m28231j0(r5)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r5 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r5
            int r5 = r5.getIndex()
            int r5 = r5 + r3
            goto L_0x0078
        L_0x004e:
            java.util.List r4 = r1.getVisibleItemsInfo()
            java.lang.Object r4 = kotlin.collections.C12686e0.m28221Z(r4)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r4 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r4
            boolean r5 = r8.isVertical$foundation_release()
            if (r5 == 0) goto L_0x0063
            int r4 = r4.getRow()
            goto L_0x0067
        L_0x0063:
            int r4 = r4.getColumn()
        L_0x0067:
            int r4 = r4 + -1
            java.util.List r5 = r1.getVisibleItemsInfo()
            java.lang.Object r5 = kotlin.collections.C12686e0.m28221Z(r5)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r5 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r5
            int r5 = r5.getIndex()
            int r5 = r5 - r3
        L_0x0078:
            int r6 = r8.lineToPrefetch
            if (r4 == r6) goto L_0x00eb
            if (r5 < 0) goto L_0x0086
            int r1 = r1.getTotalItemsCount()
            if (r5 >= r1) goto L_0x0086
            r1 = r3
            goto L_0x0087
        L_0x0086:
            r1 = r2
        L_0x0087:
            if (r1 == 0) goto L_0x00eb
            boolean r1 = r8.wasScrollingForward
            if (r1 == r9) goto L_0x00a4
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r1 = r8.currentLinePrefetchHandles
            int r5 = r1.getSize()
            if (r5 <= 0) goto L_0x00a4
            java.lang.Object[] r1 = r1.getContent()
            r6 = r2
        L_0x009a:
            r7 = r1[r6]
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r7 = (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle) r7
            r7.cancel()
            int r6 = r6 + r3
            if (r6 < r5) goto L_0x009a
        L_0x00a4:
            r8.wasScrollingForward = r9
            r8.lineToPrefetch = r4
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r9 = r8.currentLinePrefetchHandles
            r9.clear()
            kotlin.jvm.functions.Function1 r9 = r8.getPrefetchInfoRetriever$foundation_release()
            int r1 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r4)
            androidx.compose.foundation.lazy.grid.LineIndex r1 = androidx.compose.foundation.lazy.grid.LineIndex.m33494boximpl(r1)
            java.lang.Object r9 = r9.invoke(r1)
            java.util.List r9 = (java.util.List) r9
            int r1 = r9.size()
        L_0x00c3:
            if (r2 >= r1) goto L_0x00eb
            java.lang.Object r3 = r9.get(r2)
            ef.l r3 = (p336ef.C11906l) r3
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r4 = r8.currentLinePrefetchHandles
            java.lang.Object r5 = r3.mo49111c()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r3 = r3.mo49112d()
            androidx.compose.ui.unit.Constraints r3 = (androidx.compose.p002ui.unit.Constraints) r3
            long r6 = r3.m38418unboximpl()
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r3 = r0.m33539schedulePrefetch0kLqBqw(r5, r6)
            r4.add(r3)
            int r2 = r2 + 1
            goto L_0x00c3
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.notifyPrefetch(float):void");
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i, int i2, C12074d dVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, dVar);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    public final Object animateScrollToItem(int i, int i2, C12074d<? super C11921v> dVar) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i, i2, dVar);
        if (animateScrollToItem == C12150d.m26492c()) {
            return animateScrollToItem;
        }
        return C11921v.f18618a;
    }

    public final void applyMeasureResult$foundation_release(LazyGridMeasureResult lazyGridMeasureResult) {
        int i;
        C12775o.m28639i(lazyGridMeasureResult, "result");
        this.scrollPosition.updateFromMeasureResult(lazyGridMeasureResult);
        this.scrollToBeConsumed -= lazyGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyGridMeasureResult);
        setCanScrollForward(lazyGridMeasureResult.getCanScrollForward());
        LazyGridMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        boolean z = false;
        if (firstVisibleLine != null) {
            i = firstVisibleLine.m33477getIndexhA7yfN8();
        } else {
            i = 0;
        }
        if (!(i == 0 && lazyGridMeasureResult.getFirstVisibleLineScrollOffset() == 0)) {
            z = true;
        }
        setCanScrollBackward(z);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(lazyGridMeasureResult);
    }

    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final Density getDensity$foundation_release() {
        return (Density) this.density$delegate.getValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.m33485getIndexVZbfaAc();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return (LazyGridItemPlacementAnimator) this.placementAnimator$delegate.getValue();
    }

    public final Function1<LineIndex, List<C11906l<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.prefetchInfoRetriever$delegate.getValue();
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

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation_release() {
        return ((Number) this.slotsPerLine$delegate.getValue()).intValue();
    }

    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final boolean isVertical$foundation_release() {
        return ((Boolean) this.isVertical$delegate.getValue()).booleanValue();
    }

    public final float onScroll$foundation_release(float f) {
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
                Remeasurement remeasurement = getRemeasurement();
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: of.o<? super androidx.compose.foundation.gestures.ScrollScope, ? super hf.d<? super ef.v>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, p404of.C13088o<? super androidx.compose.foundation.gestures.ScrollScope, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object> r7, p355hf.C12074d<? super p336ef.C11921v> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p336ef.C11910n.m25701b(r8)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            of.o r7 = (p404of.C13088o) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            p336ef.C11910n.m25701b(r8)
            goto L_0x005a
        L_0x0045:
            p336ef.C11910n.m25701b(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            ef.v r6 = p336ef.C11921v.f18618a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, of.o, hf.d):java.lang.Object");
    }

    public final Object scrollToItem(int i, int i2, C12074d<? super C11921v> dVar) {
        Object scroll$default = ScrollableState.scroll$default(this, (MutatePriority) null, new LazyGridState$scrollToItem$2(this, i, i2, (C12074d<? super LazyGridState$scrollToItem$2>) null), dVar, 1, (Object) null);
        if (scroll$default == C12150d.m26492c()) {
            return scroll$default;
        }
        return C11921v.f18618a;
    }

    public final void setDensity$foundation_release(Density density) {
        C12775o.m28639i(density, "<set-?>");
        this.density$delegate.setValue(density);
    }

    public final void setPlacementAnimator$foundation_release(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.placementAnimator$delegate.setValue(lazyGridItemPlacementAnimator);
    }

    public final void setPrefetchInfoRetriever$foundation_release(Function1<? super LineIndex, ? extends List<C11906l<Integer, Constraints>>> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.prefetchInfoRetriever$delegate.setValue(function1);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final void setSlotsPerLine$foundation_release(int i) {
        this.slotsPerLine$delegate.setValue(Integer.valueOf(i));
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical$delegate.setValue(Boolean.valueOf(z));
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2) {
        this.scrollPosition.m33486requestPositionyO3Fmg4(ItemIndex.m33442constructorimpl(i), i2);
        LazyGridItemPlacementAnimator placementAnimator$foundation_release = getPlacementAnimator$foundation_release();
        if (placementAnimator$foundation_release != null) {
            placementAnimator$foundation_release.reset();
        }
        Remeasurement remeasurement = getRemeasurement();
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyGridItemProvider lazyGridItemProvider) {
        C12775o.m28639i(lazyGridItemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyGridItemProvider);
    }

    public LazyGridState(int i, int i2) {
        this.scrollPosition = new LazyGridScrollPosition(i, i2);
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyGridLayoutInfo.INSTANCE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.density$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DensityKt.Density(1.0f, 1.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.isVertical$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyGridState$scrollableState$1(this));
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.remeasurementModifier = new LazyGridState$remeasurementModifier$1(this);
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.prefetchInfoRetriever$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LazyGridState$prefetchInfoRetriever$2.INSTANCE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.placementAnimator$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.animateScrollScope = new LazyGridAnimateScrollScope(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
