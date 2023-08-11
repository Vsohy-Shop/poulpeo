package androidx.compose.foundation.lazy.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,122:1\n25#2:123\n25#2:130\n50#2:137\n49#2:138\n1114#3,6:124\n1114#3,6:131\n1114#3,6:139\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$1\n*L\n51#1:123\n54#1:130\n68#1:137\n68#1:138\n51#1:124,6\n54#1:131,6\n68#1:139,6\n*E\n"})
/* compiled from: LazyLayout.kt */
final class LazyLayoutKt$LazyLayout$1 extends C12777p implements C13089p<SaveableStateHolder, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<LazyLayoutItemProvider> $currentItemProvider;
    final /* synthetic */ C13088o<LazyLayoutMeasureScope, Constraints, MeasureResult> $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutKt$LazyLayout$1(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, C13088o<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> oVar, int i, State<? extends LazyLayoutItemProvider> state) {
        super(3);
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$modifier = modifier;
        this.$measurePolicy = oVar;
        this.$$dirty = i;
        this.$currentItemProvider = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SaveableStateHolder) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: of.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.saveable.SaveableStateHolder r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "saveableStateHolder"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0014
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)"
            r2 = 1342877611(0x500aafab, float:9.3070735E9)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r12, r0, r1)
        L_0x0014:
            androidx.compose.runtime.State<androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> r12 = r9.$currentItemProvider
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.Object r1 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r2.getEmpty()
            if (r1 != r3) goto L_0x0035
            androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 r3 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
            r3.<init>(r12)
            r1.<init>(r10, r3)
            r11.updateRememberedValue(r1)
        L_0x0035:
            r11.endReplaceableGroup()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r1 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory) r1
            r11.startReplaceableGroup(r0)
            java.lang.Object r10 = r11.rememberedValue()
            java.lang.Object r12 = r2.getEmpty()
            if (r10 != r12) goto L_0x0054
            androidx.compose.ui.layout.SubcomposeLayoutState r10 = new androidx.compose.ui.layout.SubcomposeLayoutState
            androidx.compose.foundation.lazy.layout.LazyLayoutItemReusePolicy r12 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemReusePolicy
            r12.<init>(r1)
            r10.<init>((androidx.compose.p002ui.layout.SubcomposeSlotReusePolicy) r12)
            r11.updateRememberedValue(r10)
        L_0x0054:
            r11.endReplaceableGroup()
            r3 = r10
            androidx.compose.ui.layout.SubcomposeLayoutState r3 = (androidx.compose.p002ui.layout.SubcomposeLayoutState) r3
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r10 = r9.$prefetchState
            r12 = -1523808544(0xffffffffa52c86e0, float:-1.4964319E-16)
            r11.startReplaceableGroup(r12)
            if (r10 != 0) goto L_0x0065
            goto L_0x0079
        L_0x0065:
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r10 = r9.$prefetchState
            int r12 = r9.$$dirty
            int r12 = r12 >> 6
            r12 = r12 & 14
            r12 = r12 | 64
            int r0 = androidx.compose.p002ui.layout.SubcomposeLayoutState.$stable
            int r0 = r0 << 6
            r12 = r12 | r0
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(r10, r1, r3, r11, r12)
            ef.v r10 = p336ef.C11921v.f18618a
        L_0x0079:
            r11.endReplaceableGroup()
            androidx.compose.ui.Modifier r4 = r9.$modifier
            of.o<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> r10 = r9.$measurePolicy
            r12 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r12)
            boolean r12 = r11.changed((java.lang.Object) r1)
            boolean r0 = r11.changed((java.lang.Object) r10)
            r12 = r12 | r0
            java.lang.Object r0 = r11.rememberedValue()
            if (r12 != 0) goto L_0x009b
            java.lang.Object r12 = r2.getEmpty()
            if (r0 != r12) goto L_0x00a3
        L_0x009b:
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1 r0 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
            r0.<init>(r1, r10)
            r11.updateRememberedValue(r0)
        L_0x00a3:
            r11.endReplaceableGroup()
            r5 = r0
            of.o r5 = (p404of.C13088o) r5
            int r10 = androidx.compose.p002ui.layout.SubcomposeLayoutState.$stable
            int r12 = r9.$$dirty
            r12 = r12 & 112(0x70, float:1.57E-43)
            r7 = r10 | r12
            r8 = 0
            r6 = r11
            androidx.compose.p002ui.layout.SubcomposeLayoutKt.SubcomposeLayout(r3, r4, r5, r6, r7, r8)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x00bf
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1.invoke(androidx.compose.runtime.saveable.SaveableStateHolder, androidx.compose.runtime.Composer, int):void");
    }
}
