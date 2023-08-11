package androidx.compose.material;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,517:1\n474#2,4:518\n478#2,2:526\n482#2:532\n25#3:522\n50#3:533\n49#3:534\n1114#4,3:523\n1117#4,3:529\n1114#4,6:535\n474#5:528\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n*L\n247#1:518,4\n247#1:526,2\n247#1:532\n247#1:522\n248#1:533\n248#1:534\n247#1:523,3\n247#1:529,3\n248#1:535,6\n247#1:528\n*E\n"})
/* compiled from: TabRow.kt */
final class TabRowKt$ScrollableTabRow$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ C13089p<List<TabPosition>, Composer, Integer, C11921v> $indicator;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabRowKt$ScrollableTabRow$2(float f, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, int i, C13089p<? super List<TabPosition>, ? super Composer, ? super Integer, C11921v> pVar, int i2) {
        super(2);
        this.$edgePadding = f;
        this.$tabs = oVar;
        this.$divider = oVar2;
        this.$selectedTabIndex = i;
        this.$indicator = pVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.compose.material.ScrollableTabData} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r2 & 11
            r4 = 2
            if (r3 != r4) goto L_0x0017
            boolean r3 = r19.getSkipping()
            if (r3 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r19.skipToGroupEnd()
            goto L_0x00cd
        L_0x0017:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0026
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)"
            r6 = 1455860572(0x56c6ab5c, float:1.09219643E14)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r3, r5)
        L_0x0026:
            r2 = 0
            r3 = 1
            androidx.compose.foundation.ScrollState r6 = androidx.compose.foundation.ScrollKt.rememberScrollState(r2, r1, r2, r3)
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.startReplaceableGroup(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r5)
            java.lang.Object r5 = r19.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r7.getEmpty()
            if (r5 != r8) goto L_0x0053
            hf.h r5 = p355hf.C12085h.f18916b
            yf.l0 r5 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r5, r1)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r8 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r8.<init>(r5)
            r1.updateRememberedValue(r8)
            r5 = r8
        L_0x0053:
            r19.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r5 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r5
            yf.l0 r5 = r5.getCoroutineScope()
            r19.endReplaceableGroup()
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.startReplaceableGroup(r8)
            boolean r8 = r1.changed((java.lang.Object) r6)
            boolean r9 = r1.changed((java.lang.Object) r5)
            r8 = r8 | r9
            java.lang.Object r9 = r19.rememberedValue()
            if (r8 != 0) goto L_0x007a
            java.lang.Object r7 = r7.getEmpty()
            if (r9 != r7) goto L_0x0082
        L_0x007a:
            androidx.compose.material.ScrollableTabData r9 = new androidx.compose.material.ScrollableTabData
            r9.<init>(r6, r5)
            r1.updateRememberedValue(r9)
        L_0x0082:
            r19.endReplaceableGroup()
            r14 = r9
            androidx.compose.material.ScrollableTabData r14 = (androidx.compose.material.ScrollableTabData) r14
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r5, r7, r3, r8)
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r5 = r5.getCenterStart()
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r3, r5, r2, r4, r8)
            r7 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.ScrollKt.horizontalScroll$default(r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.p002ui.draw.ClipKt.clipToBounds(r3)
            androidx.compose.material.TabRowKt$ScrollableTabRow$2$1 r4 = new androidx.compose.material.TabRowKt$ScrollableTabRow$2$1
            float r11 = r0.$edgePadding
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r12 = r0.$tabs
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r13 = r0.$divider
            int r15 = r0.$selectedTabIndex
            of.p<java.util.List<androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r5 = r0.$indicator
            int r6 = r0.$$dirty
            r10 = r4
            r16 = r5
            r17 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.p002ui.layout.SubcomposeLayoutKt.SubcomposeLayout(r3, r4, r1, r2, r2)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00cd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt$ScrollableTabRow$2.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
