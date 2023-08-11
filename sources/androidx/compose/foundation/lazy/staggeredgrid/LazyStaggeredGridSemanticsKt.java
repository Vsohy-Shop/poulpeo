package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,50:1\n50#2:51\n49#2:52\n1114#3,6:53\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n*L\n32#1:51\n32#1:52\n32#1:53,6\n*E\n"})
/* compiled from: LazyStaggeredGridSemantics.kt */
public final class LazyStaggeredGridSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState(LazyStaggeredGridState lazyStaggeredGridState, boolean z, Composer composer, int i) {
        C12775o.m28639i(lazyStaggeredGridState, "state");
        composer.startReplaceableGroup(1629354903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629354903, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:27)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed((Object) valueOf) | composer.changed((Object) lazyStaggeredGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C0575x9388a700(lazyStaggeredGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C0575x9388a700 lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 = (C0575x9388a700) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1;
    }
}
