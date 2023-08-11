package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffsetKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,157:1\n51#2:158\n51#2:159\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n90#1:158\n93#1:159\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 */
/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
final class C0574x5d1e95ce extends C12777p implements C13088o<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ LazyStaggeredGridItemProvider $itemProvider;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C13088o<Density, Constraints, int[]> $slotSizesSums;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0574x5d1e95ce(Orientation orientation, C13088o<? super Density, ? super Constraints, int[]> oVar, LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, PaddingValues paddingValues, boolean z, float f, float f2) {
        super(2);
        this.$orientation = orientation;
        this.$slotSizesSums = oVar;
        this.$state = lazyStaggeredGridState;
        this.$itemProvider = lazyStaggeredGridItemProvider;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33561invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyStaggeredGridMeasureResult m33561invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        boolean z;
        int i;
        long j2;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j3 = j;
        C12775o.m28639i(lazyLayoutMeasureScope2, "$this$null");
        CheckScrollableContainerConstraintsKt.m32977checkScrollableContainerConstraintsK40F9xA(j3, this.$orientation);
        int[] invoke = this.$slotSizesSums.invoke(lazyLayoutMeasureScope2, Constraints.m38400boximpl(j));
        if (this.$orientation == Orientation.Vertical) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        this.$state.setLaneWidthsPrefixSum$foundation_release(invoke);
        this.$state.setVertical$foundation_release(z2);
        this.$state.setSpanProvider$foundation_release(this.$itemProvider.getSpanProvider());
        int r14 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection()));
        int r15 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection()));
        int r4 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(this.$contentPadding, this.$orientation, lazyLayoutMeasureScope.getLayoutDirection()));
        if (z2) {
            i = Constraints.m38411getMaxHeightimpl(j);
        } else {
            i = Constraints.m38412getMaxWidthimpl(j);
        }
        int i2 = (i - r14) - r15;
        if (z2) {
            j2 = IntOffsetKt.IntOffset(r4, r14);
        } else {
            j2 = IntOffsetKt.IntOffset(r14, r4);
        }
        long j4 = j2;
        PaddingValues paddingValues = this.$contentPadding;
        int r42 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(C1232Dp.m38468constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.$contentPadding;
        int r5 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(C1232Dp.m38468constructorimpl(paddingValues2.m33281calculateTopPaddingD9Ej5fM() + paddingValues2.m33278calculateBottomPaddingD9Ej5fM()));
        long r52 = Constraints.m38403copyZbe2FdA$default(j, ConstraintsKt.m38426constrainWidthK40F9xA(j3, r42), 0, ConstraintsKt.m38425constrainHeightK40F9xA(j3, r5), 0, 10, (Object) null);
        int r13 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(this.$mainAxisSpacing);
        int r18 = lazyLayoutMeasureScope2.m38443roundToPx0680j_4(this.$crossAxisSpacing);
        LazyStaggeredGridMeasureResult r1 = LazyStaggeredGridMeasureKt.m33559measureStaggeredGridBTfHGGE(lazyLayoutMeasureScope, this.$state, this.$itemProvider, invoke, r52, z2, this.$reverseLayout, j4, i2, r13, r18, r14, r15);
        this.$state.applyMeasureResult$foundation_release(r1);
        return r1;
    }
}
