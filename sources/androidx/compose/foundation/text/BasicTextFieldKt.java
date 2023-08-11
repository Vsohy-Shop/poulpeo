package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,390:1\n25#2:391\n25#2:398\n50#2:405\n49#2:406\n36#2:413\n67#2,3:420\n66#2:423\n25#2:430\n50#2:437\n49#2:438\n25#2:445\n25#2:452\n1114#3,6:392\n1114#3,6:399\n1114#3,6:407\n1114#3,6:414\n1114#3,6:424\n1114#3,6:431\n1114#3,6:439\n1114#3,6:446\n1114#3,6:453\n76#4:459\n102#4,2:460\n76#4:462\n102#4,2:463\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n137#1:391\n144#1:398\n150#1:405\n150#1:406\n159#1:413\n163#1:420,3\n163#1:423\n283#1:430\n290#1:437\n290#1:438\n327#1:445\n367#1:452\n137#1:392,6\n144#1:399,6\n150#1:407,6\n159#1:414,6\n163#1:424,6\n283#1:431,6\n290#1:439,6\n327#1:446,6\n367#1:453,6\n144#1:459\n144#1:460,2\n159#1:462\n159#1:463,2\n*E\n"})
/* compiled from: BasicTextField.kt */
public final class BasicTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: of.p<? super of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: of.p<? super of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: of.p<? super of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: of.p<of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, androidx.compose.runtime.Composer, java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: of.p<? super of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BasicTextField(java.lang.String r41, kotlin.jvm.functions.Function1<? super java.lang.String, p336ef.C11921v> r42, androidx.compose.p002ui.Modifier r43, boolean r44, boolean r45, androidx.compose.p002ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, int r51, androidx.compose.p002ui.text.input.VisualTransformation r52, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v> r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, androidx.compose.p002ui.graphics.Brush r55, p404of.C13089p<? super p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r56, androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            r1 = r41
            r2 = r42
            r15 = r58
            r14 = r59
            r13 = r60
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            r0 = 945255183(0x3857730f, float:5.136715E-5)
            r3 = r57
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x0024
            r4 = r15 | 6
            goto L_0x0034
        L_0x0024:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x0033
            boolean r4 = r3.changed((java.lang.Object) r1)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r15
            goto L_0x0034
        L_0x0033:
            r4 = r15
        L_0x0034:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x003b
            r4 = r4 | 48
            goto L_0x004b
        L_0x003b:
            r7 = r15 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            boolean r7 = r3.changedInstance(r2)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r4 = r4 | r7
        L_0x004b:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0052
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0052:
            r12 = r15 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x0066
            r12 = r43
            boolean r16 = r3.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r16
            goto L_0x0068
        L_0x0066:
            r12 = r43
        L_0x0068:
            r16 = r13 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0087
            r5 = r44
            boolean r19 = r3.changed((boolean) r5)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r18
        L_0x0084:
            r4 = r4 | r19
            goto L_0x0089
        L_0x0087:
            r5 = r44
        L_0x0089:
            r19 = r13 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x0099
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r8 = r45
            goto L_0x00ac
        L_0x0099:
            r23 = r15 & r22
            r8 = r45
            if (r23 != 0) goto L_0x00ac
            boolean r24 = r3.changed((boolean) r8)
            if (r24 == 0) goto L_0x00a8
            r24 = r20
            goto L_0x00aa
        L_0x00a8:
            r24 = r21
        L_0x00aa:
            r4 = r4 | r24
        L_0x00ac:
            r24 = r13 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00b9
            r26 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r26
            r9 = r46
            goto L_0x00cc
        L_0x00b9:
            r26 = r15 & r25
            r9 = r46
            if (r26 != 0) goto L_0x00cc
            boolean r27 = r3.changed((java.lang.Object) r9)
            if (r27 == 0) goto L_0x00c8
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r4 = r4 | r27
        L_0x00cc:
            r27 = r13 & 64
            if (r27 == 0) goto L_0x00d7
            r28 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r28
            r10 = r47
            goto L_0x00ec
        L_0x00d7:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r15 & r28
            r10 = r47
            if (r28 != 0) goto L_0x00ec
            boolean r29 = r3.changed((java.lang.Object) r10)
            if (r29 == 0) goto L_0x00e8
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r4 = r4 | r29
        L_0x00ec:
            r11 = r13 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x00f7
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r30
            r6 = r48
            goto L_0x010c
        L_0x00f7:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r15 & r30
            r6 = r48
            if (r30 != 0) goto L_0x010c
            boolean r31 = r3.changed((java.lang.Object) r6)
            if (r31 == 0) goto L_0x0108
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r4 = r4 | r31
        L_0x010c:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0117
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r32
            r5 = r49
            goto L_0x012c
        L_0x0117:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r15 & r32
            r5 = r49
            if (r32 != 0) goto L_0x012c
            boolean r32 = r3.changed((boolean) r5)
            if (r32 == 0) goto L_0x0128
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r4 = r4 | r32
        L_0x012c:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r15 & r32
            if (r32 != 0) goto L_0x0148
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 != 0) goto L_0x0141
            r5 = r50
            boolean r32 = r3.changed((int) r5)
            if (r32 == 0) goto L_0x0143
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0141:
            r5 = r50
        L_0x0143:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r4 = r4 | r32
            goto L_0x014a
        L_0x0148:
            r5 = r50
        L_0x014a:
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0153
            r32 = r14 | 6
            r6 = r51
            goto L_0x0169
        L_0x0153:
            r32 = r14 & 14
            r6 = r51
            if (r32 != 0) goto L_0x0167
            boolean r32 = r3.changed((int) r6)
            if (r32 == 0) goto L_0x0162
            r32 = 4
            goto L_0x0164
        L_0x0162:
            r32 = 2
        L_0x0164:
            r32 = r14 | r32
            goto L_0x0169
        L_0x0167:
            r32 = r14
        L_0x0169:
            r6 = r13 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0170
            r32 = r32 | 48
            goto L_0x0183
        L_0x0170:
            r33 = r14 & 112(0x70, float:1.57E-43)
            r8 = r52
            if (r33 != 0) goto L_0x0183
            boolean r33 = r3.changed((java.lang.Object) r8)
            if (r33 == 0) goto L_0x017f
            r23 = 32
            goto L_0x0181
        L_0x017f:
            r23 = 16
        L_0x0181:
            r32 = r32 | r23
        L_0x0183:
            r8 = r32
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x018c
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01a0
        L_0x018c:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a0
            r10 = r53
            boolean r23 = r3.changedInstance(r10)
            if (r23 == 0) goto L_0x019b
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x019d
        L_0x019b:
            r28 = 128(0x80, float:1.794E-43)
        L_0x019d:
            r8 = r8 | r28
            goto L_0x01a2
        L_0x01a0:
            r10 = r53
        L_0x01a2:
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a9
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bb
        L_0x01a9:
            r12 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x01bb
            r12 = r54
            boolean r23 = r3.changed((java.lang.Object) r12)
            if (r23 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r17 = r18
        L_0x01b8:
            r8 = r8 | r17
            goto L_0x01bd
        L_0x01bb:
            r12 = r54
        L_0x01bd:
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x01c6
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r2 = r55
            goto L_0x01d7
        L_0x01c6:
            r17 = r14 & r22
            r2 = r55
            if (r17 != 0) goto L_0x01d7
            boolean r17 = r3.changed((java.lang.Object) r2)
            if (r17 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r20 = r21
        L_0x01d5:
            r8 = r8 | r20
        L_0x01d7:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x01e5
            r18 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r18
            r2 = r56
            goto L_0x01f8
        L_0x01e5:
            r18 = r14 & r25
            r2 = r56
            if (r18 != 0) goto L_0x01f8
            boolean r18 = r3.changedInstance(r2)
            if (r18 == 0) goto L_0x01f4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f6
        L_0x01f4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01f6:
            r8 = r8 | r18
        L_0x01f8:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r4 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r14) goto L_0x0235
            r2 = 374491(0x5b6db, float:5.24774E-40)
            r2 = r2 & r8
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r14) goto L_0x0235
            boolean r2 = r3.getSkipping()
            if (r2 != 0) goto L_0x0212
            goto L_0x0235
        L_0x0212:
            r3.skipToGroupEnd()
            r5 = r42
            r4 = r43
            r6 = r44
            r7 = r45
            r8 = r46
            r9 = r47
            r11 = r48
            r10 = r49
            r12 = r50
            r13 = r51
            r14 = r52
            r15 = r53
            r36 = r54
            r37 = r55
            r16 = r56
            goto L_0x04aa
        L_0x0235:
            r3.startDefaults()
            r2 = r15 & 1
            r18 = 1
            if (r2 == 0) goto L_0x026f
            boolean r2 = r3.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0245
            goto L_0x026f
        L_0x0245:
            r3.skipToGroupEnd()
            r0 = r13 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0250
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r0
        L_0x0250:
            r2 = r43
            r7 = r44
            r0 = r45
            r5 = r47
            r11 = r48
            r6 = r49
            r14 = r50
            r50 = r51
            r10 = r52
            r12 = r53
            r36 = r54
            r37 = r55
            r38 = r56
            r9 = r4
            r4 = r46
            goto L_0x033c
        L_0x026f:
            if (r7 == 0) goto L_0x0274
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0276
        L_0x0274:
            r2 = r43
        L_0x0276:
            if (r16 == 0) goto L_0x027b
            r7 = r18
            goto L_0x027d
        L_0x027b:
            r7 = r44
        L_0x027d:
            if (r19 == 0) goto L_0x0282
            r16 = 0
            goto L_0x0284
        L_0x0282:
            r16 = r45
        L_0x0284:
            if (r24 == 0) goto L_0x028d
            androidx.compose.ui.text.TextStyle$Companion r19 = androidx.compose.p002ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r19 = r19.getDefault()
            goto L_0x028f
        L_0x028d:
            r19 = r46
        L_0x028f:
            if (r27 == 0) goto L_0x0298
            androidx.compose.foundation.text.KeyboardOptions$Companion r20 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r20 = r20.getDefault()
            goto L_0x029a
        L_0x0298:
            r20 = r47
        L_0x029a:
            if (r11 == 0) goto L_0x02a3
            androidx.compose.foundation.text.KeyboardActions$Companion r11 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r11 = r11.getDefault()
            goto L_0x02a5
        L_0x02a3:
            r11 = r48
        L_0x02a5:
            if (r0 == 0) goto L_0x02a9
            r0 = 0
            goto L_0x02ab
        L_0x02a9:
            r0 = r49
        L_0x02ab:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x02bd
            if (r0 == 0) goto L_0x02b4
            r14 = r18
            goto L_0x02b7
        L_0x02b4:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L_0x02b7:
            r23 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r23
            goto L_0x02bf
        L_0x02bd:
            r14 = r50
        L_0x02bf:
            if (r5 == 0) goto L_0x02c4
            r5 = r18
            goto L_0x02c6
        L_0x02c4:
            r5 = r51
        L_0x02c6:
            if (r6 == 0) goto L_0x02cf
            androidx.compose.ui.text.input.VisualTransformation$Companion r6 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r6 = r6.getNone()
            goto L_0x02d1
        L_0x02cf:
            r6 = r52
        L_0x02d1:
            if (r9 == 0) goto L_0x02d6
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1 r9 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1.INSTANCE
            goto L_0x02d8
        L_0x02d6:
            r9 = r53
        L_0x02d8:
            if (r10 == 0) goto L_0x02fc
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r10)
            java.lang.Object r10 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r23 = androidx.compose.runtime.Composer.Companion
            r43 = r0
            java.lang.Object r0 = r23.getEmpty()
            if (r10 != r0) goto L_0x02f5
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r3.updateRememberedValue(r10)
        L_0x02f5:
            r3.endReplaceableGroup()
            r0 = r10
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x0300
        L_0x02fc:
            r43 = r0
            r0 = r54
        L_0x0300:
            if (r12 == 0) goto L_0x0313
            androidx.compose.ui.graphics.SolidColor r10 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r12 = androidx.compose.p002ui.graphics.Color.Companion
            r44 = r4
            r45 = r5
            long r4 = r12.m35697getBlack0d7_KjU()
            r12 = 0
            r10.<init>(r4, r12)
            goto L_0x0319
        L_0x0313:
            r44 = r4
            r45 = r5
            r10 = r55
        L_0x0319:
            if (r17 == 0) goto L_0x0328
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r4 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            of.p r4 = r4.m33640getLambda1$foundation_release()
            r50 = r45
            r36 = r0
            r38 = r4
            goto L_0x032e
        L_0x0328:
            r50 = r45
            r38 = r56
            r36 = r0
        L_0x032e:
            r12 = r9
            r37 = r10
            r0 = r16
            r4 = r19
            r5 = r20
            r9 = r44
            r10 = r6
            r6 = r43
        L_0x033c:
            r3.endDefaults()
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x0350
            java.lang.String r13 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:122)"
            r51 = r14
            r14 = 945255183(0x3857730f, float:5.136715E-5)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r9, r8, r13)
            goto L_0x0352
        L_0x0350:
            r51 = r14
        L_0x0352:
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r13)
            java.lang.Object r13 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r15 = r14.getEmpty()
            if (r13 != r15) goto L_0x0389
            androidx.compose.ui.text.input.TextFieldValue r13 = new androidx.compose.ui.text.input.TextFieldValue
            r15 = 0
            r17 = 0
            r19 = 6
            r20 = 0
            r43 = r13
            r44 = r41
            r45 = r15
            r47 = r17
            r48 = r19
            r49 = r20
            r43.<init>((java.lang.String) r44, (long) r45, (androidx.compose.p002ui.text.TextRange) r47, (int) r48, (kotlin.jvm.internal.DefaultConstructorMarker) r49)
            r52 = r0
            r0 = 2
            r15 = 0
            androidx.compose.runtime.MutableState r13 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r13, r15, r0, r15)
            r3.updateRememberedValue(r13)
            goto L_0x038b
        L_0x0389:
            r52 = r0
        L_0x038b:
            r3.endReplaceableGroup()
            androidx.compose.runtime.MutableState r13 = (androidx.compose.runtime.MutableState) r13
            androidx.compose.ui.text.input.TextFieldValue r0 = BasicTextField$lambda$2(r13)
            r15 = 0
            r17 = 0
            r19 = 6
            r20 = 0
            r43 = r0
            r44 = r41
            r45 = r15
            r47 = r17
            r48 = r19
            r49 = r20
            androidx.compose.ui.text.input.TextFieldValue r0 = androidx.compose.p002ui.text.input.TextFieldValue.m38190copy3r_uNRQ$default((androidx.compose.p002ui.text.input.TextFieldValue) r43, (java.lang.String) r44, (long) r45, (androidx.compose.p002ui.text.TextRange) r47, (int) r48, (java.lang.Object) r49)
            r15 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r15)
            boolean r15 = r3.changed((java.lang.Object) r0)
            boolean r16 = r3.changed((java.lang.Object) r13)
            r15 = r15 | r16
            r43 = r7
            java.lang.Object r7 = r3.rememberedValue()
            if (r15 != 0) goto L_0x03ca
            java.lang.Object r15 = r14.getEmpty()
            if (r7 != r15) goto L_0x03d2
        L_0x03ca:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1 r7 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            r7.<init>(r0, r13)
            r3.updateRememberedValue(r7)
        L_0x03d2:
            r3.endReplaceableGroup()
            of.a r7 = (p404of.C13074a) r7
            r15 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r7, r3, r15)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r3.startReplaceableGroup(r7)
            boolean r7 = r3.changed((java.lang.Object) r1)
            java.lang.Object r15 = r3.rememberedValue()
            if (r7 != 0) goto L_0x03f1
            java.lang.Object r7 = r14.getEmpty()
            if (r15 != r7) goto L_0x03fa
        L_0x03f1:
            r7 = 0
            r15 = 2
            androidx.compose.runtime.MutableState r15 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r7, r15, r7)
            r3.updateRememberedValue(r15)
        L_0x03fa:
            r3.endReplaceableGroup()
            androidx.compose.runtime.MutableState r15 = (androidx.compose.runtime.MutableState) r15
            androidx.compose.ui.text.input.ImeOptions r27 = r5.toImeOptions$foundation_release(r6)
            r24 = r6 ^ 1
            if (r6 == 0) goto L_0x040a
            r26 = r18
            goto L_0x040c
        L_0x040a:
            r26 = r50
        L_0x040c:
            if (r6 == 0) goto L_0x0411
            r7 = r18
            goto L_0x0413
        L_0x0411:
            r7 = r51
        L_0x0413:
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.startReplaceableGroup(r1)
            boolean r1 = r3.changed((java.lang.Object) r13)
            boolean r16 = r3.changed((java.lang.Object) r15)
            r1 = r1 | r16
            r44 = r5
            r5 = r42
            boolean r16 = r3.changed((java.lang.Object) r5)
            r1 = r1 | r16
            r45 = r6
            java.lang.Object r6 = r3.rememberedValue()
            if (r1 != 0) goto L_0x043b
            java.lang.Object r1 = r14.getEmpty()
            if (r6 != r1) goto L_0x0443
        L_0x043b:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1 r6 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
            r6.<init>(r5, r13, r15)
            r3.updateRememberedValue(r6)
        L_0x0443:
            r3.endReplaceableGroup()
            r17 = r6
            kotlin.jvm.functions.Function1 r17 = (kotlin.jvm.functions.Function1) r17
            r1 = r9 & 896(0x380, float:1.256E-42)
            int r6 = r9 >> 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r6
            int r6 = r8 << 9
            r13 = r6 & r22
            r1 = r1 | r13
            r13 = r6 & r25
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r6
            r1 = r1 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r13
            r33 = r1 | r6
            int r1 = r9 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r6
            r6 = r9 & r22
            r1 = r1 | r6
            r6 = r8 & r25
            r34 = r1 | r6
            r35 = 0
            r16 = r0
            r18 = r2
            r19 = r4
            r20 = r10
            r21 = r12
            r22 = r36
            r23 = r37
            r25 = r7
            r28 = r11
            r29 = r43
            r30 = r52
            r31 = r38
            r32 = r3
            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0498
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0498:
            r6 = r43
            r9 = r44
            r13 = r50
            r7 = r52
            r8 = r4
            r14 = r10
            r15 = r12
            r16 = r38
            r10 = r45
            r12 = r51
            r4 = r2
        L_0x04aa:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.endRestartGroup()
            if (r3 != 0) goto L_0x04b1
            goto L_0x04e5
        L_0x04b1:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5 r2 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
            r0 = r2
            r1 = r41
            r39 = r2
            r2 = r42
            r5 = r3
            r3 = r4
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r9
            r9 = r10
            r10 = r12
            r12 = r11
            r11 = r13
            r13 = r12
            r12 = r14
            r14 = r13
            r13 = r15
            r15 = r14
            r14 = r36
            r40 = r15
            r15 = r37
            r17 = r58
            r18 = r59
            r19 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r39
            r0 = r40
            r0.updateScope(r1)
        L_0x04e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final void BasicTextField$lambda$3(MutableState<TextFieldValue> mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    /* access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final void BasicTextField$lambda$7(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: of.p<? super of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: of.p<? super of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: of.p<of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, androidx.compose.runtime.Composer, java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: of.p<? super of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BasicTextField(androidx.compose.p002ui.text.input.TextFieldValue r37, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.input.TextFieldValue, p336ef.C11921v> r38, androidx.compose.p002ui.Modifier r39, boolean r40, boolean r41, androidx.compose.p002ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.p002ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.p002ui.graphics.Brush r51, p404of.C13089p<? super p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            r15 = r37
            r14 = r38
            r13 = r54
            r12 = r55
            r11 = r56
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1804514146(0x6b8eb362, float:3.4502916E26)
            r1 = r53
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.changedInstance(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0052:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r39
            boolean r16 = r10.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r9 = r39
        L_0x0068:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r40
            boolean r19 = r10.changed((boolean) r2)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r18
        L_0x0084:
            r1 = r1 | r19
            goto L_0x0089
        L_0x0087:
            r2 = r40
        L_0x0089:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x0099
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r41
            goto L_0x00ac
        L_0x0099:
            r23 = r13 & r22
            r3 = r41
            if (r23 != 0) goto L_0x00ac
            boolean r24 = r10.changed((boolean) r3)
            if (r24 == 0) goto L_0x00a8
            r24 = r20
            goto L_0x00aa
        L_0x00a8:
            r24 = r21
        L_0x00aa:
            r1 = r1 | r24
        L_0x00ac:
            r24 = r11 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00b9
            r26 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r26
            r5 = r42
            goto L_0x00cc
        L_0x00b9:
            r26 = r13 & r25
            r5 = r42
            if (r26 != 0) goto L_0x00cc
            boolean r27 = r10.changed((java.lang.Object) r5)
            if (r27 == 0) goto L_0x00c8
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r27
        L_0x00cc:
            r27 = r11 & 64
            if (r27 == 0) goto L_0x00d7
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r43
            goto L_0x00ec
        L_0x00d7:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r43
            if (r28 != 0) goto L_0x00ec
            boolean r29 = r10.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00e8
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r1 = r1 | r29
        L_0x00ec:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00f7
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r44
            goto L_0x010c
        L_0x00f7:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r44
            if (r30 != 0) goto L_0x010c
            boolean r31 = r10.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x0108
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r1 = r1 | r31
        L_0x010c:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0117
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r32
            r2 = r45
            goto L_0x012c
        L_0x0117:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r45
            if (r32 != 0) goto L_0x012c
            boolean r32 = r10.changed((boolean) r2)
            if (r32 == 0) goto L_0x0128
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r1 = r1 | r32
        L_0x012c:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            if (r32 != 0) goto L_0x0148
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0141
            r2 = r46
            boolean r32 = r10.changed((int) r2)
            if (r32 == 0) goto L_0x0143
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0141:
            r2 = r46
        L_0x0143:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r1 = r1 | r32
            goto L_0x014a
        L_0x0148:
            r2 = r46
        L_0x014a:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0153
            r23 = r12 | 6
            r3 = r47
            goto L_0x0169
        L_0x0153:
            r32 = r12 & 14
            r3 = r47
            if (r32 != 0) goto L_0x0167
            boolean r32 = r10.changed((int) r3)
            if (r32 == 0) goto L_0x0162
            r23 = 4
            goto L_0x0164
        L_0x0162:
            r23 = 2
        L_0x0164:
            r23 = r12 | r23
            goto L_0x0169
        L_0x0167:
            r23 = r12
        L_0x0169:
            r3 = r11 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0170
            r23 = r23 | 48
            goto L_0x0183
        L_0x0170:
            r32 = r12 & 112(0x70, float:1.57E-43)
            r5 = r48
            if (r32 != 0) goto L_0x0183
            boolean r32 = r10.changed((java.lang.Object) r5)
            if (r32 == 0) goto L_0x017f
            r28 = 32
            goto L_0x0181
        L_0x017f:
            r28 = 16
        L_0x0181:
            r23 = r23 | r28
        L_0x0183:
            r5 = r23
            r6 = r11 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x018c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01a0
        L_0x018c:
            r8 = r12 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x01a0
            r8 = r49
            boolean r23 = r10.changedInstance(r8)
            if (r23 == 0) goto L_0x019b
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x019d
        L_0x019b:
            r29 = 128(0x80, float:1.794E-43)
        L_0x019d:
            r5 = r5 | r29
            goto L_0x01a2
        L_0x01a0:
            r8 = r49
        L_0x01a2:
            r8 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01a9
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bb
        L_0x01a9:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01bb
            r9 = r50
            boolean r23 = r10.changed((java.lang.Object) r9)
            if (r23 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r17 = r18
        L_0x01b8:
            r5 = r5 | r17
            goto L_0x01bd
        L_0x01bb:
            r9 = r50
        L_0x01bd:
            r9 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01c6
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r14 = r51
            goto L_0x01d7
        L_0x01c6:
            r17 = r12 & r22
            r14 = r51
            if (r17 != 0) goto L_0x01d7
            boolean r17 = r10.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r20 = r21
        L_0x01d5:
            r5 = r5 | r20
        L_0x01d7:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01e5
            r18 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r18
            r12 = r52
            goto L_0x01f8
        L_0x01e5:
            r18 = r12 & r25
            r12 = r52
            if (r18 != 0) goto L_0x01f8
            boolean r18 = r10.changedInstance(r12)
            if (r18 == 0) goto L_0x01f4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f6
        L_0x01f4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01f6:
            r5 = r5 | r18
        L_0x01f8:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r1 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r14) goto L_0x0235
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r5
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r14) goto L_0x0235
            boolean r12 = r10.getSkipping()
            if (r12 != 0) goto L_0x0212
            goto L_0x0235
        L_0x0212:
            r10.skipToGroupEnd()
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r9 = r45
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
            r15 = r51
            r16 = r52
            r22 = r10
            r10 = r46
            goto L_0x041f
        L_0x0235:
            r10.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x026d
            boolean r12 = r10.getDefaultsInvalid()
            if (r12 == 0) goto L_0x0243
            goto L_0x026d
        L_0x0243:
            r10.skipToGroupEnd()
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x024e
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x024e:
            r20 = r39
            r21 = r40
            r23 = r41
            r24 = r42
            r14 = r43
            r26 = r44
            r12 = r45
            r27 = r46
            r28 = r47
            r29 = r48
            r30 = r49
            r32 = r50
            r33 = r51
            r34 = r52
            r0 = r1
            goto L_0x0359
        L_0x026d:
            if (r4 == 0) goto L_0x0272
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0274
        L_0x0272:
            r4 = r39
        L_0x0274:
            if (r16 == 0) goto L_0x0278
            r12 = 1
            goto L_0x027a
        L_0x0278:
            r12 = r40
        L_0x027a:
            if (r19 == 0) goto L_0x027f
            r16 = 0
            goto L_0x0281
        L_0x027f:
            r16 = r41
        L_0x0281:
            if (r24 == 0) goto L_0x028a
            androidx.compose.ui.text.TextStyle$Companion r18 = androidx.compose.p002ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r18 = r18.getDefault()
            goto L_0x028c
        L_0x028a:
            r18 = r42
        L_0x028c:
            if (r27 == 0) goto L_0x0295
            androidx.compose.foundation.text.KeyboardOptions$Companion r19 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r19 = r19.getDefault()
            goto L_0x0297
        L_0x0295:
            r19 = r43
        L_0x0297:
            if (r7 == 0) goto L_0x02a0
            androidx.compose.foundation.text.KeyboardActions$Companion r7 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r7 = r7.getDefault()
            goto L_0x02a2
        L_0x02a0:
            r7 = r44
        L_0x02a2:
            if (r0 == 0) goto L_0x02a6
            r0 = 0
            goto L_0x02a8
        L_0x02a6:
            r0 = r45
        L_0x02a8:
            r14 = r11 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x02b9
            if (r0 == 0) goto L_0x02b0
            r14 = 1
            goto L_0x02b3
        L_0x02b0:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L_0x02b3:
            r20 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r20
            goto L_0x02bb
        L_0x02b9:
            r14 = r46
        L_0x02bb:
            if (r2 == 0) goto L_0x02bf
            r2 = 1
            goto L_0x02c1
        L_0x02bf:
            r2 = r47
        L_0x02c1:
            if (r3 == 0) goto L_0x02ca
            androidx.compose.ui.text.input.VisualTransformation$Companion r3 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r3 = r3.getNone()
            goto L_0x02cc
        L_0x02ca:
            r3 = r48
        L_0x02cc:
            if (r6 == 0) goto L_0x02d1
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6 r6 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6.INSTANCE
            goto L_0x02d3
        L_0x02d1:
            r6 = r49
        L_0x02d3:
            if (r8 == 0) goto L_0x02f7
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r8)
            java.lang.Object r8 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r20 = androidx.compose.runtime.Composer.Companion
            r39 = r0
            java.lang.Object r0 = r20.getEmpty()
            if (r8 != r0) goto L_0x02f0
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r8)
        L_0x02f0:
            r10.endReplaceableGroup()
            r0 = r8
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x02fb
        L_0x02f7:
            r39 = r0
            r0 = r50
        L_0x02fb:
            if (r9 == 0) goto L_0x030e
            androidx.compose.ui.graphics.SolidColor r8 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r9 = androidx.compose.p002ui.graphics.Color.Companion
            r41 = r0
            r40 = r1
            long r0 = r9.m35697getBlack0d7_KjU()
            r9 = 0
            r8.<init>(r0, r9)
            goto L_0x0314
        L_0x030e:
            r41 = r0
            r40 = r1
            r8 = r51
        L_0x0314:
            if (r17 == 0) goto L_0x033b
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            of.p r0 = r0.m33641getLambda2$foundation_release()
            r32 = r41
            r34 = r0
            r28 = r2
            r29 = r3
            r20 = r4
            r30 = r6
            r26 = r7
            r33 = r8
            r21 = r12
            r27 = r14
            r23 = r16
            r24 = r18
            r14 = r19
            r12 = r39
            r0 = r40
            goto L_0x0359
        L_0x033b:
            r0 = r40
            r32 = r41
            r34 = r52
            r28 = r2
            r29 = r3
            r20 = r4
            r30 = r6
            r26 = r7
            r33 = r8
            r21 = r12
            r27 = r14
            r23 = r16
            r24 = r18
            r14 = r19
            r12 = r39
        L_0x0359:
            r10.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x036a
            java.lang.String r1 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:268)"
            r2 = 1804514146(0x6b8eb362, float:3.4502916E26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r0, r5, r1)
        L_0x036a:
            androidx.compose.ui.text.input.ImeOptions r16 = r14.toImeOptions$foundation_release(r12)
            r8 = r12 ^ 1
            if (r12 == 0) goto L_0x0375
            r31 = 1
            goto L_0x0377
        L_0x0375:
            r31 = r28
        L_0x0377:
            if (r12 == 0) goto L_0x037b
            r9 = 1
            goto L_0x037d
        L_0x037b:
            r9 = r27
        L_0x037d:
            r2 = r0 & 14
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.startReplaceableGroup(r1)
            boolean r1 = r10.changed((java.lang.Object) r15)
            r7 = r38
            boolean r3 = r10.changed((java.lang.Object) r7)
            r1 = r1 | r3
            java.lang.Object r3 = r10.rememberedValue()
            if (r1 != 0) goto L_0x039e
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x03a6
        L_0x039e:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1 r3 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
            r3.<init>(r15, r7)
            r10.updateRememberedValue(r3)
        L_0x03a6:
            r10.endReplaceableGroup()
            r1 = r3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r0 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r5 << 9
            r4 = r3 & r22
            r2 = r2 | r4
            r4 = r3 & r25
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r17 = r2 | r3
            int r2 = r0 >> 15
            r2 = r2 & 896(0x380, float:1.256E-42)
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r0 = r0 & r22
            r0 = r0 | r2
            r2 = r5 & r25
            r18 = r0 | r2
            r19 = 0
            r0 = r37
            r2 = r20
            r3 = r24
            r4 = r29
            r5 = r30
            r6 = r32
            r7 = r33
            r22 = r10
            r10 = r31
            r11 = r16
            r25 = r12
            r12 = r26
            r13 = r21
            r31 = r14
            r14 = r23
            r15 = r34
            r16 = r22
            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0403
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0403:
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r9 = r25
            r8 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r7 = r31
            r14 = r32
            r15 = r33
            r16 = r34
        L_0x041f:
            androidx.compose.runtime.ScopeUpdateScope r2 = r22.endRestartGroup()
            if (r2 != 0) goto L_0x0426
            goto L_0x0441
        L_0x0426:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
            r0 = r1
            r35 = r1
            r1 = r37
            r36 = r2
            r2 = r38
            r17 = r54
            r18 = r55
            r19 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r35
            r0 = r36
            r0.updateScope(r1)
        L_0x0441:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0137  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void BasicTextField(java.lang.String r38, kotlin.jvm.functions.Function1 r39, androidx.compose.p002ui.Modifier r40, boolean r41, boolean r42, androidx.compose.p002ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, androidx.compose.p002ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1 r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.p002ui.graphics.Brush r51, p404of.C13089p r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            r15 = r38
            r14 = r39
            r13 = r54
            r12 = r55
            r11 = r56
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            r1 = r53
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r9.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r9.changedInstance(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0052:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r40
            boolean r16 = r9.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r10 = r40
        L_0x0068:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r41
            boolean r19 = r9.changed((boolean) r2)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r18
        L_0x0084:
            r1 = r1 | r19
            goto L_0x0089
        L_0x0087:
            r2 = r41
        L_0x0089:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x0099
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r42
            goto L_0x00ac
        L_0x0099:
            r23 = r13 & r22
            r3 = r42
            if (r23 != 0) goto L_0x00ac
            boolean r24 = r9.changed((boolean) r3)
            if (r24 == 0) goto L_0x00a8
            r24 = r20
            goto L_0x00aa
        L_0x00a8:
            r24 = r21
        L_0x00aa:
            r1 = r1 | r24
        L_0x00ac:
            r24 = r11 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00b9
            r26 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r26
            r5 = r43
            goto L_0x00cc
        L_0x00b9:
            r26 = r13 & r25
            r5 = r43
            if (r26 != 0) goto L_0x00cc
            boolean r27 = r9.changed((java.lang.Object) r5)
            if (r27 == 0) goto L_0x00c8
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r27
        L_0x00cc:
            r27 = r11 & 64
            if (r27 == 0) goto L_0x00d7
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r44
            goto L_0x00ec
        L_0x00d7:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r44
            if (r28 != 0) goto L_0x00ec
            boolean r29 = r9.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00e8
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r1 = r1 | r29
        L_0x00ec:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00f7
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r45
            goto L_0x010c
        L_0x00f7:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r45
            if (r30 != 0) goto L_0x010c
            boolean r31 = r9.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x0108
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r1 = r1 | r31
        L_0x010c:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0117
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r32
            r2 = r46
            goto L_0x012c
        L_0x0117:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r46
            if (r32 != 0) goto L_0x012c
            boolean r32 = r9.changed((boolean) r2)
            if (r32 == 0) goto L_0x0128
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r1 = r1 | r32
        L_0x012c:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0137
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r32
            r3 = r47
            goto L_0x014c
        L_0x0137:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            r3 = r47
            if (r32 != 0) goto L_0x014c
            boolean r32 = r9.changed((int) r3)
            if (r32 == 0) goto L_0x0148
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r1 = r1 | r32
        L_0x014c:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0155
            r23 = r12 | 6
            r5 = r48
            goto L_0x016b
        L_0x0155:
            r32 = r12 & 14
            r5 = r48
            if (r32 != 0) goto L_0x0169
            boolean r32 = r9.changed((java.lang.Object) r5)
            if (r32 == 0) goto L_0x0164
            r23 = 4
            goto L_0x0166
        L_0x0164:
            r23 = 2
        L_0x0166:
            r23 = r12 | r23
            goto L_0x016b
        L_0x0169:
            r23 = r12
        L_0x016b:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0172
            r23 = r23 | 48
            goto L_0x0185
        L_0x0172:
            r32 = r12 & 112(0x70, float:1.57E-43)
            r6 = r49
            if (r32 != 0) goto L_0x0185
            boolean r32 = r9.changedInstance(r6)
            if (r32 == 0) goto L_0x0181
            r26 = 32
            goto L_0x0183
        L_0x0181:
            r26 = 16
        L_0x0183:
            r23 = r23 | r26
        L_0x0185:
            r6 = r23
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018e
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a2
        L_0x018e:
            r10 = r12 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a2
            r10 = r50
            boolean r23 = r9.changed((java.lang.Object) r10)
            if (r23 == 0) goto L_0x019d
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r29 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r6 = r6 | r29
            goto L_0x01a4
        L_0x01a2:
            r10 = r50
        L_0x01a4:
            r10 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01ab
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bd
        L_0x01ab:
            r13 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01bd
            r13 = r51
            boolean r23 = r9.changed((java.lang.Object) r13)
            if (r23 == 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r17 = r18
        L_0x01ba:
            r6 = r6 | r17
            goto L_0x01bf
        L_0x01bd:
            r13 = r51
        L_0x01bf:
            r13 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01c8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r11 = r52
            goto L_0x01d9
        L_0x01c8:
            r17 = r12 & r22
            r11 = r52
            if (r17 != 0) goto L_0x01d9
            boolean r17 = r9.changedInstance(r11)
            if (r17 == 0) goto L_0x01d5
            goto L_0x01d7
        L_0x01d5:
            r20 = r21
        L_0x01d7:
            r6 = r6 | r20
        L_0x01d9:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r12) goto L_0x0213
            r11 = 46811(0xb6db, float:6.5596E-41)
            r11 = r11 & r6
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x0213
            boolean r11 = r9.getSkipping()
            if (r11 != 0) goto L_0x01f2
            goto L_0x0213
        L_0x01f2:
            r9.skipToGroupEnd()
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r50
            r14 = r51
            r15 = r52
            r22 = r9
            r9 = r46
            goto L_0x034e
        L_0x0213:
            if (r4 == 0) goto L_0x021a
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            r20 = r4
            goto L_0x021c
        L_0x021a:
            r20 = r40
        L_0x021c:
            if (r16 == 0) goto L_0x0222
            r4 = 1
            r21 = r4
            goto L_0x0224
        L_0x0222:
            r21 = r41
        L_0x0224:
            if (r19 == 0) goto L_0x022a
            r4 = 0
            r23 = r4
            goto L_0x022c
        L_0x022a:
            r23 = r42
        L_0x022c:
            if (r24 == 0) goto L_0x0237
            androidx.compose.ui.text.TextStyle$Companion r4 = androidx.compose.p002ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r4 = r4.getDefault()
            r24 = r4
            goto L_0x0239
        L_0x0237:
            r24 = r43
        L_0x0239:
            if (r27 == 0) goto L_0x0244
            androidx.compose.foundation.text.KeyboardOptions$Companion r4 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r4 = r4.getDefault()
            r26 = r4
            goto L_0x0246
        L_0x0244:
            r26 = r44
        L_0x0246:
            if (r7 == 0) goto L_0x0251
            androidx.compose.foundation.text.KeyboardActions$Companion r4 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r4 = r4.getDefault()
            r27 = r4
            goto L_0x0253
        L_0x0251:
            r27 = r45
        L_0x0253:
            if (r0 == 0) goto L_0x0259
            r0 = 0
            r28 = r0
            goto L_0x025b
        L_0x0259:
            r28 = r46
        L_0x025b:
            if (r2 == 0) goto L_0x0263
            r0 = 2147483647(0x7fffffff, float:NaN)
            r29 = r0
            goto L_0x0265
        L_0x0263:
            r29 = r47
        L_0x0265:
            if (r3 == 0) goto L_0x0270
            androidx.compose.ui.text.input.VisualTransformation$Companion r0 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r0 = r0.getNone()
            r30 = r0
            goto L_0x0272
        L_0x0270:
            r30 = r48
        L_0x0272:
            if (r5 == 0) goto L_0x0279
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10 r0 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10.INSTANCE
            r32 = r0
            goto L_0x027b
        L_0x0279:
            r32 = r49
        L_0x027b:
            if (r8 == 0) goto L_0x029e
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0296
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r0)
        L_0x0296:
            r9.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r33 = r0
            goto L_0x02a0
        L_0x029e:
            r33 = r50
        L_0x02a0:
            if (r10 == 0) goto L_0x02b1
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.p002ui.graphics.Color.Companion
            long r2 = r2.m35697getBlack0d7_KjU()
            r4 = 0
            r0.<init>(r2, r4)
            r34 = r0
            goto L_0x02b3
        L_0x02b1:
            r34 = r51
        L_0x02b3:
            if (r13 == 0) goto L_0x02be
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            of.p r0 = r0.m33642getLambda3$foundation_release()
            r35 = r0
            goto L_0x02c0
        L_0x02be:
            r35 = r52
        L_0x02c0:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:313)"
            r2 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r6, r0)
        L_0x02ce:
            r10 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r22
            r0 = r0 | r2
            r2 = r1 & r25
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r17 = r0 | r1
            int r0 = r6 << 3
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r22
            r1 = r1 | r2
            r0 = r0 & r25
            r18 = r1 | r0
            r19 = 0
            r0 = r38
            r1 = r39
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r8 = r28
            r22 = r9
            r9 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r22
            BasicTextField((java.lang.String) r0, (kotlin.jvm.functions.Function1<? super java.lang.String, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.p002ui.text.TextStyle) r5, (androidx.compose.foundation.text.KeyboardOptions) r6, (androidx.compose.foundation.text.KeyboardActions) r7, (boolean) r8, (int) r9, (int) r10, (androidx.compose.p002ui.text.input.VisualTransformation) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v>) r12, (androidx.compose.foundation.interaction.MutableInteractionSource) r13, (androidx.compose.p002ui.graphics.Brush) r14, (p404of.C13089p<? super p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0334
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0334:
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
        L_0x034e:
            androidx.compose.runtime.ScopeUpdateScope r2 = r22.endRestartGroup()
            if (r2 != 0) goto L_0x0355
            goto L_0x0370
        L_0x0355:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12
            r0 = r1
            r36 = r1
            r1 = r38
            r37 = r2
            r2 = r39
            r16 = r54
            r17 = r55
            r18 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r36
            r0 = r37
            r0.updateScope(r1)
        L_0x0370:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0137  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void BasicTextField(androidx.compose.p002ui.text.input.TextFieldValue r38, kotlin.jvm.functions.Function1 r39, androidx.compose.p002ui.Modifier r40, boolean r41, boolean r42, androidx.compose.p002ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, androidx.compose.p002ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1 r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.p002ui.graphics.Brush r51, p404of.C13089p r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            r15 = r38
            r14 = r39
            r13 = r54
            r12 = r55
            r11 = r56
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            r1 = r53
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r9.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r9.changedInstance(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0052:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r40
            boolean r16 = r9.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r10 = r40
        L_0x0068:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r41
            boolean r19 = r9.changed((boolean) r2)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r18
        L_0x0084:
            r1 = r1 | r19
            goto L_0x0089
        L_0x0087:
            r2 = r41
        L_0x0089:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x0099
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r42
            goto L_0x00ac
        L_0x0099:
            r23 = r13 & r22
            r3 = r42
            if (r23 != 0) goto L_0x00ac
            boolean r24 = r9.changed((boolean) r3)
            if (r24 == 0) goto L_0x00a8
            r24 = r20
            goto L_0x00aa
        L_0x00a8:
            r24 = r21
        L_0x00aa:
            r1 = r1 | r24
        L_0x00ac:
            r24 = r11 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00b9
            r26 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r26
            r5 = r43
            goto L_0x00cc
        L_0x00b9:
            r26 = r13 & r25
            r5 = r43
            if (r26 != 0) goto L_0x00cc
            boolean r27 = r9.changed((java.lang.Object) r5)
            if (r27 == 0) goto L_0x00c8
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r27
        L_0x00cc:
            r27 = r11 & 64
            if (r27 == 0) goto L_0x00d7
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r44
            goto L_0x00ec
        L_0x00d7:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r44
            if (r28 != 0) goto L_0x00ec
            boolean r29 = r9.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00e8
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r1 = r1 | r29
        L_0x00ec:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00f7
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r45
            goto L_0x010c
        L_0x00f7:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r45
            if (r30 != 0) goto L_0x010c
            boolean r31 = r9.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x0108
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r1 = r1 | r31
        L_0x010c:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0117
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r32
            r2 = r46
            goto L_0x012c
        L_0x0117:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r46
            if (r32 != 0) goto L_0x012c
            boolean r32 = r9.changed((boolean) r2)
            if (r32 == 0) goto L_0x0128
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r1 = r1 | r32
        L_0x012c:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0137
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r32
            r3 = r47
            goto L_0x014c
        L_0x0137:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            r3 = r47
            if (r32 != 0) goto L_0x014c
            boolean r32 = r9.changed((int) r3)
            if (r32 == 0) goto L_0x0148
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r1 = r1 | r32
        L_0x014c:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0155
            r23 = r12 | 6
            r5 = r48
            goto L_0x016b
        L_0x0155:
            r32 = r12 & 14
            r5 = r48
            if (r32 != 0) goto L_0x0169
            boolean r32 = r9.changed((java.lang.Object) r5)
            if (r32 == 0) goto L_0x0164
            r23 = 4
            goto L_0x0166
        L_0x0164:
            r23 = 2
        L_0x0166:
            r23 = r12 | r23
            goto L_0x016b
        L_0x0169:
            r23 = r12
        L_0x016b:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0172
            r23 = r23 | 48
            goto L_0x0185
        L_0x0172:
            r32 = r12 & 112(0x70, float:1.57E-43)
            r6 = r49
            if (r32 != 0) goto L_0x0185
            boolean r32 = r9.changedInstance(r6)
            if (r32 == 0) goto L_0x0181
            r26 = 32
            goto L_0x0183
        L_0x0181:
            r26 = 16
        L_0x0183:
            r23 = r23 | r26
        L_0x0185:
            r6 = r23
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018e
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a2
        L_0x018e:
            r10 = r12 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a2
            r10 = r50
            boolean r23 = r9.changed((java.lang.Object) r10)
            if (r23 == 0) goto L_0x019d
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r29 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r6 = r6 | r29
            goto L_0x01a4
        L_0x01a2:
            r10 = r50
        L_0x01a4:
            r10 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01ab
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bd
        L_0x01ab:
            r13 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01bd
            r13 = r51
            boolean r23 = r9.changed((java.lang.Object) r13)
            if (r23 == 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r17 = r18
        L_0x01ba:
            r6 = r6 | r17
            goto L_0x01bf
        L_0x01bd:
            r13 = r51
        L_0x01bf:
            r13 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01c8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r11 = r52
            goto L_0x01d9
        L_0x01c8:
            r17 = r12 & r22
            r11 = r52
            if (r17 != 0) goto L_0x01d9
            boolean r17 = r9.changedInstance(r11)
            if (r17 == 0) goto L_0x01d5
            goto L_0x01d7
        L_0x01d5:
            r20 = r21
        L_0x01d7:
            r6 = r6 | r20
        L_0x01d9:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r12) goto L_0x0213
            r11 = 46811(0xb6db, float:6.5596E-41)
            r11 = r11 & r6
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x0213
            boolean r11 = r9.getSkipping()
            if (r11 != 0) goto L_0x01f2
            goto L_0x0213
        L_0x01f2:
            r9.skipToGroupEnd()
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r50
            r14 = r51
            r15 = r52
            r22 = r9
            r9 = r46
            goto L_0x034e
        L_0x0213:
            if (r4 == 0) goto L_0x021a
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            r20 = r4
            goto L_0x021c
        L_0x021a:
            r20 = r40
        L_0x021c:
            if (r16 == 0) goto L_0x0222
            r4 = 1
            r21 = r4
            goto L_0x0224
        L_0x0222:
            r21 = r41
        L_0x0224:
            if (r19 == 0) goto L_0x022a
            r4 = 0
            r23 = r4
            goto L_0x022c
        L_0x022a:
            r23 = r42
        L_0x022c:
            if (r24 == 0) goto L_0x0237
            androidx.compose.ui.text.TextStyle$Companion r4 = androidx.compose.p002ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r4 = r4.getDefault()
            r24 = r4
            goto L_0x0239
        L_0x0237:
            r24 = r43
        L_0x0239:
            if (r27 == 0) goto L_0x0244
            androidx.compose.foundation.text.KeyboardOptions$Companion r4 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r4 = r4.getDefault()
            r26 = r4
            goto L_0x0246
        L_0x0244:
            r26 = r44
        L_0x0246:
            if (r7 == 0) goto L_0x0251
            androidx.compose.foundation.text.KeyboardActions$Companion r4 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r4 = r4.getDefault()
            r27 = r4
            goto L_0x0253
        L_0x0251:
            r27 = r45
        L_0x0253:
            if (r0 == 0) goto L_0x0259
            r0 = 0
            r28 = r0
            goto L_0x025b
        L_0x0259:
            r28 = r46
        L_0x025b:
            if (r2 == 0) goto L_0x0263
            r0 = 2147483647(0x7fffffff, float:NaN)
            r29 = r0
            goto L_0x0265
        L_0x0263:
            r29 = r47
        L_0x0265:
            if (r3 == 0) goto L_0x0270
            androidx.compose.ui.text.input.VisualTransformation$Companion r0 = androidx.compose.p002ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r0 = r0.getNone()
            r30 = r0
            goto L_0x0272
        L_0x0270:
            r30 = r48
        L_0x0272:
            if (r5 == 0) goto L_0x0279
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13 r0 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13.INSTANCE
            r32 = r0
            goto L_0x027b
        L_0x0279:
            r32 = r49
        L_0x027b:
            if (r8 == 0) goto L_0x029e
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0296
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r0)
        L_0x0296:
            r9.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r33 = r0
            goto L_0x02a0
        L_0x029e:
            r33 = r50
        L_0x02a0:
            if (r10 == 0) goto L_0x02b1
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.p002ui.graphics.Color.Companion
            long r2 = r2.m35697getBlack0d7_KjU()
            r4 = 0
            r0.<init>(r2, r4)
            r34 = r0
            goto L_0x02b3
        L_0x02b1:
            r34 = r51
        L_0x02b3:
            if (r13 == 0) goto L_0x02be
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            of.p r0 = r0.m33643getLambda4$foundation_release()
            r35 = r0
            goto L_0x02c0
        L_0x02be:
            r35 = r52
        L_0x02c0:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:353)"
            r2 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r6, r0)
        L_0x02ce:
            r10 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r22
            r0 = r0 | r2
            r2 = r1 & r25
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r17 = r0 | r1
            int r0 = r6 << 3
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r22
            r1 = r1 | r2
            r0 = r0 & r25
            r18 = r1 | r0
            r19 = 0
            r0 = r38
            r1 = r39
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r8 = r28
            r22 = r9
            r9 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r22
            BasicTextField((androidx.compose.p002ui.text.input.TextFieldValue) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.input.TextFieldValue, p336ef.C11921v>) r1, (androidx.compose.p002ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.p002ui.text.TextStyle) r5, (androidx.compose.foundation.text.KeyboardOptions) r6, (androidx.compose.foundation.text.KeyboardActions) r7, (boolean) r8, (int) r9, (int) r10, (androidx.compose.p002ui.text.input.VisualTransformation) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.TextLayoutResult, p336ef.C11921v>) r12, (androidx.compose.foundation.interaction.MutableInteractionSource) r13, (androidx.compose.p002ui.graphics.Brush) r14, (p404of.C13089p<? super p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0334
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0334:
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
        L_0x034e:
            androidx.compose.runtime.ScopeUpdateScope r2 = r22.endRestartGroup()
            if (r2 != 0) goto L_0x0355
            goto L_0x0370
        L_0x0355:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15
            r0 = r1
            r36 = r1
            r1 = r38
            r37 = r2
            r2 = r39
            r16 = r54
            r17 = r55
            r18 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r36
            r0 = r37
            r0.updateScope(r1)
        L_0x0370:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
