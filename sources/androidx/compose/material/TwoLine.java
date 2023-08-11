package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n75#2,6:430\n81#2:462\n85#2:505\n75#3:436\n76#3,11:438\n75#3:469\n76#3,11:471\n89#3:499\n89#3:504\n76#4:437\n76#4:470\n460#5,13:449\n460#5,13:482\n473#5,3:496\n473#5,3:501\n51#6:463\n68#7,5:464\n73#7:495\n77#7:500\n154#8:506\n154#8:507\n154#8:508\n154#8:509\n154#8:510\n154#8:511\n154#8:512\n154#8:513\n154#8:514\n154#8:515\n154#8:516\n154#8:517\n154#8:518\n154#8:519\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n*L\n206#1:430,6\n206#1:462\n206#1:505\n206#1:436\n206#1:438,11\n211#1:469\n211#1:471,11\n211#1:499\n206#1:504\n206#1:437\n211#1:470\n206#1:449,13\n211#1:482,13\n211#1:496,3\n206#1:501,3\n214#1:463\n211#1:464,5\n211#1:495\n211#1:500\n175#1:506\n176#1:507\n179#1:508\n180#1:509\n181#1:510\n184#1:511\n185#1:512\n186#1:513\n187#1:514\n188#1:515\n189#1:516\n190#1:517\n191#1:518\n194#1:519\n*E\n"})
/* compiled from: ListItem.kt */
final class TwoLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    public static final TwoLine INSTANCE = new TwoLine();
    private static final float IconLeftPadding;
    private static final float IconMinPaddedWidth = C1232Dp.m38468constructorimpl((float) 40);
    private static final float IconVerticalPadding;
    private static final float MinHeight = C1232Dp.m38468constructorimpl((float) 64);
    private static final float MinHeightWithIcon = C1232Dp.m38468constructorimpl((float) 72);
    private static final float OverlineBaselineOffset = C1232Dp.m38468constructorimpl((float) 24);
    private static final float OverlineToPrimaryBaselineOffset;
    private static final float PrimaryBaselineOffsetNoIcon = C1232Dp.m38468constructorimpl((float) 28);
    private static final float PrimaryBaselineOffsetWithIcon = C1232Dp.m38468constructorimpl((float) 32);
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon;
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon;
    /* access modifiers changed from: private */
    public static final float TrailingRightPadding;

    static {
        float f = (float) 16;
        IconLeftPadding = C1232Dp.m38468constructorimpl(f);
        IconVerticalPadding = C1232Dp.m38468constructorimpl(f);
        ContentLeftPadding = C1232Dp.m38468constructorimpl(f);
        ContentRightPadding = C1232Dp.m38468constructorimpl(f);
        float f2 = (float) 20;
        OverlineToPrimaryBaselineOffset = C1232Dp.m38468constructorimpl(f2);
        PrimaryToSecondaryBaselineOffsetNoIcon = C1232Dp.m38468constructorimpl(f2);
        PrimaryToSecondaryBaselineOffsetWithIcon = C1232Dp.m38468constructorimpl(f2);
        TrailingRightPadding = C1232Dp.m38468constructorimpl(f);
    }

    private TwoLine() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ListItem(androidx.compose.p002ui.Modifier r33, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r34, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r35, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r36, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r37, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r32 = this;
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r40
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -1340612993(0xffffffffb017de7f, float:-5.5249666E-10)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r41 & 1
            r9 = 2
            if (r2 == 0) goto L_0x0025
            r10 = r8 | 6
            r11 = r10
            r10 = r33
            goto L_0x0039
        L_0x0025:
            r10 = r8 & 14
            if (r10 != 0) goto L_0x0036
            r10 = r33
            boolean r11 = r1.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0033
            r11 = 4
            goto L_0x0034
        L_0x0033:
            r11 = r9
        L_0x0034:
            r11 = r11 | r8
            goto L_0x0039
        L_0x0036:
            r10 = r33
            r11 = r8
        L_0x0039:
            r12 = r41 & 2
            if (r12 == 0) goto L_0x0040
            r11 = r11 | 48
            goto L_0x0050
        L_0x0040:
            r12 = r8 & 112(0x70, float:1.57E-43)
            if (r12 != 0) goto L_0x0050
            boolean r12 = r1.changedInstance(r3)
            if (r12 == 0) goto L_0x004d
            r12 = 32
            goto L_0x004f
        L_0x004d:
            r12 = 16
        L_0x004f:
            r11 = r11 | r12
        L_0x0050:
            r12 = r41 & 4
            if (r12 == 0) goto L_0x0057
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r12 = r8 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x0067
            boolean r12 = r1.changedInstance(r4)
            if (r12 == 0) goto L_0x0064
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r11 = r11 | r12
        L_0x0067:
            r12 = r41 & 8
            if (r12 == 0) goto L_0x006e
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r12 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007e
            boolean r12 = r1.changedInstance(r5)
            if (r12 == 0) goto L_0x007b
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r11 = r11 | r12
        L_0x007e:
            r12 = r41 & 16
            if (r12 == 0) goto L_0x0085
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0085:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0097
            boolean r12 = r1.changedInstance(r6)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r11 = r11 | r12
        L_0x0097:
            r12 = r41 & 32
            if (r12 == 0) goto L_0x009f
            r12 = 196608(0x30000, float:2.75506E-40)
        L_0x009d:
            r11 = r11 | r12
            goto L_0x00b0
        L_0x009f:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00b0
            boolean r12 = r1.changedInstance(r7)
            if (r12 == 0) goto L_0x00ad
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009d
        L_0x00ad:
            r12 = 65536(0x10000, float:9.18355E-41)
            goto L_0x009d
        L_0x00b0:
            r12 = r41 & 64
            if (r12 == 0) goto L_0x00ba
            r12 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 | r12
            r15 = r32
            goto L_0x00cd
        L_0x00ba:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r8
            r15 = r32
            if (r12 != 0) goto L_0x00cd
            boolean r12 = r1.changed((java.lang.Object) r15)
            if (r12 == 0) goto L_0x00ca
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r11 = r11 | r12
        L_0x00cd:
            r14 = r11
            r11 = 2995931(0x2db6db, float:4.198194E-39)
            r11 = r11 & r14
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r12) goto L_0x00e4
            boolean r11 = r1.getSkipping()
            if (r11 != 0) goto L_0x00de
            goto L_0x00e4
        L_0x00de:
            r1.skipToGroupEnd()
            r2 = r10
            goto L_0x035a
        L_0x00e4:
            if (r2 == 0) goto L_0x00e9
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00ea
        L_0x00e9:
            r2 = r10
        L_0x00ea:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x00f6
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.TwoLine.ListItem (ListItem.kt:196)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r10, r11)
        L_0x00f6:
            if (r3 != 0) goto L_0x00fb
            float r0 = MinHeight
            goto L_0x00fd
        L_0x00fb:
            float r0 = MinHeightWithIcon
        L_0x00fd:
            r10 = 0
            r11 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.m33326heightInVpY3zN4$default(r2, r0, r10, r9, r11)
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.startReplaceableGroup(r11)
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r11 = r11.getStart()
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r13 = r12.getTop()
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r11, r13, r1, r9)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r13)
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r13 = r1.consume(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.p002ui.unit.Density) r13
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r9 = r1.consume(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p002ui.unit.LayoutDirection) r9
            r23 = r2
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r2 = r1.consume(r2)
            androidx.compose.ui.platform.ViewConfiguration r2 = (androidx.compose.p002ui.platform.ViewConfiguration) r2
            androidx.compose.ui.node.ComposeUiNode$Companion r24 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r8 = r24.getConstructor()
            of.p r10 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r10)
            androidx.compose.runtime.Applier r15 = r1.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0155
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0155:
            r1.startReusableNode()
            boolean r15 = r1.getInserting()
            if (r15 == 0) goto L_0x0162
            r1.createNode(r8)
            goto L_0x0165
        L_0x0162:
            r1.useNode()
        L_0x0165:
            r1.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r15 = r24.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r11, r15)
            of.o r11 = r24.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r13, r11)
            of.o r11 = r24.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r9, r11)
            of.o r9 = r24.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r2, r9)
            r1.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.invoke(r2, r1, r9)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r2)
            androidx.compose.foundation.layout.RowScopeInstance r15 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 2
            r20 = 0
            r16 = r8
            androidx.compose.ui.Modifier r25 = androidx.compose.foundation.layout.RowScope.weight$default(r15, r16, r17, r18, r19, r20)
            float r26 = ContentLeftPadding
            r27 = 0
            float r28 = ContentRightPadding
            r29 = 0
            r30 = 10
            r31 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.PaddingKt.m33272paddingqDBjuR0$default(r25, r26, r27, r28, r29, r30, r31)
            r9 = -269995367(0xffffffffefe83299, float:-1.4372338E29)
            r1.startReplaceableGroup(r9)
            if (r3 == 0) goto L_0x02a0
            float r9 = IconLeftPadding
            float r11 = IconMinPaddedWidth
            float r11 = r11 + r9
            float r17 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r11)
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r16 = r8
            r18 = r0
            androidx.compose.ui.Modifier r15 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r16, r17, r18, r19, r20, r21, r22)
            float r19 = IconVerticalPadding
            r18 = 0
            r20 = 4
            r21 = 0
            r16 = r9
            r17 = r19
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.PaddingKt.m33272paddingqDBjuR0$default(r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.ui.Alignment r9 = r12.getTopStart()
            r11 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.startReplaceableGroup(r11)
            r11 = 6
            r12 = 0
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r9, r12, r1, r11)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r11)
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r11 = r1.consume(r11)
            androidx.compose.ui.unit.Density r11 = (androidx.compose.p002ui.unit.Density) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r12 = r1.consume(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p002ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r13 = r1.consume(r13)
            androidx.compose.ui.platform.ViewConfiguration r13 = (androidx.compose.p002ui.platform.ViewConfiguration) r13
            of.a r15 = r24.getConstructor()
            of.p r8 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r8)
            androidx.compose.runtime.Applier r2 = r1.getApplier()
            boolean r2 = r2 instanceof androidx.compose.runtime.Applier
            if (r2 != 0) goto L_0x023b
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x023b:
            r1.startReusableNode()
            boolean r2 = r1.getInserting()
            if (r2 == 0) goto L_0x0248
            r1.createNode(r15)
            goto L_0x024b
        L_0x0248:
            r1.useNode()
        L_0x024b:
            r1.disableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r15 = r24.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r9, r15)
            of.o r9 = r24.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r11, r9)
            of.o r9 = r24.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r12, r9)
            of.o r9 = r24.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r13, r9)
            r1.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            r9 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r8.invoke(r2, r1, r11)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r2)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r2 = r14 >> 3
            r2 = r2 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.invoke(r1, r2)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
        L_0x02a0:
            r1.endReplaceableGroup()
            r2 = 1
            if (r6 == 0) goto L_0x02dd
            r8 = -269994745(0xffffffffefe83507, float:-1.4372926E29)
            r1.startReplaceableGroup(r8)
            r8 = 2
            androidx.compose.ui.unit.Dp[] r8 = new androidx.compose.p002ui.unit.C1232Dp[r8]
            float r9 = OverlineBaselineOffset
            androidx.compose.ui.unit.Dp r9 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r9)
            r11 = 0
            r8[r11] = r9
            float r9 = OverlineToPrimaryBaselineOffset
            androidx.compose.ui.unit.Dp r9 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r9)
            r8[r2] = r9
            java.util.List r9 = kotlin.collections.C12726w.m28527n(r8)
            androidx.compose.material.TwoLine$ListItem$1$2 r8 = new androidx.compose.material.TwoLine$ListItem$1$2
            r8.<init>(r6, r14, r4)
            r11 = -1675021441(0xffffffff9c29337f, float:-5.5983967E-22)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r11, r2, r8)
            r13 = 390(0x186, float:5.47E-43)
            r8 = 0
            r12 = r1
            r15 = r14
            r14 = r8
            androidx.compose.material.ListItemKt.BaselinesOffsetColumn(r9, r10, r11, r12, r13, r14)
            r1.endReplaceableGroup()
            goto L_0x031c
        L_0x02dd:
            r15 = r14
            r8 = -269994465(0xffffffffefe8361f, float:-1.437319E29)
            r1.startReplaceableGroup(r8)
            r8 = 2
            androidx.compose.ui.unit.Dp[] r8 = new androidx.compose.p002ui.unit.C1232Dp[r8]
            if (r3 == 0) goto L_0x02ec
            float r9 = PrimaryBaselineOffsetWithIcon
            goto L_0x02ee
        L_0x02ec:
            float r9 = PrimaryBaselineOffsetNoIcon
        L_0x02ee:
            androidx.compose.ui.unit.Dp r9 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r9)
            r11 = 0
            r8[r11] = r9
            if (r3 == 0) goto L_0x02fa
            float r9 = PrimaryToSecondaryBaselineOffsetWithIcon
            goto L_0x02fc
        L_0x02fa:
            float r9 = PrimaryToSecondaryBaselineOffsetNoIcon
        L_0x02fc:
            androidx.compose.ui.unit.Dp r9 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r9)
            r8[r2] = r9
            java.util.List r9 = kotlin.collections.C12726w.m28527n(r8)
            androidx.compose.material.TwoLine$ListItem$1$3 r8 = new androidx.compose.material.TwoLine$ListItem$1$3
            r8.<init>(r4, r15, r5)
            r11 = 993836488(0x3b3cbdc8, float:0.0028799642)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r11, r2, r8)
            r13 = 384(0x180, float:5.38E-43)
            r14 = 0
            r12 = r1
            androidx.compose.material.ListItemKt.BaselinesOffsetColumn(r9, r10, r11, r12, r13, r14)
            r1.endReplaceableGroup()
        L_0x031c:
            r8 = -2000988345(0xffffffff88bb5747, float:-1.1275172E-33)
            r1.startReplaceableGroup(r8)
            if (r7 == 0) goto L_0x0340
            if (r3 == 0) goto L_0x0329
            float r8 = PrimaryBaselineOffsetWithIcon
            goto L_0x032b
        L_0x0329:
            float r8 = PrimaryBaselineOffsetNoIcon
        L_0x032b:
            r9 = r8
            r10 = 0
            androidx.compose.material.TwoLine$ListItem$1$4 r8 = new androidx.compose.material.TwoLine$ListItem$1$4
            r8.<init>(r0, r7, r15)
            r0 = -1696992176(0xffffffff9ad9f450, float:-9.0143805E-23)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r2, r8)
            r13 = 384(0x180, float:5.38E-43)
            r14 = 2
            r12 = r1
            androidx.compose.material.ListItemKt.m34037OffsetToBaselineOrCenterKz89ssw(r9, r10, r11, r12, r13, r14)
        L_0x0340:
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0358
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0358:
            r2 = r23
        L_0x035a:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x0361
            goto L_0x037a
        L_0x0361:
            androidx.compose.material.TwoLine$ListItem$2 r11 = new androidx.compose.material.TwoLine$ListItem$2
            r0 = r11
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r40
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.updateScope(r11)
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TwoLine.ListItem(androidx.compose.ui.Modifier, of.o, of.o, of.o, of.o, of.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
