package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,618:1\n25#2:619\n25#2:627\n25#2:634\n1114#3,6:620\n1114#3,6:628\n1114#3,6:635\n154#4:626\n76#5:641\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n98#1:619\n172#1:627\n226#1:634\n98#1:620,6\n172#1:628,6\n226#1:635,6\n115#1:626\n106#1:641\n*E\n"})
/* compiled from: Button.kt */
public final class ButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Button(p404of.C13074a<p336ef.C11921v> r36, androidx.compose.p002ui.Modifier r37, boolean r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.material.ButtonElevation r40, androidx.compose.p002ui.graphics.Shape r41, androidx.compose.foundation.BorderStroke r42, androidx.compose.material.ButtonColors r43, androidx.compose.foundation.layout.PaddingValues r44, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r15 = r36
            r14 = r45
            r13 = r47
            r12 = r48
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -2116133464(0xffffffff81de5da8, float:-8.168431E-38)
            r1 = r46
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
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r37
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r37
        L_0x004e:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r38
            boolean r6 = r11.changed((boolean) r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r6
            goto L_0x006a
        L_0x0068:
            r5 = r38
        L_0x006a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0084
            r7 = r39
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0080
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r8
            goto L_0x0086
        L_0x0084:
            r7 = r39
        L_0x0086:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a1
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009b
            r8 = r40
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x009d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r8 = r40
        L_0x009d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r9
            goto L_0x00a3
        L_0x00a1:
            r8 = r40
        L_0x00a3:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00bb
            r9 = r12 & 32
            r10 = r41
            if (r9 != 0) goto L_0x00b7
            boolean r9 = r11.changed((java.lang.Object) r10)
            if (r9 == 0) goto L_0x00b7
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r9
            goto L_0x00bd
        L_0x00bb:
            r10 = r41
        L_0x00bd:
            r16 = r12 & 64
            r28 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c7
            r9 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r9
            goto L_0x00db
        L_0x00c7:
            r9 = r13 & r28
            if (r9 != 0) goto L_0x00db
            r9 = r42
            boolean r17 = r11.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x00d6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r17
            goto L_0x00dd
        L_0x00db:
            r9 = r42
        L_0x00dd:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00f9
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f2
            r0 = r43
            boolean r17 = r11.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r0 = r43
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r17
            goto L_0x00fb
        L_0x00f9:
            r0 = r43
        L_0x00fb:
            r9 = r12 & 256(0x100, float:3.59E-43)
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            if (r9 == 0) goto L_0x0106
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r17
            goto L_0x011c
        L_0x0106:
            r17 = r13 & r29
            if (r17 != 0) goto L_0x011c
            r17 = r9
            r9 = r44
            boolean r18 = r11.changed((java.lang.Object) r9)
            if (r18 == 0) goto L_0x0117
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r1 = r1 | r18
            goto L_0x0120
        L_0x011c:
            r17 = r9
            r9 = r44
        L_0x0120:
            r0 = r12 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0129
            r1 = r1 | r30
            goto L_0x013a
        L_0x0129:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x013a
            boolean r0 = r11.changedInstance(r14)
            if (r0 == 0) goto L_0x0137
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r1 = r1 | r0
        L_0x013a:
            r0 = r1
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r0
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r3) goto L_0x015c
            boolean r1 = r11.getSkipping()
            if (r1 != 0) goto L_0x014b
            goto L_0x015c
        L_0x014b:
            r11.skipToGroupEnd()
            r2 = r37
            r3 = r5
            r4 = r7
            r5 = r8
            r6 = r10
            r21 = r11
            r7 = r42
            r8 = r43
            goto L_0x0335
        L_0x015c:
            r11.startDefaults()
            r1 = r13 & 1
            r31 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 0
            r9 = 1
            if (r1 == 0) goto L_0x019a
            boolean r1 = r11.getDefaultsInvalid()
            if (r1 == 0) goto L_0x0175
            goto L_0x019a
        L_0x0175:
            r11.skipToGroupEnd()
            r1 = r12 & 16
            if (r1 == 0) goto L_0x017e
            r0 = r0 & r19
        L_0x017e:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0184
            r0 = r0 & r18
        L_0x0184:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x018a
            r0 = r0 & r31
        L_0x018a:
            r17 = r42
            r4 = r43
            r6 = r7
            r7 = r8
            r16 = r10
            r8 = r5
            r10 = r9
            r9 = r37
            r5 = r44
            goto L_0x024e
        L_0x019a:
            if (r2 == 0) goto L_0x01a1
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r32 = r1
            goto L_0x01a3
        L_0x01a1:
            r32 = r37
        L_0x01a3:
            if (r4 == 0) goto L_0x01a8
            r33 = r9
            goto L_0x01aa
        L_0x01a8:
            r33 = r5
        L_0x01aa:
            if (r6 == 0) goto L_0x01cd
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r1)
            java.lang.Object r1 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x01c5
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r1)
        L_0x01c5:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = (androidx.compose.foundation.interaction.MutableInteractionSource) r1
            r34 = r1
            goto L_0x01cf
        L_0x01cd:
            r34 = r7
        L_0x01cf:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x01f0
            androidx.compose.material.ButtonDefaults r1 = androidx.compose.material.ButtonDefaults.INSTANCE
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 196608(0x30000, float:2.75506E-40)
            r20 = 31
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r10 = r9
            r35 = r17
            r9 = r20
            androidx.compose.material.ButtonElevation r1 = r1.m33918elevationR_JCAzs(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r0 & r19
            r8 = r1
            goto L_0x01f3
        L_0x01f0:
            r10 = r9
            r35 = r17
        L_0x01f3:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0205
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.INSTANCE
            r2 = 6
            androidx.compose.material.Shapes r1 = r1.getShapes(r11, r2)
            androidx.compose.foundation.shape.CornerBasedShape r1 = r1.getSmall()
            r0 = r0 & r18
            goto L_0x0207
        L_0x0205:
            r1 = r41
        L_0x0207:
            if (r16 == 0) goto L_0x020b
            r2 = 0
            goto L_0x020d
        L_0x020b:
            r2 = r42
        L_0x020d:
            r3 = r12 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0228
            androidx.compose.material.ButtonDefaults r16 = androidx.compose.material.ButtonDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 24576(0x6000, float:3.4438E-41)
            r27 = 15
            r25 = r11
            androidx.compose.material.ButtonColors r3 = r16.m33917buttonColorsro_MJ88(r17, r19, r21, r23, r25, r26, r27)
            r0 = r0 & r31
            goto L_0x022a
        L_0x0228:
            r3 = r43
        L_0x022a:
            if (r35 == 0) goto L_0x0240
            androidx.compose.material.ButtonDefaults r4 = androidx.compose.material.ButtonDefaults.INSTANCE
            androidx.compose.foundation.layout.PaddingValues r4 = r4.getContentPadding()
            r16 = r1
            r17 = r2
            r5 = r4
            r7 = r8
            r9 = r32
            r8 = r33
            r6 = r34
            r4 = r3
            goto L_0x024e
        L_0x0240:
            r5 = r44
            r16 = r1
            r17 = r2
            r4 = r3
            r7 = r8
            r9 = r32
            r8 = r33
            r6 = r34
        L_0x024e:
            r11.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0260
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Button (Button.kt:93)"
            r3 = -2116133464(0xffffffff81de5da8, float:-8.168431E-38)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r0, r1, r2)
        L_0x0260:
            int r1 = r0 >> 6
            r2 = r1 & 14
            int r3 = r0 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r2
            androidx.compose.runtime.State r10 = r4.contentColor(r8, r11, r3)
            androidx.compose.material.ButtonKt$Button$2 r12 = androidx.compose.material.ButtonKt$Button$2.INSTANCE
            r13 = 0
            r19 = r0
            r0 = 1
            r15 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r9, r13, r12, r0, r15)
            androidx.compose.runtime.State r0 = r4.backgroundColor(r8, r11, r3)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r20 = r0.m35681unboximpl()
            long r22 = Button$lambda$1(r10)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r24 = 0
            r25 = 0
            r26 = 14
            r27 = 0
            r37 = r22
            r39 = r0
            r40 = r3
            r41 = r24
            r42 = r25
            r43 = r26
            r44 = r27
            long r22 = androidx.compose.p002ui.graphics.Color.m35670copywmQWz5c$default(r37, r39, r40, r41, r42, r43, r44)
            r0 = -423487112(0xffffffffe6c21978, float:-4.5830446E23)
            r11.startReplaceableGroup(r0)
            if (r7 != 0) goto L_0x02b1
            r3 = r15
            goto L_0x02bb
        L_0x02b1:
            r0 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            androidx.compose.runtime.State r3 = r7.elevation(r8, r6, r11, r0)
        L_0x02bb:
            r11.endReplaceableGroup()
            if (r3 == 0) goto L_0x02cb
            java.lang.Object r0 = r3.getValue()
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.p002ui.unit.C1232Dp) r0
            float r0 = r0.m38482unboximpl()
            goto L_0x02d0
        L_0x02cb:
            float r0 = (float) r13
            float r0 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
        L_0x02d0:
            r13 = r0
            androidx.compose.material.ButtonKt$Button$3 r0 = new androidx.compose.material.ButtonKt$Button$3
            r2 = r19
            r0.<init>(r10, r5, r14, r2)
            r3 = 7524271(0x72cfaf, float:1.054375E-38)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r3, r10, r0)
            r0 = r2 & 14
            r0 = r0 | r30
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = r2 & r28
            r0 = r0 | r1
            int r1 = r2 << 15
            r1 = r1 & r29
            r18 = r0 | r1
            r19 = 0
            r0 = r36
            r1 = r12
            r2 = r8
            r3 = r16
            r24 = r4
            r25 = r5
            r4 = r20
            r34 = r6
            r20 = r7
            r6 = r22
            r33 = r8
            r8 = r17
            r32 = r9
            r9 = r13
            r10 = r34
            r21 = r11
            r11 = r15
            r12 = r21
            r13 = r18
            r14 = r19
            androidx.compose.material.SurfaceKt.m34128SurfaceLPr_se0(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0325
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0325:
            r6 = r16
            r7 = r17
            r5 = r20
            r8 = r24
            r9 = r25
            r2 = r32
            r3 = r33
            r4 = r34
        L_0x0335:
            androidx.compose.runtime.ScopeUpdateScope r13 = r21.endRestartGroup()
            if (r13 != 0) goto L_0x033c
            goto L_0x034d
        L_0x033c:
            androidx.compose.material.ButtonKt$Button$4 r14 = new androidx.compose.material.ButtonKt$Button$4
            r0 = r14
            r1 = r36
            r10 = r45
            r11 = r47
            r12 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x034d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.Button(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void OutlinedButton(C13074a<C11921v> aVar, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i, int i2) {
        Modifier.Companion companion;
        boolean z2;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        CornerBasedShape cornerBasedShape;
        BorderStroke borderStroke2;
        ButtonColors buttonColors2;
        PaddingValues paddingValues2;
        Composer composer2 = composer;
        int i3 = i;
        int i4 = i2;
        C12775o.m28639i(aVar, "onClick");
        C12775o.m28639i(pVar, "content");
        composer2.startReplaceableGroup(-1776134358);
        if ((i4 & 2) != 0) {
            companion = Modifier.Companion;
        } else {
            companion = modifier;
        }
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 8) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i4 & 16) != 0) {
            buttonElevation2 = null;
        } else {
            buttonElevation2 = buttonElevation;
        }
        if ((i4 & 32) != 0) {
            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(composer2, 6).getSmall();
        } else {
            cornerBasedShape = shape;
        }
        if ((i4 & 64) != 0) {
            borderStroke2 = ButtonDefaults.INSTANCE.getOutlinedBorder(composer2, 6);
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i4 & 128) != 0) {
            buttonColors2 = ButtonDefaults.INSTANCE.m33925outlinedButtonColorsRGew2ao(0, 0, 0, composer, 3072, 7);
        } else {
            buttonColors2 = buttonColors;
        }
        if ((i4 & 256) != 0) {
            paddingValues2 = ButtonDefaults.INSTANCE.getContentPadding();
        } else {
            paddingValues2 = paddingValues;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i3, -1, "androidx.compose.material.OutlinedButton (Button.kt:167)");
        }
        Button(aVar, companion, z2, mutableInteractionSource2, buttonElevation2, cornerBasedShape, borderStroke2, buttonColors2, paddingValues2, pVar, composer, (i3 & 14) | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void TextButton(C13074a<C11921v> aVar, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i, int i2) {
        Modifier.Companion companion;
        boolean z2;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        CornerBasedShape cornerBasedShape;
        BorderStroke borderStroke2;
        ButtonColors buttonColors2;
        PaddingValues paddingValues2;
        Composer composer2 = composer;
        int i3 = i;
        int i4 = i2;
        C12775o.m28639i(aVar, "onClick");
        C12775o.m28639i(pVar, "content");
        composer2.startReplaceableGroup(288797557);
        if ((i4 & 2) != 0) {
            companion = Modifier.Companion;
        } else {
            companion = modifier;
        }
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 8) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i4 & 16) != 0) {
            buttonElevation2 = null;
        } else {
            buttonElevation2 = buttonElevation;
        }
        if ((i4 & 32) != 0) {
            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(composer2, 6).getSmall();
        } else {
            cornerBasedShape = shape;
        }
        if ((i4 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i4 & 128) != 0) {
            buttonColors2 = ButtonDefaults.INSTANCE.m33926textButtonColorsRGew2ao(0, 0, 0, composer, 3072, 7);
        } else {
            buttonColors2 = buttonColors;
        }
        if ((i4 & 256) != 0) {
            paddingValues2 = ButtonDefaults.INSTANCE.getTextButtonContentPadding();
        } else {
            paddingValues2 = paddingValues;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i3, -1, "androidx.compose.material.TextButton (Button.kt:221)");
        }
        Button(aVar, companion, z2, mutableInteractionSource2, buttonElevation2, cornerBasedShape, borderStroke2, buttonColors2, paddingValues2, pVar, composer, (i3 & 14) | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
