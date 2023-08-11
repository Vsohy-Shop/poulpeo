package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13074a;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,781:1\n154#2:782\n154#2:783\n154#2:784\n154#2:785\n76#3:786\n76#3:787\n67#4,3:788\n66#4:791\n50#4:798\n49#4:799\n67#4,3:806\n66#4:809\n36#4:816\n25#4:828\n1114#5,6:792\n1114#5,6:800\n1114#5,6:810\n1114#5,6:817\n1114#5,3:829\n1117#5,3:835\n51#6:823\n474#7,4:824\n478#7,2:832\n482#7:838\n474#8:834\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n126#1:782\n129#1:783\n206#1:784\n209#1:785\n265#1:786\n266#1:787\n267#1:788,3\n267#1:791\n275#1:798\n275#1:799\n279#1:806,3\n279#1:809\n283#1:816\n740#1:828\n267#1:792,6\n275#1:800,6\n279#1:810,6\n283#1:817,6\n740#1:829,3\n740#1:835,3\n388#1:823\n740#1:824,4\n740#1:832,2\n740#1:838\n740#1:834\n*E\n"})
/* compiled from: Pager.kt */
public final class PagerKt {
    /* access modifiers changed from: private */
    public static final ConsumeAllFlingOnDirection ConsumeHorizontalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Horizontal);
    /* access modifiers changed from: private */
    public static final ConsumeAllFlingOnDirection ConsumeVerticalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Vertical);
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;

    /* JADX WARNING: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: HorizontalPager-AlbwjTQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33584HorizontalPagerAlbwjTQ(int r36, androidx.compose.p002ui.Modifier r37, androidx.compose.foundation.pager.PagerState r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.p002ui.Alignment.Vertical r43, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r47, androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection r48, p404of.C13089p<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            r15 = r49
            r14 = r51
            r13 = r52
            r12 = r53
            java.lang.String r0 = "pageContent"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            r0 = -547020879(0xffffffffdf651fb1, float:-1.6510109E19)
            r1 = r50
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r14 | 6
            r10 = r36
            goto L_0x0031
        L_0x001f:
            r1 = r14 & 14
            r10 = r36
            if (r1 != 0) goto L_0x0030
            boolean r1 = r11.changed((int) r10)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r14
            goto L_0x0031
        L_0x0030:
            r1 = r14
        L_0x0031:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r37
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r1 = r1 | r8
            goto L_0x004d
        L_0x004b:
            r7 = r37
        L_0x004d:
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r12 & 4
            if (r8 != 0) goto L_0x0060
            r8 = r38
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0062
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r8 = r38
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r9
            goto L_0x0068
        L_0x0066:
            r8 = r38
        L_0x0068:
            r9 = r12 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r39
            boolean r18 = r11.changed((java.lang.Object) r2)
            if (r18 == 0) goto L_0x0082
            r18 = r16
            goto L_0x0084
        L_0x0082:
            r18 = r17
        L_0x0084:
            r1 = r1 | r18
            goto L_0x0089
        L_0x0087:
            r2 = r39
        L_0x0089:
            r18 = r12 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r18 == 0) goto L_0x0095
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r40
            goto L_0x00a8
        L_0x0095:
            r20 = r14 & r19
            r3 = r40
            if (r20 != 0) goto L_0x00a8
            boolean r21 = r11.changed((java.lang.Object) r3)
            if (r21 == 0) goto L_0x00a4
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r21
        L_0x00a8:
            r21 = r12 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00b3
            r1 = r1 | r22
            r5 = r41
            goto L_0x00c8
        L_0x00b3:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r14 & r23
            r5 = r41
            if (r23 != 0) goto L_0x00c8
            boolean r24 = r11.changed((int) r5)
            if (r24 == 0) goto L_0x00c4
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r1 = r1 | r24
        L_0x00c8:
            r24 = r12 & 64
            if (r24 == 0) goto L_0x00d3
            r25 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r25
            r6 = r42
            goto L_0x00e8
        L_0x00d3:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r14 & r25
            r6 = r42
            if (r25 != 0) goto L_0x00e8
            boolean r26 = r11.changed((float) r6)
            if (r26 == 0) goto L_0x00e4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r1 = r1 | r26
        L_0x00e8:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r2 = r43
            goto L_0x0108
        L_0x00f3:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r14 & r27
            r2 = r43
            if (r27 != 0) goto L_0x0108
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x0104
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r27
        L_0x0108:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0124
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x011d
            r2 = r44
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x011f
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011d:
            r2 = r44
        L_0x011f:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r1 = r1 | r27
            goto L_0x0126
        L_0x0124:
            r2 = r44
        L_0x0126:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x012f
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x0147
        L_0x012f:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0147
            r27 = r6
            r6 = r45
            boolean r28 = r11.changed((boolean) r6)
            if (r28 == 0) goto L_0x0142
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0144
        L_0x0142:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0144:
            r1 = r1 | r28
            goto L_0x014b
        L_0x0147:
            r27 = r6
            r6 = r45
        L_0x014b:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0156
            r20 = r13 | 6
            r28 = r6
            r6 = r46
            goto L_0x0172
        L_0x0156:
            r28 = r13 & 14
            if (r28 != 0) goto L_0x016c
            r28 = r6
            r6 = r46
            boolean r29 = r11.changed((boolean) r6)
            if (r29 == 0) goto L_0x0167
            r20 = 4
            goto L_0x0169
        L_0x0167:
            r20 = 2
        L_0x0169:
            r20 = r13 | r20
            goto L_0x0172
        L_0x016c:
            r28 = r6
            r6 = r46
            r20 = r13
        L_0x0172:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x017f
            r20 = r20 | 48
            r29 = r6
            r2 = r20
            r6 = r47
            goto L_0x019b
        L_0x017f:
            r29 = r13 & 112(0x70, float:1.57E-43)
            if (r29 != 0) goto L_0x0195
            r29 = r6
            r6 = r47
            boolean r30 = r11.changedInstance(r6)
            if (r30 == 0) goto L_0x0190
            r23 = 32
            goto L_0x0192
        L_0x0190:
            r23 = 16
        L_0x0192:
            r20 = r20 | r23
            goto L_0x0199
        L_0x0195:
            r29 = r6
            r6 = r47
        L_0x0199:
            r2 = r20
        L_0x019b:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x01a1
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x01a1:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01a8
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b7
        L_0x01a8:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01b7
            boolean r3 = r11.changedInstance(r15)
            if (r3 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r16 = r17
        L_0x01b5:
            r2 = r2 | r16
        L_0x01b7:
            r3 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 != r2) goto L_0x01ef
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x01ef
            r2 = r3 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r2 != r5) goto L_0x01ef
            boolean r2 = r11.getSkipping()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01ef
        L_0x01d2:
            r11.skipToGroupEnd()
            r4 = r39
            r5 = r40
            r6 = r41
            r9 = r44
            r10 = r45
            r12 = r47
            r13 = r48
            r2 = r7
            r3 = r8
            r22 = r11
            r7 = r42
            r8 = r43
            r11 = r46
            goto L_0x0395
        L_0x01ef:
            r11.startDefaults()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x022c
            boolean r2 = r11.getDefaultsInvalid()
            if (r2 == 0) goto L_0x01fd
            goto L_0x022c
        L_0x01fd:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0206
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0206:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x020e
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x020e:
            if (r6 == 0) goto L_0x0212
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0212:
            r23 = r39
            r24 = r40
            r25 = r41
            r27 = r42
            r28 = r43
            r29 = r44
            r30 = r45
            r33 = r46
            r31 = r47
            r32 = r48
            r20 = r7
            r21 = r8
            goto L_0x02fc
        L_0x022c:
            if (r4 == 0) goto L_0x0233
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r16 = r2
            goto L_0x0235
        L_0x0233:
            r16 = r7
        L_0x0235:
            r2 = r12 & 4
            r7 = 0
            if (r2 == 0) goto L_0x0247
            r2 = 0
            r4 = 3
            androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(r7, r2, r11, r7, r4)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r20 = r1
            r17 = r2
            goto L_0x024b
        L_0x0247:
            r20 = r1
            r17 = r8
        L_0x024b:
            if (r9 == 0) goto L_0x0259
            float r1 = (float) r7
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r1)
            r23 = r1
            goto L_0x025b
        L_0x0259:
            r23 = r39
        L_0x025b:
            if (r18 == 0) goto L_0x0262
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.INSTANCE
            r18 = r1
            goto L_0x0264
        L_0x0262:
            r18 = r40
        L_0x0264:
            if (r21 == 0) goto L_0x0269
            r21 = r7
            goto L_0x026b
        L_0x0269:
            r21 = r41
        L_0x026b:
            if (r24 == 0) goto L_0x0275
            float r1 = (float) r7
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            r24 = r1
            goto L_0x0277
        L_0x0275:
            r24 = r42
        L_0x0277:
            if (r0 == 0) goto L_0x0280
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r0 = r0.getCenterVertically()
            goto L_0x0282
        L_0x0280:
            r0 = r43
        L_0x0282:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02af
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            int r2 = r20 >> 6
            r2 = r2 & 14
            r25 = r2 | r22
            r30 = 30
            r2 = r17
            r31 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r32 = r6
            r6 = r9
            r33 = r7
            r7 = r11
            r8 = r25
            r9 = r30
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r1.flingBehavior(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r20 & r2
            goto L_0x02b9
        L_0x02af:
            r31 = r3
            r32 = r6
            r33 = r7
            r1 = r44
            r2 = r20
        L_0x02b9:
            if (r27 == 0) goto L_0x02bd
            r3 = 1
            goto L_0x02bf
        L_0x02bd:
            r3 = r45
        L_0x02bf:
            if (r28 == 0) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            r33 = r46
        L_0x02c4:
            if (r29 == 0) goto L_0x02c8
            r4 = 0
            goto L_0x02ca
        L_0x02c8:
            r4 = r47
        L_0x02ca:
            if (r32 == 0) goto L_0x02e4
            androidx.compose.foundation.pager.PagerDefaults r5 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r5 = r5.pageNestedScrollConnection(r6)
            r6 = r31
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            goto L_0x02f1
        L_0x02e4:
            r6 = r31
            r32 = r48
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
        L_0x02f1:
            r3 = r6
            r20 = r16
            r25 = r21
            r27 = r24
            r21 = r17
            r24 = r18
        L_0x02fc:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:121)"
            r2 = -547020879(0xffffffffdf651fb1, float:-1.6510109E19)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r0)
        L_0x030d:
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Horizontal
            r8 = 0
            int r0 = r1 >> 3
            r2 = r0 & 14
            r2 = r2 | r22
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r2 = r2 & r19
            r0 = r0 | r2
            int r2 = r1 << 3
            r4 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r4
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r4
            r17 = r0 | r2
            int r0 = r1 >> 24
            r1 = r0 & 14
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 256(0x100, float:3.59E-43)
            r0 = r20
            r1 = r21
            r2 = r36
            r3 = r24
            r4 = r27
            r6 = r25
            r7 = r28
            r9 = r23
            r10 = r29
            r22 = r11
            r11 = r30
            r12 = r33
            r13 = r31
            r14 = r32
            r15 = r49
            r16 = r22
            m33585PagerwKDqQAw(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x037d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x037d:
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r31
            r13 = r32
            r11 = r33
        L_0x0395:
            androidx.compose.runtime.ScopeUpdateScope r15 = r22.endRestartGroup()
            if (r15 != 0) goto L_0x039c
            goto L_0x03b7
        L_0x039c:
            androidx.compose.foundation.pager.PagerKt$HorizontalPager$1 r14 = new androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
            r0 = r14
            r1 = r36
            r34 = r14
            r14 = r49
            r35 = r15
            r15 = r51
            r16 = r52
            r17 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r34
            r0 = r35
            r0.updateScope(r1)
        L_0x03b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m33584HorizontalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: androidx.compose.foundation.pager.PagerWrapperFlingBehavior} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Pager-wKDqQAw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33585PagerwKDqQAw(androidx.compose.p002ui.Modifier r29, androidx.compose.foundation.pager.PagerState r30, int r31, androidx.compose.foundation.pager.PageSize r32, float r33, androidx.compose.foundation.gestures.Orientation r34, int r35, androidx.compose.p002ui.Alignment.Vertical r36, androidx.compose.p002ui.Alignment.Horizontal r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r39, boolean r40, boolean r41, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r42, androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection r43, p404of.C13089p<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r44, androidx.compose.runtime.Composer r45, int r46, int r47, int r48) {
        /*
            r1 = r29
            r0 = r30
            r15 = r34
            r14 = r35
            r13 = r38
            r12 = r39
            r11 = r46
            r10 = r48
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            java.lang.String r2 = "state"
            kotlin.jvm.internal.C12775o.m28639i(r0, r2)
            java.lang.String r2 = "pageSize"
            r9 = r32
            kotlin.jvm.internal.C12775o.m28639i(r9, r2)
            java.lang.String r2 = "orientation"
            kotlin.jvm.internal.C12775o.m28639i(r15, r2)
            java.lang.String r2 = "contentPadding"
            kotlin.jvm.internal.C12775o.m28639i(r13, r2)
            java.lang.String r2 = "flingBehavior"
            kotlin.jvm.internal.C12775o.m28639i(r12, r2)
            java.lang.String r2 = "pageNestedScrollConnection"
            r8 = r43
            kotlin.jvm.internal.C12775o.m28639i(r8, r2)
            java.lang.String r2 = "pageContent"
            r7 = r44
            kotlin.jvm.internal.C12775o.m28639i(r7, r2)
            r2 = -765777783(0xffffffffd25b2889, float:-2.35319476E11)
            r3 = r45
            androidx.compose.runtime.Composer r6 = r3.startRestartGroup(r2)
            r3 = r10 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0054
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r3 = r3.getCenterVertically()
            r22 = r3
            goto L_0x0056
        L_0x0054:
            r22 = r36
        L_0x0056:
            r3 = r10 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0063
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r3 = r3.getCenterHorizontally()
            r23 = r3
            goto L_0x0065
        L_0x0063:
            r23 = r37
        L_0x0065:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0073
            java.lang.String r3 = "androidx.compose.foundation.pager.Pager (Pager.kt:240)"
            r5 = r47
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r5, r3)
            goto L_0x0075
        L_0x0073:
            r5 = r47
        L_0x0075:
            r2 = 0
            if (r14 < 0) goto L_0x007a
            r3 = 1
            goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            if (r3 == 0) goto L_0x022a
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r15 != r3) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = r2
        L_0x0084:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r6.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r4 = r6.consume(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p002ui.unit.LayoutDirection) r4
            r37 = r3
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.startReplaceableGroup(r3)
            boolean r16 = r6.changed((java.lang.Object) r13)
            boolean r17 = r6.changed((java.lang.Object) r15)
            r16 = r16 | r17
            boolean r17 = r6.changed((java.lang.Object) r4)
            r16 = r16 | r17
            java.lang.Object r3 = r6.rememberedValue()
            if (r16 != 0) goto L_0x00be
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r16.getEmpty()
            if (r3 != r5) goto L_0x00c9
        L_0x00be:
            float r3 = calculateContentPaddings(r13, r15, r4)
            androidx.compose.ui.unit.Dp r3 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            r6.updateRememberedValue(r3)
        L_0x00c9:
            r6.endReplaceableGroup()
            androidx.compose.ui.unit.Dp r3 = (androidx.compose.p002ui.unit.C1232Dp) r3
            float r16 = r3.m38482unboximpl()
            r5 = r11 & 112(0x70, float:1.57E-43)
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r3)
            boolean r3 = r6.changed((java.lang.Object) r12)
            boolean r4 = r6.changed((java.lang.Object) r0)
            r3 = r3 | r4
            java.lang.Object r4 = r6.rememberedValue()
            if (r3 != 0) goto L_0x00f1
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x00f9
        L_0x00f1:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r4 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior
            r4.<init>(r12, r0)
            r6.updateRememberedValue(r4)
        L_0x00f9:
            r6.endReplaceableGroup()
            r17 = r4
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r17 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r17
            androidx.compose.ui.unit.Dp r4 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r33)
            androidx.compose.ui.unit.Dp r3 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r33)
            int r7 = r11 >> 6
            r7 = r7 & 896(0x380, float:1.256E-42)
            r8 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.startReplaceableGroup(r8)
            boolean r8 = r6.changed((java.lang.Object) r2)
            boolean r18 = r6.changed((java.lang.Object) r0)
            r8 = r8 | r18
            boolean r3 = r6.changed((java.lang.Object) r3)
            r3 = r3 | r8
            java.lang.Object r8 = r6.rememberedValue()
            r9 = 0
            if (r3 != 0) goto L_0x0134
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r8 != r3) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            r3 = r33
            goto L_0x013e
        L_0x0134:
            androidx.compose.foundation.pager.PagerKt$Pager$2$1 r8 = new androidx.compose.foundation.pager.PagerKt$Pager$2$1
            r3 = r33
            r8.<init>(r2, r0, r3, r9)
            r6.updateRememberedValue(r8)
        L_0x013e:
            r6.endReplaceableGroup()
            of.o r8 = (p404of.C13088o) r8
            r9 = r5 | 4096(0x1000, float:5.74E-42)
            r7 = r7 | r9
            r9 = r2
            r10 = r37
            r3 = r30
            r18 = r5
            r5 = r8
            r8 = r6
            androidx.compose.runtime.EffectsKt.LaunchedEffect(r2, r3, r4, r5, r6, r7)
            int r2 = r11 >> 3
            r2 = r2 & 14
            r3 = 1157296644(0x44faf204, float:2007.563)
            r8.startReplaceableGroup(r3)
            boolean r3 = r8.changed((java.lang.Object) r0)
            java.lang.Object r4 = r8.rememberedValue()
            if (r3 != 0) goto L_0x016e
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x0177
        L_0x016e:
            androidx.compose.foundation.pager.PagerKt$Pager$3$1 r4 = new androidx.compose.foundation.pager.PagerKt$Pager$3$1
            r3 = 0
            r4.<init>(r0, r3)
            r8.updateRememberedValue(r4)
        L_0x0177:
            r8.endReplaceableGroup()
            of.o r4 = (p404of.C13088o) r4
            r2 = r2 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r4, (androidx.compose.runtime.Composer) r8, (int) r2)
            r2 = 1445594592(0x562a05e0, float:4.6735552E13)
            r8.startReplaceableGroup(r2)
            if (r40 == 0) goto L_0x0192
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r3 = r18 | 6
            androidx.compose.ui.Modifier r2 = pagerSemantics(r2, r0, r10, r8, r3)
            goto L_0x0194
        L_0x0192:
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
        L_0x0194:
            r8.endReplaceableGroup()
            androidx.compose.ui.Modifier r24 = r1.then(r2)
            r25 = 0
            r26 = 0
            androidx.compose.foundation.pager.PagerKt$Pager$4 r7 = new androidx.compose.foundation.pager.PagerKt$Pager$4
            r2 = r7
            r3 = r10
            r4 = r9
            r5 = r33
            r6 = r16
            r10 = r7
            r7 = r41
            r9 = r8
            r8 = r30
            r0 = r9
            r9 = r46
            r1 = r10
            r10 = r38
            r11 = r17
            r12 = r40
            r13 = r35
            r14 = r23
            r15 = r22
            r16 = r47
            r17 = r32
            r18 = r31
            r19 = r42
            r20 = r43
            r21 = r44
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = -1677736225(0xffffffff9bffc6df, float:-4.2314729E-22)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r0, r2, r3, r1)
            r8 = 3072(0xc00, float:4.305E-42)
            r9 = 6
            r3 = r24
            r4 = r25
            r5 = r26
            r7 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01eb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01eb:
            androidx.compose.runtime.ScopeUpdateScope r15 = r0.endRestartGroup()
            if (r15 != 0) goto L_0x01f2
            goto L_0x0229
        L_0x01f2:
            androidx.compose.foundation.pager.PagerKt$Pager$5 r14 = new androidx.compose.foundation.pager.PagerKt$Pager$5
            r0 = r14
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r22
            r9 = r23
            r10 = r38
            r11 = r39
            r12 = r40
            r13 = r41
            r27 = r14
            r14 = r42
            r28 = r15
            r15 = r43
            r16 = r44
            r17 = r46
            r18 = r47
            r19 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r27
            r0 = r28
            r0.updateScope(r1)
        L_0x0229:
            return
        L_0x022a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "beyondBoundsPageCount should be greater than or equal to 0, you selected "
            r0.append(r1)
            r1 = r35
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m33585PagerwKDqQAw(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, int, androidx.compose.foundation.pager.PageSize, float, androidx.compose.foundation.gestures.Orientation, int, androidx.compose.ui.Alignment$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec<Float> decayAnimationSpec) {
        return new PagerKt$SnapLayoutInfoProvider$1(pagerState, decayAnimationSpec, pagerSnapDistance);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: VerticalPager-AlbwjTQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33586VerticalPagerAlbwjTQ(int r36, androidx.compose.p002ui.Modifier r37, androidx.compose.foundation.pager.PagerState r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.p002ui.Alignment.Horizontal r43, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r47, androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection r48, p404of.C13089p<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            r15 = r49
            r14 = r51
            r13 = r52
            r12 = r53
            java.lang.String r0 = "pageContent"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            r0 = 26030705(0x18d3271, float:5.18676E-38)
            r1 = r50
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r14 | 6
            r10 = r36
            goto L_0x0031
        L_0x001f:
            r1 = r14 & 14
            r10 = r36
            if (r1 != 0) goto L_0x0030
            boolean r1 = r11.changed((int) r10)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r14
            goto L_0x0031
        L_0x0030:
            r1 = r14
        L_0x0031:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r37
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r1 = r1 | r8
            goto L_0x004d
        L_0x004b:
            r7 = r37
        L_0x004d:
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r12 & 4
            if (r8 != 0) goto L_0x0060
            r8 = r38
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0062
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r8 = r38
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r9
            goto L_0x0068
        L_0x0066:
            r8 = r38
        L_0x0068:
            r9 = r12 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r39
            boolean r18 = r11.changed((java.lang.Object) r2)
            if (r18 == 0) goto L_0x0082
            r18 = r16
            goto L_0x0084
        L_0x0082:
            r18 = r17
        L_0x0084:
            r1 = r1 | r18
            goto L_0x0089
        L_0x0087:
            r2 = r39
        L_0x0089:
            r18 = r12 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r18 == 0) goto L_0x0095
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r40
            goto L_0x00a8
        L_0x0095:
            r20 = r14 & r19
            r3 = r40
            if (r20 != 0) goto L_0x00a8
            boolean r21 = r11.changed((java.lang.Object) r3)
            if (r21 == 0) goto L_0x00a4
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r21
        L_0x00a8:
            r21 = r12 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00b3
            r1 = r1 | r22
            r5 = r41
            goto L_0x00c8
        L_0x00b3:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r14 & r23
            r5 = r41
            if (r23 != 0) goto L_0x00c8
            boolean r24 = r11.changed((int) r5)
            if (r24 == 0) goto L_0x00c4
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r1 = r1 | r24
        L_0x00c8:
            r24 = r12 & 64
            if (r24 == 0) goto L_0x00d3
            r25 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r25
            r6 = r42
            goto L_0x00e8
        L_0x00d3:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r14 & r25
            r6 = r42
            if (r25 != 0) goto L_0x00e8
            boolean r26 = r11.changed((float) r6)
            if (r26 == 0) goto L_0x00e4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r1 = r1 | r26
        L_0x00e8:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r2 = r43
            goto L_0x0108
        L_0x00f3:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r14 & r27
            r2 = r43
            if (r27 != 0) goto L_0x0108
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x0104
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r27
        L_0x0108:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0124
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x011d
            r2 = r44
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x011f
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011d:
            r2 = r44
        L_0x011f:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r1 = r1 | r27
            goto L_0x0126
        L_0x0124:
            r2 = r44
        L_0x0126:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x012f
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x0147
        L_0x012f:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0147
            r27 = r6
            r6 = r45
            boolean r28 = r11.changed((boolean) r6)
            if (r28 == 0) goto L_0x0142
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0144
        L_0x0142:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0144:
            r1 = r1 | r28
            goto L_0x014b
        L_0x0147:
            r27 = r6
            r6 = r45
        L_0x014b:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0156
            r20 = r13 | 6
            r28 = r6
            r6 = r46
            goto L_0x0172
        L_0x0156:
            r28 = r13 & 14
            if (r28 != 0) goto L_0x016c
            r28 = r6
            r6 = r46
            boolean r29 = r11.changed((boolean) r6)
            if (r29 == 0) goto L_0x0167
            r20 = 4
            goto L_0x0169
        L_0x0167:
            r20 = 2
        L_0x0169:
            r20 = r13 | r20
            goto L_0x0172
        L_0x016c:
            r28 = r6
            r6 = r46
            r20 = r13
        L_0x0172:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x017f
            r20 = r20 | 48
            r29 = r6
            r2 = r20
            r6 = r47
            goto L_0x019b
        L_0x017f:
            r29 = r13 & 112(0x70, float:1.57E-43)
            if (r29 != 0) goto L_0x0195
            r29 = r6
            r6 = r47
            boolean r30 = r11.changedInstance(r6)
            if (r30 == 0) goto L_0x0190
            r23 = 32
            goto L_0x0192
        L_0x0190:
            r23 = 16
        L_0x0192:
            r20 = r20 | r23
            goto L_0x0199
        L_0x0195:
            r29 = r6
            r6 = r47
        L_0x0199:
            r2 = r20
        L_0x019b:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x01a1
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x01a1:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01a8
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b7
        L_0x01a8:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01b7
            boolean r3 = r11.changedInstance(r15)
            if (r3 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r16 = r17
        L_0x01b5:
            r2 = r2 | r16
        L_0x01b7:
            r3 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 != r2) goto L_0x01ef
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x01ef
            r2 = r3 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r2 != r5) goto L_0x01ef
            boolean r2 = r11.getSkipping()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01ef
        L_0x01d2:
            r11.skipToGroupEnd()
            r4 = r39
            r5 = r40
            r6 = r41
            r9 = r44
            r10 = r45
            r12 = r47
            r13 = r48
            r2 = r7
            r3 = r8
            r22 = r11
            r7 = r42
            r8 = r43
            r11 = r46
            goto L_0x0395
        L_0x01ef:
            r11.startDefaults()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x022c
            boolean r2 = r11.getDefaultsInvalid()
            if (r2 == 0) goto L_0x01fd
            goto L_0x022c
        L_0x01fd:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0206
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0206:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x020e
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x020e:
            if (r6 == 0) goto L_0x0212
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0212:
            r23 = r39
            r24 = r40
            r25 = r41
            r27 = r42
            r28 = r43
            r29 = r44
            r30 = r45
            r33 = r46
            r31 = r47
            r32 = r48
            r20 = r7
            r21 = r8
            goto L_0x02fc
        L_0x022c:
            if (r4 == 0) goto L_0x0233
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r16 = r2
            goto L_0x0235
        L_0x0233:
            r16 = r7
        L_0x0235:
            r2 = r12 & 4
            r7 = 0
            if (r2 == 0) goto L_0x0247
            r2 = 0
            r4 = 3
            androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(r7, r2, r11, r7, r4)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r20 = r1
            r17 = r2
            goto L_0x024b
        L_0x0247:
            r20 = r1
            r17 = r8
        L_0x024b:
            if (r9 == 0) goto L_0x0259
            float r1 = (float) r7
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.m33261PaddingValues0680j_4(r1)
            r23 = r1
            goto L_0x025b
        L_0x0259:
            r23 = r39
        L_0x025b:
            if (r18 == 0) goto L_0x0262
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.INSTANCE
            r18 = r1
            goto L_0x0264
        L_0x0262:
            r18 = r40
        L_0x0264:
            if (r21 == 0) goto L_0x0269
            r21 = r7
            goto L_0x026b
        L_0x0269:
            r21 = r41
        L_0x026b:
            if (r24 == 0) goto L_0x0275
            float r1 = (float) r7
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            r24 = r1
            goto L_0x0277
        L_0x0275:
            r24 = r42
        L_0x0277:
            if (r0 == 0) goto L_0x0280
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r0 = r0.getCenterHorizontally()
            goto L_0x0282
        L_0x0280:
            r0 = r43
        L_0x0282:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02af
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            int r2 = r20 >> 6
            r2 = r2 & 14
            r25 = r2 | r22
            r30 = 30
            r2 = r17
            r31 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r32 = r6
            r6 = r9
            r33 = r7
            r7 = r11
            r8 = r25
            r9 = r30
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r1.flingBehavior(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r20 & r2
            goto L_0x02b9
        L_0x02af:
            r31 = r3
            r32 = r6
            r33 = r7
            r1 = r44
            r2 = r20
        L_0x02b9:
            if (r27 == 0) goto L_0x02bd
            r3 = 1
            goto L_0x02bf
        L_0x02bd:
            r3 = r45
        L_0x02bf:
            if (r28 == 0) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            r33 = r46
        L_0x02c4:
            if (r29 == 0) goto L_0x02c8
            r4 = 0
            goto L_0x02ca
        L_0x02c8:
            r4 = r47
        L_0x02ca:
            if (r32 == 0) goto L_0x02e4
            androidx.compose.foundation.pager.PagerDefaults r5 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r5 = r5.pageNestedScrollConnection(r6)
            r6 = r31
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            goto L_0x02f1
        L_0x02e4:
            r6 = r31
            r32 = r48
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
        L_0x02f1:
            r3 = r6
            r20 = r16
            r25 = r21
            r27 = r24
            r21 = r17
            r24 = r18
        L_0x02fc:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "androidx.compose.foundation.pager.VerticalPager (Pager.kt:201)"
            r2 = 26030705(0x18d3271, float:5.18676E-38)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r0)
        L_0x030d:
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Vertical
            r7 = 0
            int r0 = r1 >> 3
            r2 = r0 & 14
            r2 = r2 | r22
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r2 = r2 & r19
            r0 = r0 | r2
            int r2 = r1 << 3
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r2
            r0 = r0 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r4
            r0 = r0 | r2
            int r2 = r1 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r4
            r17 = r0 | r2
            int r0 = r1 >> 24
            r1 = r0 & 14
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 128(0x80, float:1.794E-43)
            r0 = r20
            r1 = r21
            r2 = r36
            r3 = r24
            r4 = r27
            r6 = r25
            r8 = r28
            r9 = r23
            r10 = r29
            r22 = r11
            r11 = r30
            r12 = r33
            r13 = r31
            r14 = r32
            r15 = r49
            r16 = r22
            m33585PagerwKDqQAw(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x037d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x037d:
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r31
            r13 = r32
            r11 = r33
        L_0x0395:
            androidx.compose.runtime.ScopeUpdateScope r15 = r22.endRestartGroup()
            if (r15 != 0) goto L_0x039c
            goto L_0x03b7
        L_0x039c:
            androidx.compose.foundation.pager.PagerKt$VerticalPager$1 r14 = new androidx.compose.foundation.pager.PagerKt$VerticalPager$1
            r0 = r14
            r1 = r36
            r34 = r14
            r14 = r49
            r35 = r15
            r15 = r51
            r16 = r52
            r17 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r34
            r0 = r35
            r0.updateScope(r1)
        L_0x03b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m33586VerticalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float calculateContentPaddings(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        float f;
        float f2;
        Orientation orientation2 = Orientation.Vertical;
        if (orientation == orientation2) {
            f = paddingValues.m33281calculateTopPaddingD9Ej5fM();
        } else {
            f = paddingValues.m33279calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        if (orientation == orientation2) {
            f2 = paddingValues.m33278calculateBottomPaddingD9Ej5fM();
        } else {
            f2 = paddingValues.m33280calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return C1232Dp.m38468constructorimpl(f + f2);
    }

    @Composable
    private static final Modifier pagerSemantics(Modifier modifier, PagerState pagerState, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(1509835088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:738)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier then = modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new PagerKt$pagerSemantics$1(z, pagerState, coroutineScope), 1, (Object) null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    /* access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, C13995l0 l0Var) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, (C12074d<? super PagerKt$pagerSemantics$performBackwardPaging$1>) null), 3, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, C13995l0 l0Var) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, (C12074d<? super PagerKt$pagerSemantics$performForwardPaging$1>) null), 3, (Object) null);
        return true;
    }

    private static final void debugLog(C13074a<String> aVar) {
    }
}
