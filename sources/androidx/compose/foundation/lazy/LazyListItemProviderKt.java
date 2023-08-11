package androidx.compose.foundation.lazy;

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

@SourceDebugExtension({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n1114#3,6:105\n1114#3,6:113\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:104\n51#1:111\n51#1:112\n46#1:105,6\n51#1:113,6\n*E\n"})
/* compiled from: LazyListItemProvider.kt */
public final class LazyListItemProviderKt {
    private static final int NearestItemsExtraItemCount = 100;
    private static final int NearestItemsSlidingWindowSize = 30;

    @ExperimentalFoundationApi
    @Composable
    public static final LazyListItemProvider rememberLazyListItemProvider(LazyListState lazyListState, Function1<? super LazyListScope, C11921v> function1, Composer composer, int i) {
        C12775o.m28639i(lazyListState, "state");
        C12775o.m28639i(function1, "content");
        composer.startReplaceableGroup(1939491467);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1939491467, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider (LazyListItemProvider.kt:39)");
        }
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) lazyListState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C0527xefb4e56c(lazyListState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State<C13528f> rememberLazyNearestItemsRangeState = LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState((C13074a) rememberedValue, C0528x12e58ca0.INSTANCE, C0529x12e58ca1.INSTANCE, composer, 432);
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed((Object) rememberLazyNearestItemsRangeState) | composer.changed((Object) lazyListState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LazyListItemProviderKt$rememberLazyListItemProvider$1$1(SnapshotStateKt.derivedStateOf(new C0526x3addb60b(rememberUpdatedState, rememberLazyNearestItemsRangeState, new LazyItemScopeImpl(), lazyListState)));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        LazyListItemProviderKt$rememberLazyListItemProvider$1$1 lazyListItemProviderKt$rememberLazyListItemProvider$1$1 = (LazyListItemProviderKt$rememberLazyListItemProvider$1$1) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyListItemProviderKt$rememberLazyListItemProvider$1$1;
    }
}
