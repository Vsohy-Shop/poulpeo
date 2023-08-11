package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,364:1\n154#2:365\n154#2:366\n480#3,4:367\n485#3:376\n122#4,5:371\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n234#1:365\n236#1:366\n317#1:367,4\n317#1:376\n317#1:371,5\n*E\n"})
/* compiled from: LazyGrid.kt */
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends C12777p implements C13088o<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyGridItemProvider $itemProvider;
    final /* synthetic */ LazyGridItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C13088o<Density, Constraints, List<Integer>> $slotSizesSums;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, LazyGridState lazyGridState, LazyGridItemProvider lazyGridItemProvider, C13088o<? super Density, ? super Constraints, ? extends List<Integer>> oVar, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$state = lazyGridState;
        this.$itemProvider = lazyGridItemProvider;
        this.$slotSizesSums = oVar;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$placementAnimator = lazyGridItemPlacementAnimator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33469invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyGridMeasureResult m33469invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        Orientation orientation;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        long j2;
        Snapshot makeCurrent;
        int i6;
        int i7;
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
        int i8 = r4 + r5;
        int i9 = i + i2;
        boolean z = this.$isVertical;
        if (z) {
            i3 = i8;
        } else {
            i3 = i9;
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
        int i10 = i3 - i4;
        long r19 = ConstraintsKt.m38428offsetNN6EwU(j3, -i9, -i8);
        this.$state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(this.$itemProvider);
        LazyGridSpanLayoutProvider spanLayoutProvider = this.$itemProvider.getSpanLayoutProvider();
        List invoke = this.$slotSizesSums.invoke(lazyLayoutMeasureScope2, Constraints.m38400boximpl(j));
        spanLayoutProvider.setSlotsPerLine(invoke.size());
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope2);
        this.$state.setSlotsPerLine$foundation_release(invoke.size());
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
        int r8 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(f);
        if (this.$isVertical) {
            Arrangement.Horizontal horizontal2 = this.$horizontalArrangement;
            if (horizontal2 != null) {
                f2 = horizontal2.m33193getSpacingD9Ej5fM();
            } else {
                f2 = C1232Dp.m38468constructorimpl((float) 0);
            }
        } else {
            Arrangement.Vertical vertical2 = this.$verticalArrangement;
            if (vertical2 != null) {
                f2 = vertical2.m33207getSpacingD9Ej5fM();
            } else {
                f2 = C1232Dp.m38468constructorimpl((float) 0);
            }
        }
        int r6 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(f2);
        int itemCount = this.$itemProvider.getItemCount();
        if (this.$isVertical) {
            i5 = Constraints.m38411getMaxHeightimpl(j) - i8;
        } else {
            i5 = Constraints.m38412getMaxWidthimpl(j) - i9;
        }
        int i11 = i5;
        if (!this.$reverseLayout || i11 > 0) {
            j2 = IntOffsetKt.IntOffset(i, r4);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i11;
            }
            if (z2) {
                r4 += i11;
            }
            j2 = IntOffsetKt.IntOffset(i, r4);
        }
        C0544x6964719 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = r2;
        int i12 = i8;
        int i13 = r6;
        int i14 = itemCount;
        int i15 = i4;
        int i16 = r8;
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = spanLayoutProvider;
        int i17 = i9;
        List list = invoke;
        C0544x6964719 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12 = new C0544x6964719(lazyLayoutMeasureScope, this.$isVertical, this.$reverseLayout, i4, i10, this.$placementAnimator, j2);
        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(this.$itemProvider, lazyLayoutMeasureScope2, i16, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12);
        boolean z3 = this.$isVertical;
        final LazyMeasuredLineProvider lazyMeasuredLineProvider = new LazyMeasuredLineProvider(z3, list, i13, i14, i16, lazyMeasuredItemProvider, lazyGridSpanLayoutProvider, new C0545xaa796ba(z3, list, lazyLayoutMeasureScope2, i13));
        final LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
        this.$state.setPrefetchInfoRetriever$foundation_release(new Function1<LineIndex, ArrayList<C11906l<? extends Integer, ? extends Constraints>>>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m33470invokebKFJvoY(((LineIndex) obj).m33506unboximpl());
            }

            /* renamed from: invoke-bKFJvoY  reason: not valid java name */
            public final ArrayList<C11906l<Integer, Constraints>> m33470invokebKFJvoY(int i) {
                LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = lazyGridSpanLayoutProvider2.getLineConfiguration(i);
                int r0 = ItemIndex.m33442constructorimpl(lineConfiguration.getFirstItemIndex());
                ArrayList<C11906l<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                List<GridItemSpan> spans = lineConfiguration.getSpans();
                LazyMeasuredLineProvider lazyMeasuredLineProvider = lazyMeasuredLineProvider;
                int size = spans.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int r6 = GridItemSpan.m33436getCurrentLineSpanimpl(spans.get(i3).m33439unboximpl());
                    arrayList.add(C11915r.m25707a(Integer.valueOf(r0), Constraints.m38400boximpl(lazyMeasuredLineProvider.m33491childConstraintsJhjzzOo$foundation_release(i2, r6))));
                    r0 = ItemIndex.m33442constructorimpl(r0 + 1);
                    i2 += r6;
                }
                return arrayList;
            }
        });
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            int i18 = i14;
            if (lazyGridState.getFirstVisibleItemIndex() >= i18) {
                if (i18 > 0) {
                    i7 = lazyGridSpanLayoutProvider2.m33487getLineIndexOfItem_Ze7BM(i18 - 1);
                    i6 = 0;
                    C11921v vVar = C11921v.f18618a;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    createNonObservableSnapshot.dispose();
                    LazyGridItemProvider lazyGridItemProvider = this.$itemProvider;
                    float scrollToBeConsumed$foundation_release = this.$state.getScrollToBeConsumed$foundation_release();
                    boolean z4 = this.$isVertical;
                    Arrangement.Vertical vertical3 = this.$verticalArrangement;
                    Arrangement.Horizontal horizontal3 = this.$horizontalArrangement;
                    boolean z5 = this.$reverseLayout;
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = this.$placementAnimator;
                    LazyLayoutPinnedItemList pinnedItems$foundation_release = this.$state.getPinnedItems$foundation_release();
                    C05433 r29 = r2;
                    final LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope;
                    final long j4 = j;
                    final int i19 = i17;
                    final int i20 = i12;
                    C05433 r2 = new C13089p<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends C11921v>, MeasureResult>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1<? super Placeable.PlacementScope, C11921v>) (Function1) obj3);
                        }

                        public final MeasureResult invoke(int i, int i2, Function1<? super Placeable.PlacementScope, C11921v> function1) {
                            C12775o.m28639i(function1, "placement");
                            return lazyLayoutMeasureScope3.layout(ConstraintsKt.m38426constrainWidthK40F9xA(j4, i + i19), ConstraintsKt.m38425constrainHeightK40F9xA(j4, i2 + i20), C12716r0.m28416g(), function1);
                        }
                    };
                    LazyGridMeasureResult r0 = LazyGridMeasureKt.m33474measureLazyGridt5wl_D8(i18, lazyGridItemProvider, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i11, i15, i10, i16, i7, i6, scrollToBeConsumed$foundation_release, r19, z4, vertical3, horizontal3, z5, lazyLayoutMeasureScope, lazyGridItemPlacementAnimator, lazyGridSpanLayoutProvider2, pinnedItems$foundation_release, r29);
                    this.$state.applyMeasureResult$foundation_release(r0);
                    return r0;
                }
            }
            int r52 = lazyGridSpanLayoutProvider2.m33487getLineIndexOfItem_Ze7BM(lazyGridState.getFirstVisibleItemIndex());
            i6 = lazyGridState.getFirstVisibleItemScrollOffset();
            i7 = r52;
            C11921v vVar2 = C11921v.f18618a;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            LazyGridItemProvider lazyGridItemProvider2 = this.$itemProvider;
            float scrollToBeConsumed$foundation_release2 = this.$state.getScrollToBeConsumed$foundation_release();
            boolean z42 = this.$isVertical;
            Arrangement.Vertical vertical32 = this.$verticalArrangement;
            Arrangement.Horizontal horizontal32 = this.$horizontalArrangement;
            boolean z52 = this.$reverseLayout;
            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = this.$placementAnimator;
            LazyLayoutPinnedItemList pinnedItems$foundation_release2 = this.$state.getPinnedItems$foundation_release();
            C05433 r292 = r2;
            final LazyLayoutMeasureScope lazyLayoutMeasureScope32 = lazyLayoutMeasureScope;
            final long j42 = j;
            final int i192 = i17;
            final int i202 = i12;
            C05433 r22 = new C13089p<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends C11921v>, MeasureResult>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1<? super Placeable.PlacementScope, C11921v>) (Function1) obj3);
                }

                public final MeasureResult invoke(int i, int i2, Function1<? super Placeable.PlacementScope, C11921v> function1) {
                    C12775o.m28639i(function1, "placement");
                    return lazyLayoutMeasureScope32.layout(ConstraintsKt.m38426constrainWidthK40F9xA(j42, i + i192), ConstraintsKt.m38425constrainHeightK40F9xA(j42, i2 + i202), C12716r0.m28416g(), function1);
                }
            };
            LazyGridMeasureResult r02 = LazyGridMeasureKt.m33474measureLazyGridt5wl_D8(i18, lazyGridItemProvider2, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i11, i15, i10, i16, i7, i6, scrollToBeConsumed$foundation_release2, r19, z42, vertical32, horizontal32, z52, lazyLayoutMeasureScope, lazyGridItemPlacementAnimator2, lazyGridSpanLayoutProvider2, pinnedItems$foundation_release2, r292);
            this.$state.applyMeasureResult$foundation_release(r02);
            return r02;
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
