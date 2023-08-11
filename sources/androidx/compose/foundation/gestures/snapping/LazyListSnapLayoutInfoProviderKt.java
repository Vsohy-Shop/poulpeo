package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n36#2:131\n1114#3,6:132\n1#4:138\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n110#1:131\n110#1:132,6\n*E\n"})
/* compiled from: LazyListSnapLayoutInfoProvider.kt */
public final class LazyListSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(LazyListState lazyListState, C13089p<? super Density, ? super Float, ? super Float, Float> pVar) {
        C12775o.m28639i(lazyListState, "lazyListState");
        C12775o.m28639i(pVar, "positionInLayout");
        return new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2(lazyListState, pVar);
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, C13089p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            pVar = LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyListState, pVar);
    }

    public static final float calculateDistanceToDesiredSnapPosition(Density density, LazyListLayoutInfo lazyListLayoutInfo, LazyListItemInfo lazyListItemInfo, C13089p<? super Density, ? super Float, ? super Float, Float> pVar) {
        C12775o.m28639i(density, "<this>");
        C12775o.m28639i(lazyListLayoutInfo, "layoutInfo");
        C12775o.m28639i(lazyListItemInfo, "item");
        C12775o.m28639i(pVar, "positionInLayout");
        return ((float) lazyListItemInfo.getOffset()) - pVar.invoke(density, Float.valueOf((float) ((getSingleAxisViewportSize(lazyListLayoutInfo) - lazyListLayoutInfo.getBeforeContentPadding()) - lazyListLayoutInfo.getAfterContentPadding())), Float.valueOf((float) lazyListItemInfo.getSize())).floatValue();
    }

    private static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        if (lazyListLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m38627getHeightimpl(lazyListLayoutInfo.m33411getViewportSizeYbymL2g());
        }
        return IntSize.m38628getWidthimpl(lazyListLayoutInfo.m33411getViewportSizeYbymL2g());
    }

    @ExperimentalFoundationApi
    @Composable
    public static final FlingBehavior rememberSnapFlingBehavior(LazyListState lazyListState, Composer composer, int i) {
        C12775o.m28639i(lazyListState, "lazyListState");
        composer.startReplaceableGroup(1148456277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1148456277, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:108)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) lazyListState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider$default(lazyListState, (C13089p) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior rememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSnapFlingBehavior;
    }
}
