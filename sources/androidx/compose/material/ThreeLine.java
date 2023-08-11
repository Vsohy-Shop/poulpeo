package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n75#2,6:430\n81#2:462\n85#2:506\n75#3:436\n76#3,11:438\n75#3:469\n76#3,11:471\n89#3:499\n89#3:505\n76#4:437\n76#4:470\n460#5,13:449\n460#5,13:482\n473#5,3:496\n473#5,3:502\n51#6:463\n58#6:501\n68#7,5:464\n73#7:495\n77#7:500\n154#8:507\n154#8:508\n154#8:509\n154#8:510\n154#8:511\n154#8:512\n154#8:513\n154#8:514\n154#8:515\n154#8:516\n154#8:517\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n*L\n303#1:430,6\n303#1:462\n303#1:506\n303#1:436\n303#1:438,11\n306#1:469\n306#1:471,11\n306#1:499\n303#1:505\n303#1:437\n306#1:470\n303#1:449,13\n306#1:482,13\n306#1:496,3\n303#1:502,3\n305#1:463\n332#1:501\n306#1:464,5\n306#1:495\n306#1:500\n276#1:507\n279#1:508\n280#1:509\n281#1:510\n284#1:511\n285#1:512\n286#1:513\n287#1:514\n288#1:515\n289#1:516\n292#1:517\n*E\n"})
/* compiled from: ListItem.kt */
final class ThreeLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    public static final ThreeLine INSTANCE = new ThreeLine();
    private static final float IconLeftPadding;
    private static final float IconMinPaddedWidth = C1232Dp.m38468constructorimpl((float) 40);
    private static final float IconThreeLineVerticalPadding;
    private static final float MinHeight = C1232Dp.m38468constructorimpl((float) 88);
    private static final float ThreeLineBaselineFirstOffset = C1232Dp.m38468constructorimpl((float) 28);
    private static final float ThreeLineBaselineSecondOffset;
    private static final float ThreeLineBaselineThirdOffset;
    private static final float ThreeLineTrailingTopPadding;
    private static final float TrailingRightPadding;

    static {
        float f = (float) 16;
        IconLeftPadding = C1232Dp.m38468constructorimpl(f);
        IconThreeLineVerticalPadding = C1232Dp.m38468constructorimpl(f);
        ContentLeftPadding = C1232Dp.m38468constructorimpl(f);
        ContentRightPadding = C1232Dp.m38468constructorimpl(f);
        float f2 = (float) 20;
        ThreeLineBaselineSecondOffset = C1232Dp.m38468constructorimpl(f2);
        ThreeLineBaselineThirdOffset = C1232Dp.m38468constructorimpl(f2);
        ThreeLineTrailingTopPadding = C1232Dp.m38468constructorimpl(f);
        TrailingRightPadding = C1232Dp.m38468constructorimpl(f);
    }

    private ThreeLine() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
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
            r13 = r38
            r14 = r40
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "secondaryText"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            r0 = 1749738797(0x684ae52d, float:3.8325823E24)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r41 & 1
            r7 = 2
            if (r2 == 0) goto L_0x002a
            r8 = r14 | 6
            r9 = r8
            r8 = r33
            goto L_0x003e
        L_0x002a:
            r8 = r14 & 14
            if (r8 != 0) goto L_0x003b
            r8 = r33
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0038
            r9 = 4
            goto L_0x0039
        L_0x0038:
            r9 = r7
        L_0x0039:
            r9 = r9 | r14
            goto L_0x003e
        L_0x003b:
            r8 = r33
            r9 = r14
        L_0x003e:
            r10 = r41 & 2
            if (r10 == 0) goto L_0x0045
            r9 = r9 | 48
            goto L_0x0055
        L_0x0045:
            r10 = r14 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x0055
            boolean r10 = r1.changedInstance(r3)
            if (r10 == 0) goto L_0x0052
            r10 = 32
            goto L_0x0054
        L_0x0052:
            r10 = 16
        L_0x0054:
            r9 = r9 | r10
        L_0x0055:
            r10 = r41 & 4
            if (r10 == 0) goto L_0x005c
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006c
            boolean r10 = r1.changedInstance(r4)
            if (r10 == 0) goto L_0x0069
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r10 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r9 = r9 | r10
        L_0x006c:
            r10 = r41 & 8
            if (r10 == 0) goto L_0x0073
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0083
            boolean r10 = r1.changedInstance(r5)
            if (r10 == 0) goto L_0x0080
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r9 = r9 | r10
        L_0x0083:
            r10 = r41 & 16
            if (r10 == 0) goto L_0x008a
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008a:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x009c
            boolean r10 = r1.changedInstance(r6)
            if (r10 == 0) goto L_0x0099
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r9 = r9 | r10
        L_0x009c:
            r10 = r41 & 32
            if (r10 == 0) goto L_0x00a4
            r10 = 196608(0x30000, float:2.75506E-40)
        L_0x00a2:
            r9 = r9 | r10
            goto L_0x00b5
        L_0x00a4:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00b5
            boolean r10 = r1.changedInstance(r13)
            if (r10 == 0) goto L_0x00b2
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a2
        L_0x00b2:
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a2
        L_0x00b5:
            r10 = r41 & 64
            if (r10 == 0) goto L_0x00bf
            r10 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 | r10
            r15 = r32
            goto L_0x00d2
        L_0x00bf:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r14
            r15 = r32
            if (r10 != 0) goto L_0x00d2
            boolean r10 = r1.changed((java.lang.Object) r15)
            if (r10 == 0) goto L_0x00cf
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r9 = r9 | r10
        L_0x00d2:
            r12 = r9
            r9 = 2995931(0x2db6db, float:4.198194E-39)
            r9 = r9 & r12
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r10) goto L_0x00e9
            boolean r9 = r1.getSkipping()
            if (r9 != 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            r1.skipToGroupEnd()
            r2 = r8
            goto L_0x0320
        L_0x00e9:
            if (r2 == 0) goto L_0x00ee
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00ef
        L_0x00ee:
            r2 = r8
        L_0x00ef:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x00fb
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:294)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r8, r9)
        L_0x00fb:
            float r0 = MinHeight
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33326heightInVpY3zN4$default(r2, r0, r8, r7, r9)
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.startReplaceableGroup(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.getStart()
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r10 = r9.getTop()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r8, r10, r1, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r10)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r7 = r1.consume(r7)
            androidx.compose.ui.unit.Density r7 = (androidx.compose.p002ui.unit.Density) r7
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r10 = r1.consume(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p002ui.unit.LayoutDirection) r10
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r11 = r1.consume(r11)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.p002ui.platform.ViewConfiguration) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            r18 = r2
            of.a r2 = r17.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r14 = r1.getApplier()
            boolean r14 = r14 instanceof androidx.compose.runtime.Applier
            if (r14 != 0) goto L_0x0155
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0155:
            r1.startReusableNode()
            boolean r14 = r1.getInserting()
            if (r14 == 0) goto L_0x0162
            r1.createNode(r2)
            goto L_0x0165
        L_0x0162:
            r1.useNode()
        L_0x0165:
            r1.disableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r14 = r17.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r8, r14)
            of.o r8 = r17.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r7, r8)
            of.o r7 = r17.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r10, r7)
            of.o r7 = r17.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r11, r7)
            r1.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r0.invoke(r2, r1, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.RowScopeInstance r19 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            r2 = -280382992(0xffffffffef49b1f0, float:-6.24216E28)
            r1.startReplaceableGroup(r2)
            if (r3 == 0) goto L_0x027c
            float r21 = IconLeftPadding
            float r2 = IconMinPaddedWidth
            float r2 = r21 + r2
            float r24 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r2)
            androidx.compose.ui.Modifier$Companion r22 = androidx.compose.p002ui.Modifier.Companion
            r25 = 0
            r26 = 0
            r27 = 12
            r28 = 0
            r23 = r24
            androidx.compose.ui.Modifier r20 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r22, r23, r24, r25, r26, r27, r28)
            float r24 = IconThreeLineVerticalPadding
            r23 = 0
            r25 = 4
            r26 = 0
            r22 = r24
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m33272paddingqDBjuR0$default(r20, r21, r22, r23, r24, r25, r26)
            androidx.compose.ui.Alignment r7 = r9.getCenterStart()
            r8 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.startReplaceableGroup(r8)
            r8 = 6
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r7, r9, r1, r8)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.p002ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r9 = r1.consume(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p002ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r10 = r1.consume(r10)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.p002ui.platform.ViewConfiguration) r10
            of.a r11 = r17.getConstructor()
            of.p r2 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r2)
            androidx.compose.runtime.Applier r14 = r1.getApplier()
            boolean r14 = r14 instanceof androidx.compose.runtime.Applier
            if (r14 != 0) goto L_0x021a
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x021a:
            r1.startReusableNode()
            boolean r14 = r1.getInserting()
            if (r14 == 0) goto L_0x0227
            r1.createNode(r11)
            goto L_0x022a
        L_0x0227:
            r1.useNode()
        L_0x022a:
            r1.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r14 = r17.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r7, r14)
            of.o r7 = r17.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r8, r7)
            of.o r7 = r17.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r9, r7)
            of.o r7 = r17.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r10, r7)
            r1.enableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r7 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r7)
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r2.invoke(r7, r1, r9)
            r1.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r0 = r12 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r1, r0)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
        L_0x027c:
            r1.endReplaceableGroup()
            r0 = 3
            androidx.compose.ui.unit.Dp[] r0 = new androidx.compose.p002ui.unit.C1232Dp[r0]
            float r2 = ThreeLineBaselineFirstOffset
            androidx.compose.ui.unit.Dp r7 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r2)
            r8 = 0
            r0[r8] = r7
            float r7 = ThreeLineBaselineSecondOffset
            androidx.compose.ui.unit.Dp r7 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r7)
            r8 = 1
            r0[r8] = r7
            float r7 = ThreeLineBaselineThirdOffset
            androidx.compose.ui.unit.Dp r7 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r7)
            r9 = 2
            r0[r9] = r7
            java.util.List r7 = kotlin.collections.C12726w.m28527n(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r23 = 2
            r24 = 0
            r20 = r0
            androidx.compose.ui.Modifier r25 = androidx.compose.foundation.layout.RowScope.weight$default(r19, r20, r21, r22, r23, r24)
            float r26 = ContentLeftPadding
            r27 = 0
            float r28 = ContentRightPadding
            r29 = 0
            r30 = 10
            r31 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.m33272paddingqDBjuR0$default(r25, r26, r27, r28, r29, r30, r31)
            androidx.compose.material.ThreeLine$ListItem$1$2 r10 = new androidx.compose.material.ThreeLine$ListItem$1$2
            r10.<init>(r6, r12, r4, r5)
            r11 = -318094245(0xffffffffed0a445b, float:-2.674473E27)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r11, r8, r10)
            r11 = 390(0x186, float:5.47E-43)
            r14 = 0
            r8 = r9
            r9 = r10
            r10 = r1
            r16 = r12
            r12 = r14
            androidx.compose.material.ListItemKt.BaselinesOffsetColumn(r7, r8, r9, r10, r11, r12)
            r7 = -678936717(0xffffffffd7883f73, float:-2.99612187E14)
            r1.startReplaceableGroup(r7)
            if (r13 == 0) goto L_0x0306
            float r22 = ThreeLineTrailingTopPadding
            float r2 = r2 - r22
            float r7 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r2)
            r21 = 0
            float r23 = TrailingRightPadding
            r24 = 0
            r25 = 9
            r26 = 0
            r20 = r0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.PaddingKt.m33272paddingqDBjuR0$default(r20, r21, r22, r23, r24, r25, r26)
            int r0 = r16 >> 9
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = r0 | 54
            r12 = 0
            r9 = r38
            r10 = r1
            androidx.compose.material.ListItemKt.m34037OffsetToBaselineOrCenterKz89ssw(r7, r8, r9, r10, r11, r12)
        L_0x0306:
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x031e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x031e:
            r2 = r18
        L_0x0320:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x0327
            goto L_0x0340
        L_0x0327:
            androidx.compose.material.ThreeLine$ListItem$2 r11 = new androidx.compose.material.ThreeLine$ListItem$2
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
        L_0x0340:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ThreeLine.ListItem(androidx.compose.ui.Modifier, of.o, of.o, of.o, of.o, of.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
