package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import com.adjust.sdk.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,713:1\n50#2:714\n49#2:715\n50#2:722\n49#2:723\n25#2:734\n25#2:749\n36#2:761\n50#2:768\n49#2:769\n50#2:776\n49#2:777\n36#2:784\n50#2:791\n49#2:792\n50#2:799\n49#2:800\n1114#3,6:716\n1114#3,6:724\n1114#3,3:735\n1117#3,3:741\n1114#3,3:750\n1117#3,3:756\n1114#3,6:762\n1114#3,6:770\n1114#3,6:778\n1114#3,6:785\n1114#3,6:793\n1114#3,6:801\n474#4,4:730\n478#4,2:738\n482#4:744\n474#4,4:745\n478#4,2:753\n482#4:759\n474#5:740\n474#5:755\n646#6:760\n76#7:807\n154#8:808\n154#8:809\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n333#1:714\n333#1:715\n350#1:722\n350#1:723\n398#1:734\n532#1:749\n656#1:761\n659#1:768\n659#1:769\n671#1:776\n671#1:777\n687#1:784\n688#1:791\n688#1:792\n700#1:799\n700#1:800\n333#1:716,6\n350#1:724,6\n398#1:735,3\n398#1:741,3\n532#1:750,3\n532#1:756,3\n656#1:762,6\n659#1:770,6\n671#1:778,6\n687#1:785,6\n688#1:793,6\n700#1:801,6\n398#1:730,4\n398#1:738,2\n398#1:744\n532#1:745,4\n532#1:753,2\n532#1:759\n398#1:740\n532#1:755\n648#1:760\n649#1:807\n705#1:808\n706#1:809\n*E\n"})
/* compiled from: Drawer.kt */
public final class DrawerKt {
    /* access modifiers changed from: private */
    public static final TweenSpec<Float> AnimationSpec = new TweenSpec(256, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    private static final float BottomDrawerOpenFraction = 0.5f;
    /* access modifiers changed from: private */
    public static final float DrawerVelocityThreshold = C1232Dp.m38468constructorimpl((float) Constants.MINIMAL_ERROR_STATUS_CODE);
    /* access modifiers changed from: private */
    public static final float EndDrawerPadding = C1232Dp.m38468constructorimpl((float) 56);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011e  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: BottomDrawer-Gs3lGvM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33993BottomDrawerGs3lGvM(p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r34, androidx.compose.p002ui.Modifier r35, androidx.compose.material.BottomDrawerState r36, boolean r37, androidx.compose.p002ui.graphics.Shape r38, float r39, long r40, long r42, long r44, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r46, androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            r15 = r34
            r14 = r46
            r13 = r48
            r12 = r49
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 625649286(0x254aa686, float:1.7577127E-16)
            r1 = r47
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r10.changedInstance(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r35
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
            goto L_0x004e
        L_0x004c:
            r4 = r35
        L_0x004e:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r12 & 4
            if (r5 != 0) goto L_0x0061
            r5 = r36
            boolean r6 = r10.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r5 = r36
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r36
        L_0x0069:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r37
            boolean r8 = r10.changed((boolean) r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r37
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a0
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r38
            boolean r9 = r10.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r38
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r38
        L_0x00a2:
            r9 = r12 & 32
            if (r9 == 0) goto L_0x00aa
            r11 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r11
            goto L_0x00bf
        L_0x00aa:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x00bf
            r11 = r39
            boolean r16 = r10.changed((float) r11)
            if (r16 == 0) goto L_0x00ba
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r16
            goto L_0x00c1
        L_0x00bf:
            r11 = r39
        L_0x00c1:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00e1
            r16 = r12 & 64
            if (r16 != 0) goto L_0x00d8
            r16 = r3
            r2 = r40
            boolean r17 = r10.changed((long) r2)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00d8:
            r16 = r3
            r2 = r40
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r17
            goto L_0x00e5
        L_0x00e1:
            r16 = r3
            r2 = r40
        L_0x00e5:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00fe
            r0 = r12 & 128(0x80, float:1.794E-43)
            r2 = r42
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r10.changed((long) r2)
            if (r0 == 0) goto L_0x00fa
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r0
            goto L_0x0100
        L_0x00fe:
            r2 = r42
        L_0x0100:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0118
            r0 = r12 & 256(0x100, float:3.59E-43)
            r2 = r44
            if (r0 != 0) goto L_0x0114
            boolean r0 = r10.changed((long) r2)
            if (r0 == 0) goto L_0x0114
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r1 = r1 | r0
            goto L_0x011a
        L_0x0118:
            r2 = r44
        L_0x011a:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0122
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0120:
            r1 = r1 | r0
            goto L_0x0133
        L_0x0122:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0133
            boolean r0 = r10.changedInstance(r14)
            if (r0 == 0) goto L_0x0130
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0120
        L_0x0130:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0120
        L_0x0133:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r1
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0154
            boolean r0 = r10.getSkipping()
            if (r0 != 0) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            r10.skipToGroupEnd()
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r8
            r1 = r10
            r6 = r11
            r7 = r40
            r9 = r42
            r11 = r44
            goto L_0x02e3
        L_0x0154:
            r10.startDefaults()
            r0 = r13 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r10.getDefaultsInvalid()
            if (r0 == 0) goto L_0x016b
            goto L_0x01b1
        L_0x016b:
            r10.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0174
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0174:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x017a
            r1 = r1 & r19
        L_0x017a:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0180
            r1 = r1 & r18
        L_0x0180:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0185
            r1 = r1 & r3
        L_0x0185:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019f
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r1
            r23 = r40
            r25 = r42
            r27 = r44
            r18 = r5
            r19 = r7
            r20 = r8
            r22 = r11
            r11 = r4
            r4 = r0
            goto L_0x023c
        L_0x019f:
            r23 = r40
            r25 = r42
            r27 = r44
            r18 = r5
            r19 = r7
            r20 = r8
            r22 = r11
            r11 = r4
            r4 = r1
            goto L_0x023c
        L_0x01b1:
            if (r16 == 0) goto L_0x01b6
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01b7
        L_0x01b6:
            r0 = r4
        L_0x01b7:
            r4 = r12 & 4
            r2 = 6
            if (r4 == 0) goto L_0x01c7
            androidx.compose.material.BottomDrawerValue r4 = androidx.compose.material.BottomDrawerValue.Closed
            r3 = 2
            r5 = 0
            androidx.compose.material.BottomDrawerState r3 = rememberBottomDrawerState(r4, r5, r10, r2, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01c8
        L_0x01c7:
            r3 = r5
        L_0x01c8:
            if (r6 == 0) goto L_0x01cb
            r7 = 1
        L_0x01cb:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x01dc
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r4 = r4.getShapes(r10, r2)
            androidx.compose.foundation.shape.CornerBasedShape r4 = r4.getLarge()
            r1 = r1 & r19
            goto L_0x01dd
        L_0x01dc:
            r4 = r8
        L_0x01dd:
            if (r9 == 0) goto L_0x01e6
            androidx.compose.material.DrawerDefaults r5 = androidx.compose.material.DrawerDefaults.INSTANCE
            float r5 = r5.m33992getElevationD9Ej5fM()
            goto L_0x01e7
        L_0x01e6:
            r5 = r11
        L_0x01e7:
            r6 = r12 & 64
            if (r6 == 0) goto L_0x01f8
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r6 = r6.getColors(r10, r2)
            long r8 = r6.m33956getSurface0d7_KjU()
            r1 = r1 & r18
            goto L_0x01fa
        L_0x01f8:
            r8 = r40
        L_0x01fa:
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x020b
            int r6 = r1 >> 18
            r6 = r6 & 14
            long r18 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r8, r10, r6)
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r6
            goto L_0x020d
        L_0x020b:
            r18 = r42
        L_0x020d:
            r6 = r12 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x022c
            androidx.compose.material.DrawerDefaults r6 = androidx.compose.material.DrawerDefaults.INSTANCE
            long r22 = r6.getScrimColor(r10, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r2
            r11 = r0
            r20 = r4
            r25 = r18
            r27 = r22
            r4 = r1
            r18 = r3
            r22 = r5
            r19 = r7
            r23 = r8
            goto L_0x023c
        L_0x022c:
            r27 = r44
            r11 = r0
            r20 = r4
            r22 = r5
            r23 = r8
            r25 = r18
            r4 = r1
            r18 = r3
            r19 = r7
        L_0x023c:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x024e
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.BottomDrawer (Drawer.kt:519)"
            r2 = 625649286(0x254aa686, float:1.7577127E-16)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r4, r0, r1)
        L_0x024e:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.startReplaceableGroup(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x0275
            hf.h r0 = p355hf.C12085h.f18916b
            yf.l0 r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r10)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r1 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r1.<init>(r0)
            r10.updateRememberedValue(r1)
            r0 = r1
        L_0x0275:
            r10.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
            yf.l0 r17 = r0.getCoroutineScope()
            r10.endReplaceableGroup()
            r0 = 0
            r1 = 0
            r2 = 1
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r11, r0, r2, r1)
            r21 = 0
            r29 = 0
            androidx.compose.material.DrawerKt$BottomDrawer$1 r8 = new androidx.compose.material.DrawerKt$BottomDrawer$1
            r0 = r8
            r1 = r19
            r9 = r2
            r2 = r18
            r3 = r46
            r5 = r27
            r7 = r20
            r15 = r8
            r8 = r23
            r30 = r10
            r31 = r11
            r10 = r25
            r12 = r22
            r13 = r17
            r14 = r34
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r10, r12, r13, r14)
            r0 = 1220102512(0x48b94970, float:379467.5)
            r1 = r30
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r2, r15)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 6
            r35 = r16
            r36 = r21
            r37 = r29
            r38 = r0
            r39 = r1
            r40 = r2
            r41 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02d3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02d3:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r23
            r9 = r25
            r11 = r27
            r2 = r31
        L_0x02e3:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x02ea
            goto L_0x0303
        L_0x02ea:
            androidx.compose.material.DrawerKt$BottomDrawer$2 r14 = new androidx.compose.material.DrawerKt$BottomDrawer$2
            r0 = r14
            r1 = r34
            r13 = r46
            r32 = r14
            r14 = r48
            r33 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r32
            r0 = r33
            r0.updateScope(r1)
        L_0x0303:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m33993BottomDrawerGs3lGvM(of.p, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BottomDrawerScrim-3J-VO9M  reason: not valid java name */
    public static final void m33994BottomDrawerScrim3JVO9M(long j, C13074a<C11921v> aVar, boolean z, Composer composer, int i) {
        int i2;
        boolean z2;
        float f;
        Modifier modifier;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        C13074a<C11921v> aVar2 = aVar;
        boolean z3 = z;
        int i6 = i;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(z3)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513067266, i2, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:642)");
            }
            if (j2 != Color.Companion.m35707getUnspecified0d7_KjU()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (Function1<? super Float, C11921v>) null, startRestartGroup, 48, 12);
                String r7 = Strings_androidKt.m34125getString4foXLRw(Strings.Companion.m34118getCloseDrawerUdPEhr4(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1298948652);
                if (z3) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed((Object) aVar2);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(aVar2, (C12074d<? super DrawerKt$BottomDrawerScrim$dismissModifier$1$1>) null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, (Object) aVar2, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue);
                    startRestartGroup.startReplaceableGroup(511388516);
                    boolean changed2 = startRestartGroup.changed((Object) r7) | startRestartGroup.changed((Object) aVar2);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(r7, aVar2);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null).then(modifier);
                Color r72 = Color.m35661boximpl(j);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed3 = startRestartGroup.changed((Object) r72) | startRestartGroup.changed((Object) animateFloatAsState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new DrawerKt$BottomDrawerScrim$1$1(j2, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DrawerKt$BottomDrawerScrim$2(j, aVar, z, i));
        }
    }

