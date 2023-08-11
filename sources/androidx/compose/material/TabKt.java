package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,434:1\n25#2:435\n25#2:443\n25#2:451\n36#2:464\n456#2,11:494\n460#2,13:524\n473#2,3:538\n460#2,13:562\n473#2,3:576\n467#2,3:581\n1114#3,6:436\n1114#3,6:444\n1114#3,6:452\n1057#3,3:465\n1060#3,3:469\n76#4:442\n76#4:450\n76#4:458\n76#4:482\n76#4:512\n76#4:550\n66#5,5:459\n71#5:468\n74#5:472\n852#6,5:473\n71#7,4:478\n75#7,11:483\n75#7:511\n76#7,11:513\n89#7:541\n75#7:549\n76#7,11:551\n89#7:579\n88#7:584\n67#8,6:505\n73#8:537\n77#8:542\n67#8,6:543\n73#8:575\n77#8:580\n76#9:585\n154#10:586\n154#10:587\n154#10:588\n154#10:589\n154#10:590\n154#10:591\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n97#1:435\n159#1:443\n228#1:451\n270#1:464\n305#1:494,11\n308#1:524,13\n308#1:538,3\n313#1:562,13\n313#1:576,3\n305#1:581,3\n97#1:436,6\n159#1:444,6\n228#1:452,6\n270#1:465,3\n270#1:469,3\n98#1:442\n160#1:450\n229#1:458\n305#1:482\n308#1:512\n313#1:550\n270#1:459,5\n270#1:468\n270#1:472\n270#1:473,5\n305#1:478,4\n305#1:483,11\n308#1:511\n308#1:513,11\n308#1:541\n313#1:549\n313#1:551,11\n313#1:579\n305#1:584\n308#1:505,6\n308#1:537\n308#1:542\n313#1:543,6\n313#1:575\n313#1:580\n270#1:585\n413#1:586\n414#1:587\n422#1:588\n426#1:589\n429#1:590\n433#1:591\n*E\n"})
/* compiled from: Tab.kt */
public final class TabKt {
    private static final float DoubleLineTextBaselineWithIcon = C1232Dp.m38468constructorimpl((float) 6);
    /* access modifiers changed from: private */
    public static final float HorizontalTextPadding = C1232Dp.m38468constructorimpl((float) 16);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    /* access modifiers changed from: private */
    public static final float LargeTabHeight = C1232Dp.m38468constructorimpl((float) 72);
    private static final float SingleLineTextBaselineWithIcon = C1232Dp.m38468constructorimpl((float) 14);
    /* access modifiers changed from: private */
    public static final float SmallTabHeight = C1232Dp.m38468constructorimpl((float) 48);
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    /* access modifiers changed from: private */
    public static final float TextDistanceFromLeadingIcon = C1232Dp.m38468constructorimpl((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0135  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: LeadingIconTab-0nD-MI0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34155LeadingIconTab0nDMI0(boolean r29, p404of.C13074a<p336ef.C11921v> r30, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.p002ui.Modifier r33, boolean r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, long r36, long r38, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r41
            r14 = r42
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -1499861761(0xffffffffa699ecff, float:-1.0680746E-15)
            r1 = r40
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r13 | 6
            r9 = r29
            goto L_0x003d
        L_0x002b:
            r1 = r13 & 14
            r9 = r29
            if (r1 != 0) goto L_0x003c
            boolean r1 = r15.changed((boolean) r9)
            if (r1 == 0) goto L_0x0039
            r1 = 4
            goto L_0x003a
        L_0x0039:
            r1 = 2
        L_0x003a:
            r1 = r1 | r13
            goto L_0x003d
        L_0x003c:
            r1 = r13
        L_0x003d:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 48
            goto L_0x0054
        L_0x0044:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0054
            boolean r2 = r15.changedInstance(r10)
            if (r2 == 0) goto L_0x0051
            r2 = 32
            goto L_0x0053
        L_0x0051:
            r2 = 16
        L_0x0053:
            r1 = r1 | r2
        L_0x0054:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x005b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x005b:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006b
            boolean r2 = r15.changedInstance(r11)
            if (r2 == 0) goto L_0x0068
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r2
        L_0x006b:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0072:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0082
            boolean r2 = r15.changedInstance(r12)
            if (r2 == 0) goto L_0x007f
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r2
        L_0x0082:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x009e
            r3 = r33
            boolean r4 = r15.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x009a
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r4
            goto L_0x00a0
        L_0x009e:
            r3 = r33
        L_0x00a0:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00a8
            r5 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r5
            goto L_0x00bc
        L_0x00a8:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r13
            if (r5 != 0) goto L_0x00bc
            r5 = r34
            boolean r6 = r15.changed((boolean) r5)
            if (r6 == 0) goto L_0x00b8
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r6
            goto L_0x00be
        L_0x00bc:
            r5 = r34
        L_0x00be:
            r6 = r14 & 64
            if (r6 == 0) goto L_0x00c6
            r7 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r7
            goto L_0x00da
        L_0x00c6:
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r13
            if (r7 != 0) goto L_0x00da
            r7 = r35
            boolean r8 = r15.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x00d6
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r8
            goto L_0x00dc
        L_0x00da:
            r7 = r35
        L_0x00dc:
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00f7
            r8 = r14 & 128(0x80, float:1.794E-43)
            r40 = r1
            r0 = r36
            if (r8 != 0) goto L_0x00f2
            boolean r16 = r15.changed((long) r0)
            if (r16 == 0) goto L_0x00f2
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r16 = r40 | r16
            goto L_0x00fd
        L_0x00f7:
            r40 = r1
            r0 = r36
            r16 = r40
        L_0x00fd:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x0117
            r8 = r14 & 256(0x100, float:3.59E-43)
            r0 = r38
            if (r8 != 0) goto L_0x0112
            boolean r8 = r15.changed((long) r0)
            if (r8 == 0) goto L_0x0112
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0112:
            r8 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r16 = r16 | r8
            goto L_0x0119
        L_0x0117:
            r0 = r38
        L_0x0119:
            r8 = 191739611(0xb6db6db, float:4.5782105E-32)
            r8 = r16 & r8
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r8 != r0) goto L_0x0135
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x012a
            goto L_0x0135
        L_0x012a:
            r15.skipToGroupEnd()
            r8 = r36
            r10 = r38
            r6 = r5
            r5 = r3
            goto L_0x025c
        L_0x0135:
            r15.startDefaults()
            r0 = r13 & 1
            r8 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = 1
            if (r0 == 0) goto L_0x0167
            boolean r0 = r15.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0147
            goto L_0x0167
        L_0x0147:
            r15.skipToGroupEnd()
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0150
            r16 = r16 & r8
        L_0x0150:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0159
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r16 = r16 & r0
        L_0x0159:
            r20 = r36
            r22 = r38
            r17 = r5
            r19 = r7
            r8 = r16
            r16 = r3
            goto L_0x01de
        L_0x0167:
            if (r2 == 0) goto L_0x016c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r3 = r0
        L_0x016c:
            if (r4 == 0) goto L_0x016f
            r5 = r1
        L_0x016f:
            if (r6 == 0) goto L_0x0190
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r0)
            java.lang.Object r0 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x018a
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r15.updateRememberedValue(r0)
        L_0x018a:
            r15.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r7 = r0
        L_0x0190:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01a5
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            java.lang.Object r0 = r15.consume(r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r19 = r0.m35681unboximpl()
            r16 = r16 & r8
            goto L_0x01a7
        L_0x01a5:
            r19 = r36
        L_0x01a7:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d2
            androidx.compose.material.ContentAlpha r0 = androidx.compose.material.ContentAlpha.INSTANCE
            r2 = 6
            float r23 = r0.getMedium(r15, r2)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 14
            r28 = 0
            r21 = r19
            long r21 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r21, r23, r24, r25, r26, r27, r28)
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r16 = r16 & r0
            r17 = r5
            r8 = r16
            r22 = r21
            r16 = r3
            r20 = r19
            goto L_0x01dc
        L_0x01d2:
            r22 = r38
            r17 = r5
            r8 = r16
            r20 = r19
            r16 = r3
        L_0x01dc:
            r19 = r7
        L_0x01de:
            r15.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01f0
            r0 = -1
            java.lang.String r2 = "androidx.compose.material.LeadingIconTab (Tab.kt:151)"
            r3 = -1499861761(0xffffffffa699ecff, float:-1.0680746E-15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r8, r0, r2)
        L_0x01f0:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 15
            r3 = r3 & 896(0x380, float:1.256E-42)
            r4 = 6
            r3 = r3 | r4
            r5 = 2
            r33 = r0
            r34 = r2
            r35 = r20
            r37 = r15
            r38 = r3
            r39 = r5
            androidx.compose.foundation.Indication r5 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r33, r34, r35, r37, r38, r39)
            androidx.compose.material.TabKt$LeadingIconTab$2 r7 = new androidx.compose.material.TabKt$LeadingIconTab$2
            r0 = r7
            r6 = r1
            r18 = r4
            r1 = r16
            r2 = r29
            r3 = r19
            r4 = r5
            r5 = r17
            r10 = r6
            r6 = r30
            r11 = r7
            r7 = r32
            r24 = r8
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 866677691(0x33a873bb, float:7.844161E-8)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r10, r11)
            int r1 = r24 >> 21
            r2 = r1 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r24 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r33 = r20
            r35 = r22
            r37 = r29
            r38 = r0
            r39 = r15
            r40 = r1
            m34158TabTransitionKlgxPg(r33, r35, r37, r38, r39, r40)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0252
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0252:
            r5 = r16
            r6 = r17
            r7 = r19
            r8 = r20
            r10 = r22
        L_0x025c:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.endRestartGroup()
            if (r15 != 0) goto L_0x0263
            goto L_0x0279
        L_0x0263:
            androidx.compose.material.TabKt$LeadingIconTab$3 r4 = new androidx.compose.material.TabKt$LeadingIconTab$3
            r0 = r4
            r1 = r29
            r2 = r30
            r3 = r31
            r14 = r4
            r4 = r32
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            r15.updateScope(r14)
        L_0x0279:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m34155LeadingIconTab0nDMI0(boolean, of.a, of.o, of.o, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0134  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Tab-0nD-MI0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34156Tab0nDMI0(boolean r27, p404of.C13074a<p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, boolean r30, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r39
            r15 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -1486097588(0xffffffffa76bf34c, float:-3.2744693E-15)
            r1 = r38
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r14 | 6
            r11 = r27
            goto L_0x002f
        L_0x001d:
            r1 = r14 & 14
            r11 = r27
            if (r1 != 0) goto L_0x002e
            boolean r1 = r12.changed((boolean) r11)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r14
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0046
        L_0x0036:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r12.changedInstance(r13)
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r29
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x005c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r4
            goto L_0x0062
        L_0x0060:
            r3 = r29
        L_0x0062:
            r4 = r15 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007c
            r5 = r30
            boolean r6 = r12.changed((boolean) r5)
            if (r6 == 0) goto L_0x0078
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r6
            goto L_0x007e
        L_0x007c:
            r5 = r30
        L_0x007e:
            r6 = r15 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r8 = r14 & r7
            if (r8 != 0) goto L_0x009b
            r8 = r31
            boolean r9 = r12.changedInstance(r8)
            if (r9 == 0) goto L_0x0097
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r9
            goto L_0x009d
        L_0x009b:
            r8 = r31
        L_0x009d:
            r9 = r15 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00aa
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r10 = r32
            goto L_0x00bd
        L_0x00aa:
            r16 = r14 & r10
            r10 = r32
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r12.changedInstance(r10)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r16
        L_0x00bd:
            r16 = r15 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00ca
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r7 = r33
            goto L_0x00dd
        L_0x00ca:
            r18 = r14 & r17
            r7 = r33
            if (r18 != 0) goto L_0x00dd
            boolean r19 = r12.changed((java.lang.Object) r7)
            if (r19 == 0) goto L_0x00d9
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r19
        L_0x00dd:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x00f6
            r0 = r15 & 128(0x80, float:1.794E-43)
            r7 = r34
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r12.changed((long) r7)
            if (r0 == 0) goto L_0x00f2
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r1 = r1 | r0
            goto L_0x00f8
        L_0x00f6:
            r7 = r34
        L_0x00f8:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0110
            r0 = r15 & 256(0x100, float:3.59E-43)
            r7 = r36
            if (r0 != 0) goto L_0x010c
            boolean r0 = r12.changed((long) r7)
            if (r0 == 0) goto L_0x010c
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010c:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r1 = r1 | r0
            goto L_0x0112
        L_0x0110:
            r7 = r36
        L_0x0112:
            r0 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r0 & r1
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r3) goto L_0x0134
            boolean r0 = r12.getSkipping()
            if (r0 != 0) goto L_0x0122
            goto L_0x0134
        L_0x0122:
            r12.skipToGroupEnd()
            r3 = r29
            r4 = r5
            r6 = r10
            r17 = r12
            r5 = r31
            r10 = r7
            r7 = r33
            r8 = r34
            goto L_0x0274
        L_0x0134:
            r12.startDefaults()
            r0 = r14 & 1
            r20 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r21 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0168
            boolean r0 = r12.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0148
            goto L_0x0168
        L_0x0148:
            r12.skipToGroupEnd()
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0151
            r1 = r1 & r20
        L_0x0151:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0159
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x0159:
            r16 = r29
            r22 = r33
            r23 = r34
            r20 = r5
            r25 = r7
            r9 = r10
            r10 = r31
            goto L_0x01f2
        L_0x0168:
            if (r2 == 0) goto L_0x016d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x016f
        L_0x016d:
            r0 = r29
        L_0x016f:
            if (r4 == 0) goto L_0x0172
            r5 = r3
        L_0x0172:
            if (r6 == 0) goto L_0x0177
            r2 = r21
            goto L_0x0179
        L_0x0177:
            r2 = r31
        L_0x0179:
            if (r9 == 0) goto L_0x017d
            r10 = r21
        L_0x017d:
            if (r16 == 0) goto L_0x019e
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r4)
            java.lang.Object r4 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r4 != r6) goto L_0x0198
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r12.updateRememberedValue(r4)
        L_0x0198:
            r12.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            goto L_0x01a0
        L_0x019e:
            r4 = r33
        L_0x01a0:
            r6 = r15 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01b5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            java.lang.Object r6 = r12.consume(r6)
            androidx.compose.ui.graphics.Color r6 = (androidx.compose.p002ui.graphics.Color) r6
            long r23 = r6.m35681unboximpl()
            r1 = r1 & r20
            goto L_0x01b7
        L_0x01b5:
            r23 = r34
        L_0x01b7:
            r6 = r15 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x01e8
            androidx.compose.material.ContentAlpha r6 = androidx.compose.material.ContentAlpha.INSTANCE
            r7 = 6
            float r6 = r6.getMedium(r12, r7)
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 14
            r20 = 0
            r29 = r23
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r16
            r36 = r20
            long r6 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r29, r31, r32, r33, r34, r35, r36)
            r8 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r8
            r16 = r0
            r22 = r4
            r20 = r5
            r25 = r6
            goto L_0x01f0
        L_0x01e8:
            r16 = r0
            r22 = r4
            r20 = r5
            r25 = r7
        L_0x01f0:
            r9 = r10
            r10 = r2
        L_0x01f2:
            r12.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0204
            r0 = -1
            java.lang.String r2 = "androidx.compose.material.Tab (Tab.kt:89)"
            r4 = -1486097588(0xffffffffa76bf34c, float:-3.2744693E-15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r0, r2)
        L_0x0204:
            if (r10 == 0) goto L_0x0212
            androidx.compose.material.TabKt$Tab$styledText$1$1 r0 = new androidx.compose.material.TabKt$Tab$styledText$1$1
            r0.<init>(r10, r1)
            r2 = -1729014781(0xffffffff98f15403, float:-6.238187E-24)
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r2, r3, r0)
        L_0x0212:
            r0 = r21
            androidx.compose.material.TabKt$Tab$2 r2 = new androidx.compose.material.TabKt$Tab$2
            r2.<init>(r0, r9, r1)
            r0 = -178151495(0xfffffffff5619fb9, float:-2.860123E32)
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r0, r3, r2)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 6
            int r1 = r1 >> r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r17
            r17 = r0 | r1
            r18 = 0
            r0 = r27
            r1 = r28
            r2 = r16
            r3 = r20
            r4 = r22
            r5 = r23
            r7 = r25
            r21 = r9
            r9 = r19
            r19 = r10
            r10 = r12
            r11 = r17
            r17 = r12
            r12 = r18
            m34157TabEVJuX4I(r0, r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0266
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0266:
            r3 = r16
            r5 = r19
            r4 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r10 = r25
        L_0x0274:
            androidx.compose.runtime.ScopeUpdateScope r12 = r17.endRestartGroup()
            if (r12 != 0) goto L_0x027b
            goto L_0x028f
        L_0x027b:
            androidx.compose.material.TabKt$Tab$3 r2 = new androidx.compose.material.TabKt$Tab$3
            r0 = r2
            r1 = r27
            r14 = r2
            r2 = r28
            r13 = r12
            r12 = r39
            r15 = r13
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            r15.updateScope(r14)
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m34156Tab0nDMI0(boolean, of.a, androidx.compose.ui.Modifier, boolean, of.o, of.o, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0112  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Tab-EVJuX4I  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34157TabEVJuX4I(boolean r29, p404of.C13074a<p336ef.C11921v> r30, androidx.compose.p002ui.Modifier r31, boolean r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r9 = r30
            r10 = r38
            r11 = r40
            r12 = r41
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = 713679175(0x2a89e147, float:2.4492406E-13)
            r1 = r39
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r11 | 6
            r14 = r29
            goto L_0x0036
        L_0x0024:
            r1 = r11 & 14
            r14 = r29
            if (r1 != 0) goto L_0x0035
            boolean r1 = r13.changed((boolean) r14)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r11
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x004d
        L_0x003d:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004d
            boolean r2 = r13.changedInstance(r9)
            if (r2 == 0) goto L_0x004a
            r2 = 32
            goto L_0x004c
        L_0x004a:
            r2 = 16
        L_0x004c:
            r1 = r1 | r2
        L_0x004d:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0067
            r3 = r31
            boolean r4 = r13.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r4
            goto L_0x0069
        L_0x0067:
            r3 = r31
        L_0x0069:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0083
            r5 = r32
            boolean r6 = r13.changed((boolean) r5)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r6
            goto L_0x0085
        L_0x0083:
            r5 = r32
        L_0x0085:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008c:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x00a1
            r7 = r33
            boolean r8 = r13.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x009d
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r8
            goto L_0x00a3
        L_0x00a1:
            r7 = r33
        L_0x00a3:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00be
            r8 = r12 & 32
            r39 = r1
            r0 = r34
            if (r8 != 0) goto L_0x00b9
            boolean r15 = r13.changed((long) r0)
            if (r15 == 0) goto L_0x00b9
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r15 = r39 | r15
            goto L_0x00c4
        L_0x00be:
            r39 = r1
            r0 = r34
            r15 = r39
        L_0x00c4:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00de
            r16 = r12 & 64
            r8 = r36
            if (r16 != 0) goto L_0x00d9
            boolean r16 = r13.changed((long) r8)
            if (r16 == 0) goto L_0x00d9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r15 = r15 | r16
            goto L_0x00e0
        L_0x00de:
            r8 = r36
        L_0x00e0:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e8
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e6:
            r15 = r15 | r0
            goto L_0x00f9
        L_0x00e8:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r13.changedInstance(r10)
            if (r0 == 0) goto L_0x00f6
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00f6:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e6
        L_0x00f9:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r15
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r1) goto L_0x0112
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x0109
            goto L_0x0112
        L_0x0109:
            r13.skipToGroupEnd()
            r4 = r5
            r5 = r7
            r6 = r34
            goto L_0x0216
        L_0x0112:
            r13.startDefaults()
            r0 = r11 & 1
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = 1
            if (r0 == 0) goto L_0x013f
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0124
            goto L_0x013f
        L_0x0124:
            r13.skipToGroupEnd()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x012d
            r15 = r15 & r16
        L_0x012d:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0135
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r15 = r15 & r0
        L_0x0135:
            r19 = r34
        L_0x0137:
            r16 = r7
            r21 = r8
            r8 = r15
            r9 = r3
            r15 = r5
            goto L_0x019f
        L_0x013f:
            if (r2 == 0) goto L_0x0144
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r3 = r0
        L_0x0144:
            if (r4 == 0) goto L_0x0147
            r5 = r1
        L_0x0147:
            if (r6 == 0) goto L_0x0168
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r0)
            java.lang.Object r0 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0162
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r0)
        L_0x0162:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r7 = r0
        L_0x0168:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x017d
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            java.lang.Object r0 = r13.consume(r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r19 = r0.m35681unboximpl()
            r15 = r15 & r16
            goto L_0x017f
        L_0x017d:
            r19 = r34
        L_0x017f:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0137
            androidx.compose.material.ContentAlpha r0 = androidx.compose.material.ContentAlpha.INSTANCE
            r2 = 6
            float r23 = r0.getMedium(r13, r2)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 14
            r28 = 0
            r21 = r19
            long r8 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r21, r23, r24, r25, r26, r27, r28)
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r15 = r15 & r0
            goto L_0x0137
        L_0x019f:
            r13.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01b1
            r0 = -1
            java.lang.String r2 = "androidx.compose.material.Tab (Tab.kt:222)"
            r3 = 713679175(0x2a89e147, float:2.4492406E-13)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r8, r0, r2)
        L_0x01b1:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 9
            r3 = r3 & 896(0x380, float:1.256E-42)
            r4 = 6
            r3 = r3 | r4
            r5 = 2
            r31 = r0
            r32 = r2
            r33 = r19
            r35 = r13
            r36 = r3
            r37 = r5
            androidx.compose.foundation.Indication r5 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r31, r32, r33, r35, r36, r37)
            androidx.compose.material.TabKt$Tab$5 r7 = new androidx.compose.material.TabKt$Tab$5
            r0 = r7
            r6 = r1
            r17 = r4
            r1 = r9
            r2 = r29
            r3 = r16
            r4 = r5
            r5 = r15
            r31 = r9
            r9 = r6
            r6 = r30
            r10 = r7
            r7 = r38
            r18 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1237246709(0xffffffffb6411d0b, float:-2.8776146E-6)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r0, r9, r10)
            int r0 = r18 >> 15
            r1 = r0 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r18 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r8 = r0 | r1
            r1 = r19
            r3 = r21
            r5 = r29
            r7 = r13
            m34158TabTransitionKlgxPg(r1, r3, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x020d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020d:
            r3 = r31
            r4 = r15
            r5 = r16
            r6 = r19
            r8 = r21
        L_0x0216:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 != 0) goto L_0x021d
            goto L_0x0230
        L_0x021d:
            androidx.compose.material.TabKt$Tab$6 r15 = new androidx.compose.material.TabKt$Tab$6
            r0 = r15
            r1 = r29
            r2 = r30
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            r13.updateScope(r15)
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m34157TabEVJuX4I(boolean, of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void TabBaselineLayout(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        int i5 = i;
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(oVar3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249848471, i2, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            TabKt$TabBaselineLayout$2 tabKt$TabBaselineLayout$2 = new TabKt$TabBaselineLayout$2(oVar3, oVar4);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r13 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r13, tabKt$TabBaselineLayout$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r13, density, companion2.getSetDensity());
            Updater.m35299setimpl(r13, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r13, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2141028452);
            if (oVar3 != null) {
                Modifier r6 = PaddingKt.m33270paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor2 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r6);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r7, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r7, density2, companion2.getSetDensity());
                Updater.m35299setimpl(r7, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r7, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                oVar3.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(448373045);
            if (oVar4 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r132 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r132, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r132, density3, companion2.getSetDensity());
                Updater.m35299setimpl(r132, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r132, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                oVar4.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabKt$TabBaselineLayout$3(oVar3, oVar4, i5));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* renamed from: TabTransition-Klgx-Pg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34158TabTransitionKlgxPg(long r19, long r21, boolean r23, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            r6 = r24
            r7 = r26
            r0 = -405571117(0xffffffffe7d379d3, float:-1.9973332E24)
            r1 = r25
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r7 & 14
            r3 = 2
            r4 = r19
            if (r2 != 0) goto L_0x001f
            boolean r2 = r1.changed((long) r4)
            if (r2 == 0) goto L_0x001c
            r2 = 4
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            r2 = r2 | r7
            goto L_0x0020
        L_0x001f:
            r2 = r7
        L_0x0020:
            r8 = r7 & 112(0x70, float:1.57E-43)
            r14 = r21
            if (r8 != 0) goto L_0x0032
            boolean r8 = r1.changed((long) r14)
            if (r8 == 0) goto L_0x002f
            r8 = 32
            goto L_0x0031
        L_0x002f:
            r8 = 16
        L_0x0031:
            r2 = r2 | r8
        L_0x0032:
            r8 = r7 & 896(0x380, float:1.256E-42)
            r13 = r23
            if (r8 != 0) goto L_0x0044
            boolean r8 = r1.changed((boolean) r13)
            if (r8 == 0) goto L_0x0041
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r2 = r2 | r8
        L_0x0044:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0054
            boolean r8 = r1.changedInstance(r6)
            if (r8 == 0) goto L_0x0051
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r2 = r2 | r8
        L_0x0054:
            r8 = r2 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0066
            boolean r8 = r1.getSkipping()
            if (r8 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r1.skipToGroupEnd()
            goto L_0x01b6
        L_0x0066:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r9 = -1
            if (r8 == 0) goto L_0x0072
            java.lang.String r8 = "androidx.compose.material.TabTransition (Tab.kt:262)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r9, r8)
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            int r2 = r2 >> 6
            r8 = r2 & 14
            r10 = 0
            androidx.compose.animation.core.Transition r8 = androidx.compose.animation.core.TransitionKt.updateTransition(r0, (java.lang.String) r10, (androidx.compose.runtime.Composer) r1, (int) r8, (int) r3)
            androidx.compose.material.TabKt$TabTransition$color$2 r0 = androidx.compose.material.TabKt$TabTransition$color$2.INSTANCE
            r10 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r1.startReplaceableGroup(r10)
            java.lang.String r16 = "ColorAnimation"
            java.lang.Object r10 = r8.getTargetState()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11 = 1445938070(0x562f4396, float:4.8176204E13)
            r1.startReplaceableGroup(r11)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r3 = "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)"
            r15 = 0
            if (r12 == 0) goto L_0x00a5
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r9, r3)
        L_0x00a5:
            if (r10 == 0) goto L_0x00aa
            r17 = r4
            goto L_0x00ac
        L_0x00aa:
            r17 = r21
        L_0x00ac:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x00b5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00b5:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.p002ui.graphics.Color.m35675getColorSpaceimpl(r17)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r12)
            boolean r12 = r1.changed((java.lang.Object) r10)
            java.lang.Object r14 = r1.rememberedValue()
            if (r12 != 0) goto L_0x00d4
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r14 != r12) goto L_0x00e4
        L_0x00d4:
            androidx.compose.ui.graphics.Color$Companion r12 = androidx.compose.p002ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r12 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r12)
            java.lang.Object r10 = r12.invoke(r10)
            r14 = r10
            androidx.compose.animation.core.TwoWayConverter r14 = (androidx.compose.animation.core.TwoWayConverter) r14
            r1.updateRememberedValue(r14)
        L_0x00e4:
            r1.endReplaceableGroup()
            r12 = r14
            androidx.compose.animation.core.TwoWayConverter r12 = (androidx.compose.animation.core.TwoWayConverter) r12
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r1.startReplaceableGroup(r10)
            java.lang.Object r10 = r8.getCurrentState()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r1.startReplaceableGroup(r11)
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x0106
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r9, r3)
        L_0x0106:
            if (r10 == 0) goto L_0x010b
            r17 = r4
            goto L_0x010d
        L_0x010b:
            r17 = r21
        L_0x010d:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0116
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0116:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r10 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r17)
            java.lang.Object r14 = r8.getTargetState()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r1.startReplaceableGroup(r11)
            boolean r17 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r17 == 0) goto L_0x0133
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r9, r3)
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            r17 = r4
            goto L_0x013a
        L_0x0138:
            r17 = r21
        L_0x013a:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0143
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0143:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r17)
            androidx.compose.animation.core.Transition$Segment r9 = r8.getSegment()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r0.invoke(r9, r1, r11)
            r11 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r11 = (androidx.compose.animation.core.FiniteAnimationSpec) r11
            r0 = 32768(0x8000, float:4.5918E-41)
            r9 = r10
            r10 = r3
            r13 = r16
            r14 = r1
            r3 = r15
            r15 = r0
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            r8 = 2
            androidx.compose.runtime.ProvidedValue[] r8 = new androidx.compose.runtime.ProvidedValue[r8]
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            long r10 = TabTransition_Klgx_Pg$lambda$5(r0)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 14
            r17 = 0
            long r10 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r10, r12, r13, r14, r15, r16, r17)
            androidx.compose.ui.graphics.Color r10 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r10)
            androidx.compose.runtime.ProvidedValue r9 = r9.provides(r10)
            r8[r3] = r9
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha()
            long r9 = TabTransition_Klgx_Pg$lambda$5(r0)
            float r0 = androidx.compose.p002ui.graphics.Color.m35673getAlphaimpl(r9)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.runtime.ProvidedValue r0 = r3.provides(r0)
            r3 = 1
            r8[r3] = r0
            r0 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r8, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r6, (androidx.compose.runtime.Composer) r1, (int) r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01b6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01b6:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x01bd
            goto L_0x01d0
        L_0x01bd:
            androidx.compose.material.TabKt$TabTransition$1 r9 = new androidx.compose.material.TabKt$TabTransition$1
            r0 = r9
            r1 = r19
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r26
            r0.<init>(r1, r3, r5, r6, r7)
            r8.updateScope(r9)
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m34158TabTransitionKlgxPg(long, long, boolean, of.o, androidx.compose.runtime.Composer, int):void");
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        float f;
        Density density2 = density;
        int i5 = i3;
        int i6 = i4;
        if (i5 == i6) {
            f = SingleLineTextBaselineWithIcon;
        } else {
            f = DoubleLineTextBaselineWithIcon;
        }
        int r3 = density.m38443roundToPx0680j_4(f) + density.m38443roundToPx0680j_4(TabRowDefaults.INSTANCE.m34167getIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.m38442roundToPxR2X_6o(IconDistanceFromBaseline)) - i5;
        int i7 = (i2 - i6) - r3;
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, (i - placeable.getWidth()) / 2, i7, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, (i - placeable2.getWidth()) / 2, i7 - height, 0.0f, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, (Object) null);
    }
}
