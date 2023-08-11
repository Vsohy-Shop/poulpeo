package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,243:1\n76#2:244\n76#2:259\n76#2:292\n76#2:337\n36#3:245\n460#3,13:271\n460#3,13:304\n473#3,3:318\n36#3:323\n460#3,13:349\n473#3,3:363\n473#3,3:368\n1114#4,6:246\n1114#4,6:324\n67#5,6:252\n73#5:284\n77#5:372\n75#6:258\n76#6,11:260\n75#6:291\n76#6,11:293\n89#6:321\n75#6:336\n76#6,11:338\n89#6:366\n89#6:371\n75#7,6:285\n81#7:317\n85#7:322\n75#7,6:330\n81#7:362\n85#7:367\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n*L\n184#1:244\n197#1:259\n212#1:292\n216#1:337\n190#1:245\n197#1:271,13\n212#1:304,13\n212#1:318,3\n218#1:323\n216#1:349,13\n216#1:363,3\n197#1:368,3\n190#1:246,6\n218#1:324,6\n197#1:252,6\n197#1:284\n197#1:372\n197#1:258\n197#1:260,11\n212#1:291\n212#1:293,11\n212#1:321\n216#1:336\n216#1:338,11\n216#1:366\n197#1:371\n212#1:285,6\n212#1:317\n212#1:322\n216#1:330,6\n216#1:362\n216#1:367\n*E\n"})
/* compiled from: SwipeToDismiss.kt */
final class SwipeToDismissKt$SwipeToDismiss$2 extends C12777p implements C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $dismissContent;
    final /* synthetic */ Function1<DismissDirection, ThresholdConfig> $dismissThresholds;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeToDismissKt$SwipeToDismiss$2(Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, int i, DismissState dismissState, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar2) {
        super(3);
        this.$directions = set;
        this.$dismissThresholds = function1;
        this.$$dirty = i;
        this.$state = dismissState;
        this.$background = pVar;
        this.$dismissContent = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: of.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C12775o.m28639i(r1, r4)
            r4 = r3 & 14
            if (r4 != 0) goto L_0x001c
            boolean r4 = r2.changed((java.lang.Object) r1)
            if (r4 == 0) goto L_0x0019
            r4 = 4
            goto L_0x001a
        L_0x0019:
            r4 = 2
        L_0x001a:
            r4 = r4 | r3
            goto L_0x001d
        L_0x001c:
            r4 = r3
        L_0x001d:
            r4 = r4 & 91
            r5 = 18
            if (r4 != r5) goto L_0x002f
            boolean r4 = r22.getSkipping()
            if (r4 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r22.skipToGroupEnd()
            goto L_0x0384
        L_0x002f:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x003e
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)"
            r6 = 338007641(0x14259659, float:8.360022E-27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r3, r4, r5)
        L_0x003e:
            long r3 = r21.m33222getConstraintsmsEJaDk()
            int r1 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r3)
            float r1 = (float) r1
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r3 = r2.consume(r3)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L_0x0057
            r12 = r5
            goto L_0x0058
        L_0x0057:
            r12 = r6
        L_0x0058:
            ef.l[] r3 = new p336ef.C11906l[r5]
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            androidx.compose.material.DismissValue r7 = androidx.compose.material.DismissValue.Default
            ef.l r4 = p336ef.C11915r.m25707a(r4, r7)
            r3[r6] = r4
            java.util.Map r9 = kotlin.collections.C12716r0.m28420k(r3)
            java.util.Set<androidx.compose.material.DismissDirection> r3 = r0.$directions
            androidx.compose.material.DismissDirection r4 = androidx.compose.material.DismissDirection.StartToEnd
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x008a
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            androidx.compose.material.DismissValue r8 = androidx.compose.material.DismissValue.DismissedToEnd
            ef.l r3 = p336ef.C11915r.m25707a(r3, r8)
            java.lang.Object r8 = r3.mo49111c()
            java.lang.Object r3 = r3.mo49112d()
            r9.put(r8, r3)
        L_0x008a:
            java.util.Set<androidx.compose.material.DismissDirection> r3 = r0.$directions
            androidx.compose.material.DismissDirection r8 = androidx.compose.material.DismissDirection.EndToStart
            boolean r3 = r3.contains(r8)
            if (r3 == 0) goto L_0x00aa
            float r3 = -r1
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.material.DismissValue r10 = androidx.compose.material.DismissValue.DismissedToStart
            ef.l r3 = p336ef.C11915r.m25707a(r3, r10)
            java.lang.Object r10 = r3.mo49111c()
            java.lang.Object r3 = r3.mo49112d()
            r9.put(r10, r3)
        L_0x00aa:
            kotlin.jvm.functions.Function1<androidx.compose.material.DismissDirection, androidx.compose.material.ThresholdConfig> r3 = r0.$dismissThresholds
            r15 = 1157296644(0x44faf204, float:2007.563)
            r2.startReplaceableGroup(r15)
            boolean r10 = r2.changed((java.lang.Object) r3)
            java.lang.Object r11 = r22.rememberedValue()
            if (r10 != 0) goto L_0x00c4
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L_0x00cc
        L_0x00c4:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 r11 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
            r11.<init>(r3)
            r2.updateRememberedValue(r11)
        L_0x00cc:
            r22.endReplaceableGroup()
            r14 = r11
            of.o r14 = (p404of.C13088o) r14
            java.util.Set<androidx.compose.material.DismissDirection> r3 = r0.$directions
            boolean r3 = r3.contains(r8)
            r8 = 1092616192(0x41200000, float:10.0)
            r10 = 1101004800(0x41a00000, float:20.0)
            if (r3 == 0) goto L_0x00e0
            r3 = r8
            goto L_0x00e1
        L_0x00e0:
            r3 = r10
        L_0x00e1:
            java.util.Set<androidx.compose.material.DismissDirection> r11 = r0.$directions
            boolean r4 = r11.contains(r4)
            if (r4 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r8 = r10
        L_0x00eb:
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.gestures.Orientation r10 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.material.DismissState r11 = r0.$state
            java.lang.Object r11 = r11.getCurrentValue()
            if (r11 != r7) goto L_0x00f9
            r11 = r5
            goto L_0x00fa
        L_0x00f9:
            r11 = r6
        L_0x00fa:
            androidx.compose.material.ResistanceConfig r5 = new androidx.compose.material.ResistanceConfig
            r5.<init>(r1, r3, r8)
            androidx.compose.material.DismissState r8 = r0.$state
            r13 = 0
            r16 = 0
            r17 = 288(0x120, float:4.04E-43)
            r18 = 0
            r7 = r4
            r1 = r15
            r15 = r5
            androidx.compose.ui.Modifier r3 = androidx.compose.material.SwipeableKt.m34140swipeablepPrIpRY$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            of.p<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r5 = r0.$background
            int r7 = r0.$$dirty
            androidx.compose.material.DismissState r8 = r0.$state
            of.p<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r9 = r0.$dismissContent
            r10 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r10)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r11 = r10.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r11, r6, r2, r6)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r12)
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.p002ui.unit.Density) r13
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r14 = r2.consume(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p002ui.unit.LayoutDirection) r14
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.ui.platform.ViewConfiguration r15 = (androidx.compose.p002ui.platform.ViewConfiguration) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r1 = r16.getConstructor()
            of.p r3 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r3)
            androidx.compose.runtime.Applier r12 = r22.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x0160
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0160:
            r22.startReusableNode()
            boolean r12 = r22.getInserting()
            if (r12 == 0) goto L_0x016d
            r2.createNode(r1)
            goto L_0x0170
        L_0x016d:
            r22.useNode()
        L_0x0170:
            r22.disableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.m35292constructorimpl(r22)
            of.o r12 = r16.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r11, r12)
            of.o r11 = r16.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r13, r11)
            of.o r11 = r16.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r14, r11)
            of.o r11 = r16.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r15, r11)
            r22.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r22)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.invoke(r1, r2, r6)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.ui.Modifier r3 = r3.matchParentSize(r4)
            int r6 = r7 >> 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.startReplaceableGroup(r11)
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r13 = r12.getStart()
            androidx.compose.ui.Alignment$Vertical r14 = r10.getTop()
            int r15 = r6 >> 3
            r18 = r15 & 14
            r15 = r15 & 112(0x70, float:1.57E-43)
            r15 = r18 | r15
            androidx.compose.ui.layout.MeasurePolicy r13 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r13, r14, r2, r15)
            int r14 = r6 << 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r15)
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.ui.unit.Density r15 = (androidx.compose.p002ui.unit.Density) r15
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p002ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r1 = r2.consume(r1)
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.p002ui.platform.ViewConfiguration) r1
            of.a r0 = r16.getConstructor()
            of.p r3 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r3)
            int r14 = r14 << 9
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 | 6
            r19 = r9
            androidx.compose.runtime.Applier r9 = r22.getApplier()
            boolean r9 = r9 instanceof androidx.compose.runtime.Applier
            if (r9 != 0) goto L_0x0214
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0214:
            r22.startReusableNode()
            boolean r9 = r22.getInserting()
            if (r9 == 0) goto L_0x0221
            r2.createNode(r0)
            goto L_0x0224
        L_0x0221:
            r22.useNode()
        L_0x0224:
            r22.disableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.m35292constructorimpl(r22)
            of.o r9 = r16.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r13, r9)
            of.o r9 = r16.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r15, r9)
            of.o r9 = r16.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r11, r9)
            of.o r9 = r16.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r1, r9)
            r22.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r22)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            int r1 = r14 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.invoke(r0, r2, r1)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            int r1 = r6 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.invoke(r0, r2, r1)
            r22.endReplaceableGroup()
            r22.endNode()
            r22.endReplaceableGroup()
            r22.endReplaceableGroup()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r2.startReplaceableGroup(r1)
            boolean r1 = r2.changed((java.lang.Object) r8)
            java.lang.Object r3 = r22.rememberedValue()
            if (r1 != 0) goto L_0x0296
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x029e
        L_0x0296:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1 r3 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
            r3.<init>(r8)
            r2.updateRememberedValue(r3)
        L_0x029e:
            r22.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.OffsetKt.offset(r4, r3)
            int r3 = r7 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.startReplaceableGroup(r4)
            androidx.compose.foundation.layout.Arrangement$Horizontal r4 = r12.getStart()
            androidx.compose.ui.Alignment$Vertical r5 = r10.getTop()
            int r6 = r3 >> 3
            r7 = r6 & 14
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r4, r5, r2, r6)
            int r5 = r3 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.p002ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p002ui.unit.LayoutDirection) r7
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r8 = r2.consume(r8)
            androidx.compose.ui.platform.ViewConfiguration r8 = (androidx.compose.p002ui.platform.ViewConfiguration) r8
            of.a r9 = r16.getConstructor()
            of.p r1 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r1)
            int r5 = r5 << 9
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | 6
            androidx.compose.runtime.Applier r10 = r22.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x0305
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0305:
            r22.startReusableNode()
            boolean r10 = r22.getInserting()
            if (r10 == 0) goto L_0x0312
            r2.createNode(r9)
            goto L_0x0315
        L_0x0312:
            r22.useNode()
        L_0x0315:
            r22.disableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m35292constructorimpl(r22)
            of.o r10 = r16.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r4, r10)
            of.o r4 = r16.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r6, r4)
            of.o r4 = r16.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r7, r4)
            of.o r4 = r16.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r8, r4)
            r22.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r22)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            int r5 = r5 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.invoke(r4, r2, r5)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r1)
            int r1 = r3 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = r19
            r3.invoke(r0, r2, r1)
            r22.endReplaceableGroup()
            r22.endNode()
            r22.endReplaceableGroup()
            r22.endReplaceableGroup()
            r22.endReplaceableGroup()
            r22.endNode()
            r22.endReplaceableGroup()
            r22.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0384
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
