package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,334:1\n480#2,4:335\n485#2:344\n122#3,5:339\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n294#1:335,4\n294#1:344\n294#1:339,5\n*E\n"})
/* compiled from: LazyList.kt */
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends C12777p implements C13088o<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> {
    final /* synthetic */ LazyListBeyondBoundsInfo $beyondBoundsInfo;
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyListItemProvider $itemProvider;
    final /* synthetic */ LazyListItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, LazyListState lazyListState, LazyListItemProvider lazyListItemProvider, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$state = lazyListState;
        this.$itemProvider = lazyListItemProvider;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$placementAnimator = lazyListItemPlacementAnimator;
        this.$beyondBoundsInfo = lazyListBeyondBoundsInfo;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33408invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyListMeasureResult m33408invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        Orientation orientation;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j2;
        Snapshot makeCurrent;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j3 = j;
        C12775o.m28639i(lazyLayoutMeasureScope2, "$this$null");
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m32977checkScrollableContainerConstraintsK40F9xA(j3, orientation);
        if (this.$isVertical) {
            i = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(this.$contentPadding.m33279calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            i2 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(this.$contentPadding.m33280calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int r4 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(this.$contentPadding.m33281calculateTopPaddingD9Ej5fM());
        int r5 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(this.$contentPadding.m33278calculateBottomPaddingD9Ej5fM());
        int i6 = r4 + r5;
        int i7 = i + i2;
        boolean z = this.$isVertical;
        if (z) {
            i3 = i6;
        } else {
            i3 = i7;
        }
        if (z && !this.$reverseLayout) {
            i4 = r4;
        } else if (z && this.$reverseLayout) {
            i4 = r5;
        } else if (z || this.$reverseLayout) {
            i4 = i2;
        } else {
            i4 = i;
        }
        int i8 = i3 - i4;
        long r31 = ConstraintsKt.m38428offsetNN6EwU(j3, -i7, -i6);
        this.$state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(this.$itemProvider);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope2);
        this.$itemProvider.getItemScope().setMaxSize(Constraints.m38412getMaxWidthimpl(r31), Constraints.m38411getMaxHeightimpl(r31));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                f = vertical.m33207getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                f = horizontal.m33193getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        int r19 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(f);
        int itemCount = this.$itemProvider.getItemCount();
        if (this.$isVertical) {
            i5 = Constraints.m38411getMaxHeightimpl(j) - i6;
        } else {
            i5 = Constraints.m38412getMaxWidthimpl(j) - i7;
        }
        int i9 = i5;
        if (!this.$reverseLayout || i9 > 0) {
            j2 = IntOffsetKt.IntOffset(i, r4);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i9;
            }
            if (z2) {
                r4 += i9;
            }
            j2 = IntOffsetKt.IntOffset(i, r4);
        }
        boolean z3 = this.$isVertical;
        LazyListItemProvider lazyListItemProvider = this.$itemProvider;
        boolean z4 = z3;
        int i10 = i7;
        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(r31, z4, lazyListItemProvider, lazyLayoutMeasureScope, new C0531xe4ed819(itemCount, r19, lazyLayoutMeasureScope, z3, this.$horizontalAlignment, this.$verticalAlignment, this.$reverseLayout, i4, i8, this.$placementAnimator, j2), (DefaultConstructorMarker) null);
        this.$state.m33424setPremeasureConstraintsBRTryo0$foundation_release(lazyMeasuredItemProvider.m33426getChildConstraintsmsEJaDk());
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            int r36 = DataIndex.m33391constructorimpl(lazyListState.getFirstVisibleItemIndex());
            int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
            C11921v vVar = C11921v.f18618a;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            LazyListItemProvider lazyListItemProvider2 = this.$itemProvider;
            float scrollToBeConsumed$foundation_release = this.$state.getScrollToBeConsumed$foundation_release();
            boolean z5 = this.$isVertical;
            List<Integer> headerIndexes = this.$itemProvider.getHeaderIndexes();
            Arrangement.Vertical vertical2 = this.$verticalArrangement;
            Arrangement.Horizontal horizontal2 = this.$horizontalArrangement;
            boolean z6 = this.$reverseLayout;
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator = this.$placementAnimator;
            LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo = this.$beyondBoundsInfo;
            int i11 = this.$beyondBoundsItemCount;
            LazyLayoutPinnedItemList pinnedItems$foundation_release = this.$state.getPinnedItems$foundation_release();
            C05302 r30 = r2;
            final LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope;
            final long j4 = j;
            final int i12 = i10;
            final int i13 = i6;
            C05302 r2 = new C13089p<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends C11921v>, MeasureResult>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1<? super Placeable.PlacementScope, C11921v>) (Function1) obj3);
                }

                public final MeasureResult invoke(int i, int i2, Function1<? super Placeable.PlacementScope, C11921v> function1) {
                    C12775o.m28639i(function1, "placement");
                    return lazyLayoutMeasureScope3.layout(ConstraintsKt.m38426constrainWidthK40F9xA(j4, i + i12), ConstraintsKt.m38425constrainHeightK40F9xA(j4, i2 + i13), C12716r0.m28416g(), function1);
                }
            };
            LazyListMeasureResult r0 = LazyListMeasureKt.m33414measureLazyListHh3qtAg(itemCount, lazyListItemProvider2, lazyMeasuredItemProvider, i9, i4, i8, r19, r36, firstVisibleItemScrollOffset, scrollToBeConsumed$foundation_release, r31, z5, headerIndexes, vertical2, horizontal2, z6, lazyLayoutMeasureScope, lazyListItemPlacementAnimator, lazyListBeyondBoundsInfo, i11, pinnedItems$foundation_release, r30);
            this.$state.applyMeasureResult$foundation_release(r0);
            return r0;
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
