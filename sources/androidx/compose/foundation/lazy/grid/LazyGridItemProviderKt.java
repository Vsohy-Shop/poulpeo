package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n36#2:121\n36#2:128\n1114#3,6:122\n1114#3,6:129\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n47#1:121\n54#1:128\n47#1:122,6\n54#1:129,6\n*E\n"})
/* compiled from: LazyGridItemProvider.kt */
public final class LazyGridItemProviderKt {
    private static final int NearestItemsExtraItemCount = 200;
    private static final int NearestItemsSlidingWindowSize = 90;

    @ExperimentalFoundationApi
    @Composable
    public static final LazyGridItemProvider rememberLazyGridItemProvider(LazyGridState lazyGridState, Function1<? super LazyGridScope, C11921v> function1, Composer composer, int i) {
        C12775o.m28639i(lazyGridState, "state");
        C12775o.m28639i(function1, "content");
        composer.startReplaceableGroup(1831211759);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1831211759, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider (LazyGridItemProvider.kt:40)");
        }
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) lazyGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C0538xf96bda6c(lazyGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State<C13528f> rememberLazyNearestItemsRangeState = LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState((C13074a) rememberedValue, C0539x97d5c1a0.INSTANCE, C0540x97d5c1a1.INSTANCE, composer, 432);
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed((Object) rememberLazyNearestItemsRangeState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1(SnapshotStateKt.derivedStateOf(new C0537x9de1a10b(rememberUpdatedState, lazyGridState, rememberLazyNearestItemsRangeState)));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1 lazyGridItemProviderKt$rememberLazyGridItemProvider$1$1 = (LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridItemProviderKt$rememberLazyGridItemProvider$1$1;
    }
}