    /* access modifiers changed from: private */
    public static final float BottomDrawerScrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011e  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ModalDrawer-Gs3lGvM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33995ModalDrawerGs3lGvM(p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r35, androidx.compose.p002ui.Modifier r36, androidx.compose.material.DrawerState r37, boolean r38, androidx.compose.p002ui.graphics.Shape r39, float r40, long r41, long r43, long r45, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            r15 = r35
            r14 = r47
            r13 = r49
            r12 = r50
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1305806945(0x4dd50861, float:4.46762016E8)
            r1 = r48
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changedInstance(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r36
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
            goto L_0x004e
        L_0x004c:
            r4 = r36
        L_0x004e:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r12 & 4
            if (r5 != 0) goto L_0x0061
            r5 = r37
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r5 = r37
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r37
        L_0x0069:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r38
            boolean r8 = r11.changed((boolean) r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r38
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a0
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r39
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r39
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r39
        L_0x00a2:
            r9 = r12 & 32
            if (r9 == 0) goto L_0x00aa
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            goto L_0x00bf
        L_0x00aa:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00bf
            r10 = r40
            boolean r16 = r11.changed((float) r10)
            if (r16 == 0) goto L_0x00ba
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r16
            goto L_0x00c1
        L_0x00bf:
            r10 = r40
        L_0x00c1:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00e1
            r16 = r12 & 64
            if (r16 != 0) goto L_0x00d8
            r16 = r3
            r2 = r41
            boolean r17 = r11.changed((long) r2)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00d8:
            r16 = r3
            r2 = r41
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r17
            goto L_0x00e5
        L_0x00e1:
            r16 = r3
            r2 = r41
        L_0x00e5:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00fe
            r0 = r12 & 128(0x80, float:1.794E-43)
            r2 = r43
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r11.changed((long) r2)
            if (r0 == 0) goto L_0x00fa
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r0
            goto L_0x0100
        L_0x00fe:
            r2 = r43
        L_0x0100:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0118
            r0 = r12 & 256(0x100, float:3.59E-43)
            r2 = r45
            if (r0 != 0) goto L_0x0114
            boolean r0 = r11.changed((long) r2)
            if (r0 == 0) goto L_0x0114
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r1 = r1 | r0
            goto L_0x011a
        L_0x0118:
            r2 = r45
        L_0x011a:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0122
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0120:
            r1 = r1 | r0
            goto L_0x0133
        L_0x0122:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0133
            boolean r0 = r11.changedInstance(r14)
            if (r0 == 0) goto L_0x0130
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0120
        L_0x0130:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0120
        L_0x0133:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r1
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0154
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            r11.skipToGroupEnd()
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r8
            r6 = r10
            r1 = r11
            r7 = r41
            r9 = r43
            r11 = r45
            goto L_0x02db
        L_0x0154:
            r11.startDefaults()
            r0 = r13 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x016b
            goto L_0x01a7
        L_0x016b:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0174
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0174:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x017a
            r1 = r1 & r19
        L_0x017a:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0180
            r1 = r1 & r18
        L_0x0180:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0185
            r1 = r1 & r3
        L_0x0185:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0195
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r1
            r23 = r41
            r25 = r43
            r27 = r45
            r3 = r0
            goto L_0x019c
        L_0x0195:
            r23 = r41
            r25 = r43
            r27 = r45
            r3 = r1
        L_0x019c:
            r9 = r4
            r18 = r5
            r19 = r7
            r20 = r8
            r22 = r10
            goto L_0x0231
        L_0x01a7:
            if (r16 == 0) goto L_0x01ac
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01ad
        L_0x01ac:
            r0 = r4
        L_0x01ad:
            r4 = r12 & 4
            r2 = 6
            if (r4 == 0) goto L_0x01bd
            androidx.compose.material.DrawerValue r4 = androidx.compose.material.DrawerValue.Closed
            r3 = 2
            r5 = 0
            androidx.compose.material.DrawerState r3 = rememberDrawerState(r4, r5, r11, r2, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01be
        L_0x01bd:
            r3 = r5
        L_0x01be:
            if (r6 == 0) goto L_0x01c1
            r7 = 1
        L_0x01c1:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x01d2
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r4 = r4.getShapes(r11, r2)
            androidx.compose.foundation.shape.CornerBasedShape r4 = r4.getLarge()
            r1 = r1 & r19
            goto L_0x01d3
        L_0x01d2:
            r4 = r8
        L_0x01d3:
            if (r9 == 0) goto L_0x01dc
            androidx.compose.material.DrawerDefaults r5 = androidx.compose.material.DrawerDefaults.INSTANCE
            float r5 = r5.m33992getElevationD9Ej5fM()
            goto L_0x01dd
        L_0x01dc:
            r5 = r10
        L_0x01dd:
            r6 = r12 & 64
            if (r6 == 0) goto L_0x01ee
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r6 = r6.getColors(r11, r2)
            long r8 = r6.m33956getSurface0d7_KjU()
            r1 = r1 & r18
            goto L_0x01f0
        L_0x01ee:
            r8 = r41
        L_0x01f0:
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0201
            int r6 = r1 >> 18
            r6 = r6 & 14
            long r18 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r8, r11, r6)
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r6
            goto L_0x0203
        L_0x0201:
            r18 = r43
        L_0x0203:
            r6 = r12 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0221
            androidx.compose.material.DrawerDefaults r6 = androidx.compose.material.DrawerDefaults.INSTANCE
            long r22 = r6.getScrimColor(r11, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r2
            r20 = r4
            r25 = r18
            r27 = r22
            r18 = r3
            r22 = r5
            r19 = r7
            r23 = r8
            r9 = r0
            goto L_0x0230
        L_0x0221:
            r27 = r45
            r20 = r4
            r22 = r5
            r23 = r8
            r25 = r18
            r9 = r0
            r18 = r3
            r19 = r7
        L_0x0230:
            r3 = r1
        L_0x0231:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0243
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.ModalDrawer (Drawer.kt:385)"
            r2 = 1305806945(0x4dd50861, float:4.46762016E8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x0243:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r11.startReplaceableGroup(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x026a
            hf.h r0 = p355hf.C12085h.f18916b
            yf.l0 r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r11)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r1 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r1.<init>(r0)
            r11.updateRememberedValue(r1)
            r0 = r1
        L_0x026a:
            r11.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
            yf.l0 r17 = r0.getCoroutineScope()
            r11.endReplaceableGroup()
            r0 = 0
            r1 = 0
            r2 = 1
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r9, r0, r2, r1)
            r21 = 0
            r29 = 0
            androidx.compose.material.DrawerKt$ModalDrawer$1 r10 = new androidx.compose.material.DrawerKt$ModalDrawer$1
            r0 = r10
            r1 = r18
            r7 = r2
            r2 = r19
            r4 = r27
            r6 = r20
            r15 = r7
            r7 = r23
            r30 = r9
            r31 = r10
            r9 = r25
            r32 = r11
            r11 = r22
            r12 = r47
            r13 = r17
            r14 = r35
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14)
            r0 = 816674999(0x30ad78b7, float:1.2621716E-9)
            r2 = r31
            r1 = r32
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r15, r2)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 6
            r36 = r16
            r37 = r21
            r38 = r29
            r39 = r0
            r40 = r1
            r41 = r2
            r42 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(r36, r37, r38, r39, r40, r41, r42)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02cb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02cb:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r23
            r9 = r25
            r11 = r27
            r2 = r30
        L_0x02db:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x02e2
            goto L_0x02fb
        L_0x02e2:
            androidx.compose.material.DrawerKt$ModalDrawer$2 r14 = new androidx.compose.material.DrawerKt$ModalDrawer$2
            r0 = r14
            r1 = r35
            r13 = r47
            r33 = r14
            r14 = r49
            r34 = r15
            r15 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r33
            r0 = r34
            r0.updateScope(r1)
        L_0x02fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m33995ModalDrawerGs3lGvM(of.p, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc  reason: not valid java name */
    public static final void m33996ScrimBx497Mc(boolean z, C13074a<C11921v> aVar, C13074a<Float> aVar2, long j, Composer composer, int i) {
        int i2;
        Modifier modifier;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changedInstance(aVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(j)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:677)");
            }
            String r0 = Strings_androidKt.m34125getString4foXLRw(Strings.Companion.m34118getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010554804);
            if (z) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed((Object) aVar);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(aVar, (C12074d<? super DrawerKt$Scrim$dismissDrawer$1$1>) null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, (Object) aVar, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed((Object) r0) | startRestartGroup.changed((Object) aVar);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DrawerKt$Scrim$dismissDrawer$2$1(r0, aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null).then(modifier);
            Color r2 = Color.m35661boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed3 = startRestartGroup.changed((Object) r2) | startRestartGroup.changed((Object) aVar2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DrawerKt$Scrim$1$1(j, aVar2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DrawerKt$Scrim$2(z, aVar, aVar2, j, i));
        }
    }

    /* access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return C13537l.m30885l((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.compose.runtime.saveable.Saver<androidx.compose.material.BottomDrawerState, androidx.compose.material.BottomDrawerValue>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.BottomDrawerState rememberBottomDrawerState(androidx.compose.material.BottomDrawerValue r7, kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomDrawerValue, java.lang.Boolean> r8, androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = -598115156(0xffffffffdc597cac, float:-2.44868592E17)
            r9.startReplaceableGroup(r0)
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0011
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$1 r8 = androidx.compose.material.DrawerKt$rememberBottomDrawerState$1.INSTANCE
        L_0x0011:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x001d
            r11 = -1
            java.lang.String r1 = "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:345)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r1)
        L_0x001d:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material.BottomDrawerState$Companion r10 = androidx.compose.material.BottomDrawerState.Companion
            androidx.compose.runtime.saveable.Saver r1 = r10.Saver(r8)
            r2 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.startReplaceableGroup(r10)
            boolean r10 = r9.changed((java.lang.Object) r7)
            boolean r11 = r9.changed((java.lang.Object) r8)
            r10 = r10 | r11
            java.lang.Object r11 = r9.rememberedValue()
            if (r10 != 0) goto L_0x0044
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L_0x004c
        L_0x0044:
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1 r11 = new androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1
            r11.<init>(r7, r8)
            r9.updateRememberedValue(r11)
        L_0x004c:
            r9.endReplaceableGroup()
            r3 = r11
            of.a r3 = (p404of.C13074a) r3
            r5 = 72
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r0, r1, (java.lang.String) r2, r3, (androidx.compose.runtime.Composer) r4, (int) r5, (int) r6)
            androidx.compose.material.BottomDrawerState r7 = (androidx.compose.material.BottomDrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0065:
            r9.endReplaceableGroup()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.rememberBottomDrawerState(androidx.compose.material.BottomDrawerValue, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.material.BottomDrawerState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.compose.runtime.saveable.Saver<androidx.compose.material.DrawerState, androidx.compose.material.DrawerValue>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.DrawerState rememberDrawerState(androidx.compose.material.DrawerValue r7, kotlin.jvm.functions.Function1<? super androidx.compose.material.DrawerValue, java.lang.Boolean> r8, androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = -1435874229(0xffffffffaa6a4c4b, float:-2.0809844E-13)
            r9.startReplaceableGroup(r0)
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0011
            androidx.compose.material.DrawerKt$rememberDrawerState$1 r8 = androidx.compose.material.DrawerKt$rememberDrawerState$1.INSTANCE
        L_0x0011:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x001d
            r11 = -1
            java.lang.String r1 = "androidx.compose.material.rememberDrawerState (Drawer.kt:328)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r1)
        L_0x001d:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material.DrawerState$Companion r10 = androidx.compose.material.DrawerState.Companion
            androidx.compose.runtime.saveable.Saver r1 = r10.Saver(r8)
            r2 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.startReplaceableGroup(r10)
            boolean r10 = r9.changed((java.lang.Object) r7)
            boolean r11 = r9.changed((java.lang.Object) r8)
            r10 = r10 | r11
            java.lang.Object r11 = r9.rememberedValue()
            if (r10 != 0) goto L_0x0044
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L_0x004c
        L_0x0044:
            androidx.compose.material.DrawerKt$rememberDrawerState$2$1 r11 = new androidx.compose.material.DrawerKt$rememberDrawerState$2$1
            r11.<init>(r7, r8)
            r9.updateRememberedValue(r11)
        L_0x004c:
            r9.endReplaceableGroup()
            r3 = r11
            of.a r3 = (p404of.C13074a) r3
            r5 = 72
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r0, r1, (java.lang.String) r2, r3, (androidx.compose.runtime.Composer) r4, (int) r5, (int) r6)
            androidx.compose.material.DrawerState r7 = (androidx.compose.material.DrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0065:
            r9.endReplaceableGroup()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.rememberDrawerState(androidx.compose.material.DrawerValue, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.material.DrawerState");
    }
}
