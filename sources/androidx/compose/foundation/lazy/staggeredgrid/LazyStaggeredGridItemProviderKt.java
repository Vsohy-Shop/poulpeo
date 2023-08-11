package androidx.compose.foundation.lazy.staggeredgrid;

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
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,73:1\n36#2:74\n1114#3,6:75\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n46#1:74\n46#1:75,6\n*E\n"})
/* compiled from: LazyStaggeredGridItemProvider.kt */
public final class LazyStaggeredGridItemProviderKt {
    @ExperimentalFoundationApi
    @Composable
    public static final LazyStaggeredGridItemProvider rememberStaggeredGridItemProvider(LazyStaggeredGridState lazyStaggeredGridState, Function1<? super LazyStaggeredGridScope, C11921v> function1, Composer composer, int i) {
        C12775o.m28639i(lazyStaggeredGridState, "state");
        C12775o.m28639i(function1, "content");
        composer.startReplaceableGroup(2039920307);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2039920307, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider (LazyStaggeredGridItemProvider.kt:35)");
        }
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 3) & 14);
        State<C13528f> rememberLazyNearestItemsRangeState = LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState(new C0569x4e564b57(lazyStaggeredGridState), C0570x4e564b58.INSTANCE, C0571x4e564b59.INSTANCE, composer, 432);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) lazyStaggeredGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C0564x329c90aa(SnapshotStateKt.derivedStateOf(new C0565x6d2c3253(rememberUpdatedState, rememberLazyNearestItemsRangeState, lazyStaggeredGridState)));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C0564x329c90aa lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1 = (C0564x329c90aa) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1;
    }
}
