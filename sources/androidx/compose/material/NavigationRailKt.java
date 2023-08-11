package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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

@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,405:1\n25#2:406\n460#2,13:432\n473#2,3:446\n456#2,11:467\n460#2,13:497\n473#2,3:511\n460#2,13:535\n473#2,3:549\n467#2,3:554\n1114#3,6:407\n76#4:413\n76#4:420\n76#4:455\n76#4:485\n76#4:523\n68#5,5:414\n73#5:445\n77#5:450\n67#5,6:478\n73#5:510\n77#5:515\n67#5,6:516\n73#5:548\n77#5:553\n75#6:419\n76#6,11:421\n89#6:449\n71#6,4:451\n75#6,11:456\n75#6:484\n76#6,11:486\n89#6:514\n75#6:522\n76#6,11:524\n89#6:552\n88#6:557\n76#7:558\n154#8:559\n154#8:560\n154#8:561\n154#8:562\n154#8:563\n154#8:564\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n155#1:406\n176#1:432,13\n176#1:446,3\n265#1:467,11\n267#1:497,13\n267#1:511,3\n269#1:535,13\n269#1:549,3\n265#1:554,3\n155#1:407,6\n157#1:413\n176#1:420\n265#1:455\n267#1:485\n269#1:523\n176#1:414,5\n176#1:445\n176#1:450\n267#1:478,6\n267#1:510\n267#1:515\n269#1:516,6\n269#1:548\n269#1:553\n176#1:419\n176#1:421,11\n176#1:449\n265#1:451,4\n265#1:456,11\n267#1:484\n267#1:486,11\n267#1:514\n269#1:522\n269#1:524,11\n269#1:552\n265#1:557\n233#1:558\n379#1:559\n384#1:560\n389#1:561\n395#1:562\n400#1:563\n405#1:564\n*E\n"})
/* compiled from: NavigationRail.kt */
public final class NavigationRailKt {
    /* access modifiers changed from: private */
    public static final float HeaderPadding;
    private static final float ItemIconTopOffset = C1232Dp.m38468constructorimpl((float) 14);
    private static final float ItemLabelBaselineBottomOffset = C1232Dp.m38468constructorimpl((float) 16);
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, (DefaultConstructorMarker) null);
    private static final float NavigationRailItemCompactSize = C1232Dp.m38468constructorimpl((float) 56);
    private static final float NavigationRailItemSize = C1232Dp.m38468constructorimpl((float) 72);
    /* access modifiers changed from: private */
    public static final float NavigationRailPadding;

    static {
        float f = (float) 8;
        NavigationRailPadding = C1232Dp.m38468constructorimpl(f);
        HeaderPadding = C1232Dp.m38468constructorimpl(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0130  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: NavigationRail-HsRjFd4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34060NavigationRailHsRjFd4(androidx.compose.p002ui.Modifier r22, long r23, long r25, float r27, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r28, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 1790971523(0x6ac00e83, float:1.1609114E26)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r9 | 6
            r4 = r3
            r3 = r22
            goto L_0x0030
        L_0x001c:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r22
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r9
            goto L_0x0030
        L_0x002d:
            r3 = r22
            r4 = r9
        L_0x0030:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r32 & 2
            if (r5 != 0) goto L_0x0043
            r5 = r23
            boolean r7 = r1.changed((long) r5)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0043:
            r5 = r23
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
            goto L_0x004b
        L_0x0049:
            r5 = r23
        L_0x004b:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0062
            r7 = r32 & 4
            r10 = r25
            if (r7 != 0) goto L_0x005e
            boolean r7 = r1.changed((long) r10)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r7
            goto L_0x0064
        L_0x0062:
            r10 = r25
        L_0x0064:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007e
            r12 = r27
            boolean r13 = r1.changed((float) r12)
            if (r13 == 0) goto L_0x007a
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r13
            goto L_0x0080
        L_0x007e:
            r12 = r27
        L_0x0080:
            r13 = r32 & 16
            if (r13 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0087:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x009c
            r14 = r28
            boolean r15 = r1.changedInstance(r14)
            if (r15 == 0) goto L_0x0098
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r15
            goto L_0x009e
        L_0x009c:
            r14 = r28
        L_0x009e:
            r15 = r32 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00a8
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a6:
            r4 = r4 | r15
            goto L_0x00b8
        L_0x00a8:
            r15 = r9 & r16
            if (r15 != 0) goto L_0x00b8
            boolean r15 = r1.changedInstance(r8)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a6
        L_0x00b8:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r4
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r0) goto L_0x00ce
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x00c8
            goto L_0x00ce
        L_0x00c8:
            r1.skipToGroupEnd()
            r7 = r14
            goto L_0x0175
        L_0x00ce:
            r1.startDefaults()
            r0 = r9 & 1
            r15 = 6
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x00dd
            goto L_0x00f2
        L_0x00dd:
            r1.skipToGroupEnd()
            r0 = r32 & 2
            if (r0 == 0) goto L_0x00e6
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e6:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x00ec
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ec:
            r0 = r3
        L_0x00ed:
            r2 = r10
            r7 = r14
        L_0x00ef:
            r10 = r4
            r4 = r12
            goto L_0x0127
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00f8
        L_0x00f7:
            r0 = r3
        L_0x00f8:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x0109
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r2 = r2.getColors(r1, r15)
            long r2 = r2.m33956getSurface0d7_KjU()
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r5 = r2
        L_0x0109:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x0118
            int r2 = r4 >> 3
            r2 = r2 & 14
            long r2 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r5, r1, r2)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r10 = r2
        L_0x0118:
            if (r7 == 0) goto L_0x0121
            androidx.compose.material.NavigationRailDefaults r2 = androidx.compose.material.NavigationRailDefaults.INSTANCE
            float r2 = r2.m34059getElevationD9Ej5fM()
            r12 = r2
        L_0x0121:
            if (r13 == 0) goto L_0x00ed
            r2 = 0
            r7 = r2
            r2 = r10
            goto L_0x00ef
        L_0x0127:
            r1.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x0139
            r11 = -1
            java.lang.String r12 = "androidx.compose.material.NavigationRail (NavigationRail.kt:92)"
            r13 = 1790971523(0x6ac00e83, float:1.1609114E26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r13, r10, r11, r12)
        L_0x0139:
            r11 = 0
            r17 = 0
            androidx.compose.material.NavigationRailKt$NavigationRail$1 r12 = new androidx.compose.material.NavigationRailKt$NavigationRail$1
            r12.<init>(r7, r10, r8)
            r13 = -1571506489(0xffffffffa254b6c7, float:-2.882812E-18)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r13, r14, r12)
            r12 = r10 & 14
            r13 = 1572864(0x180000, float:2.204052E-39)
            r12 = r12 | r13
            int r13 = r10 << 3
            r14 = r13 & 896(0x380, float:1.256E-42)
            r12 = r12 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            int r10 = r10 << r15
            r10 = r10 & r16
            r20 = r12 | r10
            r21 = 18
            r10 = r0
            r12 = r5
            r14 = r2
            r16 = r17
            r17 = r4
            r19 = r1
            androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0172
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0172:
            r10 = r2
            r12 = r4
            r3 = r0
        L_0x0175:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.endRestartGroup()
            if (r13 != 0) goto L_0x017c
            goto L_0x018f
        L_0x017c:
            androidx.compose.material.NavigationRailKt$NavigationRail$2 r14 = new androidx.compose.material.NavigationRailKt$NavigationRail$2
            r0 = r14
            r1 = r3
            r2 = r5
            r4 = r10
            r6 = r12
            r8 = r29
            r9 = r31
            r10 = r32
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r13.updateScope(r14)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m34060NavigationRailHsRjFd4(androidx.compose.ui.Modifier, long, long, float, of.p, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: NavigationRailItem-0S3VyRs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34061NavigationRailItem0S3VyRs(boolean r24, p404of.C13074a<p336ef.C11921v> r25, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r26, androidx.compose.p002ui.Modifier r27, boolean r28, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r29, boolean r30, androidx.compose.foundation.interaction.MutableInteractionSource r31, long r32, long r34, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r2 = r25
            r3 = r26
            r13 = r37
            r14 = r38
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r0 = -1813548445(0xffffffff93e77263, float:-5.8425392E-27)
            r1 = r36
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r4 = r14 & 1
            if (r4 == 0) goto L_0x0025
            r4 = r13 | 6
            r5 = r4
            r4 = r24
            goto L_0x0039
        L_0x0025:
            r4 = r13 & 14
            if (r4 != 0) goto L_0x0036
            r4 = r24
            boolean r5 = r1.changed((boolean) r4)
            if (r5 == 0) goto L_0x0033
            r5 = 4
            goto L_0x0034
        L_0x0033:
            r5 = 2
        L_0x0034:
            r5 = r5 | r13
            goto L_0x0039
        L_0x0036:
            r4 = r24
            r5 = r13
        L_0x0039:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x0040
            r5 = r5 | 48
            goto L_0x0050
        L_0x0040:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0050
            boolean r6 = r1.changedInstance(r2)
            if (r6 == 0) goto L_0x004d
            r6 = 32
            goto L_0x004f
        L_0x004d:
            r6 = 16
        L_0x004f:
            r5 = r5 | r6
        L_0x0050:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x0057
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            boolean r6 = r1.changedInstance(r3)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r5 = r5 | r6
        L_0x0067:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x006e
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r27
            boolean r8 = r1.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r5 = r5 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r27
        L_0x0083:
            r8 = r14 & 16
            if (r8 == 0) goto L_0x008a
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008a:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x009f
            r9 = r28
            boolean r10 = r1.changed((boolean) r9)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r5 = r5 | r10
            goto L_0x00a1
        L_0x009f:
            r9 = r28
        L_0x00a1:
            r10 = r14 & 32
            if (r10 == 0) goto L_0x00a9
            r11 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r11
            goto L_0x00bd
        L_0x00a9:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x00bd
            r11 = r29
            boolean r12 = r1.changedInstance(r11)
            if (r12 == 0) goto L_0x00b9
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r5 = r5 | r12
            goto L_0x00bf
        L_0x00bd:
            r11 = r29
        L_0x00bf:
            r12 = r14 & 64
            if (r12 == 0) goto L_0x00c7
            r15 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r15
            goto L_0x00dc
        L_0x00c7:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r13
            if (r15 != 0) goto L_0x00dc
            r15 = r30
            boolean r16 = r1.changed((boolean) r15)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r5 = r5 | r16
            goto L_0x00de
        L_0x00dc:
            r15 = r30
        L_0x00de:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e9
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r2 = r31
            goto L_0x00fe
        L_0x00e9:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            r2 = r31
            if (r17 != 0) goto L_0x00fe
            boolean r17 = r1.changed((java.lang.Object) r2)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r5 = r5 | r17
        L_0x00fe:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x011a
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0113
            r2 = r32
            boolean r17 = r1.changed((long) r2)
            if (r17 == 0) goto L_0x0115
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0113:
            r2 = r32
        L_0x0115:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r5 = r5 | r17
            goto L_0x011c
        L_0x011a:
            r2 = r32
        L_0x011c:
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x0138
            r2 = r14 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0131
            r2 = r34
            boolean r17 = r1.changed((long) r2)
            if (r17 == 0) goto L_0x0133
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0131:
            r2 = r34
        L_0x0133:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r5 = r5 | r17
            goto L_0x013a
        L_0x0138:
            r2 = r34
        L_0x013a:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r5 & r17
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x015c
            boolean r2 = r1.getSkipping()
            if (r2 != 0) goto L_0x014b
            goto L_0x015c
        L_0x014b:
            r1.skipToGroupEnd()
            r3 = r26
            r8 = r31
            r4 = r7
            r5 = r9
            r6 = r11
            r7 = r15
            r9 = r32
            r11 = r34
            goto L_0x035d
        L_0x015c:
            r1.startDefaults()
            r2 = r13 & 1
            r17 = 0
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = 1
            if (r2 == 0) goto L_0x018a
            boolean r2 = r1.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0170
            goto L_0x018a
        L_0x0170:
            r1.skipToGroupEnd()
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0179
            r5 = r5 & r18
        L_0x0179:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0181
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r0
        L_0x0181:
            r0 = r31
            r19 = r34
            r2 = r7
            r6 = r32
            goto L_0x020b
        L_0x018a:
            if (r6 == 0) goto L_0x018f
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0190
        L_0x018f:
            r2 = r7
        L_0x0190:
            if (r8 == 0) goto L_0x0193
            r9 = r3
        L_0x0193:
            if (r10 == 0) goto L_0x0197
            r11 = r17
        L_0x0197:
            if (r12 == 0) goto L_0x019a
            r15 = r3
        L_0x019a:
            if (r0 == 0) goto L_0x01bb
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r0)
            java.lang.Object r0 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x01b5
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r1.updateRememberedValue(r0)
        L_0x01b5:
            r1.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x01bd
        L_0x01bb:
            r0 = r31
        L_0x01bd:
            r6 = r14 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x01cf
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.INSTANCE
            r7 = 6
            androidx.compose.material.Colors r6 = r6.getColors(r1, r7)
            long r6 = r6.m33952getPrimary0d7_KjU()
            r5 = r5 & r18
            goto L_0x01d1
        L_0x01cf:
            r6 = r32
        L_0x01d1:
            r8 = r14 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0209
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.ui.graphics.Color r8 = (androidx.compose.p002ui.graphics.Color) r8
            long r19 = r8.m35681unboximpl()
            androidx.compose.material.ContentAlpha r8 = androidx.compose.material.ContentAlpha.INSTANCE
            r10 = 6
            float r8 = r8.getMedium(r1, r10)
            r10 = 0
            r12 = 0
            r18 = 0
            r21 = 14
            r22 = 0
            r27 = r19
            r29 = r8
            r30 = r10
            r31 = r12
            r32 = r18
            r33 = r21
            r34 = r22
            long r19 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r27, r29, r30, r31, r32, r33, r34)
            r8 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r8
            goto L_0x020b
        L_0x0209:
            r19 = r34
        L_0x020b:
            r1.endDefaults()
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x021d
            r8 = -1
            java.lang.String r10 = "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)"
            r12 = -1813548445(0xffffffff93e77263, float:-5.8425392E-27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r12, r5, r8, r10)
        L_0x021d:
            if (r11 == 0) goto L_0x022b
            androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1 r8 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            r8.<init>(r11, r5)
            r10 = -180398615(0xfffffffff53f55e9, float:-2.4254667E32)
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r10, r3, r8)
        L_0x022b:
            r8 = r17
            if (r11 != 0) goto L_0x0232
            float r10 = NavigationRailItemCompactSize
            goto L_0x0234
        L_0x0232:
            float r10 = NavigationRailItemSize
        L_0x0234:
            r12 = 0
            r16 = 0
            int r3 = r5 >> 18
            r3 = r3 & 896(0x380, float:1.256E-42)
            r17 = 6
            r3 = r3 | 6
            r17 = 2
            r27 = r12
            r28 = r16
            r29 = r6
            r31 = r1
            r32 = r3
            r33 = r17
            androidx.compose.foundation.Indication r3 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r27, r28, r29, r31, r32, r33)
            androidx.compose.ui.semantics.Role$Companion r12 = androidx.compose.p002ui.semantics.Role.Companion
            int r12 = r12.m37820getTabo7Vup1c()
            androidx.compose.ui.semantics.Role r12 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r12)
            r27 = r2
            r28 = r24
            r29 = r0
            r30 = r3
            r31 = r9
            r32 = r12
            r33 = r25
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.selection.SelectableKt.m33587selectableO2vRcR0(r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m33338size3ABfNKs(r3, r10)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r10 = r10.getCenter()
            r12 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.startReplaceableGroup(r12)
            r12 = 0
            r35 = r0
            r0 = 6
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r10, r12, r1, r0)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r1.consume(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.p002ui.unit.Density) r0
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r12 = r1.consume(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p002ui.unit.LayoutDirection) r12
            r16 = r2
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r2 = r1.consume(r2)
            androidx.compose.ui.platform.ViewConfiguration r2 = (androidx.compose.p002ui.platform.ViewConfiguration) r2
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r4 = r17.getConstructor()
            of.p r3 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r3)
            r18 = r9
            androidx.compose.runtime.Applier r9 = r1.getApplier()
            boolean r9 = r9 instanceof androidx.compose.runtime.Applier
            if (r9 != 0) goto L_0x02c2
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02c2:
            r1.startReusableNode()
            boolean r9 = r1.getInserting()
            if (r9 == 0) goto L_0x02cf
            r1.createNode(r4)
            goto L_0x02d2
        L_0x02cf:
            r1.useNode()
        L_0x02d2:
            r1.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r9 = r17.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r10, r9)
            of.o r9 = r17.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r0, r9)
            of.o r0 = r17.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r12, r0)
            of.o r0 = r17.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r2, r0)
            r1.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.invoke(r0, r1, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1 r0 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
            r3 = r26
            r0.<init>(r15, r3, r8, r5)
            r2 = 670576792(0x27f83098, float:6.8886513E-15)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r2, r4, r0)
            int r2 = r5 >> 24
            r4 = r2 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            r4 = 6
            int r4 = r5 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r27 = r6
            r29 = r19
            r31 = r24
            r32 = r0
            r33 = r1
            r34 = r2
            m34062NavigationRailTransitionKlgxPg(r27, r29, r31, r32, r33, r34)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0352
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0352:
            r8 = r35
            r9 = r6
            r6 = r11
            r7 = r15
            r4 = r16
            r5 = r18
            r11 = r19
        L_0x035d:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x0364
            goto L_0x037b
        L_0x0364:
            androidx.compose.material.NavigationRailKt$NavigationRailItem$3 r2 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$3
            r0 = r2
            r1 = r24
            r23 = r2
            r2 = r25
            r3 = r26
            r13 = r37
            r14 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
            r0 = r23
            r15.updateScope(r0)
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m34061NavigationRailItem0S3VyRs(boolean, of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void NavigationRailItemBaselineLayout(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, float f, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        float f2 = f;
        int i6 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1903861684);
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
                ComposerKt.traceEventStart(-1903861684, i2, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:258)");
            }
            NavigationRailKt$NavigationRailItemBaselineLayout$2 navigationRailKt$NavigationRailItemBaselineLayout$2 = new NavigationRailKt$NavigationRailItemBaselineLayout$2(oVar4, f2);
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
            Updater.m35299setimpl(r13, navigationRailKt$NavigationRailItemBaselineLayout$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r13, density, companion2.getSetDensity());
            Updater.m35299setimpl(r13, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r13, viewConfiguration, companion2.getSetViewConfiguration());
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
            startRestartGroup.startReplaceableGroup(286683862);
            if (oVar4 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f2);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(alpha);
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
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(oVar3, oVar4, f2, i6));
        }
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    /* renamed from: NavigationRailTransition-Klgx-Pg  reason: not valid java name */
    public static final void m34062NavigationRailTransitionKlgxPg(long j, long j2, boolean z, C13089p<? super Float, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i) {
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
        Composer startRestartGroup = composer.startRestartGroup(-207161906);
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
                ComposerKt.traceEventStart(-207161906, i8, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:226)");
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, NavigationRailAnimationSpec, 0.0f, (Function1<? super Float, C11921v>) null, startRestartGroup, 48, 12);
            long r9 = ColorKt.m35722lerpjxsXWHM(j4, j3, NavigationRailTransition_Klgx_Pg$lambda$3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(Color.m35670copywmQWz5c$default(r9, 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m35673getAlphaimpl(r9)))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(startRestartGroup, -1688205042, true, new NavigationRailKt$NavigationRailTransition$1(pVar2, i8, animateFloatAsState)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailTransition$2(j, j2, z, pVar, i));
        }
    }

    /* access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s  reason: not valid java name */
    public static final MeasureResult m34066placeIcon3p2s80s(MeasureScope measureScope, Placeable placeable, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m38412getMaxWidthimpl(j), Constraints.m38411getMaxHeightimpl(j), (Map) null, new NavigationRailKt$placeIcon$1(placeable, Math.max(0, (Constraints.m38412getMaxWidthimpl(j) - placeable.getWidth()) / 2), Math.max(0, (Constraints.m38411getMaxHeightimpl(j) - placeable.getHeight()) / 2)), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0  reason: not valid java name */
    public static final MeasureResult m34067placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j, float f) {
        int i = placeable.get(AlignmentLineKt.getLastBaseline());
        int r6 = (Constraints.m38411getMaxHeightimpl(j) - i) - measureScope.m38443roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        int r5 = (Constraints.m38412getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        int r10 = measureScope.m38443roundToPx0680j_4(ItemIconTopOffset);
        int r9 = (Constraints.m38412getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        int c = C13265c.m30134c(((float) (((Constraints.m38411getMaxHeightimpl(j) - placeable2.getHeight()) / 2) - r10)) * (((float) 1) - f));
        return MeasureScope.layout$default(measureScope, Constraints.m38412getMaxWidthimpl(j), Constraints.m38411getMaxHeightimpl(j), (Map) null, new NavigationRailKt$placeLabelAndIcon$1(f, placeable, r5, r6, c, placeable2, r9, r10), 4, (Object) null);
    }
}
