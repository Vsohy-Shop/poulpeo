package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,122:1\n154#2:123\n154#2:124\n154#2:125\n76#3:126\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n50#1:123\n58#1:124\n60#1:125\n89#1:126\n*E\n"})
/* compiled from: LazyStaggeredGrid.kt */
public final class LazyStaggeredGridKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @ExperimentalFoundationApi
    @Composable
    /* renamed from: LazyStaggeredGrid-LJWHXA8  reason: not valid java name */
    public static final void m33550LazyStaggeredGridLJWHXA8(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, C13088o<? super Density, ? super Constraints, int[]> oVar, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, float f, float f2, Function1<? super LazyStaggeredGridScope, C11921v> function1, Composer composer, int i, int i2, int i3) {
        Modifier.Companion companion;
        PaddingValues paddingValues2;
        boolean z3;
        FlingBehavior flingBehavior2;
        int i4;
        boolean z4;
        float f3;
        float f4;
        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
        Orientation orientation2 = orientation;
        Function1<? super LazyStaggeredGridScope, C11921v> function12 = function1;
        int i5 = i2;
        int i6 = i3;
        C12775o.m28639i(lazyStaggeredGridState2, "state");
        C12775o.m28639i(orientation2, "orientation");
        C12775o.m28639i(oVar, "slotSizesSums");
        C12775o.m28639i(function12, "content");
        Composer startRestartGroup = composer.startRestartGroup(1320541636);
        if ((i6 & 8) != 0) {
            companion = Modifier.Companion;
        } else {
            companion = modifier;
        }
        if ((i6 & 16) != 0) {
            paddingValues2 = PaddingKt.m33261PaddingValues0680j_4(C1232Dp.m38468constructorimpl((float) 0));
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i6 & 32) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i6 & 64) != 0) {
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
            i4 = i & -3670017;
        } else {
            flingBehavior2 = flingBehavior;
            i4 = i;
        }
        if ((i6 & 128) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        if ((i6 & 256) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f3 = f;
        }
        if ((i6 & 512) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f4 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1320541636, i4, i5, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(startRestartGroup, 6);
        LazyStaggeredGridItemProvider rememberStaggeredGridItemProvider = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider(lazyStaggeredGridState2, function12, startRestartGroup, ((i5 << 3) & 112) | 8);
        int i7 = i4 >> 6;
        int i8 = i4 >> 9;
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = rememberStaggeredGridItemProvider;
        int i9 = i4;
        boolean z5 = z3;
        Modifier modifier2 = companion;
        Composer composer2 = startRestartGroup;
        C13088o<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> r8 = LazyStaggeredGridMeasurePolicyKt.m33560rememberStaggeredGridMeasurePolicynbWgWpA(lazyStaggeredGridState, rememberStaggeredGridItemProvider, paddingValues2, z3, orientation, f3, f4, oVar, startRestartGroup, (i7 & 7168) | (i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 8 | ((i4 << 9) & 57344) | (i8 & 458752) | (i8 & 3670016) | ((i4 << 15) & 29360128));
        LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState2, z5, composer2, ((i9 >> 12) & 112) | 8);
        ScrollPositionUpdater(lazyStaggeredGridItemProvider, lazyStaggeredGridState2, composer2, 64);
        OverscrollEffect overscrollEffect2 = overscrollEffect;
        LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
        Orientation orientation3 = orientation;
        boolean z6 = z4;
        FlingBehavior flingBehavior3 = flingBehavior2;
        LazyLayoutKt.LazyLayout(lazyStaggeredGridItemProvider, LazyLayoutSemanticsKt.lazyLayoutSemantics(ScrollableKt.scrollable(OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifier2.then(lazyStaggeredGridState.getRemeasurementModifier$foundation_release()), orientation2), overscrollEffect2), lazyStaggeredGridState3, orientation3, overscrollEffect2, z6, scrollableDefaults.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z5), flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource$foundation_release()), lazyStaggeredGridItemProvider, rememberLazyStaggeredGridSemanticState, orientation, z6, z5, composer2, ((i9 << 6) & 7168) | (i8 & 57344) | (i9 & 458752)), lazyStaggeredGridState.getPrefetchState$foundation_release(), r8, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            LazyStaggeredGridKt$LazyStaggeredGrid$1 lazyStaggeredGridKt$LazyStaggeredGrid$1 = r0;
            LazyStaggeredGridKt$LazyStaggeredGrid$1 lazyStaggeredGridKt$LazyStaggeredGrid$12 = new LazyStaggeredGridKt$LazyStaggeredGrid$1(lazyStaggeredGridState, orientation, oVar, modifier2, paddingValues2, z5, flingBehavior2, z4, f3, f4, function1, i, i2, i3);
            endRestartGroup.updateScope(lazyStaggeredGridKt$LazyStaggeredGrid$1);
        }
    }

    /* access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(LazyLayoutItemProvider lazyLayoutItemProvider, LazyStaggeredGridState lazyStaggeredGridState, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(231106410);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231106410, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:114)");
        }
        if (lazyLayoutItemProvider.getItemCount() > 0) {
            lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyLayoutItemProvider);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyStaggeredGridKt$ScrollPositionUpdater$1(lazyLayoutItemProvider, lazyStaggeredGridState, i));
        }
    }
}
