package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.semantics.ScrollAxisRange;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12085h;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,151:1\n474#2,4:152\n478#2,2:160\n482#2:166\n25#3:156\n83#3,3:167\n1114#4,3:157\n1117#4,3:163\n1114#4,6:170\n474#5:162\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n47#1:152,4\n47#1:160,2\n47#1:166\n47#1:156\n49#1:167,3\n47#1:157,3\n47#1:163,3\n49#1:170,6\n47#1:162\n*E\n"})
/* compiled from: LazyLayoutSemantics.kt */
public final class LazyLayoutSemanticsKt {
    @Composable
    public static final Modifier lazyLayoutSemantics(Modifier modifier, LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2, Composer composer, int i) {
        boolean z3;
        LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1;
        C0557xf9da2eb9 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1;
        Modifier modifier2 = modifier;
        LazyLayoutItemProvider lazyLayoutItemProvider2 = lazyLayoutItemProvider;
        LazyLayoutSemanticState lazyLayoutSemanticState2 = lazyLayoutSemanticState;
        Orientation orientation2 = orientation;
        Composer composer2 = composer;
        C12775o.m28639i(modifier2, "<this>");
        C12775o.m28639i(lazyLayoutItemProvider2, "itemProvider");
        C12775o.m28639i(lazyLayoutSemanticState2, "state");
        C12775o.m28639i(orientation2, "orientation");
        composer2.startReplaceableGroup(290103779);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(290103779, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
        composer2.startReplaceableGroup(773894976);
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer2));
            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {lazyLayoutItemProvider2, lazyLayoutSemanticState2, orientation2, Boolean.valueOf(z)};
        composer2.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z4 |= composer2.changed(objArr[i2]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z4 || rememberedValue2 == Composer.Companion.getEmpty()) {
            if (orientation2 == Orientation.Vertical) {
                z3 = true;
            } else {
                z3 = false;
            }
            LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(lazyLayoutItemProvider2);
            ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new C0554x1761fe57(lazyLayoutSemanticState2), new C0555x1761fe58(lazyLayoutSemanticState2, lazyLayoutItemProvider2), z2);
            if (z) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(z3, coroutineScope, lazyLayoutSemanticState2);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = null;
            }
            if (z) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = new C0557xf9da2eb9(lazyLayoutItemProvider2, coroutineScope, lazyLayoutSemanticState2);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = null;
            }
            rememberedValue2 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1, z3, scrollAxisRange, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1, lazyLayoutSemanticState.collectionInfo()), 1, (Object) null);
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier2.then((Modifier) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
