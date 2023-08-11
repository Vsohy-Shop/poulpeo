package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.draw.ShadowKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,641:1\n154#2:642\n154#2:645\n154#2:655\n154#2:665\n154#2:675\n76#3:643\n76#3:653\n76#3:663\n76#3:673\n76#3:683\n76#3:684\n51#4:644\n51#4:654\n51#4:664\n51#4:674\n51#4:685\n25#5:646\n25#5:656\n25#5:666\n25#5:676\n1114#6,6:647\n1114#6,6:657\n1114#6,6:667\n1114#6,6:677\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n*L\n111#1:642\n219#1:645\n333#1:655\n448#1:665\n576#1:675\n114#1:643\n223#1:653\n337#1:663\n452#1:673\n578#1:683\n584#1:684\n114#1:644\n223#1:654\n337#1:664\n452#1:674\n584#1:685\n220#1:646\n334#1:656\n449#1:666\n577#1:676\n220#1:647,6\n334#1:657,6\n449#1:667,6\n577#1:677,6\n*E\n"})
/* compiled from: Surface.kt */
public final class SurfaceKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012e  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: Surface-9VG74zQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34126Surface9VG74zQ(p404of.C13074a<p336ef.C11921v> r38, androidx.compose.p002ui.Modifier r39, androidx.compose.p002ui.graphics.Shape r40, long r41, long r43, androidx.compose.foundation.BorderStroke r45, float r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.foundation.Indication r48, boolean r49, java.lang.String r50, androidx.compose.p002ui.semantics.Role r51, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            r15 = r38
            r14 = r52
            r13 = r54
            r12 = r55
            r11 = r56
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1585925488(0x5e874d70, float:4.874786E18)
            r1 = r53
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.changedInstance(r15)
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
            goto L_0x004e
        L_0x003b:
            r7 = r13 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r39
            boolean r8 = r10.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x004a
            r8 = 32
            goto L_0x004c
        L_0x004a:
            r8 = 16
        L_0x004c:
            r1 = r1 | r8
            goto L_0x0050
        L_0x004e:
            r7 = r39
        L_0x0050:
            r8 = r11 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x0059:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r40
            boolean r17 = r10.changed((java.lang.Object) r2)
            if (r17 == 0) goto L_0x0068
            r17 = r16
            goto L_0x006a
        L_0x0068:
            r17 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r17
            goto L_0x006f
        L_0x006d:
            r2 = r40
        L_0x006f:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0087
            r5 = r11 & 8
            r6 = r41
            if (r5 != 0) goto L_0x0082
            boolean r18 = r10.changed((long) r6)
            if (r18 == 0) goto L_0x0082
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r18
            goto L_0x0089
        L_0x0087:
            r6 = r41
        L_0x0089:
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00a3
            r18 = r11 & 16
            r5 = r43
            if (r18 != 0) goto L_0x009f
            boolean r7 = r10.changed((long) r5)
            if (r7 == 0) goto L_0x009f
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r1 = r1 | r7
            goto L_0x00a5
        L_0x00a3:
            r5 = r43
        L_0x00a5:
            r7 = r11 & 32
            if (r7 == 0) goto L_0x00b0
            r19 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r19
            r9 = r45
            goto L_0x00c5
        L_0x00b0:
            r19 = 458752(0x70000, float:6.42848E-40)
            r19 = r13 & r19
            r9 = r45
            if (r19 != 0) goto L_0x00c5
            boolean r20 = r10.changed((java.lang.Object) r9)
            if (r20 == 0) goto L_0x00c1
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r1 = r1 | r20
        L_0x00c5:
            r20 = r11 & 64
            if (r20 == 0) goto L_0x00d0
            r21 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r21
            r3 = r46
            goto L_0x00e5
        L_0x00d0:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r13 & r21
            r3 = r46
            if (r21 != 0) goto L_0x00e5
            boolean r22 = r10.changed((float) r3)
            if (r22 == 0) goto L_0x00e1
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r22
        L_0x00e5:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f0
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r23
            r2 = r47
            goto L_0x0105
        L_0x00f0:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r13 & r23
            r2 = r47
            if (r23 != 0) goto L_0x0105
            boolean r23 = r10.changed((java.lang.Object) r2)
            if (r23 == 0) goto L_0x0101
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0103
        L_0x0101:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x0103:
            r1 = r1 | r23
        L_0x0105:
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x0121
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x011a
            r2 = r48
            boolean r23 = r10.changed((java.lang.Object) r2)
            if (r23 == 0) goto L_0x011c
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011a:
            r2 = r48
        L_0x011c:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r1 = r1 | r23
            goto L_0x0123
        L_0x0121:
            r2 = r48
        L_0x0123:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x012e
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r23
            r3 = r49
            goto L_0x0143
        L_0x012e:
            r23 = 1879048192(0x70000000, float:1.58456325E29)
            r23 = r13 & r23
            r3 = r49
            if (r23 != 0) goto L_0x0143
            boolean r23 = r10.changed((boolean) r3)
            if (r23 == 0) goto L_0x013f
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0141
        L_0x013f:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0141:
            r1 = r1 | r23
        L_0x0143:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x014c
            r23 = r12 | 6
            r5 = r50
            goto L_0x0160
        L_0x014c:
            r23 = r12 & 14
            r5 = r50
            if (r23 != 0) goto L_0x015e
            boolean r6 = r10.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x015a
            r6 = 4
            goto L_0x015b
        L_0x015a:
            r6 = 2
        L_0x015b:
            r23 = r12 | r6
            goto L_0x0160
        L_0x015e:
            r23 = r12
        L_0x0160:
            r6 = r11 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0167
            r23 = r23 | 48
            goto L_0x017a
        L_0x0167:
            r24 = r12 & 112(0x70, float:1.57E-43)
            r5 = r51
            if (r24 != 0) goto L_0x017a
            boolean r24 = r10.changed((java.lang.Object) r5)
            if (r24 == 0) goto L_0x0176
            r17 = 32
            goto L_0x0178
        L_0x0176:
            r17 = 16
        L_0x0178:
            r23 = r23 | r17
        L_0x017a:
            r5 = r23
            r9 = r11 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0183
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0193
        L_0x0183:
            r9 = r12 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0193
            boolean r9 = r10.changedInstance(r14)
            if (r9 == 0) goto L_0x0190
            r9 = r16
            goto L_0x0192
        L_0x0190:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r5 = r5 | r9
        L_0x0193:
            r9 = r5
            r5 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r5 & r1
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r12) goto L_0x01c6
            r5 = r9 & 731(0x2db, float:1.024E-42)
            r12 = 146(0x92, float:2.05E-43)
            if (r5 != r12) goto L_0x01c6
            boolean r5 = r10.getSkipping()
            if (r5 != 0) goto L_0x01aa
            goto L_0x01c6
        L_0x01aa:
            r10.skipToGroupEnd()
            r2 = r39
            r3 = r40
            r4 = r41
            r6 = r43
            r8 = r45
            r9 = r46
            r11 = r48
            r12 = r49
            r13 = r50
            r14 = r51
            r1 = r10
            r10 = r47
            goto L_0x0380
        L_0x01c6:
            r10.startDefaults()
            r5 = r13 & 1
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x0221
            boolean r5 = r10.getDefaultsInvalid()
            if (r5 == 0) goto L_0x01da
            goto L_0x0221
        L_0x01da:
            r10.skipToGroupEnd()
            r0 = r11 & 8
            if (r0 == 0) goto L_0x01e3
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x01e3:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x01e9
            r1 = r1 & r17
        L_0x01e9:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0208
            r0 = r1 & r16
            r17 = r39
            r19 = r40
            r23 = r41
            r25 = r43
            r20 = r45
            r27 = r46
            r28 = r47
            r29 = r48
            r30 = r49
            r31 = r50
            r32 = r51
            r6 = r0
            goto L_0x02de
        L_0x0208:
            r17 = r39
            r19 = r40
            r23 = r41
            r25 = r43
            r20 = r45
            r27 = r46
            r28 = r47
            r29 = r48
            r30 = r49
            r31 = r50
            r32 = r51
            r6 = r1
            goto L_0x02de
        L_0x0221:
            if (r4 == 0) goto L_0x0226
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0228
        L_0x0226:
            r4 = r39
        L_0x0228:
            if (r8 == 0) goto L_0x022f
            androidx.compose.ui.graphics.Shape r5 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            goto L_0x0231
        L_0x022f:
            r5 = r40
        L_0x0231:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0249
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.INSTANCE
            r12 = 6
            androidx.compose.material.Colors r8 = r8.getColors(r10, r12)
            long r23 = r8.m33956getSurface0d7_KjU()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r39 = r4
            r40 = r5
            r4 = r23
            goto L_0x024f
        L_0x0249:
            r39 = r4
            r40 = r5
            r4 = r41
        L_0x024f:
            r8 = r11 & 16
            if (r8 == 0) goto L_0x025e
            int r8 = r1 >> 9
            r8 = r8 & 14
            long r23 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r4, r10, r8)
            r1 = r1 & r17
            goto L_0x0260
        L_0x025e:
            r23 = r43
        L_0x0260:
            if (r7 == 0) goto L_0x0264
            r7 = 0
            goto L_0x0266
        L_0x0264:
            r7 = r45
        L_0x0266:
            if (r20 == 0) goto L_0x026f
            r12 = 0
            float r8 = (float) r12
            float r8 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r8)
            goto L_0x0271
        L_0x026f:
            r8 = r46
        L_0x0271:
            if (r0 == 0) goto L_0x0292
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r0 != r12) goto L_0x028c
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r0)
        L_0x028c:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x0294
        L_0x0292:
            r0 = r47
        L_0x0294:
            r12 = r11 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x02a5
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.foundation.IndicationKt.getLocalIndication()
            java.lang.Object r12 = r10.consume(r12)
            androidx.compose.foundation.Indication r12 = (androidx.compose.foundation.Indication) r12
            r1 = r1 & r16
            goto L_0x02a7
        L_0x02a5:
            r12 = r48
        L_0x02a7:
            if (r2 == 0) goto L_0x02ab
            r2 = 1
            goto L_0x02ad
        L_0x02ab:
            r2 = r49
        L_0x02ad:
            if (r3 == 0) goto L_0x02b1
            r3 = 0
            goto L_0x02b3
        L_0x02b1:
            r3 = r50
        L_0x02b3:
            r17 = r39
            r19 = r40
            if (r6 == 0) goto L_0x02cb
            r28 = r0
            r6 = r1
            r30 = r2
            r31 = r3
            r20 = r7
            r27 = r8
            r29 = r12
            r25 = r23
            r32 = 0
            goto L_0x02dc
        L_0x02cb:
            r32 = r51
            r28 = r0
            r6 = r1
            r30 = r2
            r31 = r3
            r20 = r7
            r27 = r8
            r29 = r12
            r25 = r23
        L_0x02dc:
            r23 = r4
        L_0x02de:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02ef
            java.lang.String r0 = "androidx.compose.material.Surface (Surface.kt:568)"
            r1 = 1585925488(0x5e874d70, float:4.874786E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r6, r9, r0)
        L_0x02ef:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            java.lang.Object r0 = r10.consume(r0)
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.p002ui.unit.C1232Dp) r0
            float r0 = r0.m38482unboximpl()
            float r0 = r0 + r27
            float r0 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            r5 = r0
            r1 = 2
            androidx.compose.runtime.ProvidedValue[] r12 = new androidx.compose.runtime.ProvidedValue[r1]
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r2 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r25)
            androidx.compose.runtime.ProvidedValue r1 = r1.provides(r2)
            r2 = 0
            r12[r2] = r1
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            androidx.compose.ui.unit.Dp r0 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r0)
            androidx.compose.runtime.ProvidedValue r0 = r1.provides(r0)
            r16 = 1
            r12[r16] = r0
            androidx.compose.material.SurfaceKt$Surface$13 r8 = new androidx.compose.material.SurfaceKt$Surface$13
            r0 = r8
            r1 = r17
            r2 = r19
            r3 = r23
            r7 = r20
            r33 = r8
            r8 = r27
            r18 = r9
            r9 = r28
            r34 = r10
            r10 = r29
            r11 = r30
            r35 = r12
            r12 = r31
            r13 = r32
            r14 = r38
            r15 = r52
            r16 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 149594672(0x8eaa230, float:1.4121493E-33)
            r2 = r33
            r1 = r34
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r2)
            r2 = 56
            r3 = r35
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x036a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x036a:
            r2 = r17
            r3 = r19
            r8 = r20
            r4 = r23
            r6 = r25
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
        L_0x0380:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x0387
            goto L_0x03a2
        L_0x0387:
            androidx.compose.material.SurfaceKt$Surface$14 r1 = new androidx.compose.material.SurfaceKt$Surface$14
            r0 = r1
            r36 = r1
            r1 = r38
            r37 = r15
            r15 = r52
            r16 = r54
            r17 = r55
            r18 = r56
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r36
            r0 = r37
            r0.updateScope(r1)
        L_0x03a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m34126Surface9VG74zQ(of.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, of.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f7  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Surface-F-jzlyU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34127SurfaceFjzlyU(androidx.compose.p002ui.Modifier r22, androidx.compose.p002ui.graphics.Shape r23, long r24, long r26, androidx.compose.foundation.BorderStroke r28, float r29, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r10 = r30
            r11 = r32
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = 1412203386(0x542c837a, float:2.96376074E12)
            r1 = r31
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x001c
            r3 = r11 | 6
            r4 = r3
            r3 = r22
            goto L_0x0030
        L_0x001c:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r22
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r11
            goto L_0x0030
        L_0x002d:
            r3 = r22
            r4 = r11
        L_0x0030:
            r5 = r33 & 2
            if (r5 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x004a
        L_0x0037:
            r6 = r11 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r23
            boolean r7 = r12.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r4 = r4 | r7
            goto L_0x004c
        L_0x004a:
            r6 = r23
        L_0x004c:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r33 & 4
            if (r7 != 0) goto L_0x005f
            r7 = r24
            boolean r9 = r12.changed((long) r7)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r7 = r24
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r9
            goto L_0x0067
        L_0x0065:
            r7 = r24
        L_0x0067:
            r9 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007e
            r9 = r33 & 8
            r13 = r26
            if (r9 != 0) goto L_0x007a
            boolean r9 = r12.changed((long) r13)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r9
            goto L_0x0080
        L_0x007e:
            r13 = r26
        L_0x0080:
            r9 = r33 & 16
            if (r9 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x0087:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x009d
            r15 = r28
            boolean r16 = r12.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x0098
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r16
            goto L_0x009f
        L_0x009d:
            r15 = r28
        L_0x009f:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00aa
            r17 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r17
            r2 = r29
            goto L_0x00bf
        L_0x00aa:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r11 & r17
            r2 = r29
            if (r17 != 0) goto L_0x00bf
            boolean r17 = r12.changed((float) r2)
            if (r17 == 0) goto L_0x00bb
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r4 = r4 | r17
        L_0x00bf:
            r17 = r33 & 64
            if (r17 == 0) goto L_0x00c8
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c5:
            r4 = r4 | r17
            goto L_0x00da
        L_0x00c8:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00da
            boolean r17 = r12.changedInstance(r10)
            if (r17 == 0) goto L_0x00d7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00d7:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c5
        L_0x00da:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r4 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00f7
            boolean r0 = r12.getSkipping()
            if (r0 != 0) goto L_0x00eb
            goto L_0x00f7
        L_0x00eb:
            r12.skipToGroupEnd()
            r1 = r3
            r2 = r6
            r3 = r7
            r5 = r13
            r7 = r15
            r8 = r29
            goto L_0x01e6
        L_0x00f7:
            r12.startDefaults()
            r0 = r11 & 1
            r2 = 0
            if (r0 == 0) goto L_0x012b
            boolean r0 = r12.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0106
            goto L_0x012b
        L_0x0106:
            r12.skipToGroupEnd()
            r0 = r33 & 4
            if (r0 == 0) goto L_0x010f
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x010f:
            r0 = r33 & 8
            if (r0 == 0) goto L_0x0120
            r0 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r20 = r29
            r18 = r13
            r17 = r15
            r13 = r3
            r14 = r6
            r15 = r7
            r6 = r0
            goto L_0x016d
        L_0x0120:
            r20 = r29
            r18 = r13
            r17 = r15
            r13 = r3
        L_0x0127:
            r14 = r6
            r15 = r7
            r6 = r4
            goto L_0x016d
        L_0x012b:
            if (r1 == 0) goto L_0x0130
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0131
        L_0x0130:
            r0 = r3
        L_0x0131:
            if (r5 == 0) goto L_0x0138
            androidx.compose.ui.graphics.Shape r1 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            r6 = r1
        L_0x0138:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x0149
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material.Colors r1 = r1.getColors(r12, r3)
            long r7 = r1.m33956getSurface0d7_KjU()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0149:
            r1 = r33 & 8
            if (r1 == 0) goto L_0x0157
            int r1 = r4 >> 6
            r1 = r1 & 14
            long r13 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r7, r12, r1)
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0157:
            if (r9 == 0) goto L_0x015b
            r1 = 0
            r15 = r1
        L_0x015b:
            if (r16 == 0) goto L_0x0165
            float r1 = (float) r2
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            r20 = r1
            goto L_0x0167
        L_0x0165:
            r20 = r29
        L_0x0167:
            r18 = r13
            r17 = r15
            r13 = r0
            goto L_0x0127
        L_0x016d:
            r12.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x017f
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.Surface (Surface.kt:104)"
            r3 = 1412203386(0x542c837a, float:2.96376074E12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r6, r0, r1)
        L_0x017f:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            java.lang.Object r0 = r12.consume(r0)
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.p002ui.unit.C1232Dp) r0
            float r0 = r0.m38482unboximpl()
            float r0 = r0 + r20
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            r0 = 2
            androidx.compose.runtime.ProvidedValue[] r9 = new androidx.compose.runtime.ProvidedValue[r0]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r1 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r18)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r9[r2] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r5)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r8 = 1
            r9[r8] = r0
            androidx.compose.material.SurfaceKt$Surface$1 r7 = new androidx.compose.material.SurfaceKt$Surface$1
            r0 = r7
            r1 = r13
            r2 = r14
            r3 = r15
            r10 = r7
            r7 = r17
            r11 = r8
            r8 = r20
            r21 = r9
            r9 = r30
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            r0 = -1822160838(0xffffffff9364083a, float:-2.8781702E-27)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r0, r11, r10)
            r1 = 56
            r2 = r21
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r2, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r12, (int) r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01dd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01dd:
            r1 = r13
            r2 = r14
            r3 = r15
            r7 = r17
            r5 = r18
            r8 = r20
        L_0x01e6:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.endRestartGroup()
            if (r12 != 0) goto L_0x01ed
            goto L_0x01fc
        L_0x01ed:
            androidx.compose.material.SurfaceKt$Surface$2 r13 = new androidx.compose.material.SurfaceKt$Surface$2
            r0 = r13
            r9 = r30
            r10 = r32
            r11 = r33
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: Surface-LPr_se0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34128SurfaceLPr_se0(p404of.C13074a<p336ef.C11921v> r30, androidx.compose.p002ui.Modifier r31, boolean r32, androidx.compose.p002ui.graphics.Shape r33, long r34, long r36, androidx.compose.foundation.BorderStroke r38, float r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r13 = r30
            r14 = r41
            r15 = r43
            r12 = r44
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1560876237(0x5d0914cd, float:6.1735908E17)
            r1 = r42
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.changedInstance(r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r31
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
            r4 = r31
        L_0x004e:
            r5 = r12 & 4
            if (r5 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0068
            r6 = r32
            boolean r7 = r11.changed((boolean) r6)
            if (r7 == 0) goto L_0x0064
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r7
            goto L_0x006a
        L_0x0068:
            r6 = r32
        L_0x006a:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0084
            r8 = r33
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0080
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r9
            goto L_0x0086
        L_0x0084:
            r8 = r33
        L_0x0086:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r15
            if (r9 != 0) goto L_0x00a2
            r9 = r12 & 16
            if (r9 != 0) goto L_0x009b
            r9 = r34
            boolean r16 = r11.changed((long) r9)
            if (r16 == 0) goto L_0x009d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r9 = r34
        L_0x009d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r16
            goto L_0x00a4
        L_0x00a2:
            r9 = r34
        L_0x00a4:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00c4
            r16 = r12 & 32
            if (r16 != 0) goto L_0x00bb
            r16 = r3
            r2 = r36
            boolean r17 = r11.changed((long) r2)
            if (r17 == 0) goto L_0x00bf
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bb:
            r16 = r3
            r2 = r36
        L_0x00bf:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r1 = r1 | r17
            goto L_0x00c8
        L_0x00c4:
            r16 = r3
            r2 = r36
        L_0x00c8:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x00d3
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r0 = r38
            goto L_0x00e8
        L_0x00d3:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r15 & r18
            r0 = r38
            if (r18 != 0) goto L_0x00e8
            boolean r19 = r11.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x00e4
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r1 = r1 | r19
        L_0x00e8:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r19
            r2 = r39
            goto L_0x0107
        L_0x00f3:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r15 & r19
            r2 = r39
            if (r19 != 0) goto L_0x0107
            boolean r3 = r11.changed((float) r2)
            if (r3 == 0) goto L_0x0104
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r3
        L_0x0107:
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0112
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r19
            r2 = r40
            goto L_0x0127
        L_0x0112:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r15 & r19
            r2 = r40
            if (r19 != 0) goto L_0x0127
            boolean r19 = r11.changed((java.lang.Object) r2)
            if (r19 == 0) goto L_0x0123
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r1 = r1 | r19
        L_0x0127:
            r2 = r12 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x012f
            r2 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012d:
            r1 = r1 | r2
            goto L_0x0140
        L_0x012f:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r15
            if (r2 != 0) goto L_0x0140
            boolean r2 = r11.changedInstance(r14)
            if (r2 == 0) goto L_0x013d
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012d
        L_0x013d:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012d
        L_0x0140:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r4) goto L_0x0163
            boolean r2 = r11.getSkipping()
            if (r2 != 0) goto L_0x0150
            goto L_0x0163
        L_0x0150:
            r11.skipToGroupEnd()
            r2 = r31
            r3 = r6
            r4 = r8
            r5 = r9
            r15 = r11
            r7 = r36
            r9 = r38
            r10 = r39
            r11 = r40
            goto L_0x02b6
        L_0x0163:
            r11.startDefaults()
            r2 = r15 & 1
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x01ac
            boolean r2 = r11.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0177
            goto L_0x01ac
        L_0x0177:
            r11.skipToGroupEnd()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0180
            r1 = r1 & r20
        L_0x0180:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0199
            r0 = r1 & r19
            r16 = r31
            r23 = r36
            r25 = r38
            r26 = r39
            r27 = r40
            r19 = r6
            r20 = r8
            r21 = r9
            r6 = r0
            goto L_0x022a
        L_0x0199:
            r16 = r31
            r23 = r36
            r25 = r38
            r26 = r39
            r27 = r40
            r19 = r6
            r20 = r8
            r21 = r9
            r6 = r1
            goto L_0x022a
        L_0x01ac:
            if (r16 == 0) goto L_0x01b1
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01b3
        L_0x01b1:
            r2 = r31
        L_0x01b3:
            if (r5 == 0) goto L_0x01b6
            r6 = 1
        L_0x01b6:
            if (r7 == 0) goto L_0x01bd
            androidx.compose.ui.graphics.Shape r5 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            goto L_0x01be
        L_0x01bd:
            r5 = r8
        L_0x01be:
            r7 = r12 & 16
            if (r7 == 0) goto L_0x01d0
            androidx.compose.material.MaterialTheme r7 = androidx.compose.material.MaterialTheme.INSTANCE
            r8 = 6
            androidx.compose.material.Colors r7 = r7.getColors(r11, r8)
            long r7 = r7.m33956getSurface0d7_KjU()
            r1 = r1 & r20
            goto L_0x01d1
        L_0x01d0:
            r7 = r9
        L_0x01d1:
            r9 = r12 & 32
            if (r9 == 0) goto L_0x01e0
            int r9 = r1 >> 12
            r9 = r9 & 14
            long r9 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r7, r11, r9)
            r1 = r1 & r19
            goto L_0x01e2
        L_0x01e0:
            r9 = r36
        L_0x01e2:
            if (r17 == 0) goto L_0x01e7
            r16 = 0
            goto L_0x01e9
        L_0x01e7:
            r16 = r38
        L_0x01e9:
            if (r0 == 0) goto L_0x01f2
            r0 = 0
            float r4 = (float) r0
            float r0 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r4)
            goto L_0x01f4
        L_0x01f2:
            r0 = r39
        L_0x01f4:
            if (r3 == 0) goto L_0x0219
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r3)
            java.lang.Object r3 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x020f
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r3)
        L_0x020f:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r26 = r0
            r27 = r3
            goto L_0x021d
        L_0x0219:
            r27 = r40
            r26 = r0
        L_0x021d:
            r20 = r5
            r19 = r6
            r21 = r7
            r23 = r9
            r25 = r16
            r6 = r1
            r16 = r2
        L_0x022a:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x023c
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.Surface (Surface.kt:210)"
            r2 = 1560876237(0x5d0914cd, float:6.1735908E17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r6, r0, r1)
        L_0x023c:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            java.lang.Object r0 = r11.consume(r0)
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.p002ui.unit.C1232Dp) r0
            float r0 = r0.m38482unboximpl()
            float r0 = r0 + r26
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            r0 = 2
            androidx.compose.runtime.ProvidedValue[] r10 = new androidx.compose.runtime.ProvidedValue[r0]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r1 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r23)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r1 = 0
            r10[r1] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r5)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r3 = 1
            r10[r3] = r0
            androidx.compose.material.SurfaceKt$Surface$4 r9 = new androidx.compose.material.SurfaceKt$Surface$4
            r0 = r9
            r1 = r16
            r2 = r20
            r8 = r3
            r3 = r21
            r7 = r25
            r13 = r8
            r8 = r26
            r14 = r9
            r9 = r27
            r28 = r10
            r10 = r19
            r15 = r11
            r11 = r30
            r12 = r41
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 2031491085(0x7916180d, float:4.870827E34)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r13, r14)
            r1 = 56
            r2 = r28
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r2, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r15, (int) r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02a6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02a6:
            r2 = r16
            r3 = r19
            r4 = r20
            r5 = r21
            r7 = r23
            r9 = r25
            r10 = r26
            r11 = r27
        L_0x02b6:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.endRestartGroup()
            if (r15 != 0) goto L_0x02bd
            goto L_0x02d2
        L_0x02bd:
            androidx.compose.material.SurfaceKt$Surface$5 r14 = new androidx.compose.material.SurfaceKt$Surface$5
            r0 = r14
            r1 = r30
            r12 = r41
            r13 = r43
            r29 = r14
            r14 = r44
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            r0 = r29
            r15.updateScope(r0)
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m34128SurfaceLPr_se0(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: Surface-Ny5ogXk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34130SurfaceNy5ogXk(boolean r33, p404of.C13074a<p336ef.C11921v> r34, androidx.compose.p002ui.Modifier r35, boolean r36, androidx.compose.p002ui.graphics.Shape r37, long r38, long r40, androidx.compose.foundation.BorderStroke r42, float r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r45, androidx.compose.runtime.Composer r46, int r47, int r48, int r49) {
        /*
            r15 = r34
            r14 = r45
            r13 = r47
            r12 = r49
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 262027249(0xf9e37f1, float:1.560155E-29)
            r1 = r46
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            r10 = r33
            goto L_0x0036
        L_0x0024:
            r1 = r13 & 14
            r10 = r33
            if (r1 != 0) goto L_0x0035
            boolean r1 = r11.changed((boolean) r10)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r13
            goto L_0x0036
        L_0x0035:
            r1 = r13
        L_0x0036:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x004d
        L_0x003d:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004d
            boolean r4 = r11.changedInstance(r15)
            if (r4 == 0) goto L_0x004a
            r4 = 32
            goto L_0x004c
        L_0x004a:
            r4 = 16
        L_0x004c:
            r1 = r1 | r4
        L_0x004d:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r35
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r35
        L_0x0069:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r36
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
            r7 = r36
        L_0x0085:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008c:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00a2
            r9 = r37
            boolean r16 = r11.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x009d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r16
            goto L_0x00a4
        L_0x00a2:
            r9 = r37
        L_0x00a4:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00be
            r16 = r12 & 32
            r2 = r38
            if (r16 != 0) goto L_0x00b9
            boolean r17 = r11.changed((long) r2)
            if (r17 == 0) goto L_0x00b9
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r17
            goto L_0x00c0
        L_0x00be:
            r2 = r38
        L_0x00c0:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00dc
            r17 = r12 & 64
            r18 = r1
            r0 = r40
            if (r17 != 0) goto L_0x00d7
            boolean r19 = r11.changed((long) r0)
            if (r19 == 0) goto L_0x00d7
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r18 = r18 | r19
            goto L_0x00e0
        L_0x00dc:
            r18 = r1
            r0 = r40
        L_0x00e0:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e9
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r18 | r1
            goto L_0x00fe
        L_0x00e9:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00fe
            r1 = r42
            boolean r19 = r11.changed((java.lang.Object) r1)
            if (r19 == 0) goto L_0x00f9
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r18 = r18 | r19
            goto L_0x0100
        L_0x00fe:
            r1 = r42
        L_0x0100:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x010b
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r18 | r19
            r2 = r43
            goto L_0x0120
        L_0x010b:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r13 & r19
            r2 = r43
            if (r19 != 0) goto L_0x0120
            boolean r3 = r11.changed((float) r2)
            if (r3 == 0) goto L_0x011c
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r18 = r18 | r3
        L_0x0120:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x012b
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r18 = r18 | r19
            r2 = r44
            goto L_0x0140
        L_0x012b:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r13 & r19
            r2 = r44
            if (r19 != 0) goto L_0x0140
            boolean r19 = r11.changed((java.lang.Object) r2)
            if (r19 == 0) goto L_0x013c
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013e
        L_0x013c:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013e:
            r18 = r18 | r19
        L_0x0140:
            r2 = r12 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0147
            r2 = r48 | 6
            goto L_0x0159
        L_0x0147:
            r2 = r48 & 14
            if (r2 != 0) goto L_0x0157
            boolean r2 = r11.changedInstance(r14)
            if (r2 == 0) goto L_0x0153
            r2 = 4
            goto L_0x0154
        L_0x0153:
            r2 = 2
        L_0x0154:
            r2 = r48 | r2
            goto L_0x0159
        L_0x0157:
            r2 = r48
        L_0x0159:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r18 & r19
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x0184
            r5 = r2 & 11
            r7 = 2
            if (r5 != r7) goto L_0x0184
            boolean r5 = r11.getSkipping()
            if (r5 != 0) goto L_0x016f
            goto L_0x0184
        L_0x016f:
            r11.skipToGroupEnd()
            r3 = r35
            r4 = r36
            r6 = r38
            r10 = r42
            r12 = r44
            r5 = r9
            r1 = r11
            r8 = r40
            r11 = r43
            goto L_0x02e8
        L_0x0184:
            r11.startDefaults()
            r5 = r13 & 1
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r5 == 0) goto L_0x01ce
            boolean r5 = r11.getDefaultsInvalid()
            if (r5 == 0) goto L_0x0198
            goto L_0x01ce
        L_0x0198:
            r11.skipToGroupEnd()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x01a1
            r18 = r18 & r20
        L_0x01a1:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x01ba
            r0 = r18 & r19
            r18 = r35
            r19 = r36
            r21 = r38
            r23 = r40
            r25 = r42
            r26 = r43
            r27 = r44
            r6 = r0
            r20 = r9
            goto L_0x0252
        L_0x01ba:
            r19 = r36
            r21 = r38
            r23 = r40
            r25 = r42
            r26 = r43
            r27 = r44
            r20 = r9
            r6 = r18
            r18 = r35
            goto L_0x0252
        L_0x01ce:
            if (r4 == 0) goto L_0x01d3
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01d5
        L_0x01d3:
            r4 = r35
        L_0x01d5:
            if (r6 == 0) goto L_0x01d9
            r5 = 1
            goto L_0x01db
        L_0x01d9:
            r5 = r36
        L_0x01db:
            if (r8 == 0) goto L_0x01e2
            androidx.compose.ui.graphics.Shape r6 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            goto L_0x01e3
        L_0x01e2:
            r6 = r9
        L_0x01e3:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x01f5
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.INSTANCE
            r9 = 6
            androidx.compose.material.Colors r8 = r8.getColors(r11, r9)
            long r8 = r8.m33956getSurface0d7_KjU()
            r18 = r18 & r20
            goto L_0x01f7
        L_0x01f5:
            r8 = r38
        L_0x01f7:
            r20 = r12 & 64
            if (r20 == 0) goto L_0x0206
            int r20 = r18 >> 15
            r7 = r20 & 14
            long r21 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r8, r11, r7)
            r18 = r18 & r19
            goto L_0x0208
        L_0x0206:
            r21 = r40
        L_0x0208:
            if (r0 == 0) goto L_0x020c
            r0 = 0
            goto L_0x020e
        L_0x020c:
            r0 = r42
        L_0x020e:
            if (r1 == 0) goto L_0x0217
            r1 = 0
            float r7 = (float) r1
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r7)
            goto L_0x0219
        L_0x0217:
            r1 = r43
        L_0x0219:
            if (r3 == 0) goto L_0x0240
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r3)
            java.lang.Object r3 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r3 != r7) goto L_0x0234
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r3)
        L_0x0234:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r25 = r0
            r26 = r1
            r27 = r3
            goto L_0x0246
        L_0x0240:
            r27 = r44
            r25 = r0
            r26 = r1
        L_0x0246:
            r19 = r5
            r20 = r6
            r6 = r18
            r23 = r21
            r18 = r4
            r21 = r8
        L_0x0252:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0263
            java.lang.String r0 = "androidx.compose.material.Surface (Surface.kt:323)"
            r1 = 262027249(0xf9e37f1, float:1.560155E-29)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r6, r2, r0)
        L_0x0263:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            java.lang.Object r0 = r11.consume(r0)
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.p002ui.unit.C1232Dp) r0
            float r0 = r0.m38482unboximpl()
            float r0 = r0 + r26
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            r0 = 2
            androidx.compose.runtime.ProvidedValue[] r9 = new androidx.compose.runtime.ProvidedValue[r0]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r1 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r23)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r1 = 0
            r9[r1] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r5)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r7 = 1
            r9[r7] = r0
            androidx.compose.material.SurfaceKt$Surface$7 r8 = new androidx.compose.material.SurfaceKt$Surface$7
            r0 = r8
            r1 = r18
            r16 = r2
            r2 = r20
            r3 = r21
            r15 = r7
            r7 = r25
            r28 = r8
            r8 = r26
            r29 = r9
            r9 = r33
            r10 = r27
            r30 = r11
            r11 = r19
            r12 = r34
            r13 = r45
            r14 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1391199439(0xffffffffad13fb31, float:-8.411758E-12)
            r2 = r28
            r1 = r30
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r15, r2)
            r2 = 56
            r3 = r29
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02d8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02d8:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r23
            r10 = r25
            r11 = r26
            r12 = r27
        L_0x02e8:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x02ef
            goto L_0x030c
        L_0x02ef:
            androidx.compose.material.SurfaceKt$Surface$8 r14 = new androidx.compose.material.SurfaceKt$Surface$8
            r0 = r14
            r1 = r33
            r2 = r34
            r13 = r45
            r31 = r14
            r14 = r47
            r32 = r15
            r15 = r48
            r16 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            r1 = r31
            r0 = r32
            r0.updateScope(r1)
        L_0x030c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m34130SurfaceNy5ogXk(boolean, of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg  reason: not valid java name */
    public static final Modifier m34133surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier modifier2;
        Modifier r10 = ShadowKt.m35337shadows4CzXII$default(modifier, f, shape, false, 0, 0, 24, (Object) null);
        if (borderStroke != null) {
            modifier2 = BorderKt.border(Modifier.Companion, borderStroke, shape);
        } else {
            modifier2 = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m32956backgroundbw27NRU(r10.then(modifier2), j, shape), shape);
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    /* renamed from: surfaceColorAtElevation-cq6XJ1M  reason: not valid java name */
    public static final long m34134surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:629)");
        }
        if (Color.m35672equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m33956getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.m34011apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & 112) | ((i << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: Surface-Ny5ogXk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34129SurfaceNy5ogXk(boolean r33, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r34, androidx.compose.p002ui.Modifier r35, boolean r36, androidx.compose.p002ui.graphics.Shape r37, long r38, long r40, androidx.compose.foundation.BorderStroke r42, float r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r45, androidx.compose.runtime.Composer r46, int r47, int r48, int r49) {
        /*
            r15 = r34
            r14 = r45
            r13 = r47
            r12 = r49
            java.lang.String r0 = "onCheckedChange"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 1341569296(0x4ff6b910, float:8.2786468E9)
            r1 = r46
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            r10 = r33
            goto L_0x0036
        L_0x0024:
            r1 = r13 & 14
            r10 = r33
            if (r1 != 0) goto L_0x0035
            boolean r1 = r11.changed((boolean) r10)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r13
            goto L_0x0036
        L_0x0035:
            r1 = r13
        L_0x0036:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x004d
        L_0x003d:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004d
            boolean r4 = r11.changedInstance(r15)
            if (r4 == 0) goto L_0x004a
            r4 = 32
            goto L_0x004c
        L_0x004a:
            r4 = 16
        L_0x004c:
            r1 = r1 | r4
        L_0x004d:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r35
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r35
        L_0x0069:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r36
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
            r7 = r36
        L_0x0085:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008c:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00a2
            r9 = r37
            boolean r16 = r11.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x009d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r16
            goto L_0x00a4
        L_0x00a2:
            r9 = r37
        L_0x00a4:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00be
            r16 = r12 & 32
            r2 = r38
            if (r16 != 0) goto L_0x00b9
            boolean r17 = r11.changed((long) r2)
            if (r17 == 0) goto L_0x00b9
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r17
            goto L_0x00c0
        L_0x00be:
            r2 = r38
        L_0x00c0:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00dc
            r17 = r12 & 64
            r18 = r1
            r0 = r40
            if (r17 != 0) goto L_0x00d7
            boolean r19 = r11.changed((long) r0)
            if (r19 == 0) goto L_0x00d7
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r18 = r18 | r19
            goto L_0x00e0
        L_0x00dc:
            r18 = r1
            r0 = r40
        L_0x00e0:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e9
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r18 | r1
            goto L_0x00fe
        L_0x00e9:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00fe
            r1 = r42
            boolean r19 = r11.changed((java.lang.Object) r1)
            if (r19 == 0) goto L_0x00f9
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r18 = r18 | r19
            goto L_0x0100
        L_0x00fe:
            r1 = r42
        L_0x0100:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x010b
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r18 | r19
            r2 = r43
            goto L_0x0120
        L_0x010b:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r13 & r19
            r2 = r43
            if (r19 != 0) goto L_0x0120
            boolean r3 = r11.changed((float) r2)
            if (r3 == 0) goto L_0x011c
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r18 = r18 | r3
        L_0x0120:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x012b
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r18 = r18 | r19
            r2 = r44
            goto L_0x0140
        L_0x012b:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r13 & r19
            r2 = r44
            if (r19 != 0) goto L_0x0140
            boolean r19 = r11.changed((java.lang.Object) r2)
            if (r19 == 0) goto L_0x013c
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013e
        L_0x013c:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013e:
            r18 = r18 | r19
        L_0x0140:
            r2 = r12 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0147
            r2 = r48 | 6
            goto L_0x0159
        L_0x0147:
            r2 = r48 & 14
            if (r2 != 0) goto L_0x0157
            boolean r2 = r11.changedInstance(r14)
            if (r2 == 0) goto L_0x0153
            r2 = 4
            goto L_0x0154
        L_0x0153:
            r2 = 2
        L_0x0154:
            r2 = r48 | r2
            goto L_0x0159
        L_0x0157:
            r2 = r48
        L_0x0159:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r18 & r19
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x0184
            r5 = r2 & 11
            r7 = 2
            if (r5 != r7) goto L_0x0184
            boolean r5 = r11.getSkipping()
            if (r5 != 0) goto L_0x016f
            goto L_0x0184
        L_0x016f:
            r11.skipToGroupEnd()
            r3 = r35
            r4 = r36
            r6 = r38
            r10 = r42
            r12 = r44
            r5 = r9
            r1 = r11
            r8 = r40
            r11 = r43
            goto L_0x02e8
        L_0x0184:
            r11.startDefaults()
            r5 = r13 & 1
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r5 == 0) goto L_0x01ce
            boolean r5 = r11.getDefaultsInvalid()
            if (r5 == 0) goto L_0x0198
            goto L_0x01ce
        L_0x0198:
            r11.skipToGroupEnd()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x01a1
            r18 = r18 & r20
        L_0x01a1:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x01ba
            r0 = r18 & r19
            r18 = r35
            r19 = r36
            r21 = r38
            r23 = r40
            r25 = r42
            r26 = r43
            r27 = r44
            r6 = r0
            r20 = r9
            goto L_0x0252
        L_0x01ba:
            r19 = r36
            r21 = r38
            r23 = r40
            r25 = r42
            r26 = r43
            r27 = r44
            r20 = r9
            r6 = r18
            r18 = r35
            goto L_0x0252
        L_0x01ce:
            if (r4 == 0) goto L_0x01d3
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x01d5
        L_0x01d3:
            r4 = r35
        L_0x01d5:
            if (r6 == 0) goto L_0x01d9
            r5 = 1
            goto L_0x01db
        L_0x01d9:
            r5 = r36
        L_0x01db:
            if (r8 == 0) goto L_0x01e2
            androidx.compose.ui.graphics.Shape r6 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            goto L_0x01e3
        L_0x01e2:
            r6 = r9
        L_0x01e3:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x01f5
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.INSTANCE
            r9 = 6
            androidx.compose.material.Colors r8 = r8.getColors(r11, r9)
            long r8 = r8.m33956getSurface0d7_KjU()
            r18 = r18 & r20
            goto L_0x01f7
        L_0x01f5:
            r8 = r38
        L_0x01f7:
            r20 = r12 & 64
            if (r20 == 0) goto L_0x0206
            int r20 = r18 >> 15
            r7 = r20 & 14
            long r21 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r8, r11, r7)
            r18 = r18 & r19
            goto L_0x0208
        L_0x0206:
            r21 = r40
        L_0x0208:
            if (r0 == 0) goto L_0x020c
            r0 = 0
            goto L_0x020e
        L_0x020c:
            r0 = r42
        L_0x020e:
            if (r1 == 0) goto L_0x0217
            r1 = 0
            float r7 = (float) r1
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r7)
            goto L_0x0219
        L_0x0217:
            r1 = r43
        L_0x0219:
            if (r3 == 0) goto L_0x0240
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r3)
            java.lang.Object r3 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r3 != r7) goto L_0x0234
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r3)
        L_0x0234:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r25 = r0
            r26 = r1
            r27 = r3
            goto L_0x0246
        L_0x0240:
            r27 = r44
            r25 = r0
            r26 = r1
        L_0x0246:
            r19 = r5
            r20 = r6
            r6 = r18
            r23 = r21
            r18 = r4
            r21 = r8
        L_0x0252:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0263
            java.lang.String r0 = "androidx.compose.material.Surface (Surface.kt:438)"
            r1 = 1341569296(0x4ff6b910, float:8.2786468E9)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r6, r2, r0)
        L_0x0263:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            java.lang.Object r0 = r11.consume(r0)
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.p002ui.unit.C1232Dp) r0
            float r0 = r0.m38482unboximpl()
            float r0 = r0 + r26
            float r5 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r0)
            r0 = 2
            androidx.compose.runtime.ProvidedValue[] r9 = new androidx.compose.runtime.ProvidedValue[r0]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r1 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r23)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r1 = 0
            r9[r1] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation()
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r5)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r7 = 1
            r9[r7] = r0
            androidx.compose.material.SurfaceKt$Surface$10 r8 = new androidx.compose.material.SurfaceKt$Surface$10
            r0 = r8
            r1 = r18
            r16 = r2
            r2 = r20
            r3 = r21
            r15 = r7
            r7 = r25
            r28 = r8
            r8 = r26
            r29 = r9
            r9 = r33
            r10 = r27
            r30 = r11
            r11 = r19
            r12 = r34
            r13 = r45
            r14 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -311657392(0xffffffffed6c7c50, float:-4.5742967E27)
            r2 = r28
            r1 = r30
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r15, r2)
            r2 = 56
            r3 = r29
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02d8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02d8:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r23
            r10 = r25
            r11 = r26
            r12 = r27
        L_0x02e8:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x02ef
            goto L_0x030c
        L_0x02ef:
            androidx.compose.material.SurfaceKt$Surface$11 r14 = new androidx.compose.material.SurfaceKt$Surface$11
            r0 = r14
            r1 = r33
            r2 = r34
            r13 = r45
            r31 = r14
            r14 = r47
            r32 = r15
            r15 = r48
            r16 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            r1 = r31
            r0 = r32
            r0.updateScope(r1)
        L_0x030c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m34129SurfaceNy5ogXk(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
