package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.AlphaKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,400:1\n25#2:401\n460#2,13:427\n473#2,3:441\n456#2,11:462\n460#2,13:492\n473#2,3:506\n460#2,13:530\n473#2,3:544\n467#2,3:549\n1114#3,6:402\n76#4:408\n76#4:415\n76#4:450\n76#4:480\n76#4:518\n68#5,5:409\n73#5:440\n77#5:445\n67#5,6:473\n73#5:505\n77#5:510\n67#5,6:511\n73#5:543\n77#5:548\n75#6:414\n76#6,11:416\n89#6:444\n71#6,4:446\n75#6,11:451\n75#6:479\n76#6,11:481\n89#6:509\n75#6:517\n76#6,11:519\n89#6:547\n88#6:552\n76#7:553\n154#8:554\n154#8:555\n154#8:556\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n155#1:401\n170#1:427,13\n170#1:441,3\n260#1:462,11\n262#1:492,13\n262#1:506,3\n264#1:530,13\n264#1:544,3\n260#1:549,3\n155#1:402,6\n156#1:408\n170#1:415\n260#1:450\n262#1:480\n264#1:518\n170#1:409,5\n170#1:440\n170#1:445\n262#1:473,6\n262#1:505\n262#1:510\n264#1:511,6\n264#1:543\n264#1:548\n170#1:414\n170#1:416,11\n170#1:444\n260#1:446,4\n260#1:451,11\n262#1:479\n262#1:481,11\n262#1:509\n264#1:517\n264#1:519,11\n264#1:547\n260#1:552\n228#1:553\n388#1:554\n393#1:555\n399#1:556\n*E\n"})
/* compiled from: BottomNavigation.kt */
public final class BottomNavigationKt {
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = new TweenSpec(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final float BottomNavigationHeight = C1232Dp.m38468constructorimpl((float) 56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;

    static {
        float f = (float) 12;
        BottomNavigationItemHorizontalPadding = C1232Dp.m38468constructorimpl(f);
        CombinedItemTextBaseline = C1232Dp.m38468constructorimpl(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: BottomNavigation-PEIptTM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33895BottomNavigationPEIptTM(androidx.compose.p002ui.Modifier r24, long r25, long r27, float r29, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r7 = r30
            r8 = r32
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 456489494(0x1b357a16, float:1.5011417E-22)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r8 | 6
            r4 = r3
            r3 = r24
            goto L_0x0030
        L_0x001c:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r24
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r8
            goto L_0x0030
        L_0x002d:
            r3 = r24
            r4 = r8
        L_0x0030:
            r5 = r8 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r33 & 2
            if (r5 != 0) goto L_0x0043
            r5 = r25
            boolean r9 = r1.changed((long) r5)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0043:
            r5 = r25
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
            goto L_0x004b
        L_0x0049:
            r5 = r25
        L_0x004b:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0064
            r9 = r33 & 4
            if (r9 != 0) goto L_0x005e
            r9 = r27
            boolean r11 = r1.changed((long) r9)
            if (r11 == 0) goto L_0x0060
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r9 = r27
        L_0x0060:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r11
            goto L_0x0066
        L_0x0064:
            r9 = r27
        L_0x0066:
            r11 = r33 & 8
            if (r11 == 0) goto L_0x006d
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r12 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r29
            boolean r13 = r1.changed((float) r12)
            if (r13 == 0) goto L_0x007c
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r4 = r4 | r13
            goto L_0x0082
        L_0x0080:
            r12 = r29
        L_0x0082:
            r13 = r33 & 16
            if (r13 == 0) goto L_0x0089
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0089:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x009b
            boolean r13 = r1.changedInstance(r7)
            if (r13 == 0) goto L_0x0098
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r13
        L_0x009b:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b0
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r1.skipToGroupEnd()
            r2 = r3
            goto L_0x0150
        L_0x00b0:
            r1.startDefaults()
            r13 = r8 & 1
            r14 = 6
            if (r13 == 0) goto L_0x00d7
            boolean r13 = r1.getDefaultsInvalid()
            if (r13 == 0) goto L_0x00bf
            goto L_0x00d7
        L_0x00bf:
            r1.skipToGroupEnd()
            r2 = r33 & 2
            if (r2 == 0) goto L_0x00c8
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c8:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x00ce
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ce:
            r2 = r3
        L_0x00cf:
            r21 = r12
        L_0x00d1:
            r22 = r9
            r9 = r4
            r3 = r22
            goto L_0x0107
        L_0x00d7:
            if (r2 == 0) goto L_0x00dc
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00dd
        L_0x00dc:
            r2 = r3
        L_0x00dd:
            r3 = r33 & 2
            if (r3 == 0) goto L_0x00ed
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r3 = r3.getColors(r1, r14)
            long r5 = androidx.compose.material.ColorsKt.getPrimarySurface(r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ed:
            r3 = r33 & 4
            if (r3 == 0) goto L_0x00fc
            int r3 = r4 >> 3
            r3 = r3 & 14
            long r9 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r5, r1, r3)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x00fc:
            if (r11 == 0) goto L_0x00cf
            androidx.compose.material.BottomNavigationDefaults r3 = androidx.compose.material.BottomNavigationDefaults.INSTANCE
            float r3 = r3.m33894getElevationD9Ej5fM()
            r21 = r3
            goto L_0x00d1
        L_0x0107:
            r1.endDefaults()
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0116
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.BottomNavigation (BottomNavigation.kt:89)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r10, r11)
        L_0x0116:
            r10 = 0
            r15 = 0
            androidx.compose.material.BottomNavigationKt$BottomNavigation$1 r0 = new androidx.compose.material.BottomNavigationKt$BottomNavigation$1
            r0.<init>(r7, r9)
            r11 = 678339930(0x286ea55a, float:1.3247509E-14)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r11, r12, r0)
            r0 = r9 & 14
            r11 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r11
            int r11 = r9 << 3
            r12 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            int r9 = r9 << r14
            r9 = r9 & r11
            r19 = r0 | r9
            r20 = 18
            r9 = r2
            r11 = r5
            r13 = r3
            r16 = r21
            r18 = r1
            androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x014d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x014d:
            r9 = r3
            r12 = r21
        L_0x0150:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.endRestartGroup()
            if (r11 != 0) goto L_0x0157
            goto L_0x016a
        L_0x0157:
            androidx.compose.material.BottomNavigationKt$BottomNavigation$2 r13 = new androidx.compose.material.BottomNavigationKt$BottomNavigation$2
            r0 = r13
            r1 = r2
            r2 = r5
            r4 = r9
            r6 = r12
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            r11.updateScope(r13)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m33895BottomNavigationPEIptTM(androidx.compose.ui.Modifier, long, long, float, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0126  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: BottomNavigationItem-jY6E1Zs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33896BottomNavigationItemjY6E1Zs(androidx.compose.foundation.layout.RowScope r26, boolean r27, p404of.C13074a<p336ef.C11921v> r28, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r29, androidx.compose.p002ui.Modifier r30, boolean r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, boolean r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, long r35, long r37, androidx.compose.runtime.Composer r39, int r40, int r41, int r42) {
        /*
            r1 = r26
            r3 = r28
            r4 = r29
            r14 = r40
            r15 = r42
            java.lang.String r0 = "$this$BottomNavigationItem"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -1473735525(0xffffffffa828949b, float:-9.358097E-15)
            r2 = r39
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r15
            if (r5 == 0) goto L_0x002a
            r5 = r14 | 6
            goto L_0x003a
        L_0x002a:
            r5 = r14 & 14
            if (r5 != 0) goto L_0x0039
            boolean r5 = r2.changed((java.lang.Object) r1)
            if (r5 == 0) goto L_0x0036
            r5 = 4
            goto L_0x0037
        L_0x0036:
            r5 = 2
        L_0x0037:
            r5 = r5 | r14
            goto L_0x003a
        L_0x0039:
            r5 = r14
        L_0x003a:
            r8 = r15 & 1
            if (r8 == 0) goto L_0x0041
            r5 = r5 | 48
            goto L_0x0054
        L_0x0041:
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0054
            r8 = r27
            boolean r9 = r2.changed((boolean) r8)
            if (r9 == 0) goto L_0x0050
            r9 = 32
            goto L_0x0052
        L_0x0050:
            r9 = 16
        L_0x0052:
            r5 = r5 | r9
            goto L_0x0056
        L_0x0054:
            r8 = r27
        L_0x0056:
            r9 = r15 & 2
            if (r9 == 0) goto L_0x005d
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005d:
            r9 = r14 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006d
            boolean r9 = r2.changedInstance(r3)
            if (r9 == 0) goto L_0x006a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r5 = r5 | r9
        L_0x006d:
            r9 = r15 & 4
            if (r9 == 0) goto L_0x0074
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r9 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0084
            boolean r9 = r2.changedInstance(r4)
            if (r9 == 0) goto L_0x0081
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r5 = r5 | r9
        L_0x0084:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x008b
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008b:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00a0
            r10 = r30
            boolean r11 = r2.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x009c
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r5 = r5 | r11
            goto L_0x00a2
        L_0x00a0:
            r10 = r30
        L_0x00a2:
            r11 = r15 & 16
            if (r11 == 0) goto L_0x00aa
            r12 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r12
            goto L_0x00be
        L_0x00aa:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r14
            if (r12 != 0) goto L_0x00be
            r12 = r31
            boolean r13 = r2.changed((boolean) r12)
            if (r13 == 0) goto L_0x00ba
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r5 = r5 | r13
            goto L_0x00c0
        L_0x00be:
            r12 = r31
        L_0x00c0:
            r13 = r15 & 32
            if (r13 == 0) goto L_0x00cb
            r16 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r16
            r6 = r32
            goto L_0x00e0
        L_0x00cb:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r14 & r16
            r6 = r32
            if (r16 != 0) goto L_0x00e0
            boolean r16 = r2.changedInstance(r6)
            if (r16 == 0) goto L_0x00dc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r5 = r5 | r16
        L_0x00e0:
            r16 = r15 & 64
            if (r16 == 0) goto L_0x00eb
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r0 = r33
            goto L_0x0100
        L_0x00eb:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r14 & r17
            r0 = r33
            if (r17 != 0) goto L_0x0100
            boolean r18 = r2.changed((boolean) r0)
            if (r18 == 0) goto L_0x00fc
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r5 = r5 | r18
        L_0x0100:
            r7 = r15 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x010b
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r19
            r0 = r34
            goto L_0x0120
        L_0x010b:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r14 & r19
            r0 = r34
            if (r19 != 0) goto L_0x0120
            boolean r19 = r2.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x011c
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r5 = r5 | r19
        L_0x0120:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x013c
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0135
            r0 = r35
            boolean r19 = r2.changed((long) r0)
            if (r19 == 0) goto L_0x0137
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0135:
            r0 = r35
        L_0x0137:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r5 = r5 | r19
            goto L_0x013e
        L_0x013c:
            r0 = r35
        L_0x013e:
            r19 = r41 & 14
            if (r19 != 0) goto L_0x0158
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0151
            r0 = r37
            boolean r19 = r2.changed((long) r0)
            if (r19 == 0) goto L_0x0153
            r19 = 4
            goto L_0x0155
        L_0x0151:
            r0 = r37
        L_0x0153:
            r19 = 2
        L_0x0155:
            r19 = r41 | r19
            goto L_0x015c
        L_0x0158:
            r0 = r37
            r19 = r41
        L_0x015c:
            r20 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r5 & r20
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r1) goto L_0x0182
            r0 = r19 & 11
            r1 = 2
            if (r0 != r1) goto L_0x0182
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0172
            goto L_0x0182
        L_0x0172:
            r2.skipToGroupEnd()
            r8 = r33
            r9 = r34
            r7 = r6
            r5 = r10
            r6 = r12
            r10 = r35
            r12 = r37
            goto L_0x0389
        L_0x0182:
            r2.startDefaults()
            r0 = r14 & 1
            r18 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            if (r0 == 0) goto L_0x01af
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0193
            goto L_0x01af
        L_0x0193:
            r2.skipToGroupEnd()
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019c
            r5 = r5 & r18
        L_0x019c:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01a2
            r19 = r19 & -15
        L_0x01a2:
            r9 = r33
            r7 = r34
            r21 = r37
            r0 = r10
            r1 = r19
            r10 = r35
            goto L_0x0228
        L_0x01af:
            if (r9 == 0) goto L_0x01b4
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01b5
        L_0x01b4:
            r0 = r10
        L_0x01b5:
            if (r11 == 0) goto L_0x01b8
            r12 = 1
        L_0x01b8:
            if (r13 == 0) goto L_0x01bb
            r6 = 0
        L_0x01bb:
            if (r16 == 0) goto L_0x01bf
            r9 = 1
            goto L_0x01c1
        L_0x01bf:
            r9 = r33
        L_0x01c1:
            if (r7 == 0) goto L_0x01e2
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r7)
            java.lang.Object r7 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r7 != r10) goto L_0x01dc
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r2.updateRememberedValue(r7)
        L_0x01dc:
            r2.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = (androidx.compose.foundation.interaction.MutableInteractionSource) r7
            goto L_0x01e4
        L_0x01e2:
            r7 = r34
        L_0x01e4:
            r10 = r15 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x01f9
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.ui.graphics.Color r10 = (androidx.compose.p002ui.graphics.Color) r10
            long r10 = r10.m35681unboximpl()
            r5 = r5 & r18
            goto L_0x01fb
        L_0x01f9:
            r10 = r35
        L_0x01fb:
            r13 = r15 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0224
            androidx.compose.material.ContentAlpha r13 = androidx.compose.material.ContentAlpha.INSTANCE
            r1 = 6
            float r13 = r13.getMedium(r2, r1)
            r1 = 0
            r18 = 0
            r21 = 0
            r22 = 14
            r23 = 0
            r30 = r10
            r32 = r13
            r33 = r1
            r34 = r18
            r35 = r21
            r36 = r22
            r37 = r23
            long r21 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r30, r32, r33, r34, r35, r36, r37)
            r19 = r19 & -15
            goto L_0x0226
        L_0x0224:
            r21 = r37
        L_0x0226:
            r1 = r19
        L_0x0228:
            r2.endDefaults()
            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r13 == 0) goto L_0x0239
            java.lang.String r13 = "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)"
            r3 = -1473735525(0xffffffffa828949b, float:-9.358097E-15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r5, r1, r13)
        L_0x0239:
            if (r6 == 0) goto L_0x024b
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1 r3 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1
            r3.<init>(r6, r5)
            r13 = 1343298261(0x50111ad5, float:9.7378191E9)
            r38 = r6
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r13, r6, r3)
            goto L_0x024e
        L_0x024b:
            r38 = r6
            r3 = 0
        L_0x024e:
            r6 = 0
            int r13 = r5 >> 21
            r13 = r13 & 896(0x380, float:1.256E-42)
            r17 = 6
            r13 = r13 | 6
            r17 = 2
            r30 = r6
            r6 = 0
            r31 = r6
            r32 = r10
            r34 = r2
            r35 = r13
            r36 = r17
            androidx.compose.foundation.Indication r6 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r30, r31, r32, r34, r35, r36)
            androidx.compose.ui.semantics.Role$Companion r13 = androidx.compose.p002ui.semantics.Role.Companion
            int r13 = r13.m37820getTabo7Vup1c()
            androidx.compose.ui.semantics.Role r13 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r13)
            r30 = r0
            r31 = r27
            r32 = r7
            r33 = r6
            r34 = r12
            r35 = r13
            r36 = r28
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.selection.SelectableKt.m33587selectableO2vRcR0(r30, r31, r32, r33, r34, r35, r36)
            r13 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r18 = 2
            r19 = 0
            r30 = r26
            r31 = r6
            r32 = r13
            r33 = r17
            r34 = r18
            r35 = r19
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.weight$default(r30, r31, r32, r33, r34, r35)
            androidx.compose.ui.Alignment$Companion r13 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r13 = r13.getCenter()
            r39 = r0
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r0)
            r0 = 0
            r17 = r7
            r7 = 6
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r13, r0, r2, r7)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r13)
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.p002ui.unit.Density) r13
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p002ui.unit.LayoutDirection) r0
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r8 = r2.consume(r8)
            androidx.compose.ui.platform.ViewConfiguration r8 = (androidx.compose.p002ui.platform.ViewConfiguration) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            r19 = r12
            of.a r12 = r18.getConstructor()
            of.p r6 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r6)
            androidx.compose.runtime.Applier r14 = r2.getApplier()
            boolean r14 = r14 instanceof androidx.compose.runtime.Applier
            if (r14 != 0) goto L_0x02ef
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02ef:
            r2.startReusableNode()
            boolean r14 = r2.getInserting()
            if (r14 == 0) goto L_0x02fc
            r2.createNode(r12)
            goto L_0x02ff
        L_0x02fc:
            r2.useNode()
        L_0x02ff:
            r2.disableReusing()
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r14 = r18.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r12, r7, r14)
            of.o r7 = r18.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r12, r13, r7)
            of.o r7 = r18.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r12, r0, r7)
            of.o r0 = r18.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r12, r8, r0)
            r2.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.invoke(r0, r2, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1 r0 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
            r0.<init>(r9, r4, r3, r5)
            r3 = -1411872801(0xffffffffabd887df, float:-1.5385435E-12)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r3, r6, r0)
            int r3 = r5 >> 27
            r3 = r3 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            int r3 = r5 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            r30 = r10
            r32 = r21
            r34 = r27
            r35 = r0
            r36 = r2
            r37 = r1
            m33897BottomNavigationTransitionKlgxPg(r30, r32, r34, r35, r36, r37)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x037e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x037e:
            r7 = r38
            r5 = r39
            r8 = r9
            r9 = r17
            r6 = r19
            r12 = r21
        L_0x0389:
            androidx.compose.runtime.ScopeUpdateScope r14 = r2.endRestartGroup()
            if (r14 != 0) goto L_0x0390
            goto L_0x03af
        L_0x0390:
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$3 r3 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$3
            r0 = r3
            r1 = r26
            r2 = r27
            r24 = r3
            r3 = r28
            r4 = r29
            r25 = r14
            r14 = r40
            r15 = r41
            r16 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16)
            r1 = r24
            r0 = r25
            r0.updateScope(r1)
        L_0x03af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m33896BottomNavigationItemjY6E1Zs(androidx.compose.foundation.layout.RowScope, boolean, of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void BottomNavigationItemBaselineLayout(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, float f, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        float f2 = f;
        int i6 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1162995092);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changedInstance(oVar3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(f2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162995092, i2, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:253)");
            }
            BottomNavigationKt$BottomNavigationItemBaselineLayout$2 bottomNavigationKt$BottomNavigationItemBaselineLayout$2 = new BottomNavigationKt$BottomNavigationItemBaselineLayout$2(oVar4, f2);
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
            Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r7, bottomNavigationKt$BottomNavigationItemBaselineLayout$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density, companion2.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(layoutId);
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
            Composer r4 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r4, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r4, density2, companion2.getSetDensity());
            Updater.m35299setimpl(r4, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r4, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oVar3.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1198312437);
            if (oVar4 != null) {
                Modifier r42 = PaddingKt.m33270paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f2), BottomNavigationItemHorizontalPadding, 0.0f, 2, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(r42);
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
                Composer r11 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r11, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r11, density3, companion2.getSetDensity());
                Updater.m35299setimpl(r11, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r11, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
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
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationItemBaselineLayout$3(oVar3, oVar4, f2, i6));
        }
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    /* renamed from: BottomNavigationTransition-Klgx-Pg  reason: not valid java name */
    public static final void m33897BottomNavigationTransitionKlgxPg(long j, long j2, boolean z, C13089p<? super Float, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3 = j;
        long j4 = j2;
        boolean z2 = z;
        C13089p<? super Float, ? super Composer, ? super Integer, C11921v> pVar2 = pVar;
        int i7 = i;
        Composer startRestartGroup = composer.startRestartGroup(-985175058);
        if ((i7 & 14) == 0) {
            if (startRestartGroup.changed(j3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (startRestartGroup.changed(j4)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 7168) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985175058, i8, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:221)");
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, BottomNavigationAnimationSpec, 0.0f, (Function1<? super Float, C11921v>) null, startRestartGroup, 48, 12);
            long r9 = ColorKt.m35722lerpjxsXWHM(j4, j3, BottomNavigationTransition_Klgx_Pg$lambda$3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(Color.m35670copywmQWz5c$default(r9, 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m35673getAlphaimpl(r9)))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(startRestartGroup, -138092754, true, new BottomNavigationKt$BottomNavigationTransition$1(pVar2, i8, animateFloatAsState)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationTransition$2(j, j2, z, pVar, i));
        }
    }

    /* access modifiers changed from: private */
    public static final float BottomNavigationTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s  reason: not valid java name */
    public static final MeasureResult m33901placeIcon3p2s80s(MeasureScope measureScope, Placeable placeable, long j) {
        int r2 = Constraints.m38411getMaxHeightimpl(j);
        return MeasureScope.layout$default(measureScope, placeable.getWidth(), r2, (Map) null, new BottomNavigationKt$placeIcon$1(placeable, (r2 - placeable.getHeight()) / 2), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0  reason: not valid java name */
    public static final MeasureResult m33902placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j, float f) {
        int r2 = Constraints.m38411getMaxHeightimpl(j);
        int i = placeable.get(AlignmentLineKt.getLastBaseline());
        int r3 = measureScope.m38443roundToPx0680j_4(CombinedItemTextBaseline);
        int i2 = (r2 - i) - r3;
        int height = (r2 - (r3 * 2)) - placeable2.getHeight();
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        return MeasureScope.layout$default(measureScope, max, r2, (Map) null, new BottomNavigationKt$placeLabelAndIcon$1(f, placeable, (max - placeable.getWidth()) / 2, i2, C13265c.m30134c(((float) (((r2 - placeable2.getHeight()) / 2) - height)) * (((float) 1) - f)), placeable2, (max - placeable2.getWidth()) / 2, height), 4, (Object) null);
    }
}
