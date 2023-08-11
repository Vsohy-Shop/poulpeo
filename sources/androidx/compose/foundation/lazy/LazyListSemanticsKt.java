package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n50#2:32\n49#2:33\n1114#3,6:34\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:32\n28#1:33\n28#1:34,6\n*E\n"})
/* compiled from: LazyListSemantics.kt */
public final class LazyListSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(LazyListState lazyListState, boolean z, Composer composer, int i) {
        C12775o.m28639i(lazyListState, "state");
        composer.startReplaceableGroup(596174919);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(596174919, i, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:23)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed((Object) valueOf) | composer.changed((Object) lazyListState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(lazyListState, z);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyLayoutSemanticState;
    }
}
